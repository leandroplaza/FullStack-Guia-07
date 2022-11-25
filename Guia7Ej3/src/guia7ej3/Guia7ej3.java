/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej3;

import Entidad.Operacion;
import Servicios.ServicioOperacion;

/**
 *
 * @author ezepl
 */
public class Guia7ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioOperacion op = new ServicioOperacion();
       
        Operacion oper = op.crearOperacion();
        
               
        System.out.println("El resultado de la suma es " + op.sumaOperacion(oper));
        System.out.println("El resultado de la resta es " + op.restaOperacion(oper));
        System.out.println("El resultado de la multiplicacion es " + op.multiplicarOperacion(oper));
        System.out.println("El resultado de la division es " + op.dividirOperacion(oper));
    }
    
}
