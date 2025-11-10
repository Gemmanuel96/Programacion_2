/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package divicionexcepcion;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class DivicionExcepcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        try {
            System.out.println("Ingrese un numero: ");
            int a = input.nextInt();
            System.out.println("Ingrese el divisor: ");
            int b = input.nextInt();
            
            int resultado = a / b;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            
            System.out.println("Error, no se puede dividir por cero. ");
            
        }
       
    }
    
}
