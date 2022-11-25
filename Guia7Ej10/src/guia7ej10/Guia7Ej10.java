/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej10;

import java.util.Arrays;

/**
 *
 * @author ezepl
 */
public class Guia7Ej10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    double[]arregloA=new double[50];
    double[]arregloB=new double[20];
    
        for (int i = 0; i < 50; i++) {
            arregloA[i]=(Math.random()*10);
            System.out.print(""+arregloA[i]);
            
        }
        Arrays.sort(arregloA);
        System.out.println(" ");
        
        System.out.print(""+Arrays.toString(arregloA));
        System.out.println(" ");
        for (int i = 0; i < 20; i++) {
            if (i>=0 && i<10) {
                arregloB[i]=arregloA[i];
            }else if (i>=10 && i<20 ) {
                arregloB[i]=0.5;
            }
                
            
            
        }
        
        
        
        
        System.out.println(""+Arrays.toString(arregloB));
    
    
    
    }
    
}
