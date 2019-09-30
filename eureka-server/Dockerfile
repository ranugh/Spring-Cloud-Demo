FROM java:8-jre
MAINTAINER Biswapriya Khawas <biswa.khawas@gmail.com>

ADD ./target/eureka-server.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/eureka-server.jar"]

EXPOSE 8761