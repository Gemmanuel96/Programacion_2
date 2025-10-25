/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase_abstracta;

/**
 *
 * @author gonza
 */
public class Circulo extends Figura{
    private double radio;

    public Circulo(double radio, String nombre) {
        super(nombre);
        this.radio = radio;
    }
    
    
    @Override
    public void calcularArea() {
       double Area;
       Area = 3.14 * Math.pow(radio, 2);
        System.out.println("Area : " + Area);
    }


    
    
    
    
}
