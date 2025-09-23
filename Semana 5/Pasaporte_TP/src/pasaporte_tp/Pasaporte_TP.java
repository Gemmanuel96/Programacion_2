/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pasaporte_tp;

/**
 *
 * @author gonza
 */
public class Pasaporte_TP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pasaporte pasaporte = new Pasaporte("ABC156","18/09/2025","fotoTitular","JPG");
        Titular titular = new Titular ("Gonzalo Emanuel", "35145756");
        
        titular.setPasaporte(pasaporte);
        
        System.out.println("Numero de pasaporte = "+titular.mostrarCodigoPasaporte());
        System.out.println("Titular de pasaporte = "+pasaporte.mostrarTitular());
        
        
        
        
        
        
        
        
       
     
    }
    
}
