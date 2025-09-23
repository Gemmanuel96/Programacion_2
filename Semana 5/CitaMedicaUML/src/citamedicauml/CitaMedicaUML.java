/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package citamedicauml;

/**
 *
 * @author gonza
 */
public class CitaMedicaUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Paciente paciente = new Paciente ("Emiliano Cervantes","58498218");
        Profesional profesional = new Profesional ("AB318415","Dermatologia");
        CitaMedica cita = new CitaMedica("13:00","21/09/2025", paciente, profesional);
        
        cita.mostrarDatosPaciente();
        cita.mostrarEspecialidadProfesional();
        System.out.println("\n");
        cita.mostrarCita();
                
        
        
        
    }
    
}
