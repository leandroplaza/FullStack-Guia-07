package Servicios;


import Entidad.Operacion;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ezepl
 */
public class ServicioOperacion {

    Scanner leer = new Scanner(System.in);

    public Operacion crearOperacion() {
        System.out.println("Ingrese el valor del numero 1");
        int numero1 = leer.nextInt();
        System.out.println("Ingrese el valor del numero 2");
        int numero2 = leer.nextInt();
        return new Operacion(numero1, numero2);
    }

    public int sumaOperacion(Operacion suma) {
        return suma.getNumero1() + suma.getNumero2();

    }

    public int restaOperacion(Operacion resta) {
        return resta.getNumero1() - resta.getNumero2();
    }

    public int multiplicarOperacion(Operacion mult) {
        if (mult.getNumero1() == 0 || mult.getNumero2() == 0) {
            System.out.println("Error:no es posible multiplicar por 0, ya que el resultado siempre es 0");
            return 0;

        } else {
            return mult.getNumero1() * mult.getNumero2();
        }

    }
 public int dividirOperacion(Operacion divid) {
        if (divid.getNumero1() == 0 || divid.getNumero2() == 0) {
            System.out.println("Error:no es posible dividir por 0, ya que el resultado es indeterminado");
            return 0;

        } else {
            return divid.getNumero1() / divid.getNumero2();
        }

    }







}
