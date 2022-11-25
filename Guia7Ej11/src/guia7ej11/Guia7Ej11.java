/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej11;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class Guia7Ej11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese año");
        int anio = leer.nextInt();

        System.out.println("Ingrese mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese dia");
        int dia = leer.nextInt();

        Date fecha = new Date(anio - 1900, mes - 1, dia);

        System.out.println("" + fecha);
        Date fechaActual = new Date();
        if (fechaActual.getYear() > fecha.getYear()) {
            System.out.println("La diferencia de años entre la fecha ingresada y la fecha actual es " + (fechaActual.getYear() - fecha.getYear()));
        }
        if (fechaActual.getYear() < fecha.getYear()) {
            System.out.println("La diferencia de años entre la fecha ingresada y la fecha actual es " + (fecha.getYear() - fechaActual.getYear()));
        }

    }

}
