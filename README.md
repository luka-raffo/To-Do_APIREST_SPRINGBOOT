# To-Do_APIREST_SPRINGBOOT

![Captura de pantalla 2025-02-03 203757](https://github.com/user-attachments/assets/a94c0e66-5470-4cfa-847d-6151dd3510ff)
![Captura de pantalla 2025-02-04 095609](https://github.com/user-attachments/assets/331ff6b1-ef47-4ef8-9ee1-7b7da04d2c8a)
![Captura de pantalla 2025-02-04 095702](https://github.com/user-attachments/assets/dfe5a4a3-8ce1-4fb8-ac27-36df757b218c)
![Captura de pantalla 2025-02-04 095752](https://github.com/user-attachments/assets/c4e4dcf0-75c0-4d21-80e4-69501be0ab5d)
![Captura de pantalla 2025-02-04 095828](https://github.com/user-attachments/assets/a72aff15-6cf5-4bd1-8016-0dd501223884)




Este repositorio contiene una API RESTful para gestionar una lista de tareas (To-Do) construida con Spring Boot. La API permite realizar operaciones CRUD (Crear, Leer, Actualizar y Eliminar) sobre las tareas, así como gestionar usuarios y autenticación.

## Características principales

- **Gestión de Tareas**: Crear, leer, actualizar y eliminar tareas.
- **Base de Datos**: Uso de una base de datos relacional (MySQL) para almacenar la información.

## Tecnologías utilizadas

- **Spring Boot**: Framework principal para construir la aplicación.
- **Spring Data JPA**: Para la persistencia de datos.
- **MySQ**: Base de datos relacional.
- **Maven**: Gestión de dependencias y construcción del proyecto.

## Requisitos previos

- Java 17 o superior.
- Maven 3.x.
- MySQL, PostgreSQL u otra base de datos compatible.
- IDE compatible con Spring Boot (IntelliJ IDEA, Eclipse, etc.).

## Configuración

1. **Clonar el repositorio**:
   ```bash
   git clone https://github.com/luka-raffo/To-Do_APIREST_SPRINGBOOT.git
   cd To-Do_APIREST_SPRINGBOOT


Tareas:

    GET /api/tasks: Obtener todas las tareas.

    POST /api/tasks: Crear una nueva tarea.

    PUT /api/tasks/{id}: Actualizar una tarea existente.

    DELETE /api/tasks/{id}: Eliminar una tarea.
