/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Circunferencia;
import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class ServicioCircunferencia {

    Scanner leer = new Scanner(System.in);

    public Circunferencia crearCircunferencia() {
        System.out.println("Ingrese el radio de la circunferencia");
        double radio = leer.nextDouble();
        return new Circunferencia(radio);

    }

    public void areaCircunferencia(Circunferencia c1) {
        double area = Math.PI * Math.pow(c1.getRadio(), c1.getRadio());
        System.out.println("" + area);
    }

    public void perimetroCircunferencia(Circunferencia c1) {
        double perimetro = 2 * Math.PI * c1.getRadio();
        System.out.println("" + perimetro);
    }

}
