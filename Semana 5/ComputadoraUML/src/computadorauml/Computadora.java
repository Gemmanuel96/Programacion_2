/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package computadorauml;

/**
 *
 * @author gonza
 */
public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placaMadre;
    private Propietario propietario;
    
    //Constructor
    public Computadora(String marca, String numeroSerie,String modelo, String chipset ) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placaMadre = new PlacaMadre(modelo, chipset); //Composicion
    }
    
    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    
    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        if(propietario != null && propietario.getComputadora() != this){
            propietario.setComputadora(this);
        }
    }
    
    //Metodos
    
    public void mostrarDatosPlacaMadre(){
        System.out.println("Modelo: "+placaMadre.getModelo()+ "\nChipset: "+ placaMadre.getChipset());
    }
    
    public void mostratDatosPropietario(){
        System.out.println("Propietario: "+ propietario.getNombre()+"\nDNI: "+ propietario.getDni());
    }
    
}
