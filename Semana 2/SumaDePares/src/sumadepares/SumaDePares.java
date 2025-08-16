/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumadepares;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class SumaDePares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero,suma;
        suma = 0;
        
        System.out.println("Ingrese numeros pares, cero para terminar. ");
        System.out.println("Numero: ");
        numero= Integer.parseInt(input.nextLine());
        
        while (numero != 0) {
            System.out.println("Numero: ");
            
            if (numero % 2 == 0){
                suma += numero;
            }    
            numero= Integer.parseInt(input.nextLine());
        }
        
        System.out.println("Suma de pares total = "+ suma);
    }//Fin de Algoritmo
    
}
