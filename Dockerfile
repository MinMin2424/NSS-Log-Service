FROM maven:3.9.9-eclipse-temurin-24-alpine AS builder

WORKDIR /app
COPY . .

RUN mvn clean package -DskipTests

FROM openjdk:25-slim

WORKDIR /app
COPY --from=builder /app/target/*.jar app.jar

EXPOSE 8080

ENTRYPOINT ["java","-jar","app.jar"]
