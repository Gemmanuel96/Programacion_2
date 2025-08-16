/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package positivonegativocero;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class PositivoNegativoCero {
    public static void main(String[] args) {
        Scanner input =  new Scanner (System.in);
        
        int numero, positivo, negativo, cero;
        
        positivo = 0;
        negativo = 0;
        cero = 0;
        
        System.out.println("Ingrese 10 numeros");
        
        //Inicio For
        for(int i = 1; i<11; i++){
            System.out.print("Numero " +i+": ");
            numero = Integer.parseInt(input.nextLine());
            
            if(numero>0){                
                positivo += 1;
                
            }else if (numero < 0){                
                negativo += 1;
                
            }else{
                cero += 1;
            }     
        }//Fin de FOR
        
        
        System.out.println("Positivos = " + positivo);
        System.out.println("Negativos = " + negativo);
        System.out.println("Iguales a Cero = " + cero);
             
    }
    
}
