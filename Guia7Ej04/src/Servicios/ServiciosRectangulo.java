/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class ServiciosRectangulo {

    Scanner leer = new Scanner(System.in);

    public Rectangulo crearRectangulo() {
        System.out.println("Ingrese la medida de la base del rectangulo");
        double base = leer.nextDouble();
        System.out.println("La base del rectangulo es "+base);
        System.out.println("Ingrese la medida de la altura del rectangulo");
        double altura = leer.nextDouble();
         System.out.println("La altura del rectangulo es "+altura);
        return new Rectangulo(base, altura);
    }
    public double superficieRectangulo(Rectangulo superficie){
            return superficie.getBase()*superficie.getAltura();
    }
    public double perimetroRectangulo(Rectangulo perimetro){
            return 2*perimetro.getBase()+2*perimetro.getAltura();
    } 
    public void  dibujarRectangulo(Rectangulo dib){
        for (int i = 1; i <= dib.getAltura(); i++) {
            for (int j = 1; j <= dib.getBase(); j++) {
                if (i > 1 && i < dib.getAltura() && j > 1 && j < dib.getBase()) {
                    System.out.print("   ");
                   
                } else {
                    System.out.print("*  ");
                }
            }
            System.out.println("");
        }

    
    
    }




}    
    
    
