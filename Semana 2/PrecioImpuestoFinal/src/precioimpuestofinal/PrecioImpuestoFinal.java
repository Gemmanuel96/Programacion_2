/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package precioimpuestofinal;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class PrecioImpuestoFinal {
 
     public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
       
       double desc,precio,imp; //Guardar valores ingresados
       double descuento,impuesto,subtotal,total;
       
       System.out.print("Ingrese precio = ");
       precio =  Double.parseDouble(input.nextLine());
         
       System.out.print("Ingrese el pocentaje del impuesto = ");
       imp = Double.parseDouble(input.nextLine());
         
       System.out.print("Ingrese porcentaje del descueto = ");
       desc = Double.parseDouble(input.nextLine());
         
       //Calculamos impuesto, descuento y mostramos resultado en consola.
       impuesto = impuesto(precio, imp);
       subtotal = precio + impuesto;
       System.out.println("Con impuesto del "+imp+" = " + subtotal);
       
       descuento = descuento(subtotal, desc);
       total= subtotal - descuento;
       System.out.println("Precio final con descuento del "+desc+" = "+total);
         
         
       
       
    }
    
    static double descuento(double precio, double descuento){
            double desc;
            desc = precio * descuento/100;
            return desc; 
       } // Funcion de Descuento
   
     static double impuesto(double precio, double impuesto){
            double imp;
            imp = precio * impuesto/100;
            return imp; 
       } // Funcion de impúesto
    
}
