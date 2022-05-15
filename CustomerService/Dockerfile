FROM java:8
EXPOSE 8082
ADD target/spring-boot-docker.jar spring-boot-docker.jar
#ARG JAR_FILE=target/*.jar
#COPY ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/spring-boot-docker.jar"]