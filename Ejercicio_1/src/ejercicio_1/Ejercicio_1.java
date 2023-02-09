/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razaPerros = new ArrayList();
        System.out.println("Prueba");
        boolean respuesta=false; // Se entinede que no hay más elementos.
        do{
            System.out.print("Ingrese Raza de Perro: ");
            razaPerros.add(leer.next());
            System.out.print("Desea Ingresar otro Raza? [Si | No(Salir)]");         
            respuesta = leer.next().equalsIgnoreCase("si");           
        }while(respuesta);
    
        System.out.println("Imprimiendo Razas Registradas....");
        System.out.println(razaPerros.toString());
    }
    
    
}
