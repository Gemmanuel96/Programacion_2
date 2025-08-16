/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numeromayor;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class NumeroMayor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int numero,mayor;
        System.out.println("Ingrese 3 numeros");
        
        mayor = 0;
        
        for(int i=1; i<4; i++){
            System.out.print("Numero "+i+": ");        
            numero =Integer.parseInt(input.nextLine());
        
            if (numero>mayor){
                mayor = numero;
            } //Fin de If
        }//Fin de For
        
        System.out.println("El mayor es = " + mayor);
        
    }
    
}
