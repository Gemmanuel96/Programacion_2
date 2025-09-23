/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uml_libros;

/**
 *
 * @author gonza
 */
public class UML_Libros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Editorial editorial = new Editorial("Planeta", "Av.Juan B. Justo 1623");
       Autor autor = new Autor ("Juan Marquez","Uruguay");
       Libro libro = new Libro("El arte de la guerra","AB365ZB",autor,editorial);
        
        System.out.println(libro.getNombreAutor());
        System.out.println(libro.getIsbn());
        System.out.println(libro.getNombreEditorial());
        System.out.println(libro.getTitulo());
    
        
     
    }
    
}
