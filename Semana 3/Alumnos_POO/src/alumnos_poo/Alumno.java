/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package alumnos_poo;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Alumno {
   private String Nombre,Apellido,curso;
   private int Calificacion, puntos;
   
   //Ingresamos nuevos valores en nuestro objeto
   public void setNombre(String N_nom){
       Nombre = N_nom;  
   }
   
   public void setApellido(String N_apellido){
       Apellido = N_apellido;
   }
   
   public void setCurso (String N_curso){
       curso = N_curso;
   }
   
   public int setCalificacion(int N_calificacion){
        
       if(N_calificacion <= 10 && N_calificacion >0){
           Calificacion = N_calificacion;
       }else{
           System.out.println("La nota Ingresada no es valida.");
       }
       return Calificacion;
    }
   
    public void mostrarInfo(){
       System.out.println(Nombre);
       System.out.println(Apellido);
       System.out.println(curso);
       System.out.println("Calificacion = "+ Calificacion);
    }
   
    public void mostrarCalificacion(){
        System.out.println(Calificacion);
    } 
            
   public int subirCalificacion(int puntos){
        Calificacion = Calificacion + puntos;
       return Calificacion;
   }
   
   public int bajarCalificacion(int puntos){
       Calificacion = Calificacion - puntos;
       return Calificacion;
   }
   }
       

