/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alumnos_poo;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Alumnos_POO {

    
    public static void main(String[] args) {
      Scanner input = new Scanner (System.in);
      String nombre,apellido,curso;
      int calificacion;
      
      Alumno alum1 = new Alumno();
      
        System.out.print("Ingrese nombre: ");
        nombre = input.nextLine();
        alum1.setNombre(nombre);
        
        System.out.print("Ingrese Apellido: ");
        apellido = input.nextLine();
        alum1.setApellido(apellido);
        
        System.out.print("Ingrese Curso: ");
        curso = input.nextLine();
        alum1.setCurso(curso);
        
        System.out.print("Ingrese calificacion : ");
        calificacion = Integer.parseInt(input.nextLine());
        alum1.setCalificacion(calificacion);
        
        System.out.println("\nMostramos informacion: ");
        alum1.mostrarInfo();
        
        System.out.println("Subimos puntos: ");
        alum1.subirCalificacion(3);
        alum1.mostrarCalificacion();
        
        System.out.println("Bajamos puntos");
        alum1.bajarCalificacion(2);
        alum1.mostrarCalificacion();
      
      
      
    }
    
}
