/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class raices {
int a;
int b;
int c;
    Scanner leer = new Scanner(System.in);
    public raices() {
    }

    public void  raiz (int a, int b, int c) {
        
        this.a =a ;
        this.b =  b ;
        this.c = c ;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Scanner getLeer() {
        return leer;
    }

    public void setLeer(Scanner leer) {
        this.leer = leer;
    }

    
    
    
    
    
    
    
    
}
