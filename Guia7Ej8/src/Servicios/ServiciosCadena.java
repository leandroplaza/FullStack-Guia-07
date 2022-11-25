/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

//import Entidad.Cadena;
import Entidad.Cadena;
import java.util.Scanner;


/**
 *
 * @author ezepl
 */
public class ServiciosCadena {

    Scanner leer = new Scanner(System.in);
//    Cadena cad = new Cadena();

    public void mostrarVocales(Cadena cad) {
        String fras = cad.getFrase();
        int contvocal = 0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            if ((fras.charAt(i) == 'a') || (fras.charAt(i) == 'e') || (fras.charAt(i) == 'i') || (fras.charAt(i) == 'o') || (fras.charAt(i) == 'u')) {
                contvocal++;
            }
        }
        System.out.println("La frase ingresada contiene " + contvocal + " vocales");
    }

    public String invertirFrase(Cadena cad) {
        String fras = "";
        for (int i = cad.getLongitud() - 1; i >= 0; i--) {
            fras = fras + cad.getFrase().charAt(i);
        }
        return fras;
    }

    public void vecesRepetido(Cadena cad) {
        String fras = cad.getFrase();
        int contcaracter = 0;
        String caracter;
        do {
            System.out.println("Ingrese un caracter para buscar en la frase ingresada");
            caracter = leer.nextLine();
        } while (caracter.length() != 1);
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (fras.substring(i, i + 1).equalsIgnoreCase(caracter)) {
                contcaracter++;
            }
        }
        if (contcaracter > 0) {
            System.out.println("El caracter ingresado se encuentra " + contcaracter + " veces");
        } else {
            System.out.println("El caracter ingresado no se encuentra en la frase");
        }
    }

    public void compararLongitud(Cadena cad) {
        String frase1 = cad.getFrase();
        System.out.println("Ingrese una nueva frase");
        String frase2 = leer.nextLine();
        if (frase1.length() > frase2.length()) {
            System.out.println("La ultima frase ingresada es menor a la frase original");
        }
        if (frase1.length() == frase2.length()) {
            System.out.println("La ultima frase ingresada es igual a la frase original");
        }
        if (frase1.length() < frase2.length()) {
            System.out.println("La ultima frase ingresada es mayor a la frase original");
        }

    }

    public String unirFrase(Cadena cad) {
        String frase1 = cad.getFrase();
        System.out.println("Ingrese una nueva frase");
        String frase2 = leer.nextLine();
        return frase1 + frase2;
    }

    public void reemplazar(Cadena cad) {
        String frase2 = "";
        System.out.println("Ingrese un caracter para reemplazar la/las letra/s A de la frase ingresada");
        String simbolo = leer.nextLine();
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i).equalsIgnoreCase("a")) {
                frase2 = cad.getFrase().replace("a", simbolo);
            }

        }
        System.out.println("La frase nueva es: " + frase2);

    }

    public boolean contiene(Cadena cad) {
        boolean cont = false;
        System.out.println("Ingrese una letra para comprobar si se encuentra en la frase");
        String letra = leer.next();
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i).equalsIgnoreCase(letra)) {
                cont = true;
            }
            
        }
    return cont;
    }

}
