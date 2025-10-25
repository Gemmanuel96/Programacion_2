/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_polimorfismo;

/**
 *
 * @author gonza
 */
public class Perro extends Animal{
        private String nombre;

    public Perro(String nombre, String raza, int edad) {
        super(raza, edad);
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    
    @Override
    public void describirAnimal() {
        System.out.println("Nombre: " + getNombre());
        System.out.println("Edad: " + getEdad());
        System.out.println("Raza: " + getRaza());
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau!");
    }

        
  
     
    
   
}
