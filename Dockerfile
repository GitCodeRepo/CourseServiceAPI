# Fetching latest version of Java
FROM openjdk:17
 
# Setting up work directory
WORKDIR /CourseServiceAPI

# Copy the jar file into our app
COPY ./target/api-0.0.1-SNAPSHOT.jar /CourseServiceAPI

# Exposing port 8080
EXPOSE 8080

CMD ["java", "-jar", "api-0.0.1-SNAPSHOT.jar"]
