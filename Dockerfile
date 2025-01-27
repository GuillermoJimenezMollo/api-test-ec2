# Usar una imagen base de JDK
FROM openjdk:11-jdk-slim

# Crear directorio de trabajo
WORKDIR /app

# Copiar el archivo JAR al contenedor
COPY build/libs/api-test-ec2-1.0.0.jar app.jar

# Exponer el puerto donde tu app corre
EXPOSE 8080

ENTRYPOINT ["java", "-jar", "app.jar"]
