/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package trabajo_practico_poo;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Trabajo_Practico_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        Empleado e1 = new Empleado("Juan Gabriel Lopez","Repositor",5,0.0);
        Empleado e2 = new Empleado("Jorge Jimenez","Operario");
        Empleado e3 = new Empleado("Roberto Albarain","Programador");
        
        //Mostramos datos de los empleados
        System.out.println(e1.toString()+"\n"); //Mostramos los datos
        System.out.println(e2.toString()+"\n");
        System.out.println(e3.toString()+"\n");
        
        //Modificamos datos de 3er empleado.
        e3.setNombreCompleto("Ignacio Rodriguez");
        e3.setID(2);
        
        //MOstramos los datos
        
        //Ingresamos salario de los 3 empleados
        e1.actualizarSalario(5000);//Ingresamos un numero entero de salario
        e1.actualizarSalario(5.0); //Agregamos en numero double mas del salario
        
        
        e2.actualizarSalario(2500);
        e2.actualizarSalario(3.0);
        
        
        //En empleado 3 le damos el salario con SetSalario
        e3.setSalario(2500.0);
        e3.actualizarSalario(5.5);
        
        System.out.println(e1.toString()+"\n");
        System.out.println(e2.toString()+"\n");
        System.out.println(e3.toString()+"\n");
        
        
        System.out.println("Total de empleados en planta = " + Empleado.mostrarTotalEmpleados());
        
        
    }
    
}
