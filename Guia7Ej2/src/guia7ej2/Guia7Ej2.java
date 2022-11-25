/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej2;

import Entidad.Circunferencia;
import Servicios.ServicioCircunferencia;




/**
 *
 * @author ezepl
 */
public class Guia7Ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
      ServicioCircunferencia sc= new ServicioCircunferencia();
      Circunferencia ver= sc.crearCircunferencia();
      sc.areaCircunferencia(ver);
      sc.perimetroCircunferencia(ver);

    }
}