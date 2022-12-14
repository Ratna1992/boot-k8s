FROM openjdk:17
EXPOSE 9876
ADD target/boot-k8s.jar boot-k8s.jar
ENTRYPOINT ["java","-jar","boot-k8s.jar"]
