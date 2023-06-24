/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author omerb
 */
public class Persona {

    private String nombre;
    private String apellido;
    private String userName;

    public Persona(String nom, String ape, String us) {
        nombre = nom;
        apellido = ape;
        userName = us;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerApellido(String ape) {
        apellido = ape;
    }

    public void establecerUserName(String us) {
        userName = us;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerApellido() {
        return apellido;
    }

    public String obtenerUserName() {
        return userName;
    }

    @Override
    public String toString() {
        String cadena = String.format("Nombre Completo: %s %s\nUserName: %s\n", nombre,apellido, userName);
        return cadena;
    }
}
