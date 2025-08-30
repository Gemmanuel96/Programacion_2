/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libros_poo;

import java.util.Scanner;
/**
 *
 * @author gonza
 */
public class Libros_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String autor,titulo;
        int anio;
        
        Libro lib = new Libro();
        
        System.out.print("Ingrese nombre del Autor: ");
        autor = input.nextLine();
        lib.setAutor(autor);
        
        System.out.print("Ingrese titulo del libro: ");
        titulo = input.nextLine();
        lib.setTitulo(titulo);
      
        do {            
            System.out.print("Ingrese anio de publicacion(1900 - 2025): ");
            anio = Integer.parseInt(input.nextLine());
            lib.setAnio(anio);
        } while (anio<1900 || anio > 2025);
         
         
         System.out.println("\nMostramos Informacio: ");
         lib.mostrarInfo();
         
         System.out.println("\nModificamos el anio = ");
         anio =Integer.parseInt(input.nextLine());
         lib.setAnio(anio);
         
         lib.mostrarInfo();
         
        
        
        
        
        
        
        
        
        
    }
    
}
