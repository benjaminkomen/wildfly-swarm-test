FROM java:openjdk-8-jdk

MAINTAINER  Benjamin Komen <komenb@gmail.com>

# RUN

ENV MAVEN_VERSION 3.3.9
ENV JAVA_OPTS -Xms256m -Xmx512m -Djava.net.preferIPv4Stack=true

# CMD

ADD target/foobar-hollow-swarm.jar /opt/foobar-hollow-swarm.jar
ADD target/foobar.war /opt/deploy/foobar.war

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/foobar-hollow-swarm.jar"]