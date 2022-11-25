/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.raices;
import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class serviciosRaices {

    Scanner leer = new Scanner(System.in);

    public void constructor(raices r) {
        System.out.println("Ingrese el valor del coeficiente A");
        r.setA(leer.nextInt());
        System.out.println("Ingrese el valor del coeficiente B");
        r.setB(leer.nextInt());
        System.out.println("Ingrese el valor del coeficiente C");
        r.setC(leer.nextInt());
    }

    public double getDiscriminante(raices r) {
        double discriminante;
        discriminante = Math.pow(r.getB(), 2) - (4 * r.getA() * r.getC());
       
        return discriminante;
    }

    public boolean tieneRaices(raices r) {
        boolean solucion = false;
        if (getDiscriminante(r) > 0) {

            solucion = true;
        }
        return solucion;
    }
    public boolean tieneRaiz(raices r) {
        boolean solucion = false;
        if (getDiscriminante(r) == 0) {
            solucion = true;
        }
        return solucion;
    }
    public void obtenerRaices(raices r){
        double ecuacion;
        if (tieneRaices(r)==true) {
           //ecuacion= -r.getB()+(Math.sqrt(r.getB())(Math.pow(r.getB(),2)-4*r.getA()*r.getC()))/2*r.getA());
        }
        







    }
















}
