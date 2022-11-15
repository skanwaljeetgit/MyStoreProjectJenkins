FROM openjdk:11
MAINTAINER kanwaljeet singh
EXPOSE 8080
ADD --user=admin --password=PTL@dm1n123456 -O /usr/local/sampleapplication.jar http://localhost:8082/artifactory/ksdevtestopscdflow/MyAmazonV1/MyAmazonV1/0.0.1-SNAPSHOT/MyAmazonV1-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","sampleapplication.jar"]
