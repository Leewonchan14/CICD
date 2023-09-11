# ./gradlew bootRun
FROM ubuntu
FROM openjdk:17-jdk-alpine

EXPOSE 8080




COPY build/libs .

# run ./gradlew bootRun

#RUN java -jar CICD-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "CICD-0.0.1-SNAPSHOT.jar"]
