/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Cafetera;


import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class ServiciosCafetera {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cafetera caf= new Cafetera();
    public void   llenarCafetera() {
        System.out.println("Ingrese la capacidad en cc de la cafetera");
        double llenar = leer.nextInt();
        System.out.println("La capacidad de su cafetera es: " + llenar + " cc ");
        caf.setCapacidadMaxima(llenar);
        caf.setCantidadActual(llenar);
    }
    
    public void servirTaza() {
        System.out.println("Ingrese el tamaño de cafe que desea ");
        int taza = leer.nextInt();
        System.out.println("El tamaño del cafe que seleccionó es " + taza);
        if (taza <= caf.getCantidadActual()) {
            System.out.println("Que disfrutes tu café!! Gracias por elegir Nespresso");
           caf.setCantidadActual(caf.getCantidadActual() - (taza));

        } else if (taza > caf.getCantidadActual()) {

            System.out.println("Disculpe, la cantidad de cafe no alcanzó para llenar su taza");
            System.out.println("Se sirvieron " + caf.getCantidadActual() + " cc de café, en breve repondremos");
           
        } else if (caf.getCantidadActual() == 0) {
            System.out.println("Disculpe se agotó el cafe, en breve repondremos. Gracias ");
        }
    }

    public void vaciarCafetera() {
        caf.setCantidadActual(0);
        System.out.println("La cafetera ha sido vaciada");

    }

    public void agregarCafe() {
        System.out.println("Ingrese la cantidad de cafe que desea agregar");
        int agrega = leer.nextInt();
       caf.setCantidadActual(caf.getCantidadActual() + (agrega));
        System.out.println("Se ha agregado " + agrega + " cc de cafe a su cafetera ");
        System.out.println("La capacidad actual de su cafetera es : " + caf.getCantidadActual());
    }
}
