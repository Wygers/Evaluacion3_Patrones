📝 TaskFlow – Gestor de Tareas Colaborativas

Descripción: TaskFlow permite a usuarios gestionar tareas, asignarlas, y recibir notificaciones. Ideal para pymes o estudiantes que requieren una solución sencilla

Patrones Aplicados:
- **Singleton**: `TaskRepository` asegura única instancia de almacenamiento en memoria.
- **Adapter**: `TaskAdapter` transforma datos de entrada en objetos `Task`.
- **Observer**: `User` implementa `Observer`, recibiendo notificaciones de nuevas tareas.
- **MVC**: Separación clara entre Modelo, Vista (consola) y Controlador
