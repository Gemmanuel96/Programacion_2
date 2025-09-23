/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impuestouml;

/**
 *
 * @author gonza
 */
public class Impuesto {
    private double monto;
    private Contribuyente contribuyente;
    
//Contructor
    public Impuesto(double monto) {
        this.monto = monto;
    }
    //Get y Set
    public double getMonto() {
        return monto;
    }

    public void setContribuyente(Contribuyente contribuyente) {
        this.contribuyente = contribuyente;
    }
     
    //Metodos
    public void mostrarContribuyente(){
        System.out.println("Nombre: " + contribuyente.getNombre()+ "\nCuil: "+ contribuyente.getCuil());
    }
}
