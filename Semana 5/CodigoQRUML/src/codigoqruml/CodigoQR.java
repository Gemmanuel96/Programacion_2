/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoqruml;

/**
 *
 * @author gonza
 */
public class CodigoQR {
    private String valor;
    private Usuario usuario;

    public CodigoQR(String valor, Usuario usuario) {
        this.valor = valor;
        this.usuario = usuario;
    }

    public String getValor() {
        return valor;
    }
    
    public void mostrarCodigoyUsuario(){
        System.out.println("Valor: "+ valor+"\nUsuario: "+ usuario.getNombre());
    }
    
}
