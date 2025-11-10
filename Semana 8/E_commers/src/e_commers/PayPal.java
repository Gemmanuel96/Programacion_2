/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package e_commers;

import e_commers.PagoConDescuento;
import e_commers.Cliente;

/**
 *
 * @author gonza
 */
public class PayPal  implements PagoConDescuento,Pago{ 
   // ===== Atributos =====
private Cliente cliente;
private String email;
private double saldo;

// ===== Constructores =====
public PayPal(Cliente cliente, String email, double saldo) {
    this.cliente = cliente;
    this.email = email;
    this.saldo = saldo;
}

// ===== Getters & Setters =====
public Cliente getCliente() {
    return cliente;
}

public void setCliente(Cliente cliente) {
    this.cliente = cliente;
    if (cliente != null && cliente.getPaypal() != this) {
        cliente.setPaypal(this);
    }
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public double getMonto() {
    return saldo;
}

public void setMonto(double saldo) {
    this.saldo = saldo;
}

// ===== Métodos de las Interfaces =====
@Override
public void aplicarDescuento(double monto) {
    double d = 15;
    double totalConDescuento = monto - (monto * d / 100);
    System.out.println("Con descuento es: " + totalConDescuento);
}

@Override
public void procesarPago(double monto) {
    if (monto > saldo) {
        System.out.println("El pago no pudo ser procesado");
    } else {
        saldo -= monto;
        System.out.println("El pago fue de: " + monto);
    }
}
}
