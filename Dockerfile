FROM openjdk:8
COPY  target/devops-calculator-1.0-SNAPSHOT-jar-with-dependencies.jar ./
WORKDIR ./
CMD ["java", "-jar", "devops-calculator-1.0-SNAPSHOT-jar-with-dependencies.jar"]

#every line in docker file is layer of image
