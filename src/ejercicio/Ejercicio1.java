/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio.pkg1;
import java.util.Scanner;
//import java.util.*;
/**
 *
 * @author labesp
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int edad;
        System.out.print("Ingrese su edad: ");
        edad = sc.nextInt();
        if (edad>=18) {
            if (edad>65) {
                if (edad>105) {
                    System.out.println("Edad fuera de rango, ingrese correctamente la edad");
                }else{
                    System.out.println("Eres de la tercera edad");
                }
            }else{
                System.out.println("Eres mayor de edad");
            }
        }else if (edad <0){
            System.out.println("No ingrese una edad negativa");
        }else{
            System.out.println("Eres menor de edad");
        }
        
}
}