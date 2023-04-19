/*
 Escriba un programa que pida una frase o palabra y valide si la primera letra de esa frase
es una ‘A’. Si la primera letra es una ‘A’, se deberá de imprimir un mensaje por pantalla
que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”. Nota:
investigar la función Substring y equals() de Java.
 */
package javaapplication27;
import java.util.Scanner;


public class JavaApplication27 {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       
        System.out.println("ingrese una frace");
        String frase = leer.nextLine();
        
        

        do{
        
            if (frase.substring(0,1).equalsIgnoreCase("a")){
            
                System.out.println("CORRECTO");
                break;
            }
            else {
               System.out.println("INCORRECTO");
               break;
            }
            
            
        }while(frase.length() != 0);
        
        
    }
    
}
