/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edades;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Edades {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int edad;
        
        System.out.print("Ingrese su edad = ");
        edad = Integer.parseInt(input.nextLine());
        
        if (edad < 0){
            System.out.println("La edad ingresada no es valida");
        }else{
            if (edad > 0 && edad < 12){
                System.out.println("Sos un ninio");
        
            }else if(edad >= 12 && edad <= 17){
                System.out.println("Sos un adolescente.");
                
            }else if(edad >= 18 && edad <= 59 ){
                System.out.println("Sos un adulto.");
                
            }else{
                 System.out.println(" Sos un adulto mayor.");      
                }
        }//Fin de IF
        
    }
    
}
