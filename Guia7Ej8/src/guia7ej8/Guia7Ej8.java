/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia7ej8;

import Entidad.Cadena;
import Servicios.ServiciosCadena;
import java.util.Scanner;

/*
 *a

 * @author ezepl
 */
public class Guia7Ej8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in).useDelimiter("\n");
        Cadena cad = new Cadena();
        ServiciosCadena cade=new ServiciosCadena();
        System.out.println("Ingrese una frase por favor");
        cad.setFrase(leer.nextLine());
        cad.setLongitud(cad.getFrase().length());
        cade.mostrarVocales(cad);
        System.out.println("La frase invertida es: "+cade.invertirFrase(cad));
        cade.vecesRepetido(cad);
        cade.compararLongitud(cad);
        System.out.println("La frase original sumada a la ultima frase es :"+cade.unirFrase(cad));
        cade.reemplazar(cad);
        System.out.println(" Contiene la letra ingresada? "+ cade.contiene(cad));
    
    
    
    
    
    
    }
    
}
