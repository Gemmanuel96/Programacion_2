/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cuentabancariauml;

/**
 *
 * @author gonza
 */
public class Titular {
    private String nombre;
    private String dni;
    private CuentaBancaria cuenta;
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    //Getters y setters
    public CuentaBancaria getCuenta() {
        return cuenta;
    }

    public void setCuenta(CuentaBancaria cuenta) {
        this.cuenta = cuenta;
        if(cuenta != null && cuenta.getTitular() != this){
            cuenta.setTitular(this);
        }
    }
    
    public String mostrarDatostitular(){
        return nombre +"\nDni = "+dni;
    }
    
    
    
    
    
}
