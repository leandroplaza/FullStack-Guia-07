/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej04;

import Entidad.Rectangulo;
import Servicios.ServiciosRectangulo;

/**
 *
 * @author ezepl
 */
public class Guia7Ej04 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServiciosRectangulo rct = new ServiciosRectangulo();
        Rectangulo rc = rct.crearRectangulo();
        
        System.out.println("La superficie del perimetro es "+rct.superficieRectangulo(rc));
        System.out.println("El perimetro del rectangulo es "+rct.perimetroRectangulo(rc));
        rct.dibujarRectangulo(rc);

    }

}
