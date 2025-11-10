/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lecturadearchivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author gonza
 */
public class LecturaDeArchivo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        try {
             File archivo = new File("texto.txt");
        Scanner input = new Scanner(archivo);
        
        while (input.hasNextLine()){
            System.out.println(input.nextLine());
        }
        
        input.close();
        
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no existe.");
        }
        
        
    }
    
}
