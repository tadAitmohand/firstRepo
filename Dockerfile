FROM openjdk:8-jdk-alpine
VOLUME /var/offre_service
ADD target/offre*.jar /offreService.jar
CMD ["java", "-jar", "/offreService.jar"]
EXPOSE 8081