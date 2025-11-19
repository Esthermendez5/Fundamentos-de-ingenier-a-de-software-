# 🩺 Sistema de Gestión de Citas Médicas  
Proyecto académico — Ingeniería de Software

Este proyecto implementa un módulo funcional para la **gestión y registro de citas médicas**, cumpliendo los requisitos de análisis UML, diseño orientado a objetos y codificación del modelo. Incluye diagramas de casos de uso, clases, secuencia y la implementación gráfica del proceso de agendamiento de una cita.

---

## 📌 Objetivo del Proyecto

Automatizar el registro de citas médicas permitiendo a un paciente:

- Registrar sus datos.
- Seleccionar un doctor.
- Elegir fecha y hora.
- Crear una cita médica.
- Recibir una notificación automática de confirmación.


---

## 🧩 Arquitectura del Sistema

El proyecto está organizado siguiendo el modelo orientado a objetos.

### **Clases Principales**
| Clase | Descripción |
|-------|-------------|
| `Paciente` | Representa los datos y acciones del paciente. |
| `Doctor` | Contiene información del doctor y su disponibilidad. |
| `CitaMedica` | Estructura principal para registrar fecha, hora, doctor y paciente. |
| `Notificacion` | Genera y envía mensajes de confirmación. |
| `InterfazNotificar` | Interface que define el contrato para el envío de notificaciones. |
| `ServicioNotificaciones` | Implementación concreta de la interface. |
| `GestionCitasMedicas` | Interfaz gráfica del sistema para agendar citas. |

---

## 📘 Diagramas UML Incluidos

### ✔ Diagrama de Casos de Uso  
Representa los actores y funcionalidades principales:  
- Registrar paciente  
- Agendar cita  
- Enviar notificación  

### ✔ Diagrama de Clases  
Incluye relaciones, métodos, atributos, una interface y colaboraciones.

### ✔ Diagrama de Secuencia  
Modela el escenario “Agendar Cita” paso por paso:

1. Solicitud del paciente  
2. Consulta de disponibilidad del doctor  
3. Creación de la cita  
4. Generación de la notificación  
5. Confirmación al usuario  

---

## 🖥 Interfaz de Usuario

El sistema incluye una **UI moderna en Java Swing**, con estilos, colores suaves y diseño tipo tarjeta.  
Permite:

- Ingresar datos del paciente
- Seleccionar doctor
- Ingresar fecha y hora
- Agendar la cita
- Cerrar el programa automáticamente al finalizar
 ![texto alternativo]("C:\Users\Usuario\Downloads\Imagen de WhatsApp 2025-11-18 a las 23.11.40_15751b79.jpg")
  ![texto alternativo](""C:\Users\Usuario\Downloads\Imagen de WhatsApp 2025-11-18 a las 23.11.59_dea03def.jpg"")

---

## 🧑‍🏫 Trabajo Académico

Este proyecto forma parte de la **Semana 07: Casos de uso, clases, relaciones y secuencia**, cumpliendo con los siguientes entregables:

- ✔ Diagramas UML  
- ✔ Tarjetas CRC  
- ✔ Código del modelo  
- ✔ Simulación del escenario “Agendar Cita”  
- ✔ Interfaz gráfica funcional  
- ✔ Publicación en GitHub de acceso abierto  

---

