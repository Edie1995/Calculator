FROM docker.io/openjdk:11-jre-slim
RUN addgroup edyta && useradd edyta -g edyta
USER edyta:edyta
ARG JAR_FILE=target/*.jar
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]