/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package impuestouml;

/**
 *
 * @author gonza
 */
public class ImpuestoUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Contribuyente persona = new Contribuyente ("Emilio Gimenez", "2065893251-3");
       Impuesto imp = new Impuesto(2566.0);
       imp.setContribuyente(persona);
       
 
       Calculadora calculadora = new Calculadora();
       
       calculadora.Calcular(imp);
       imp.mostrarContribuyente();
    }
    
}
