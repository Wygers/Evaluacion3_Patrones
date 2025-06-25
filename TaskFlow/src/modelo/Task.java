/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vicen
 */
public class Task {
    private static int contador = 1;
    private int id;
    private String title;
    private String description;
    private boolean completed;
    private User assignedUser;

    public Task(String title, String description) {
        this.id = contador++;
        this.title = title;
        this.description = description;
        this.completed = false;
    }

    public void assignUser(User user) {
        this.assignedUser = user;
    }

    public void markAsCompleted() {
        this.completed = true;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public boolean isCompleted() {
        return completed;
    }

    public String getDescription() {
        return description;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    @Override
    public String toString() {
        return "Tarea #" + id +
               " - Título: " + title +
               " - Descripción: " + description +
               " - Estado: " + (completed ? "✅ Completada" : "⏳ Pendiente") +
               (assignedUser != null ? " - Asignada a: " + assignedUser.getName() : " - Sin asignar");
    }
}
