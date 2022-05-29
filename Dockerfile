From openjdk:11
copy ./target/spring-boot-azure-demoo-0.0.1-SNAPSHOT.jar spring-boot-azure-demoo-0.0.1-SNAPSHOT.jar
CMD ["java","-jar","spring-boot-azure-demoo-0.0.1-SNAPSHOT.jar"]