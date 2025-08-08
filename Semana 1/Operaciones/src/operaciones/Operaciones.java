/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package operaciones;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Operaciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num,num2;
        double resultado;
        
        System.out.print("Ingrese un numero = ");
        num = input.nextInt();
        
        System.out.print("Ingrese un numero = ");
        num2 = input.nextInt();
        
        //Divicion
        resultado = ((double)num / num2);
        System.out.println("Divicion = " + resultado);
        
        //Suma
        resultado = num + num2;
        System.out.println("Suma = " + resultado);
        
        //Resta
        resultado = num - num2;
        System.out.println("Resta = " + resultado);
        
        //Multiplicacion
        resultado = num * num2;
        System.out.println("Multiplicacion = " + resultado);
    }   
    
}
