/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class ServiciosCtaBanc {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
;

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese su numero de  cliente");
        int numeroCliente = leer.nextInt();
        System.out.println("Ingrese su nombre y apellido");
        String nombre = leer.next();
        System.out.println("Ingrese su numeron de Dni");
        long dni = leer.nextLong();
        return new CuentaBancaria(numeroCliente, dni, nombre);

    }

    public void ingresarSaldo(CuentaBancaria cta) {
        System.out.println("Coloque  el importe a ingresar a su cuenta");
        int dineroIngresar = leer.nextInt();
        cta.setSaldoActual(dineroIngresar + cta.getSaldoActual());
        System.out.println("El importe ingresado es "+dineroIngresar);
        System.out.println("Su saldo actual es "+cta.getSaldoActual());
    }

    public void retirarSaldo(CuentaBancaria ret) {
        System.out.println("Ingrese el importe que desea retirar");
        int retirar = leer.nextInt();
        if (retirar > ret.getSaldoActual()) {
            ret.saldoActual=0;
            System.out.println("El importe ingresado supera su saldo, su saldo actual es"+ret.getSaldoActual());
        }else{
            ret.setSaldoActual(ret.getSaldoActual()-(retirar));
            System.out.println("Usted ha retirado "+retirar+ " pesos. Su saldo actual es: "+ret.getSaldoActual());
        }
    
    }
    public CuentaBancaria extraerSaldo(CuentaBancaria ext){
        System.out.println("Ha solicitado Extraccion Rapida");
            ext.setSaldoActual(ext.getSaldoActual()-(ext.getSaldoActual()*0.2));
            System.out.println("Ha realizado retiro express, se debito de su cuenta el 20%, su saldo actual es  "+ext.getSaldoActual());
            return ext;
            
    }
    public void consultarSaldo(CuentaBancaria cons){
         cons.getSaldoActual();
         System.out.println("Su saldo actual es : "+ cons.getSaldoActual());
    }
    public void consultarDatos(CuentaBancaria dat){
        System.out.println("Datos de la cuenta: ");
        System.out.println("Nombre del titular:  "+dat.getNombre());
        System.out.println("DNI del titular; " +dat.getDNI());
        System.out.println("El numero de cliente es: " +dat.getNumeroCliente());
    
    }
}


