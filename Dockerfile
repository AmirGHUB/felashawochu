FROM openjdk:11
ADD target/greeting-0.0.1-SNAPSHOT.jar	greeting-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "greeting-0.0.1-SNAPSHOT.jar"]
