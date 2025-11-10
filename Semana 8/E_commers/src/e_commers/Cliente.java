/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e_commers;

/**
 *
 * @author gonza
 */
public class Cliente implements Notificable{
  // ===== Atributos =====
    private String nombre;
    private TarjetaCredito tarjeta;
    private PayPal paypal;
    private Pedido pedido;

    // ===== Constructores =====
    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public Cliente(String nombre, TarjetaCredito tarjeta) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
    }

    public Cliente(String nombre, PayPal paypal) {
        this.nombre = nombre;
        this.paypal = paypal;
    }

    public Cliente(String nombre, TarjetaCredito tarjeta, PayPal paypal) {
        this.nombre = nombre;
        this.tarjeta = tarjeta;
        this.paypal = paypal;
    }

    // ===== Getters & Setters =====
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pedido getPedido() {
        return pedido;
    }

    public void setPedido(Pedido pedido) {
        this.pedido = pedido;
        if (pedido != null && pedido.getCliente() != this) {
            pedido.setCliente(this);
        }
    }

    public TarjetaCredito getTarjeta() {
        return tarjeta;
    }

    public void setTarjeta(TarjetaCredito tarjeta) {
        this.tarjeta = tarjeta;
        if (tarjeta != null && tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }

    public PayPal getPaypal() {
        return paypal;
    }

    public void setPaypal(PayPal paypal) {
        this.paypal = paypal;
        if (paypal != null && paypal.getCliente() != this) {
            paypal.setCliente(this);
        }
    }

    // ===== Implementación de la interfaz Notificable =====
    @Override
    public void notificarCambioEstado(String mensaje) {
        System.out.println("Cliente " + nombre + " fue notificado: " + mensaje);
    }
 }
