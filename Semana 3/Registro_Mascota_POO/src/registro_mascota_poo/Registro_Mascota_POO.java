/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package registro_mascota_poo;

import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class Registro_Mascota_POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        String nombre, especie;
        int edad, anios;
        
        //Objeto Mascota
        Mascota masc1 = new Mascota();
        
        System.out.print("Ingrese el nombre de su mascota: ");
        nombre =  input.nextLine();
        masc1.setNombre(nombre);
        
        System.out.print("Ingrese su especie: ");
        especie = input.nextLine();
        masc1.setEspecie(especie);
        
        System.out.print("Ingrese edad de la mascota: ");
        edad = Integer.parseInt(input.nextLine());
        masc1.setEdad(edad);
        
        masc1.mostrarInfo();
        
        System.out.print("\nCuantos anios cumplio desde las ultima vez = ");
        anios = Integer.parseInt(input.nextLine());
        masc1.cumplirAnios(anios);
        
        masc1.getEdad();
        
       
        
    }
    
}
