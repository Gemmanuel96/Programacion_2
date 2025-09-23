/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package citamedicauml;

/**
 *
 * @author gonza
 */
public class CitaMedica {
    private String hora;
    private String fecha;
    private Paciente paciente;
    private Profesional profesional;

    public CitaMedica(String hora, String fecha, Paciente paciente, Profesional profesional) {
        this.hora = hora;
        this.fecha = fecha;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    
    public void mostrarCita(){
        System.out.println("Fecha: "+ fecha+ "\nHora: "+ hora+"\nPaciente: " + paciente.getNombre()+"\nProfecional: "+ profesional.getEspecialidad()  );
    }

    public void mostrarDatosPaciente() {
        System.out.println("Nombre: " + paciente.getNombre()+ "\nObraSocial: " + paciente.getObraSocial());
    }

    public void mostrarEspecialidadProfesional() {
        System.out.println("Especialidad: "+ profesional.getEspecialidad() + "\nTitulo: "+profesional.getTitulo());
    }
            
    
    
    
}
