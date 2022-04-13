FROM openjdk:8
COPY  ./target/devops-calculator-1.0-SNAPSHOT.jar ./
WORKDIR ./
CMD ["java", "-jar", "Calculator-1.0-SNAPSHOT.jar"]

#every line in docker file is layer of image