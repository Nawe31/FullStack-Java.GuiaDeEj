/*Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario, validando
que el primer numero múltiplo del segundo y e imprima si el primer numero es múltiplo del
segundo, sino informe que no lo son.*/
package javaapplication17;
import java.util.Scanner;
public class JavaApplication17 {

public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese un numero");
        int num = leer.nextInt();
        
          System.out.println("Ingrese un segundo numero");
        int num2 = leer.nextInt();
        
        
        Multiplo1(num,num2);
 
        
     
    }

     public static void Multiplo1 (int num, int num2) {
         
        
        
        if (num % num2 == 0){
            System.out.println(" es multiplo");
        }
        else {
            System.out.println("no es multiplo");
        }
                
                
        
        
    }
    

}