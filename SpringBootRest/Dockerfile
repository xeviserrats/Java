FROM amazoncorretto:11
ARG WAR_FILE
COPY ./target/SpringBootRest.war SpringBootRest
CMD ["java","-jar","SpringBootRest","--server.port=8080"]
