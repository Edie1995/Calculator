FROM docker.io/openjdk:11-jre-slim
ARG JAR_FILE=target/*.jar
RUN addgroup edyta && useradd edyta -g edyta
RUN chown -R  edyta:edyta /var/log
USER edyta:edyta
COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]