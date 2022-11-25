/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej12;

import entidad.Persona;
import servicios.serviciosPersona;

/**
 *
 * @author ezepl
 */
public class Guia7Ej12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        serviciosPersona pe = new serviciosPersona();
        Persona p = new Persona();
        pe.crearPersona(p);

        pe.calcularEdad(p);
        System.out.println("" + pe.menorQue(p, 0));
        pe.mostrarPersona(p);
    }

}
