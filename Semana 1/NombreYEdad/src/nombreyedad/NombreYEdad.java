/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package nombreyedad;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class NombreYEdad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       //Declaramos lasa variables
       String nombre;
       int edad;
       
       //Inicio de codigo
        System.out.print("Ingrese su nombre = ");
        nombre = input.nextLine();
        System.out.print("Ingrese su edad = ");
        edad = Integer.parseInt(input.nextLine()); // variable.parseVariable(input.nextLine())
        
        System.out.println("Nombre = " + nombre);
        System.out.println("Edad = " + edad);
       
       
    }
    
}
