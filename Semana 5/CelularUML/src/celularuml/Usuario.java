/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package celularuml;

/**
 *
 * @author gonza
 */
public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular;

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public Celular getCelular() {
        return celular;
    }

    public void setCelular(Celular celular) {
        this.celular = celular;
        if(celular != null && celular.getUsuario()!= this){
            celular.setUsuario(this);
        }
    }
    
    public String mostrarTelefono(){
        return celular.getMarca()+" "+celular.getModelo();
    }

    public String mostrarDatosUsuario() {
        return nombre +" "+dni;
    }
    
}
