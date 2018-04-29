# wildfly-swarm-test

First do a maven clean install, which compiles the code.

Run the following two commands:
`docker build -t bkomen/wildfly-swarm-test .`

`docker run -p 8080:8080 bkomen/wildfly-swarm-test`