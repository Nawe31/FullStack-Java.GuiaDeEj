/*
  Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo. Si
el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir
“INCORRECTO”.
 */
package javaapplication26;
import java.util.Scanner;


public class JavaApplication26 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        
        System.out.println("ingrese una frace");
        String frace = leer.nextLine();
        
        do {
            if (frace.length() <= 8){
      System.out.println("mensaje correcto");
      break;}
            
            if (frace.length() > 8);{
         System.out.println(" mensaje incorrecto");
         break;}
            
        }while(frace.length() <= 8);
        
    
        
   
}}
