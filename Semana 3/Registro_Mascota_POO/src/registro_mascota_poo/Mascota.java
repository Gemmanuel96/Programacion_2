/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registro_mascota_poo;

/**
 *
 * @author gonza
 */
public class Mascota {
    private String nombre,especie;
    private int edad;
    
    public void mostrarInfo(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Especie: " + especie);
        System.out.println("Edad: " + edad);
    }
    
    public void setNombre(String n_nombre){
        nombre = n_nombre;
    }
    
    public void setEspecie(String n_especie){
        especie =  n_especie;
    }
    
    public void setEdad(int n_edad){
        edad = n_edad;
    }
    
    public int cumplirAnios(int anios){  
        return edad += anios;
    }
    
    public void getEdad(){
        System.out.println("Edad: " + edad);
    }
}
