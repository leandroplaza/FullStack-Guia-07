/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidad;

import java.util.Date;



/**
 *
 * @author ezepl
 */
public class Persona {
String nombre;
int anio;
int mes;
int dia;
Date fechaNacimieto;

    public void setFechaNacimieto(Date fechaNacimieto) {
        this.fechaNacimieto = fechaNacimieto;
    }

    public Date getFechaNacimieto() {
        return fechaNacimieto;
    }
    public Persona() {
    }

    public Persona(String nombre, int anio, int mes, int dia, Date fechaNacimiento) {
        this.nombre = nombre;
        this.anio = anio;
        this.mes = mes;
        this.dia = dia;
        this.fechaNacimieto=fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nombre de la persona=" + nombre + ", Año de nacimiento=" + anio + ", Mes de nacimiento=" + mes + ", Dia de nacimiento=" + dia + ", fechaNacimieto=" + fechaNacimieto + '}';
    }

   

}
