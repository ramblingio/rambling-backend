FROM finntech/openjdk8:1.8.0_92

ADD build/libs/rambling-backend.jar /app/rambling-backend.jar

EXPOSE 8080
