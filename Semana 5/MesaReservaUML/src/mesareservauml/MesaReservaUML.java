/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package mesareservauml;

/**
 *
 * @author gonza
 */
public class MesaReservaUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Reserva reserva = new Reserva("29/05/2025", "19:00");
        Cliente persona = new Cliente("Gustavo Ferras","11235846648");
        Mesa mesa = new Mesa("45",7);
        
        reserva.setCliente(persona);
        reserva.setMesa(mesa);
        reserva.mostrarReserva();
        
        
        
    }
    
}
