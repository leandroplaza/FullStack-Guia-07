/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.puntos;
import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class serviciosPuntos {

    Scanner leer = new Scanner(System.in);

    public void crearPuntos(puntos ptos) {
        System.out.println("Ingrese el valor de las coordenadas del punto 1, en donde el primer numero ingresado será el valor del eje X1,"
                + "y el segundo numero ingresado será el valor del eje Y1 ");
        System.out.println("Ingrese el valor para X1");
        ptos.setX1(leer.nextInt());
         System.out.println("Ingrese el valor para Y1");
        ptos.setY1(leer.nextInt());
        System.out.println("Ingrese el valor de las coordenadas del punto 2, en donde el primer numero ingresado será el valor del eje X2,"
                + "y el segundo numero ingresado sera el valor del eje Y2 ");
        System.out.println("Ingrese el valor para Y1");
        ptos.setX2(leer.nextInt());
         System.out.println("Ingrese el valor para Y2");
        ptos.setY2(leer.nextInt());

    }

    public double calcularDistancia(puntos ptos) {

        int punto1 = ptos.getX2() - ptos.getX1();
        System.out.println("valor X2  "+ptos.getX2());
        System.out.println("valor X1  "+ptos.getX1());
        System.out.println("valor punto1 (X2-X1)  "+punto1);
        System.out.println("--------------------------------------------------------");
        double coordenada1 = Math.pow(punto1, 2);
        System.out.println("valor coordenada1 (punto 1 al cuadrado)  "+coordenada1);
        System.out.println("--------------------------------------------------------");
        int punto2 = ptos.getY2() - ptos.getY1();
         System.out.println("valor Y2  "+ptos.getY2());
        System.out.println("valor Y1  "+ptos.getY1());
        System.out.println("valor punto2 (Y2-Y1)  "+punto2);
        System.out.println("--------------------------------------------------------");
                
        double coordenada2 = Math.pow(punto2, 2);
        System.out.println("valor coordenada 2 (punto 2 al cuadrado) "+coordenada2);
          System.out.println("--------------------------------------------------------");
        double distancia = Math.sqrt(coordenada1 + coordenada2);
        return distancia;
    }
}
