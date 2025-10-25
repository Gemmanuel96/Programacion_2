/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales_polimorfismo;

/**
 *
 * @author gonza
 */
public class Animal {
     private String raza;
     private int edad;

    public Animal(String raza, int edad) {
        this.raza = raza;
        this.edad = edad;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

  
    
   
 public void hacerSonido(){
     System.out.println("Sonido Generico");
 }
 public void describirAnimal(){
     System.out.println("Descripcion Animal");
 }
}
