FROM openjdk:17-jdk-slim

COPY . /app

WORKDIR /app

RUN ./mvnw clean install -DskipTests

CMD ["java", "-jar", "target/wiki_project-0.0.1-SNAPSHOT.jar"]

EXPOSE 9091