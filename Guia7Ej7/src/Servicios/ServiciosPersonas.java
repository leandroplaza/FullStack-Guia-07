 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class ServiciosPersonas {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona pers = new Persona();
        System.out.println("Ingrese su nombre y apellido");
        pers.setNombre(leer.next());
        System.out.println("Ingrese su edad");
        pers.setEdad(leer.nextInt());
        System.out.println("Sexo");
        pers.setSexo(leer.next());
        if (pers.getSexo().equalsIgnoreCase("m") | pers.getSexo().equalsIgnoreCase("f") | pers.getSexo().equalsIgnoreCase("o")) {
            pers.setSexo(pers.getSexo());
        } else {
            System.out.println("El caracter ingresado, no es valido, por favor ingrese nuevamente");
            pers.setSexo(leer.next());
        }
        System.out.println("Ingrese su peso expresado en kg");
        pers.setPeso(leer.nextDouble());
        System.out.println("Ingrese su altura expresada en mts");
        pers.setAltura(leer.nextDouble());
        return pers;
    }

    public double CalcularIMCPersona(Persona pers) {
        int retorno = 1987;
        double calculo = pers.getPeso() / (pers.getAltura() * pers.getAltura());

        if (calculo < 20) {
           System.out.println("Su IMC se encuentra por debajo de los valores ideales");

            retorno = -1;

        }
        if (calculo > 19 && calculo < 26) {
            System.out.println("Su IMC se encuentra en los valores  ideales");

            retorno = 0;
        }
        if (calculo > 26) {
            System.out.println("Su IMC se encuentra por encima de los valores ideales");

            retorno = 1;
        }
        return retorno;
    }

    public boolean MayorEdadPersona(Persona pers) {

        boolean mayoredad = false;

        if (pers.getEdad() > 17) {
            mayoredad = true;
            
        }

        return mayoredad;

    }
}
