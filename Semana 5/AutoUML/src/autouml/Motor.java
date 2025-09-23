/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package autouml;

/**
 *
 * @author gonza
 */
public class Motor {
    private String tipo;
    private String numeroSerie;

    public Motor(String tipo, String numeroSerie) {
        this.tipo = tipo;
        this.numeroSerie = numeroSerie;
    }
    
    public void mostrarMotor(){
        System.out.println("Tipo: " + tipo + "\nNumeroSerie: " + numeroSerie);
    }
    
}
