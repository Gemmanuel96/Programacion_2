/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarjetauml;

/**
 *
 * @author gonza
 */
public class Cliente {
    private String nombre;
    private String dni;
    private TarjetaCredito tarjetacredito;

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.tarjetacredito = tarjetacredito;
    }
    
    //Getters para devolver el valor y no posicion en memoria
    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public TarjetaCredito getTarjetacredito() {
        return tarjetacredito;
    }

    public void setTarjetacredito(TarjetaCredito tarjetacredito) {
        this.tarjetacredito = tarjetacredito;
        if(tarjetacredito != null && tarjetacredito.getCliente() != this){
            tarjetacredito.setCliente(this);
        }
    }
    
    //Metodos
    public String mostrarDatosTarjeta(){
        return "Banco = " + tarjetacredito.getBanco()+"\nFecha Vencimiento = "+tarjetacredito.getFechaVencimiento() +"\nNumero Tarjeta = " + tarjetacredito.getNumero();
    }
}
    


