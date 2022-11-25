/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author ezepl
 */
public class CuentaBancaria {
    public int numeroCliente;
    public long DNI;
    public double saldoActual;
    public String nombre;
    
    public CuentaBancaria() {
    }

    public CuentaBancaria(String nombre) {
        this.nombre = nombre;
        
    }

    public CuentaBancaria(int numeroCliente , long DNI, String nombre) {
        this.numeroCliente= numeroCliente;
        this.DNI = DNI;
        this.nombre = nombre;
        
    }

    public CuentaBancaria(int numeroCliente, long DNI, double saldoActual,String nombre) {
        this.numeroCliente = numeroCliente;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
         this.nombre = nombre;
    }

    public int getNumeroCliente() {
        return numeroCliente;
    }

    public void setNumeroCliente(int numeroCliente) {
        this.numeroCliente = numeroCliente;
    }

    public long getDNI() {
        return DNI;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
    
}
