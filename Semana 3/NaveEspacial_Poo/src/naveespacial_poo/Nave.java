/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package naveespacial_poo;

/**
 *
 * @author gonza
 */
public class Nave {
    private String nombre;
    private int combustible = 0 ,distancia = 0;
    
    public void setNombreNave(String nom){
        this.nombre = nom;
    }
    
    public void despegar(){
        if (combustible > 0){
             System.out.println("Despegando!");
        }else{
            System.out.println("No hay suficiente combustible para despegar.");
        }
    }
    
    public void recargarCombustible(int comb){
        if (combustible + comb > 50){
            System.out.println("Supera la capacidad del tanque.");
        }else{
            combustible += comb;
        }    
    }
    
    public void avanzar(int kms){
        if (kms > combustible){
            System.out.println("No alcanza el combustible, recargar.");
        }else{
            System.out.println("Avanzando...");
            combustible -= kms;
            distancia += kms;
        }
    }
    
    public void mostratEstado(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: "+ combustible);
        System.out.println("Distancia recorrida = " + distancia + " Kms.");
    }
    
    
}
