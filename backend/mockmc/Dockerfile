FROM maven:3.9.3 AS builder
RUN mkdir /app /output
WORKDIR /app
COPY . .
RUN mvn package -Dmaven.test.failure.ignore=true
RUN mv /app/target/*.jar /output/app.jar

FROM openjdk:17.0.2-oracle
COPY --from=builder /output/app.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
EXPOSE 9010