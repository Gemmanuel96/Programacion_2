/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mesareservauml;

/**
 *
 * @author gonza
 */
public class Mesa {
    private String numero;
    private int capacidad;

    public Mesa(String numero, int capacidad) {
        this.numero = numero;
        this.capacidad = capacidad;
    }
    
    public void mostrarMesa(){
        System.out.println("Numero: "+ numero +"\nCapacidad: "+ capacidad);
    }
    
}
