# ☕ API REST con Java y Spring Boot

Este proyecto es una API REST básica construida con **Java**, utilizando **Spring Boot** y conectada a una base de datos **PostgreSQL**. Implementa operaciones CRUD completas y está organizada por capas siguiendo buenas prácticas de desarrollo backend.

## ⚙️ Tecnologías utilizadas

- Java 
- Spring Boot
- Spring Data JPA
- PostgreSQL
- Maven
- Lombok
- JUnit (para pruebas)

## 📦 Estructura del proyecto

- `controller/` – Maneja las solicitudes HTTP (endpoints).
- `service/` – Lógica del negocio.
- `model/` – Modelos o DTOs si aplica.
- `entity/` – Representa las entidades de la base de datos.
- `repository/` – Interfaces JPA para acceso a datos.
- `resources/` – Archivos de configuración (`application.properties`).
- `test/` – Pruebas unitarias y de integración.

## 🔄 Funcionalidad

Este proyecto implementa un **CRUD completo** (Crear, Leer, Actualizar, Eliminar) para una entidad definida, con conexión persistente a PostgreSQL.

## 🚀 Cómo ejecutar

1. Clona el repositorio.
2. Configura la conexión a la base de datos en `application.properties`.
3. Ejecuta la clase `ApiRestApplication.java` como aplicación Spring Boot.
4. Accede a los endpoints vía Postman, navegador o cualquier cliente HTTP.

