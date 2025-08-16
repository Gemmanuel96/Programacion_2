/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package productocategorias;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class ProductoCategorias {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        char categoria;
        double precio, descuento;
        
        System.out.print("Ingrese precio del producto = ");
        precio = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese Categoria (A,B o C) = ");
        categoria = input.nextLine().charAt(0); 
        
        
        //Switch
        switch (categoria) {
            case 'A', 'a' -> {
                descuento = descuento_10(precio);
                System.out.println("Precio con el descuento del 10% : " + descuento);
                // descuneto del 10
            }
            case'B', 'b' -> {
                descuento = descuento_15(precio);
                System.out.println("Precio con el descuento de 15% = "+descuento);
            }
            case'C', 'c'->{
                descuento = descuento_20(precio);
                System.out.println("Precio con el descuento del 20% = "+descuento);
            }
            default -> System.out.println("La categoria seleccionada no es valida.");
                    
            }//Fin de Switch 
    }
    
        //Funciones
       static double descuento_10(double precio){
            double descuento,total;
            descuento = (precio *10)/100;
            total = precio - descuento;
            return total; 
       } // Descuento del 10
       
       static double descuento_15(double precio){
            double descuento,total;
            descuento = (precio *15)/100;
            total = precio - descuento;
            return total; 
       } // Descuento del 15
       
       static double descuento_20(double precio){
            double descuento,total;
            descuento = (precio *20)/100;
            total = precio - descuento;
            return total; 
       }//Descuento del 30
}