FROM gradle:7.5.0-jdk17
WORKDIR /opt/app
COPY ./build/libs/springboot-backend-0.0.1-SNAPSHOT.jar ./

ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar springboot-backend-0.0.1-SNAPSHOT.jar"]

#FROM gradle:7.5.0-jdk17
#WORKDIR /opt/app
#COPY ./ ./
#RUN ./gradlew assemble
#
#ENTRYPOINT ["sh", "-c", "java ${JAVA_OPTS} -jar build/libs/springboot-backend-0.0.1-SNAPSHOT.jar"]