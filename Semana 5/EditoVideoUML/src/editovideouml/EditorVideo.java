/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package editovideouml;

/**
 *
 * @author gonza
 */
public class EditorVideo {
    public void exportar(String formato, Proyecto proyecto){
        Render render = new Render(formato, proyecto);
        System.out.println("Render realizado de: \nProyecto: "+render.getFormato()+"\nProyecto: "+proyecto.getNombre()+"\nDuracion: "+ proyecto.getDuracion());
    }
}
