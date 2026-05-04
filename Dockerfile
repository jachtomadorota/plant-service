FROM jelastic/maven:3.9.5-openjdk-21

# 1. Copy application into server folder
COPY . /server
WORKDIR /server

# 2. Going into server folder
CMD ["cd", "/server"]

# 3. Execute building a JAR file with tests
RUN mvn clean install

# 4. Launch application
CMD ["java", "-jar", "--Dspring.application.properties=application.properties", "Application.java"]