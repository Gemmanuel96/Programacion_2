/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package reproductoruml;

/**
 *
 * @author gonza
 */
public class Cancion {
    private String titulo;
    private Artista artista;

    public Cancion(String titulo) {
        this.titulo = titulo;
    }

    public void setArtista(Artista artista) {
        this.artista = artista;
    }

   public String mostrarCancion(){
     return titulo +"\nArtista = "+artista.getNombre()+"\nGenero = " + artista.getGenero();
   }
    
    
}
