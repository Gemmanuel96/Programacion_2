/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e_commers;

import e_commers.Pagable;
import e_commers.Cliente;
import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class Pedido implements Pagable,Notificable{
    private Cliente cliente;
    private ArrayList<Producto> productos;

    public Pedido(Cliente cliente) {
        this.cliente = cliente;
        this.productos = new ArrayList<>();
        
        // Mantiene la relación 1 a 1 sincronizada
        if (cliente != null && cliente.getPedido() != this) {
            cliente.setPedido(this);
        }
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente != null && cliente.getPedido() != this) {
            cliente.setPedido(this);
        }
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    @Override
    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    @Override
    public void notificarCambioEstado(String mensaje) {
        System.out.println("Estado del pedido: " + mensaje);
        if (cliente != null) {
            cliente.notificarCambioEstado(mensaje);
        }
    }
    
}
