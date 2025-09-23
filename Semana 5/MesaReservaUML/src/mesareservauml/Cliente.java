/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mesareservauml;

/**
 *
 * @author gonza
 */
public class Cliente {
    private String nombre;
    private String telefono;

    public Cliente(String nombre, String telefono) {
        this.nombre = nombre;
        this.telefono = telefono;
    }
    
    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre +"\nTelefono: "+ telefono);
    }
    
    
}
