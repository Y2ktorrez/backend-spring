# Usa una imagen de Maven para compilar el proyecto
FROM maven:3.8.5-openjdk-17 AS build
WORKDIR /app

# Copia los archivos de configuración de Maven y descarga dependencias
COPY pom.xml /app/pom.xml
RUN mvn dependency:go-offline

# Copia el resto del proyecto y compila
COPY src /app/src
RUN mvn clean package

# Usa una imagen más ligera de OpenJDK para ejecutar la aplicación
FROM openjdk:17-jdk-slim
WORKDIR /app

# Copia el JAR generado por Maven desde la etapa de compilación
COPY --from=build /app/target/backend-0.0.1-SNAPSHOT.jar app_backend.jar

# Exponer el puerto 8080 para el backend
EXPOSE 8080

# Comando para ejecutar la aplicación
ENTRYPOINT ["java", "-jar", "app_backend.jar"]
