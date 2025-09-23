/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancariauml;

/**
 *
 * @author gonza
 */
public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave;
    private Titular titular;
    
    public CuentaBancaria(String cbu, double saldo,String codigo, String ultimaModificacion) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = new ClaveSeguridad(codigo,ultimaModificacion);
    }

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
        if (titular != null && titular.getCuenta() != this){
            titular.setCuenta(this);
        }
    }
    
    
    public void mostrarDatosCuenta(){
        System.out.println("Cbu = "+ cbu +"\nSaldo = "+ saldo+ "\nTitular = "+ titular.mostrarDatostitular());
    }
    
    public void modificarCodigo(String codigo,String ultimaModificacion){
        clave.modicarClaveYFecha(codigo, ultimaModificacion);
    }
    
    public void ingresarSaldo(double saldo){
        this.saldo += saldo; 
    }
    
    public void retirarDinero(double saldo){
        this.saldo -= saldo;
    }
    
    public void mostrarSaldo(){
        System.out.println("Saldo = "+ saldo);
    }
}
