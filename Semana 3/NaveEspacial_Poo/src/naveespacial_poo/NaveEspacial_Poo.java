/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package naveespacial_poo;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class NaveEspacial_Poo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String nombre;
        int distancia,combustible;
        
        
        Nave nave1 = new Nave();
        System.out.print("Ingrese nombre de la nave: ");
        nombre = input.nextLine();
        nave1.setNombreNave(nombre);
        
        System.out.println("\n");
        nave1.despegar();
        
        System.out.print("\nIngrese recarga de combsutible: ");
        combustible = Integer.parseInt(input.nextLine());
        nave1.recargarCombustible(combustible);
        
        nave1.despegar();
        System.out.print("\nIngrese kms a recorrer: ");
        distancia = Integer.parseInt(input.nextLine());
        nave1.avanzar(distancia);
        
        System.out.println("\nMostramos estado de la nave y distancia recorrida:");
        nave1.mostratEstado();
        
        System.out.print("\nIngrese cantidad de recargar de combustible:");
        combustible = Integer.parseInt(input.nextLine());
        nave1.recargarCombustible(combustible);
        System.out.print("\nIngrese kms a recorrer: ");
        distancia = Integer.parseInt(input.nextLine());
        nave1.avanzar(distancia);
        
        System.out.println("\nMostramos estado de la nave y distacia recorrida:");
        nave1.mostratEstado();
    }
    
}
