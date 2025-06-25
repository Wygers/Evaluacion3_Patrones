/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import java.util.List;
import modelo.Task;
import modelo.TaskAdapter;
import modelo.TaskRepository;
import modelo.User;

/**
 *
 * @author vicen
 */
public class TaskController {
    private TaskRepository repo = TaskRepository.getInstance(); // aca se esta llamando al patron singleton proveniente de TaskRepository

    public void createAndAssignTask(String title, String desc, User user) {
        Task task = TaskAdapter.fromInput(title, desc, user);
        repo.addTask(task);
        user.update("Nueva tarea asignada: " + task.getTitle());
    }

    public List<Task> getAllTasks() {
        return repo.getAllTasks();
    }
    
}
