FROM openjdk
COPY target/JenkinsLaboratoryApp-0.0.1-SNAPSHOT.jar JenkinsLaboratoryApp-0.0.1-SNAPSHOT.jar
RUN ["java", "-jar", "JenkinsLaboratoryApp-0.0.1-SNAPSHOT.jar"]
