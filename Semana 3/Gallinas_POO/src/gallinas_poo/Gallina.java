/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gallinas_poo;

/**
 *
 * @author gonza
 */
public class Gallina {
    private int idgallina, edad, huevos;
    
    //Setter de gallina
    public void setIdGallina(int n_idgallina){
        this.idgallina = n_idgallina;
    }
    
    public void setEdad(int n_edad){
        this.edad = n_edad;
    }
    
    public void setHuevos(int n_huevos){
        this.huevos = n_huevos;
    }
    
    //Getters de gallina
    
    public void mostrarEstado(){
        System.out.println("ID Gallina: " + idgallina);
        System.out.println("Edad: " + edad);
        System.out.println("huevos: " + huevos);
    }
    
    public void ponerHuevo(int n_huevo){
        huevos+= n_huevo;
    }
    
    public void envejecer(int n_edad){
        edad += n_edad;
    }
}
