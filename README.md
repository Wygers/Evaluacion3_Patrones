# 🧠 TaskFlow – Sistema de Gestión de Tareas

**TaskFlow** es una aplicación Java orientada a objetos que simula un sistema de gestión de tareas colaborativas. Permite crear, asignar y visualizar tareas, notificando automáticamente a los usuarios asignados. El proyecto aplica múltiples patrones de diseño GoF para asegurar una arquitectura escalable, modular y mantenible.

---

## 📌 Descripción

El sistema permite:

- Crear tareas con título y descripción.
- Asignar tareas a usuarios específicos.
- Visualizar el listado de tareas registradas.
- Notificar a los usuarios cuando reciben nuevas tareas.
- Ejecutar toda la lógica desde consola, con posibilidad de expansión a interfaces gráficas.

---

## 🎯 Problema que Resuelve

En muchos contextos (equipos pequeños, proyectos académicos o personales), no se dispone de herramientas simples para gestionar tareas sin depender de plataformas complejas.

**TaskFlow** simula una solución local, ejecutable desde consola, que permite:

- Centralizar la gestión de tareas.
- Simular asignación automática con notificación al usuario.
- Separar claramente la lógica, vista y datos (MVC).
- Preparar el sistema para futuras expansiones.

---

## 🧠 Patrones de Diseño Aplicados

### 1. 🧱 Singleton (Creacional)
- **Dónde:** `TaskRepository.java`
- **Por qué:** Se requiere una única instancia global que mantenga el estado compartido de todas las tareas.
- **Cómo:** Implementación estática con método `getInstance()` que asegura instancia única.

---

### 2. 🔌 Adapter (Estructural)
- **Dónde:** `TaskAdapter.java`
- **Por qué:** Desacopla la entrada desde la vista del modelo, permitiendo transformar texto plano en instancias de `Task`.
- **Cómo:** Método `fromInput()` convierte los datos ingresados en consola en objetos del modelo.

---

### 3. 👀 Observer (Comportamiento)
- **Dónde:** `Observer.java`, `User.java`
- **Por qué:** Permite que el usuario sea notificado automáticamente cuando recibe una tarea.
- **Cómo:** La clase `User` implementa el patrón `Observer` y define el método `update()` para recibir mensajes de asignación.

---

### 4. 🧩 MVC – Modelo Vista Controlador (Libre elección)
- **Dónde:** `modelo/`, `vista/`, `controlador/`
- **Por qué:** Separa responsabilidades para facilitar mantenimiento y escalabilidad.
- **Cómo:**
  - `modelo/`: contiene entidades, patrones y lógica.
  - `controlador/`: conecta modelo y vista.
  - `vista/`: gestiona la interacción por consola.

---

## 🚀 Cómo Ejecutar el Proyecto

### 🔧 Requisitos
- JDK 8 o superior
- Terminal, NetBeans o IDE compatible

### 🧪 Desde terminal

```bash
# Compilación
javac -d bin src/modelo/*.java src/controlador/*.java src/vista/*.java

# Ejecución
java -cp bin vista.Main
