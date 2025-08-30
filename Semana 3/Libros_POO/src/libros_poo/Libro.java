/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libros_poo;

/**
 *
 * @author gonza
 */
public class Libro {
    private String Autor,Titulo;
    private int Anio;
    
    public void mostrarInfo(){
        System.out.println("Titulo: "+ Titulo);
        System.out.println("Autor: " + Autor);
        System.out.println("Anio: " + Anio);       
    }
    
    //Setters
    
    //Ingresamos titulo
    public void setTitulo(String n_titulo){
        this.Titulo = n_titulo;
    }
    //
    public void setAutor(String n_Autor){
        this.Autor = n_Autor;
    }
    
    public void setAnio(int n_Anio){
        
        if (n_Anio >= 1900 && n_Anio <= 2025){
            this.Anio = n_Anio;
        }else{
            System.out.println("El anio Ingresado no es valido."); 
            
        }
    }
    
    
    
    //Getters
     //Mostramos Autor
    public String getAutor(){
        return Autor;
    }
    
    //Mostramos Titulo
    public String getTitulo(){
        return Titulo;
    }
    
    //Mostramos Anio
    public int getAnio(){
        return Anio;
    }
    
 
}
