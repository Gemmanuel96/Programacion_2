/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actualizacionstock;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class ActualizacionStock {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int stockActual,cantidadVendidas,cantidadRecibidas;
        
        System.out.print("Ingrese stock Actual de producto = ");
        stockActual = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese cantidad de producto vendido = ");
        cantidadVendidas = Integer.parseInt(input.nextLine());
        System.out.print("Ingrese Cantidad recibidas = ");
        cantidadRecibidas =  Integer.parseInt(input.nextLine());
        
        stockActual = ActualizacionDeStock(stockActual, cantidadVendidas, cantidadRecibidas);
        
        System.out.println("Stock Actual = "+ stockActual);
        
        
    }
    //Actualizacion de Stock
    static int ActualizacionDeStock(int stockActual,int cantidadVendida,int cantidadRecibida){    
        return stockActual - cantidadVendida + cantidadRecibida; 
    }
}
