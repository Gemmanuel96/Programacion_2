/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package animales_polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class Animales_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Animal> animales = new ArrayList<>();

        animales.add(new Perro("Rocky", "Labrador", 5));
        animales.add(new Gato("Michi", "Siames", 3));
        animales.add(new Vaca("Lola", "Holando", 7));

        for (Animal animal : animales) {
            animal.describirAnimal();
            animal.hacerSonido();
            System.out.println("------------------------");
    }
    
 }
}
