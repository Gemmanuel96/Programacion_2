/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pasaporte_tp;

/**
 *
 * @author gonza
 */
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Titular titular;
    private Foto foto; 

    //Constructor
    public Pasaporte(String numero, String fechaEmision,String imagen, String formato ) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = new Foto(imagen,formato);
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if(titular != null && titular.getPasaporte() != this){
            titular.setPasaporte(this);
        }
    }

    public Titular getTitular() {
        return titular;
    }

    public String getNumero() {
        return numero;
    }
    
    public String mostrarTitular(){
        return titular.getNombre();
    }
    
    

    

    
    
    
    

    
    
    
   
    

    
    
    
    
    

}