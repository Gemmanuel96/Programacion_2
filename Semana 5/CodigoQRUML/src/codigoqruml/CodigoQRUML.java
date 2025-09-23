/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package codigoqruml;

/**
 *
 * @author gonza
 */
public class CodigoQRUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Juan gabriel", "juan_gabriel@hotmail.com");
        GeneradorQR generador = new GeneradorQR();
        generador.generar("6516515165", usuario);
        
    }
    
}
