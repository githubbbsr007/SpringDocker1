#start with the base image containing java run time
FROM openjdk:17-ea-10-jdk-slim

#information about who maintain the image
MAINTAINER piersquere.com

#add application jar to the image
COPY target/Swagger-0.0.1-SNAPSHOT.jar Swagger-0.0.1-SNAPSHOT.jar

#execute appliction
ENTRYPOINT ["java","-jar","Swagger-0.0.1-SNAPSHOT.jar"]

#docker build . -t githubbbsr007/account:swaggerDocker(command to create docker image)

#docker run -p 8080:8080 githubbbsr007/account:swaggerDocker(command to run docker image)

#docker run -d -p 8080:8080 githubbbsr007/account:swaggerDocker(command to run docker image in backend without print in console)