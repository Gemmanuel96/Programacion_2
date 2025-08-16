/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package descuentoespecial;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class DescuentoEspecial {

    static double descuento = 10; //Variable Global
    
    public static void main(String[] args) {
    
        double precio,total;
        Scanner input = new Scanner (System.in);
        
        System.out.print("Ingrese precio = ");
        precio = Double.parseDouble(input.nextLine());
        
        total = descuentoEspecial(precio);
        System.out.println("Precio con descuento = " + total);
        
    }
    
    static double descuentoEspecial(double precio){
        double des_Especial = descuento;
        return precio - ((precio*des_Especial)/100);
    }
    
}
