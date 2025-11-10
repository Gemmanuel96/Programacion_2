/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edadpruebaexception;

/**
 *
 * @author gonza
 */
public class EdadPruebaException {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
          try {
            int edad = 150;
            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Edad invalida: " + edad);
            }
            System.out.println("Edad válida: " + edad);
        } catch (EdadInvalidaException e) {
            System.out.println("Error: " + e.getMessage());
            
        }
    }
    
}
