# FROM openjdk:22-jdk
FROM openjdk:23-jdk

ENV APP_HOME=/opt/app
WORKDIR ${APP_HOME}

# Copy the JAR file
COPY paymentapi.jar ${APP_HOME}/paymentapi.jar

# Set the entrypoint to run Java
ENTRYPOINT ["java", "-jar"]

# Set default CMD arguments that can be overridden
CMD ["-Dserver.port=8081", "paymentapi.jar"]
