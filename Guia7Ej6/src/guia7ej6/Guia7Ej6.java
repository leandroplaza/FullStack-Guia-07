/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej6;

import Entidad.Cafetera;
import Servicios.ServiciosCafetera;
import java.util.Scanner;


/**
 *
 * @author ezepl
 */
public class Guia7Ej6 {
    Scanner leer= new Scanner(System.in);
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner leer= new Scanner(System.in);
        ServiciosCafetera cf = new ServiciosCafetera();
        System.out.println("Ingrese la opcion que desee");
        System.out.println("Para llenar cafetera, coloque 1");
        System.out.println("Para servir taza, coloque 2");
        System.out.println("Para vaciar cafetera, coloque 3");
        System.out.println("Para agregar cafe, coloque 4");
        System.out.println("Para salir , coloque 5");

        int opc = 0;
        while (opc != 5) {
        opc=leer.nextInt();
            switch (opc) {
                case 1:
                    cf.llenarCafetera();
                    break;
                case 2:
                    cf.servirTaza();
                    break;
                case 3:
                    cf.vaciarCafetera();
                    break;
                case 4:
                    cf.agregarCafe();
                    break;
                case 5:
                    System.out.println("Gracias por elegir Nespresso");
            }

        }

    }
}