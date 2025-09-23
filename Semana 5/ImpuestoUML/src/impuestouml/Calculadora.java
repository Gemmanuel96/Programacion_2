/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package impuestouml;

/**
 *
 * @author gonza
 */
public class Calculadora {
    public void Calcular(Impuesto impuesto){
       double calculado = impuesto.getMonto() + (impuesto.getMonto() * 15 / 100);
        System.out.println("Valor con impuesto : " + calculado);
    }
}