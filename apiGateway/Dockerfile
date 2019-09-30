FROM java:8-jre
MAINTAINER Biswapriya Khawas <biswa.khawas@gmail.com>

ADD ./target/apiGateway.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/apiGateway.jar"]

EXPOSE 8010