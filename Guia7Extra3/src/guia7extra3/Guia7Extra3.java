/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extra3;

import entidad.raices;
import servicios.serviciosRaices;

/**
 *
 * @author ezepl
 */
public class Guia7Extra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        serviciosRaices ecuaciones = new serviciosRaices();
        raices r = new raices();
        ecuaciones.constructor(r);
        System.out.println("El valor del discriminante es:  "+ecuaciones.getDiscriminante(r));
        System.out.println("La ecuación tiene solucion doble?? " +ecuaciones.tieneRaices(r));
        System.out.println("La ecuacion tiene una unica solucion?"+ecuaciones.tieneRaiz(r));
    }
}
