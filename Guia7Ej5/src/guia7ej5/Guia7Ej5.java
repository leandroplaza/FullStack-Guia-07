/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej5;

import Entidad.CuentaBancaria;
import Servicios.ServiciosCtaBanc;
import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class Guia7Ej5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer =new Scanner(System.in);
        int opc=0;
        ServiciosCtaBanc CB= new ServiciosCtaBanc();
      CuentaBancaria cbu= CB.crearCuenta();
        System.out.println("Elija la operacion que desea realizar");
        System.out.println("Para ingresar dinero, presione 1");
        System.out.println("Para retirar dinero, presione 2 ");
        System.out.println("Para extraccion rapida, presione 3");
        System.out.println("Para consultar su saldo, presione 4 ");
        System.out.println("Para consultar los datos de la cuenta, presione 5");
        System.out.println("Para salir, presione 6");
       
        while (  opc !=6) {
            opc=leer.nextInt();
            switch(opc){
                case 1:
                    CB.ingresarSaldo(cbu);
                    break;
                case 2:
                    CB.retirarSaldo(cbu);
                    break;
                case 3:
                    CB.extraerSaldo(cbu);
                    break;
                case 4:
                    CB.consultarSaldo(cbu);
                    break;
                case 5:
                    CB.consultarDatos(cbu);
                    break;
                case 6:
                    System.out.println("Gracias por elegir nuestro Banco ");
            
            
            
            
            
            }
        
            
        }
        
        
        
        
        
        
    }
    
}
