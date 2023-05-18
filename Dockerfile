FROM openjdk:17-jre-slim-buster
ARG JAR_FILE=build/libs/vikrant-1.0-SNAPSHOT.jar
COPY ${JAR_FILE} vikrant.jar
ENTRYPOINT ["java","-jar","/vikrant.jar"]
EXPOSE 8076