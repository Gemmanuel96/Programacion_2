/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajo_practico_poo;

/**
 *
 * @author gonza
 */
public class Empleado {
    private int id;
    private String nombreCompleto;
    private String puesto;
    private double salario = 0.0;
    private static int totalDeEmpleados = 0;
    
     private static int generadorID = 0;
    
    public Empleado(String nombreCompleto,String puesto,int id, double salario){
        totalDeEmpleados += 1;
       this.nombreCompleto = nombreCompleto;
       this.puesto = puesto;
       this.salario = salario;
       this.id = id;
    }
    
    public Empleado(String nombreCompleto,String puesto){
        totalDeEmpleados +=1; 
        this.nombreCompleto = nombreCompleto;
        this.puesto = puesto;
        this.id = ++generadorID;
        
    }
     
    public Empleado(){  
    }
    
    //Setters
    public void setNombreCompleto(String nombre){
        this.nombreCompleto = nombre;
    }
    
    public void setPuesto(String puesto){
        this.puesto = puesto;
    }
    
    public void setSalario(double Salario){
        this.salario = Salario;
    }
    
    public void setID(int id){
        this.id = id;
    }
    
    //Getters
    
    public String getNombreCompleto(){
        return this.nombreCompleto;
    }
    
    public String getPuesto(){
        return this.puesto;
    }
    
    public int getID(){
        return this.id;
    }
    
    public double getSalario(){
        return this.salario;
    }
    

//Metodos
    public void actualizarSalario(double porcentaje){
        this.salario += this.salario * porcentaje / 100.0;
    }
    
    public void actualizarSalario(int monto){
        this.salario += monto;
    }
    
    @Override
    public String toString() {
    return "ID = " + id + "\n" +
           "Nombre Completo = " + nombreCompleto + "\n" +
           "Puesto = " + puesto + "\n" +
           "Salario = $" + salario;
}
    
    public static int mostrarTotalEmpleados(){
       return totalDeEmpleados;
    }
    
}
