FROM amazoncorretto:17-alpine-jdk                  
MAINTAINER LUIS                                    
COPY target/app01-0.0.1-SNAPSHOT.jar lc-app.jar    
ENTRYPOINT ["java", "-jar", "/lc-app.jar"]         




