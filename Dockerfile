FROM tomcat:8.0-alpine
MAINTAINER kanwaljeet singh
RUN apk update
RUN apk add wget
RUN wget --user=skanwaljeet --password=PTL@dm1n123456 -O /usr/local/tomcat/webapps/sampleapplication.jar http://localhost:8082/artifactory/ksdevtestopscdflow/MyAmazonV1/MyAmazonV1/0.0.1-SNAPSHOT/MyAmazonV1-0.0.1-SNAPSHOT.jar
EXPOSE 8080
CMD /usr/local/tomcat/bin/catalina.bat run
