FROM amazoncorretto:11-alpine-jdk //de que imagen partimos
MAINTAINER Mariano // Quien es el dueño
COPY target/Mariano-0.0.1-SNAPSHOT.jar mariano-app.jar          //Copiar empaquetado github
ENTRYPOINT["java","-jar","/mariano-app.jar"]      //Prioridad
