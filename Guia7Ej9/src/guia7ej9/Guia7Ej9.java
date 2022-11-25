/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej9;

import entidad.matematica;
import servicios.serviciosMatematica;

/**
 *
 * @author ezepl
 */
public class Guia7Ej9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        serviciosMatematica mat = new serviciosMatematica();
        matematica mate = new matematica();

        mate.setNum1(Math.random() * 10);
        mate.setNum2(Math.random() * 10);
        System.out.println("El numero 1 es: " + mate.getNum1());
        System.out.println("El numero 2 es: " + mate.getNum2());
        mat.devolverMayor(mate);
        mat.calcularPotencia(mate);
        mat.calcularRaiz(mate);
        
    
    
    
    
    }

}
