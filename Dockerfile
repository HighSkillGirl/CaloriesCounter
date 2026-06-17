FROM maven:3.9-eclipse-temurin-25
WORKDIR /CaloriesCounter
COPY . .
RUN mvn clean package -DskipTests
ENTRYPOINT ["java", "-jar", "target/CaloriesCounter-0.0.1-SNAPSHOT.jar"]