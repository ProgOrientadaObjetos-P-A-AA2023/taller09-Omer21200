/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;

/**
 *
 * @author reroes
 */
public class PrestamoEducativo extends Prestamo{
    private String nivelEstudio;
    private InstitucionEducativa centroEducativo;
    private double valorCarrera;
    private double valorMensual;

    public PrestamoEducativo(String nivelEstu, InstitucionEducativa centroEdu, 
            double valorCa, Persona bene, double numMe, String ciu) {
        super(bene, numMe, ciu);
        nivelEstudio = nivelEstu;
        centroEducativo = centroEdu;
        valorCarrera = valorCa;
    }

    public void establecerNivelEstudio(String nivelEstu) {
        nivelEstudio = nivelEstu;
    }

    public void establecerCentroEducativo(InstitucionEducativa centroEdu) {
        centroEducativo = centroEdu;
    }

    public void establecerValorCarrera(double valorCa) {
        valorCarrera = valorCa;
    }

    public void establecerValorMensual() {
        valorMensual = (valorCarrera/numMeses)-(0.10*(valorCarrera/numMeses));
    }

    public String obtenerNivelEstudio() {
        return nivelEstudio;
    }

    public InstitucionEducativa obtenerCentroEducativo() {
        return centroEducativo;
    }

    public double obtenerValorCarrera() {
        return valorCarrera;
    }

    public double obtenerValorMensual() {
        return valorMensual;
    }
    @Override
    public String toString() {
        String cadena = String.format("Prestamo de Estudiantil");
        cadena = String.format("%s\n%s", cadena, super.toString());
        cadena = String.format("%s%s", cadena, centroEducativo);
        cadena = String.format("%sNivel de Estudio: %s\n"
                + "Valor de la Carrera: %.2f\nValor Mensual: %.2f\n", cadena,
                nivelEstudio, valorCarrera, valorMensual);
        return cadena;
    }
}
