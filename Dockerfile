FROM java:openjdk-8-jdk

MAINTAINER  Benjamin Komen <komenb@gmail.com>

# RUN

# ENV JAVA_OPTS -Xms256m -Xmx512m -Djava.net.preferIPv4Stack=true

# CMD

ADD target/wildfly-swarm-test-1.0-SNAPSHOT-hollow-thorntail.jar /opt/wildfly-swarm-test-1.0-SNAPSHOT-hollow-thorntail.jar
ADD target/wildfly-swarm-test-1.0-SNAPSHOT.war /opt/deploy/wildfly-swarm-test-1.0-SNAPSHOT.war

EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/wildfly-swarm-test-1.0-SNAPSHOT-hollow-thorntail.jar", "/opt/deploy/wildfly-swarm-test-1.0-SNAPSHOT.war"]