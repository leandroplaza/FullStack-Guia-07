/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej7;

import Entidad.Persona;
import Servicios.ServiciosPersonas;

/**
 *
 * @author ezepl
 */
public class Guia7Ej7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Scanner leer = new Scanner(System.in);
        //Persona peso= IMC.crearPersona();
        //IMC.crearPersona();
        int debajo = 0;
        int igual = 0;
        int encima = 0;
        int mayores = 0;
        int menores = 0;

        ServiciosPersonas IMC = new ServiciosPersonas();

        Persona pers1 = IMC.crearPersona();
        IMC.CalcularIMCPersona(pers1);
        IMC.MayorEdadPersona(pers1);

        Persona pers2 = IMC.crearPersona();
        IMC.CalcularIMCPersona(pers2);
        IMC.MayorEdadPersona(pers2);

        Persona pers3 = IMC.crearPersona();
        IMC.CalcularIMCPersona(pers3);
        IMC.MayorEdadPersona(pers3);

        Persona pers4 = IMC.crearPersona();
        IMC.CalcularIMCPersona(pers4);
        IMC.MayorEdadPersona(pers4);
        if (IMC.MayorEdadPersona(pers1)) {
            mayores++;

        } else {
            menores++;
        }
        if (IMC.MayorEdadPersona(pers2)) {
            mayores++;

        } else {
            menores++;
        }
        if (IMC.MayorEdadPersona(pers3)) {
            mayores++;

        } else {
            menores++;
        }

        if (IMC.MayorEdadPersona(pers4)) {
            mayores++;

        } else {
            menores++;
        }

        if (IMC.CalcularIMCPersona(pers1) == -1) {
            debajo++;
        }
        if (IMC.CalcularIMCPersona(pers1) == 0) {
            igual++;
        }
        if (IMC.CalcularIMCPersona(pers1) == 1) {
            encima++;
        }
        if (IMC.CalcularIMCPersona(pers2) == -1) {
            debajo++;
        }
        if (IMC.CalcularIMCPersona(pers2) == 0) {
            igual++;
        }
        if (IMC.CalcularIMCPersona(pers2) == 1) {
            encima++;
        }
        if (IMC.CalcularIMCPersona(pers3) == -1) {
            debajo++;
        }
        if (IMC.CalcularIMCPersona(pers3) == 0) {
            igual++;
        }
        if (IMC.CalcularIMCPersona(pers3) == 1) {
            encima++;
        }
        if (IMC.CalcularIMCPersona(pers4) == -1) {
            debajo++;
        }
        if (IMC.CalcularIMCPersona(pers4) == 0) {
            igual++;
        }
        if (IMC.CalcularIMCPersona(pers4) == 1) {
            encima++;
        }

    

    System.out.println ("Las cantidad de personas que se encuentran por debajo del IMC, son ; " + debajo);
    System.out.println ("Las cantidad de personas que se encuentran con el IMC en los valores normales, son : " + igual);
    System.out.println ("Las cantidad de personas que se encuentran por encima del IMC, son ; " + encima);

    System.out.println ("El porcentaje de mayores de edad es  " + mayores * 100 / 4+ " % ");
    System.out.println ("El porcentaje de menores de edad es  " + menores * 100 / 4+ " % ");

    }
}

