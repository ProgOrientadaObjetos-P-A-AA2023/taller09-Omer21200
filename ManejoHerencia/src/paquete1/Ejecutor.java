/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import paquete2.InstitucionEducativa;
import paquete2.Persona;
import paquete2.Prestamo;
import paquete3.PrestamoAutomovil;
import paquete4.PrestamoEducativo;

/**
 *
 * @author reroes
 */
public class Ejecutor {

    public static void main(String[] args) {
        //--------------------------------------------
        List<Prestamo> lista = new ArrayList<>();
        String nombre, apellido, userName, ciudad;
        double tiemPres = 0, valorVehiculo;
        String tipoVehiculo, marcaVehiculo;
        Scanner sc = new Scanner(System.in);
        String operador, opc;
        String nivelEstu, nombreCen, siglaCen;
        double valorCarrera;
        boolean ban = true, ban2 = true, ban3 = true;
        do {

            nombre = ingresarCadenas("Ingrese el Nombre del Beneficiario: ");
            apellido = ingresarCadenas("Ingrese el Apellido del Beneficiario: ");
            userName = ingresarCadenas("Ingrese el UserName del Beneficiario: ");
            ciudad = ingresarCadenas("Ingrese la Ciudad: ");
            tiemPres = ingresarNumeros("Ingrese el Tiempo de Prestamo: ", 2);
            Persona benefi = new Persona(nombre, apellido, userName);
            do {
                System.out.println("-----------------Tipo de Prestamo--------------------");
                System.out.println("| -Prestamo De Automovil(1)                          |");
                System.out.println("| -Prestamo Estudiantil(2)                           |");
                System.out.println("------------------------------------------------------");
                System.out.print("Opc: ");
                operador = sc.nextLine();
                switch (operador) {
                    case "1":
                        ban3 = false;
                        nombre = ingresarCadenas("Ingrese el Nombre del Garante: ");
                        apellido = ingresarCadenas("Ingrese el Apellido del Garante: ");
                        userName = ingresarCadenas("Ingrese el UserName del Garante: ");
                        tipoVehiculo = ingresarCadenas("Ingrese el Tipo del Vehiculo: ");
                        marcaVehiculo = ingresarCadenas("Ingrese la Marca del Vehiculo: ");
                        valorVehiculo = ingresarNumeros("Ingrese el valor del Vehiculo: ", 1);
                        Persona garante = new Persona(nombre, apellido, userName);
                        PrestamoAutomovil presAuto = new PrestamoAutomovil(garante, tipoVehiculo,
                                marcaVehiculo, valorVehiculo, benefi, tiemPres, ciudad); // crearPropietario();
                        presAuto.establecerValorMensual();
                        lista.add(presAuto);
                        break;
                    case "2":
                        ban3 = false;
                        nombreCen = ingresarCadenas("Ingrese el Nombre del Centro Eduactivo: ");
                        siglaCen = ingresarCadenas("Ingrese las Siglas del Centro Eduactivo: ");
                        nivelEstu = ingresarCadenas("Ingrese el nivel de estudio del Beneficiario: ");
                        valorCarrera = ingresarNumeros("Ingrese el valor de la Carrera: ", 1);
                        InstitucionEducativa institu = new InstitucionEducativa(nombreCen, siglaCen);
                        PrestamoEducativo presEdu = new PrestamoEducativo(nivelEstu, institu, valorCarrera, benefi, tiemPres, ciudad);
                        presEdu.establecerValorMensual();
                        lista.add(presEdu);
                        break;
                    default:
                        System.out.println("Resultado no valido");
                        ban3 = true;
                        break;
                }
            } while (ban3);

            if (ban == true) {
                do {
                    opc = ingresarCadenas("Desea realizar otra opción (Si/No): ");
                    if (opc.equals("Si") || opc.equals("si")) {
                        ban2 = false;
                        ban = true;
                    } else if (opc.equals("No") || opc.equals("no")) {
                        ban2 = false;
                        ban = false;
                    } else {
                        System.out.println("Error......");
                    }
                } while (ban2);
            }

        } while (ban);
        System.out.println("");
        for (Prestamo lista1 : lista) {
            System.out.println(lista1);
        }

    }

    public static double ingresarNumeros(String s, int tipo) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.US);
        boolean ban = true;
        double numero = 0;
        do {
            try {
                ban = false;
                System.out.print(s);
                if (tipo == 1) {
                    numero = sc.nextDouble();
                } else {
                    numero = sc.nextInt();
                }

            } catch (Exception e) {
                ban = true;
                System.out.println("Error al ingresar el numero...");
                sc.nextLine();
            }
        } while (ban);
        return numero;
    }

    public static String ingresarCadenas(String s) {
        Scanner sc = new Scanner(System.in);
        System.out.print(s);
        String cade = sc.nextLine();
        return cade;
    }
}
