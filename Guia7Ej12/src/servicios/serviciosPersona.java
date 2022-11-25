/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class serviciosPersona {

    Scanner leer = new Scanner(System.in);

    public void crearPersona(Persona p) {

        System.out.println("Ingrese su  nombre");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese el año de su nacimiento");
        p.setAnio(leer.nextInt());
        System.out.println("Ingrese el mes de su nacimiento");
        p.setMes(leer.nextInt());
        System.out.println("Ingrese el dia de su nacimiento");
        p.setDia(leer.nextInt());
        System.out.println("el año de nacimiento ingresado es: " + p.getAnio());
        Date fechaNacimiento = new Date(p.getAnio() - 1900, p.getMes() - 1, p.getDia());
        p.setFechaNacimieto(fechaNacimiento);
        p.getFechaNacimieto().getYear();
    }

    public void calcularEdad(Persona p) {
        Date fechaActual = new Date();

        int edad = fechaActual.getYear() - p.getFechaNacimieto().getYear();
     
        System.out.println("Segun la fecha de nacimiento ingresada su edad actual es : " + edad);
    }

    public boolean menorQue(Persona p, int edad) {
        Date fechaActual = new Date();
        System.out.println("Ingrese la edad de la segunda persona para comparar si es menor o mayor a la persona creada");
        edad = leer.nextInt();
        boolean menor = false;
        int edad2 = fechaActual.getYear() - p.getFechaNacimieto().getYear();
        if (edad2 < edad) {
            menor = true;
        }
        return menor;
    }
    public void mostrarPersona(Persona p){
        System.out.println(""+p.toString());
    }
}
