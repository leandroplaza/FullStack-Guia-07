/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author ezepl
 */
public class Libro {

    Scanner leer = new Scanner(System.in);
    public int isbn;
    public String titulo;
    public String autor;
    public int numpag;

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numpag) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numpag = numpag;
    }
    //Metodo para cargar datos del libro
    public void llenarLibro(){
        System.out.println("Ingrese el titulo del libro");
        titulo = leer.nextLine();
        System.out.println("Ingrese el ISBN del libro");
        isbn = leer.nextInt();
        System.out.println("Ingrese el autor del libro");
        autor = leer.nextLine();
        System.out.println("Ingrese el numero de paginas");
        numpag = leer.nextInt();
    }
    //Metodo para mostrar los datos del libro
    public void mostrarLibro(){
        System.out.println("El ISBN del libro es "+ isbn);
        System.out.println("El titulo del libro es "+titulo);
        System.out.println("El autor del libro es "+autor);
        System.out.println("El numero de paginas es "+numpag);
        
        
        
        
        
    }






}











