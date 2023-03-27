FROM gradle:7.4.1 AS build
COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build

FROM openjdk:20
EXPOSE 8080
COPY --from=build /home/gradle/src/build/libs/demo-0.0.1-SNAPSHOT.jar /app/
RUN bash -c 'touch /app/demo-0.0.1-SNAPSHOT.jar'
ENTRYPOINT ["java", "-jar","/app/demo-0.0.1-SNAPSHOT.jar"]