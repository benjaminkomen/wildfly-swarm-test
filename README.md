# wildfly-swarm-test

## Instructions

First do a maven clean install, which compiles the code:
`mvn clean install`

You now have at least a .war and a .jar file in your target folder of your project. You can run the project from Git Bash using: `mvn wildfly-swarm:run`

Run the following two commands (while your current direction is the folder of the wildfly-swarm-test project):
`docker build -t bkomen/wildfly-swarm-test .`

`docker run -p 8080:8080 bkomen/wildfly-swarm-test`

You can now access your application at http://localhost:8080/hello

or http://localhost:8080/index.xhtml


After you are done you need to run:
`docker ps`

Grab the id of the running docker image and copy it. Now run:
`docker stop <image-id>`

## External Resources
* https://docker-curriculum.com/
* http://docs.wildfly-swarm.io/2018.5.0/
