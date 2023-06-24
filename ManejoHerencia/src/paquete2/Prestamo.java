/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;

/**
 *
 * @author reroes
 */
public class Prestamo {

    protected Persona beneficiario;
    protected double numMeses;
    protected String ciudad;

    public Prestamo(Persona bene, double numMe, String ciu) {
        beneficiario = bene;
        numMeses = numMe;
        ciudad = ciu.toLowerCase();
    }

    public void establecerBeneficiario(Persona bene) {
        beneficiario = bene;
    }

    public void establecerNumMeses(int numMe) {
        numMeses = numMe;
    }

    public void establecerCiudad(String ciu) {
        ciudad = ciu.toLowerCase();
    }

    public Persona obtenerBeneficiario() {
        return beneficiario;
    }

    public double obtenerNumMeses() {
        return numMeses;
    }

    public String obtenerCiudad() {
        return ciudad;
    }

    @Override
    public String toString() {
        String cadena = String.format("Beneficiaro: \n%s", beneficiario);
        cadena=String.format("%sCiudad: %s\nNumero de meses: %.0f\n", cadena,ciudad,numMeses);
        return cadena;
    }
}
