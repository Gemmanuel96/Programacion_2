/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gallinas_poo;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Gallinas_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        int id,edad;
       
        //Gallina 1
        Gallina gallina = new Gallina();
       
        System.out.print("Ingrese id de gallina = ");
        id = Integer.parseInt(input.nextLine());
        gallina.setIdGallina(id);
       
        System.out.print("Ingrese edad: ");
        edad = Integer.parseInt(input.nextLine());
        gallina.setEdad(edad);
        
        //Gallina 2
        Gallina gallina2 = new Gallina();
        System.out.print("\nIngrese id gallina : ");
        id = Integer.parseInt(input.nextLine());
        gallina2.setIdGallina(id);
         
        System.out.print("Ingrese edad: ");
        edad = Integer.parseInt(input.nextLine());
        gallina2.setEdad(edad);
        
        //Mostramos informacion
        System.out.println("\nInfo Gallina 1: ");
        gallina.mostrarEstado();
        

        System.out.println("\nInfo Gallina 2: ");
        gallina2.mostrarEstado();
       
        //Ingresamos Huevos
        gallina.setHuevos(7);
        gallina2.setHuevos(12);
        
        gallina.envejecer(2);
        gallina2.envejecer(3);
        
        //Mostramos info de nuevo
        System.out.println("\nInfo 1:");
        gallina.mostrarEstado();
        System.out.println("\ninfo2:");
        gallina2.mostrarEstado();
        
    }
    
}
