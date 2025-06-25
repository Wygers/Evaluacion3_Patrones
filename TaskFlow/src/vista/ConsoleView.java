/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import controlador.TaskController;
import java.util.InputMismatchException;
import java.util.Scanner;
import modelo.User;

/**
 *
 * @author vicen
 */
public class ConsoleView {
    private TaskController controller = new TaskController();
    
    public void mostrarMenu() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su nombre de usuario: ");
        String nombreUsuario = sc.nextLine().trim();
        User usuario = new User(nombreUsuario.isEmpty() ? "Anonimo" : nombreUsuario);

        while (true) {
            System.out.println("===== MENU PRINCIPAL =====");
            System.out.println("1. Crear tarea");
            System.out.println("2. Ver tareas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opcion: ");
            
            
            int opcion;
            try {
                opcion = sc.nextInt();
                sc.nextLine(); // Limpiar el buffer después de nextInt()
            } catch (InputMismatchException e) {
                System.out.println("⚠️ Entrada invalida. Debe ingresar un numero.");
                sc.nextLine(); // Consumir entrada inválida
                continue;
            }

            switch (opcion) {
                case 1:
                    System.out.print("Titulo de la tarea: ");
                    String titulo = sc.nextLine().trim();

                    System.out.print("Descripcion de la tarea: ");
                    String desc = sc.nextLine().trim();

                    if (titulo.isEmpty() || desc.isEmpty()) {
                        System.out.println("⚠️ El titulo y la descripcion no pueden estar vacíos.");
                    } else {
                        controller.createAndAssignTask(titulo, desc, usuario);
                        System.out.println("✅ Tarea creada y asignada a " + usuario.getName());
                    }
                    break;

                case 2:
                    System.out.println("📋 Lista de tareas:");
                    controller.getAllTasks().forEach(System.out::println);
                    break;

                case 0:
                    System.out.println("👋 Saliendo del sistema. ¡Hasta luego!");
                    return;

                default:
                    System.out.println("⚠️ Opcion no válida. Intente de nuevo.");
            }
        }
    }
}
