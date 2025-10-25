/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase_abstracta;

import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class Clase_Abstracta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
           ArrayList <Figura>  figuras = new ArrayList<>();
           
           figuras.add(new Circulo(5, "Circulo"));
           figuras.add(new Rectangulo(3, 2, "Rectangulo"));
           
           for(Figura figura : figuras){
               System.out.println("Resultado de Area de " + figura.getNombre());
               figura.calcularArea();
           }
  
  
    }
    
}
