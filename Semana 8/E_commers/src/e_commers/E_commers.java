/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e_commers;

/**
 *
 * @author gonza
 */
public class E_commers {

    /**
     * @param args the command line arguments
     */
 
    public static void main(String[] args) {

        // Crear cliente
        Cliente cliente = new Cliente("Gonzalo");

        // Crear pedido y asociarlo al cliente
        Pedido pedido = new Pedido(cliente);

        // Agregar productos al pedido
        pedido.agregarProducto(new Producto("Notebook", 1200));
        pedido.agregarProducto(new Producto("Mouse", 300));
        pedido.agregarProducto(new Producto("Teclado", 500));

        // Mostrar total del pedido
        System.out.println("Cliente: " + cliente.getNombre());
        System.out.println("Total del pedido: $" + pedido.calcularTotal());

        // Cambiar estado del pedido
        pedido.notificarCambioEstado("En preparacion");

        // Crear cuenta PayPal y asociarla al cliente
        PayPal paypal = new PayPal(cliente, "gonzalo@email.com", 3000);
        cliente.setPaypal(paypal);

        // Aplicar descuento al total
        double monto = pedido.calcularTotal();
        paypal.aplicarDescuento(monto);

        // Procesar pago
        paypal.procesarPago(monto);

        // Cambiar estado final del pedido
        pedido.notificarCambioEstado("Entregado");
    }

}