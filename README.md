city-list
========================

## Checkout Project
```
git clone https:
```

## Setup of IDE development environment
* as IntelliJ User please refer to [IntelliJ Setup Guide](https://wiki.int.kn/display/gscgiaf/Intellij+IDEA)

## Technical requirements in order to run the application
* Since this project is developed with Java17, developer needs to set JAVA_HOME as Java17 otherwise there will be problem, due to version conflict. Inorder to solve this problem just add following line to **project's gradle.properties** file
```
org.gradle.java.home= --Path to JDK-17
or use it as param for command line
gradlew sA clean build -Dorg.gradle.java.home="c:/dev/Java/openjdk-17.0.2"
```

## Rest Documentation
* Documentation of the REST APIs
* The Swagger UI landing page url, {environment-url}/swagger-ui/index.html
* Json url, {environment-url}/v3/api-docs, developers can import the json file or url into the postman.

## Actuator
* Actuator brings production-ready features to our application.
* Monitoring our app, gathering metrics, understanding traffic etc
* All actuator endpoints are placed under {managementPort}/actuator path
* Some available endpoints under actuator as follows.
    * /health
    * /info
    * /prometheus
    * /metrics
