/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package editovideouml;

/**
 *
 * @author gonza
 */
public class EditoVideoUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Proyecto proyecto = new Proyecto("Paises Bajos","1:30:25");
      EditorVideo editor = new EditorVideo();
      
      editor.exportar("MP4", proyecto);
      
      
    }
    
}
