/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author vicen
 */
public class User implements Observer{
    private String name;

    public User(String name) {
        this.name = name;
    }

    public void update(String message) {
        System.out.println("[" + name + "] Notificacion: " + message);
    }

    public String getName() {
        return name;
    }
}
