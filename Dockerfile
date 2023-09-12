# ./gradlew bootRun
FROM openjdk:17-jdk-alpine

WORKDIR /app

EXPOSE 8080

COPY build/libs/*.jar app.jar
# run ./gradlew bootRun

#RUN java -jar CICD-0.0.1-SNAPSHOT.jar
CMD ["java", "-jar", "app.jar"]
#ENTRYPOINT ["java","-jar","build/libs/CICD-0.0.1-SNAPSHOT.jar"]