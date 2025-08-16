/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package costoenvio;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class CostoEnvio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        
        String zona;
        double costoEnvio,peso,total,precio;
        
        //Precio
        System.out.print("Ingrese precio del producto = $");
        precio = Double.parseDouble(input.nextLine());
        //Zona
        System.out.print("Ingrese zona de envio[Nacional o Internacional] = ");
        zona = input.nextLine().toLowerCase(); 
       //Peso
        System.out.print("Ingrese el peso de producto = $");
        peso = Double.parseDouble(input.nextLine());
        
        //Calculamos envio y total de compra
        costoEnvio = CostoEnvio(peso, zona);
        total = TotalCompra(precio, CostoEnvio(peso, zona));
        
        System.out.println("");
        System.out.println("Costo de envio = $"+ costoEnvio);
        System.out.println("Precio total con envio incluido = $"+ total);
        
        
              
    }
    //Funcion De costo de envio
    static double CostoEnvio(double peso,String zona){
            double z = 0;
            if ("nacional".equals(zona)){
                z = 5;
            }else if("internacional".equals(zona)){
                z = 10;
            }
            return z * peso;
    }
    
    
    static double TotalCompra(double precioProducto, double CostoDeEnvio){
        return precioProducto + CostoDeEnvio;
        
    }
}
