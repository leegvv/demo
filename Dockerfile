FROM adoptopenjdk/openjdk8:jre-nightly
ADD target/demo-1.0.0.jar demo.jar
ENTRYPOINT ["java", "-jar", "/demo.jar"]