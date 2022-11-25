/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7extra2;

import entidad.puntos;
import servicios.serviciosPuntos;

/**
 *
 * @author ezepl
 */
public class Guia7Extra2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     puntos  p= new puntos();
     serviciosPuntos ptos=new serviciosPuntos(); 
      ptos.crearPuntos(p);
        System.out.println("La distancia entre los puntos ingresados es : "+ptos.calcularDistancia(p));
        
        
        
    }
    
}
