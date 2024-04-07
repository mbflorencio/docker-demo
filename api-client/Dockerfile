FROM maven:3.8.4 AS builder

WORKDIR /app

COPY pom.xml .

COPY src ./src

RUN mvn clean package -DskipTests

FROM openjdk:17

WORKDIR /app

 # Copie o arquivo JAR do seu projeto para dentro do contêiner
COPY --from=builder /app/target/*.jar /app/api-client.jar

 # Comando para executar o projeto quando o contêiner for iniciado
 CMD ["java", "-jar", "/app/api-client.jar"]
