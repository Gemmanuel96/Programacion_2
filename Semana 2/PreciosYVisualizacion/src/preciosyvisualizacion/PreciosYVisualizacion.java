/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package preciosyvisualizacion;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class PreciosYVisualizacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        double [] lista = {156.5,100,2.25,355.3,400.8,55.50};
        double valorNuevo;
        int posicion;
        
        System.out.println("Lista de precio actual = ");
        for (double precio : lista){
            System.out.println("$"+ precio);
        }
        
        System.out.println("Ingrese un precio nuevo = ");
        valorNuevo = Double.parseDouble(input.nextLine());
        
        System.out.println("Ingrese precio a actualizar [0,5] = ");
        posicion = Integer.parseInt(input.nextLine());
        
        lista[posicion] = valorNuevo;
        
         System.out.println("Lista de precio actualizado = ");
        for (double precio : lista){
            System.out.println("$"+ precio);
        }
        
        
    }
    
}
