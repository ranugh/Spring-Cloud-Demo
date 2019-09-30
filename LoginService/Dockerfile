FROM java:8-jre
MAINTAINER Biswapriya Khawas <biswa.khawas@gmail.com>

ADD ./target/LoginServer.jar /app/
CMD ["java", "-Xmx200m", "-jar", "/app/LoginServer.jar"]

EXPOSE 8012