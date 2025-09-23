/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package reproductoruml;

/**
 *
 * @author gonza
 */
public class ReproductorUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cancion cancion = new Cancion("In the End");
        Artista artista = new Artista("Linkin Park", "Nu Metal");
        
        cancion.setArtista(artista);
        
        Reproductor reproductor = new Reproductor();
        reproductor.ReproduciendoCancion(cancion);
    }
    
}
