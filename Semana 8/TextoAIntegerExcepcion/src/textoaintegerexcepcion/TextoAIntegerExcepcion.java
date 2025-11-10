/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package textoaintegerexcepcion;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class TextoAIntegerExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        try {
            System.out.println("Ingrese un numero: ");
            String texto = input.nextLine();
            int numero = Integer.parseInt(texto);
            
            System.out.println("Numero ingresado: " + numero);
            
        } catch (NumberFormatException e) {
            System.out.println("Error, el texto no es un numero valido");
        }
    }
    
}
