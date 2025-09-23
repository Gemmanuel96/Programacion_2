/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package autouml;

/**
 *
 * @author gonza
 */
public class AutoUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Motor motor = new Motor("V8", "ABD456");
        Vehiculo vehiculo = new Vehiculo ("Audi","TT", motor);
        Conductor conductor = new Conductor("Susana Jimenez", "XTZ532");
        
        vehiculo.setConductor(conductor);
        
        vehiculo.mostrarDatosVehiculo();
    }
    
}
