package libreria;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import libreria.Autor;
import libreria.Libro;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author gonza
 */
public class Biblioteca {
    private String nombre;
    private ArrayList <Libro> libros;

    public Biblioteca(String nombre) {
        this.nombre = nombre;
        this.libros = new ArrayList<>();
    }
    
    
    
    //Buscador de libros por ISBN
    public void buscarLibroPorISBN(String isbn) {
    int i = 0;

    while (i < cantLibros() && !this.libros.get(i).getISBN().equalsIgnoreCase(isbn)) {
        i++;
    }

    if (i < cantLibros()) {
        this.libros.get(i).mostrarInfo();
    } else {
        System.out.println("No se encontró el libro con ISBN " + isbn);
    }
}
     
    //Cantidad de Libros
    private int cantLibros(){
        return libros.size();
    }
    
    public void cantidadLibros(){
        System.out.println("Cantidad de Libros : " + libros.size());
    }
    
    //Eliminar Libros
    public boolean eliminarProducto(String isbn){
        Iterator <Libro> it = this.libros.iterator();
        
        while(it.hasNext()){
            Libro a = it.next();
            
            if(a.getISBN().equalsIgnoreCase(isbn)){
                it.remove();
                return true;
            }
        }
        return false;
    }
     //Listar Libros
    
    public void listarLibros(){
        for(Libro i : libros){
            System.out.println("\n");
            i.mostrarInfo();
        }
    }
    
    //Agregar Libro
    public void agregarLibro(String id,String titulo,int anio, Autor autor){
        
        if(id == null){
            System.out.println("ISBN requerido.");
        }else if(titulo == null){
            System.out.println("Titulo Requerido");
        }else if(anio <= 0){
            System.out.println("Anio requerido");
        }else if(autor == null){
            System.out.println("Autor requrido");
        }else{
          Libro libro = new Libro(id, titulo, anio, autor);
          libros.add(libro);
        }
            
    }
    
    //Filtro de Libro
    
    public void filtrarPorAnio(int anio){
        List <Libro> filtrados = filtrar(anio);
        if(filtrados.isEmpty()){
            System.out.println("No hay Libros disponibles");
        }else{
            for (Libro i : filtrados) {
                System.out.println(i.getAutor() + "\n");
            }
        }
        
    }
    
    
    //Busqueda de libro
     private List <Libro> filtrar(int anio){
         List <Libro> encontrados = new ArrayList<>();
         
         for (Libro a : libros){
             if(a.getAnioPublicacion() == anio ){
                 encontrados.add(a); 
             }
         }
         
         if (encontrados.isEmpty()){
             System.out.println("No se encontraron Libros");
         }
         
         return encontrados;
     }
    
     
     //Muestra Autores Disponibles
     public List <Libro> autoresDisponibles(String autor){
         List <Libro> encontrados = new ArrayList<>();
         
         if(autor == null){
             return encontrados;
         }
         
         for (Libro a : libros){
             if(a.getAutor() != null && a.getAutor().getNombre() != null && a.getAutor().getNombre().equalsIgnoreCase(autor)){
                 encontrados.add(a); 
             }
         }
         return encontrados;
     }
     
     public void mostrarAutoresDisponibler(){
        for (Libro i : libros){
            System.out.println(i.getAutor()+"\n");
        }
    }  
    
     
}

