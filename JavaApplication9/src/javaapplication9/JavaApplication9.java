/* 
Implementar un programa que le pida dos números enteros a usuario y determine si ambos o
alguno de ellos es mayor a 25.


*/
package javaapplication9;

import java.util.Scanner;

public class JavaApplication9 {

 
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese un numero");
        int num1 = leer.nextInt();
        
        System.out.println("Ingresa tu nombre");
        int num2 = leer.nextInt();
        
     if (num1 > 25 ){
         
         System.out.println("numero 1 es mayor que 25");
         
     } 
     else
     {
          System.out.println("numero 1 no es  mayor");
     }
      if (num2 > 25){
         
         System.out.println("numero 2 es mayor que 25 ");
         
     } 
     else
     {
          System.out.println("numero 2 no es  mayor");
     }
     
     
    }
}
