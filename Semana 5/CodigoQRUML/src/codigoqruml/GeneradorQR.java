/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package codigoqruml;

/**
 *
 * @author gonza
 */
public class GeneradorQR {
    public void generar(String valor, Usuario usuario){
        CodigoQR codigo = new CodigoQR(valor, usuario);
        System.out.println("Cogido generado a usuario: ");
        codigo.mostrarCodigoyUsuario();
    }
}
