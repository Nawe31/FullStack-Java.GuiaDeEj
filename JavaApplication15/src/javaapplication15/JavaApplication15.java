/*Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el número
ingresado seguido de tantos asteriscos como indique su valor. Por ejemplo:


/**
 *
 */
package javaapplication15;
import java.util.Scanner;
public class JavaApplication15 {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       
        int num;
        
        for (int i = 0; i < 4; i++) {
            
            
            System.out.println(" ingrese una nuero");
            num = leer.nextInt();
            
            
            if ( num != 0){
                for (int j = 0; j < num; j++) {
                   System.out.print("*"); 
                    
                }
                
                
            }
        }
        
        
    }
    
}
