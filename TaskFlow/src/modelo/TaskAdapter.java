/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vicen
 */
public class TaskAdapter {
    public static Task fromInput(String titulo, String descripcion, User usuario) {
        Task tarea = new Task(titulo, descripcion);
        tarea.assignUser(usuario);
        return tarea;
    }
}
