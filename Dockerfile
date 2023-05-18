FROM openjdk:17-alpine
ARG JAR_FILE=build/libs/vikrant-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} vikrant.jar
ENTRYPOINT ["java","-jar","/vikrant.jar"]
EXPOSE 8076
