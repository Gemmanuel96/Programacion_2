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
public class TarjetaCredito implements PagoConDescuento,Pago{
    //Atributos
   private Cliente cliente;
   private String numeroTarjeta;
   private double saldo;

   //Contructores
    public TarjetaCredito(Cliente cliente, String numeroTarjeta, double saldo) {
        this.cliente = cliente;
        this.numeroTarjeta = numeroTarjeta;
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente != null && cliente.getTarjeta() != this){
            cliente.setTarjeta(this);
        }
    }

    //Sets && Gets
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    
    //Metodos Interfaces
    @Override
    public void aplicarDescuento (double monto) {
        double d = 15;
        double descuento = 0;
        descuento += monto - (monto * d / 100);
        System.out.println("Con descuento: " + descuento);
    }

    @Override
    public void procesarPago (double monto) {
        if (monto > saldo){
            System.out.println("El pago no pudo ser procesado");
        } else {
            saldo -= monto;
            System.out.println("El pago fue de : "+ monto);
        }
    }

    
    
    
}
