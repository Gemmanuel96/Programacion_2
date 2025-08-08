/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package division;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Division {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int num,num2,resultado;
        double resultado2;
        
        System.out.print("Ingrese numero = ");
        num = input.nextInt();
        System.out.print("Ingrese numero = ");
        num2 = input.nextInt();
        
        resultado = num / num2;
        System.out.println("Resultado = " + resultado);
        resultado2 = ((double)num  / num2);
        System.out.println("Resultado = " + resultado2);
             
        
    }
    
}
