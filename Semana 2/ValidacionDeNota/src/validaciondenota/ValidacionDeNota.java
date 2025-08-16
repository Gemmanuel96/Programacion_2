/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package validaciondenota;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class ValidacionDeNota {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int nota;
        
        System.out.print("Ingrese una nota = ");
        do {            
            nota = Integer.parseInt(input.nextLine());
            
            if (nota>10 || nota<0){
                System.out.print("Error, Ingrese Nuevamente = ");
            }
            
        } while (nota<0 || nota>10);
    }
        

}