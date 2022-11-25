/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import entidad.matematica;

/**
 *
 * @author ezepl
 */
public class serviciosMatematica {

    public void devolverMayor(matematica mat) {
        if (mat.getNum1() > mat.getNum2()) {
            System.out.println("El numero 1 es mayor al numero 2");
        }
        if (mat.getNum1() == mat.getNum2()) {
            System.out.println("El numero 1 es igual al numero 2");
        }
        if (mat.getNum1() < mat.getNum2()) {
            System.out.println("El numero 1 es menor al numero 2");
        }
    }

    public void calcularPotencia(matematica mat) {
        double numero1 = mat.getNum1();
        double numero2 = mat.getNum2();
        numero1 = Math.round(numero1);
        numero2 = Math.round(numero2);
        System.out.println("El numero 1 es: " + mat.getNum1() + " lo redondeamos para que quede como entero, por lo tanto es " + numero1);
        System.out.println("El numero 1 es: " + mat.getNum2() + " lo redondeamos para que quede como entero, por lo tanto es " + numero2);
        double potencia;
        if (numero1 > numero2) {
            potencia = Math.pow(numero1, numero2);
            System.out.println("El numero 2 es menor al numero 1, por lo tanto el numero1 elevado a numero 2 es " + potencia);
        }
        if (numero1 < numero2) {
            potencia = Math.pow(numero2, numero1);
            System.out.println("El numero 1 es menor al numero 2, por lo tanto el numero2 elevado a numero 1 es " + potencia);
        }
    }

     public void calcularRaiz(matematica mat) {
        double numero1 = mat.getNum1();
        double numero2 = mat.getNum2();
        numero1 = Math.round(numero1);
        numero2 = Math.round(numero2);
        System.out.println("El numero 1 es: " + mat.getNum1() + " lo redondeamos para que quede como entero, por lo tanto es " + numero1);
        System.out.println("El numero 1 es: " + mat.getNum2() + " lo redondeamos para que quede como entero, por lo tanto es " + numero2);
        double raiz;
        if (numero1 > numero2) {
            raiz = Math.sqrt( numero2);
            System.out.println("El numero 2 es menor al numero 1, por lo tanto la raíz cuadrada del numero 2 es " + raiz);
        }
        if (numero1 < numero2) {
           raiz = Math.sqrt( numero1);
            System.out.println("El numero 1 es menor al numero 2, por lo tanto la raíz cuadrada del numero 1 es " + raiz);
        }
    }











}
