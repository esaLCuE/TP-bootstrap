pipeline {
  agent any

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
  }
}
