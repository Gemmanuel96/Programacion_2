/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package añobisiesto;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class AñoBisiesto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int año;
        
        System.out.print("Ingrese un anio = ");
        año = Integer.parseInt(input.nextLine());
        
        if ((año % 4 == 0 && año % 100 != 0) || año % 400 == 0){
            System.out.println("Es bisiesto.");
        }else{
            System.out.println("No es bisiesto.");
        }
    
    }
    
}
