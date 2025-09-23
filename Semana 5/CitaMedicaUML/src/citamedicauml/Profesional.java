/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citamedicauml;

/**
 *
 * @author gonza
 */
public class Profesional {
    private String titulo;
    private String especialidad;

    public Profesional(String titulo, String especialidad) {
        this.titulo = titulo;
        this.especialidad = especialidad;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getEspecialidad() {
        return especialidad;
    }
    
    
}
