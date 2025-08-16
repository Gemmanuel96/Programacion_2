/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package actualizacionprecios_2_0;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class ActualizacionPrecios_2_0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        double valor;
        int posicion;
        double [] precios = {13.5,45.5,80.2,23.4,105.2,14.6};
        
        System.out.println("Lista de precios = ");
        mostrarPrecios(precios, 0);
        
        System.out.print("\nIngrese un valor nuevo = ");
        valor = Double.parseDouble(input.nextLine());
        
        System.out.print("Ingrese posicion a cambiar [0,5] = ");
        posicion = Integer.parseInt(input.nextLine());
        
        precios[posicion] = valor;
        
        System.out.println("Lista actualizada = ");
        mostrarPrecios(precios, 0);
        
    }
    static void mostrarPrecios(double [] lista,int indice){
        if (indice >= lista.length){ //Lista.length ultima posicion de array
            return;
        }
        System.out.println(indice+")$"+lista[indice]);
        mostrarPrecios(lista, indice+1); //llamada a la funcion nuevamente
    }
}
