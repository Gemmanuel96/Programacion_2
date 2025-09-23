/*
/ * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package celularuml;

/**
 *
 * @author gonza
 */
public class CelularUML {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Gonzalo Nuñez", "39658636");
        Celular celular = new Celular("13654654af","AF350","Xiomi");
        Bateria bateria = new Bateria("Samsung","5200 kWh");
        
        celular.setUsuario(usuario);
        celular.setBateria(bateria);
        
        System.out.println(celular.mostrarDatosUsuario());
        System.out.println(usuario.mostrarTelefono());
        
        
        
    }
    
}
