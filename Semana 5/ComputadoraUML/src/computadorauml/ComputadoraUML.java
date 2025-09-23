/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package computadorauml;

/**
 *
 * @author gonza
 */
public class ComputadoraUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Computadora compu = new Computadora ("Gigabite", "AH4184", "Asus", "MH350");
        Propietario prop = new Propietario("Gonzalo Emanuel", "39658363");
        
        prop.setComputadora(compu);
        //compu.mostrarDatosPlacaMadre();
        //compu.mostratDatosPropietario();
        
        prop.mostrarDatosComputadora();
    }
    
}
