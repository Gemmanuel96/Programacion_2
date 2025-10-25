/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleados_polimorfismo;

/**
 *
 * @author gonza
 */
public class EmpleadoTemporal  extends Empleado{
    
    private String nombreCompleto;
    private int diasTrabajados;

    public EmpleadoTemporal(String nombreCompleto, int diasTrabajados, double sueldo) {
        super(sueldo);
        this.nombreCompleto = nombreCompleto;
        this.diasTrabajados = diasTrabajados;
    }
  
    @Override
    public void calcularSueldo() {
        double sueldoActualizado;
        sueldoActualizado = getSueldo() + (diasTrabajados * 3500);
        setSueldo(sueldoActualizado);
    }
   
    public void mostrarSueldoEmpleado(){
        System.out.println("Empleado: " + nombreCompleto);
        System.out.println("Sueldo: " + getSueldo());
    }
    
    
    
}
