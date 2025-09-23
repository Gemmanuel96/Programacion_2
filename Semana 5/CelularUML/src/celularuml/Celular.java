/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celularuml;

/**
 *
 * @author gonza
 */
public class Celular {
    private String imei;
    private String modelo;
    private String marca;
    private Bateria bateria;
    private Usuario usuario;
    
    public Celular(String imei, String modelo, String marca) {
        this.imei = imei;
        this.modelo = modelo;
        this.marca = marca;
    }

    //Usuario Gett y sett
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
        if(usuario != null && usuario.getCelular()!= this){
            usuario.setCelular(this);
        }
    }
     
    public String mostrarDatosUsuario(){
        return usuario.mostrarDatosUsuario();
    }
    
    //Agregar bateria
    public void setBateria(Bateria bateria) {
        this.bateria = bateria;
    }
    
    //Celular

    public String getModelo() {
        return modelo;
    }

    public String getMarca() {
        return marca;
    }
    
 
   
    
    
}
