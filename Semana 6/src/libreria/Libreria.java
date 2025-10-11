/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libreria;

import java.util.List;



/**
 *
 * @author gonza
 */
public class Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Ingresamos Autores
       Autor a1 = new Autor("1", "Julio Cortazar", "Argentino");
       Autor a2 = new Autor("2", "Jorge Luis Borges", "Argentino");
       Autor a3 = new Autor("3", "Isabel Allende", "Chilena");
       Autor a4 = new Autor("4", "Gabriel Garcia Marquez", "Colombiano");
       Autor a5 = new Autor("5", "Mario Vargas Llosa", "Peruano");
       
       //Creamos una biblioteca - paso 1
       Biblioteca biblioteca = new Biblioteca("Leones");
       
       //Agregamos Libros - paso 2
       biblioteca.agregarLibro("005526", "El senor de los anillos", 1996, a1);
       biblioteca.agregarLibro("005527", "Cien anos de soledad", 1967, a4);
       biblioteca.agregarLibro("005528", "La casa de los espiritus", 1982, a3);
       biblioteca.agregarLibro("005529", "Rayuela", 1963, a1);
       biblioteca.agregarLibro("005530", "La ciudad y los perros", 1967, a5);
       
       //listamos Libros - paso 3
//       biblioteca.listarLibros();
       
       //Buscamos Libros por ISBN - paso 4
//        biblioteca.buscarLibroPorISBN("005529");
        
        //Eliminamos libros - paso 5
//        biblioteca.eliminarProducto("005526");
//        biblioteca.listarLibros();
//        
//        System.out.println("\n");
//  
//        biblioteca.cantidadLibros();
//        
//        biblioteca.filtrarPorAnio(1967);
//        
        biblioteca.mostrarAutoresDisponibler();
        
}
}
