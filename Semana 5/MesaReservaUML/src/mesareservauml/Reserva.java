/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mesareservauml;

/**
 *
 * @author gonza
 */
public class Reserva {
    private String fecha;
    private String hora;
    private Cliente cliente;
    private Mesa mesa;

    public Reserva(String fecha, String hora) {
        this.fecha = fecha;
        this.hora = hora;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public void setMesa(Mesa mesa) {
        this.mesa = mesa;
    }
    
    public void mostrarReserva(){
        System.out.println("Fecha: "+ fecha+"\nHora: " + hora);
        cliente.mostrarDatos();
        mesa.mostrarMesa();
        
    }
    
}
