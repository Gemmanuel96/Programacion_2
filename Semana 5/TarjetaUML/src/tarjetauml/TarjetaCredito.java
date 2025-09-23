/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tarjetauml;

/**
 *
 * @author gonza
 */
public class TarjetaCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente;
    private Banco banco;

    public TarjetaCredito(String numero, String fechaVencimiento, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
    }
    
    //Getters y Setters
    public Cliente getCliente() {
        return cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if(cliente != null && cliente.getTarjetacredito() != this){
            cliente.setTarjetacredito(this);
        }
    }

    
    public String getNumero() {
        return numero;
    }

    public String getFechaVencimiento() {
        return fechaVencimiento;
    }

    public String getBanco() {
        return banco.getNombre();
    }
    
    //Metodos
    public String mostrarDatosCliente(){
        return "Nombre = "+ cliente.getNombre()+"\nDni= "+cliente.getDni();
    }
    
    
    
}
