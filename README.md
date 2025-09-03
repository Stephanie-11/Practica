# Practica

## 📌 Descripción
Practica es una aplicación Java basada en *Maven, diseñada con una arquitectura modular y soporte para **IntelliJ IDEA*.
El proyecto incluye configuración para *Maven Wrapper*, lo que permite compilar y ejecutar la aplicación sin necesidad de tener Maven instalado globalmente.

---

## 🏗 Estructura del Proyecto

Practica/
│── .idea/                  # Configuración de IntelliJ IDEA
│── Practica/               # Carpeta principal del proyecto Maven
│   │── .idea/              # Configuración adicional de IntelliJ
│   │── .mvn/               # Configuración de Maven Wrapper
│   │── src/                # Código fuente (Java y recursos)
│   │── target/             # Archivos compilados (se genera automáticamente)
│   │── pom.xml             # Archivo de configuración Maven
│   │── mvnw / mvnw.cmd     # Scripts de Maven Wrapper
│   │── HELP.md             # Guía básica generada por Spring/Maven
│   │── .gitignore          # Exclusiones de Git
│   │── .gitattributes      # Configuración de atributos en Git
│── target/                 # Carpeta de compilación (nivel raíz)
│── README                  # Documento base


---

## ⚙ Requisitos
- *Java 17 o superior* (recomendado)
- *Maven 3.8+* (opcional, ya que incluye Maven Wrapper)
- *IntelliJ IDEA* o cualquier IDE compatible con Maven

---

## 🚀 Ejecución del Proyecto

### 1. Usando Maven instalado
bash
mvn clean install
mvn spring-boot:run


### 2. Usando Maven Wrapper (recomendado)
bash
./mvnw clean install
./mvnw spring-boot:run


En Windows:
bash
mvnw.cmd clean install
mvnw.cmd spring-boot:run


---

## 🗂 Estructura del código fuente (src/)
- src/main/java → Código fuente Java (controladores, servicios, repositorios, modelos).
- src/main/resources → Archivos de configuración y recursos (application.properties, templates, etc.).
- src/test/java → Pruebas unitarias y de integración.

---

## ✨ Notas
- La carpeta target/ se genera automáticamente al compilar, por lo que no es necesario incluirla en el control de versiones.
- El archivo pom.xml centraliza la gestión de dependencias, plugins y configuración de construcción.

---

## 📄 Licencia
Este proyecto está bajo la licencia MIT - consulta el archivo LICENSE si existe para más detalles.
