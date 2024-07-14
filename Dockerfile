FROM amazoncorretto:17-alpine-jdk                  //De que imagen de java partimos
MAINTAINER LUIS                                    //Quien es el dueño de la imagen
COPY target/app01-0.0.1-SNAPSHOT.jar lc-app.jar    //Copia de nuestro proyecto el empaquetado a Github
ENTRYPOINT ["java", "-jar", "/lc-app-jar"]         //Indica lo primero que va a ejecutar




