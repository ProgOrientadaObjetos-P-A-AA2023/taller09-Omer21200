/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete3;

import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoAutomovil extends Prestamo {

    private Persona garante;
    private String tipoAutomovil;
    private String marcavehiculo;
    private double valoAutomivil;
    private double valorMensual;

    public PrestamoAutomovil(Persona ga, String tipoAuto, String marcavehi,
            double valoAuto, Persona bene, double numMe, String ciu) {
        super(bene, numMe, ciu);
        garante = ga;
        tipoAutomovil = tipoAuto;
        marcavehiculo = marcavehi;
        valoAutomivil = valoAuto;
    }

    public void establecerGarante(Persona ga) {
        garante = ga;
    }

    public void establecerTipoAutomovil(String tipoAuto) {
        tipoAutomovil = tipoAuto;
    }

    public void establecerMarcavehiculo(String marcavehi) {
        marcavehiculo = marcavehi;
    }

    public void establecerValoAutomivil(double valoAuto) {
        valoAutomivil = valoAuto;
    }

    public void establecerValorMensual() {
        valorMensual = valoAutomivil / numMeses;
    }

    public Persona obtenerGarante() {
        return garante;
    }

    public String obtenerTipoAutomovil() {
        return tipoAutomovil;
    }

    public String obtenerMarcavehiculo() {
        return marcavehiculo;
    }

    public double obtenerValoAutomivil() {
        return valoAutomivil;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }

    @Override
    public String toString() {
        String cadena = String.format("Prestamo de Automovil");
        cadena = String.format("%s\n%s", cadena, super.toString());
        cadena = String.format("%sGarante:\n%s", cadena, garante);
        cadena = String.format("%sTipo de Automovil: %s\nMarca Automovil: %s\n"
                + "Valor del Automovil: %.2f\nValor Mensual: %.2f\n", cadena,
                tipoAutomovil, marcavehiculo, valoAutomivil, valorMensual);
        return cadena;
    }
}
