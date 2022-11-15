FROM openjdk:11
MAINTAINER kanwaljeet singh
EXPOSE 8080
ADD target/docker-jenkins-integration-sample.jar http://localhost:8082/artifactory/ksdevtestopscdflow/MyAmazonV1/MyAmazonV1/0.0.1-SNAPSHOT/MyAmazonV1-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/docker-jenkins-integration-sample.jar"]
