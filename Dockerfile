FROM eclipse-temurin:17-jdk-alpine
RUN mkdir /project
COPY . /project
WORKDIR /project
ENTRYPOINT ["java","-jar","build/libs/schedulerlock-0.0.1-SNAPSHOT.jar"]