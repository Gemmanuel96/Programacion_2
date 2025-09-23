/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tarjetauml;

/**
 *
 * @author gonza
 */
public class TarjetaUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banco banco = new Banco ("Galicia","20568488465-1");
        Cliente cliente = new Cliente("Juan Ignacio", "39658484");
        TarjetaCredito tarjeta = new TarjetaCredito("1584948816881", "25/09/2033", banco);
        
        cliente.setTarjetacredito(tarjeta);
        
        System.out.println(cliente.getDni()+ cliente.getNombre()+"\n"+cliente.mostrarDatosTarjeta());
        System.out.println(tarjeta.mostrarDatosCliente());
        
    }
    
}
