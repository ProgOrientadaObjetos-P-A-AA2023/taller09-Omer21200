/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete2;

/**
 *
 * @author omerb
 */
public class InstitucionEducativa {
    private String nombre;
    private String siglas;

    public InstitucionEducativa(String nom, String si) {
        nombre = nom;
        siglas = si;
    }

    public void establecerNombre(String nom) {
        nombre = nom;
    }

    public void establecerSiglas(String si) {
        siglas = si;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public String obtenerSiglas() {
        return siglas;
    }
    
    @Override
    public String toString(){
        String cadena=String.format("Institucion Educativa\nNombre: %s\nSiglas: %s\n", nombre,siglas);
        return cadena;
    }
    
}
