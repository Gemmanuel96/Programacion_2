/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cuentabancariauml;

/**
 *
 * @author gonza
 */
public class CuentaBancariaUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Titular titular = new Titular("Sergio Aguero", "39658963");
        CuentaBancaria cuenta = new CuentaBancaria("28178843885", 35000.0, "1932", "22/9/2025");
        cuenta.setTitular(titular);
        
        cuenta.mostrarSaldo();
        cuenta.ingresarSaldo(5000.0);
        cuenta.retirarDinero(2500.0);
        cuenta.mostrarSaldo();
        System.out.println("\n");
        cuenta.retirarDinero(25000.0);
        cuenta.mostrarDatosCuenta();
        
    }
}
