FROM openjdk:17
EXPOSE 8083
ADD target/ContactMicro.jar ContactMicro.jar
ENTRYPOINT ["java","-jar","ContactMicro.jar"]
