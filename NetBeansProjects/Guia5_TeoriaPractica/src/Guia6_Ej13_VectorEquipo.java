
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author CRAMOS
 */
public class Guia6_Ej13_VectorEquipo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
             
        Scanner leer = new Scanner(System.in); 
        
        System.out.println("Bienvenido!");
        
        String[] equipo = new String[6];
        
        for (int i = 0; i < equipo.length; i++) {
            System.out.println("Ingresa el nombre del integrante Nro. " + (i+1) + " del equipo");    
        equipo[i] = leer.nextLine();
        }
        
     }
    
}
   
