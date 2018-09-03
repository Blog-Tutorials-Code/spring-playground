FROM ferdinandyeboah/custom-maven
WORKDIR /spring-playground

COPY pom.xml .
COPY src src

#Expose port 8080, still needs to be mapped when docker run -p host:80
EXPOSE 8080

CMD [ "mvn", "spring-boot:run" ]


#Other options. Copy the jar from target then run. Would require running mvn install in pipeline before docker build
# COPY target/*.jar spring-playground.jar
# CMD [ "sh", "-c", "java -jar spring-playground.jar" ]

# Look into mounting docker volumes so dependencies not downloaded every time
# VOLUME [ "~/Desktop/root/.m2", "/root/.m2"  ]