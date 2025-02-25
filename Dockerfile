FROM openjdk:21
EXPOSE 9000
WORKDIR /app
COPY target/AppWeb-0.0.1-SNAPSHOT.jar /app/AppWeb-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "AppWeb-0.0.1-SNAPSHOT.jar"]
