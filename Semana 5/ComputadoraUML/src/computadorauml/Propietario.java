/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computadorauml;

/**
 *
 * @author gonza
 */
public class Propietario {
    private String nombre;
    private String dni;
    private Computadora computadora;
    
    //Constructores
    public Propietario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //Getters y setters
    public Computadora getComputadora() {
        return computadora;
    }

    public void setComputadora(Computadora computadora) {
        this.computadora = computadora;
        if(computadora != null && computadora.getPropietario() != this){
            computadora.setPropietario(this);
        }
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }
    
    //Metodos
    public void mostrarDatosComputadora(){
        System.out.println("Marca: "+computadora.getMarca()+"\nNumeroSerie: "+ computadora.getNumeroSerie());
    }
    
    
}
