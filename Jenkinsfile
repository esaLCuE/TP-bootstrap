pipeline {
  agent any

  environment {
    registry = "esalcue/webspringboot2025"
    registryCredential = "CredentialDocker"
    dockerImage = ''
  }
  
  tools {
    maven 'maven'
  }
  stages {
    stage('Clean workspace') {
      steps {
        cleanWs()
      }
    }
    
    stage('Git Checkout') {
      steps {
        script {
          git branch: 'main',
            credentialsId: 'credentialAppWeb',
            url: 'https://github.com/esaLCuE/TP-bootstrap.git'
        }
      }
    }
    stage('Build Maven') {
      steps {
        bat 'mvn clean package'
      }
    }
    stage('Build Docker Image') {
      steps {
        script {
          docker.build('esalcue/webspringboot2025:latest', '-f Dockerfile .')
        }
      }
    }
    stage('Push to Docker Hub') {
      steps {
        script {
          docker.withRegistry('', registryCredential) {
            docker.image('esalcue/webspringboot2025:latest').push()
          }
        }
      }
    }
    stage('Deploy docker-compose') {
      steps {
        script {
          bat 'docker-compose up -d --build --force-recreate --remove-orphans'
        }
      }
    }
  }
}
