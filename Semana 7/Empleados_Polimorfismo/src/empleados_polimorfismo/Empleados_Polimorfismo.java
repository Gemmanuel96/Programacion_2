/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empleados_polimorfismo;

import java.util.ArrayList;

/**
 *
 * @author gonza
 */
public class Empleados_Polimorfismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       ArrayList <Empleado> empleados = new ArrayList<>();
       
       empleados.add(new EmpleadoPlanta("Juan Alberto", 15, 20000));
       empleados.add(new EmpleadoTemporal("Gonzalo Nuñez", 10, 10000));
       empleados.add(new EmpleadoTemporal("Javier Lozano", 17, 10000));
       
       
        for(Empleado e : empleados){
            e.calcularSueldo();
            e.mostrarSueldoEmpleado();
            
            if( e instanceof EmpleadoPlanta){
                System.out.println("Es un empleado de planta\n");
            }else{
                System.out.println("Es un empleado temporal\n");
            }
        }
        
    }
    
}
