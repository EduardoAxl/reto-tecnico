FROM openjdk:8-jdk-alpine
VOLUME /tmp

EXPOSE 8085
ADD ./target/PruebaTecnica-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["java","-jar","app.jar"]