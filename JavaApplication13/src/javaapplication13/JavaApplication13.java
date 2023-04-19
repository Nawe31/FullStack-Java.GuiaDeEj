/* Escriba un programa que lea 20 números. Si el número leído es igual a cero
se debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". 
El programa deberá calcular y mostrar
el resultado de la suma de los números leídos, pero si el número es negativo 
no debe sumarse. Nota: recordar el uso de la sentencia break*/
package javaapplication13;
import java.util.Scanner;
public class JavaApplication13 {
    


    public static void main(String[] args) {
         
        Scanner leer = new Scanner(System.in);
        int nota;
        int num = 0;
        System.out.println(" ingrese una nota");
        nota = leer.nextInt();
        
        while (nota != 0)
        {
            if ( nota > 1){
            num = num + nota;
            
           System.out.println(" ingrese una distinta de 0, el total es " + num);
            nota = leer.nextInt();
            }
            else{
             num = num + nota;
              System.out.println(" ingrese una distinta de 0, el total es " + num);
            nota = leer.nextInt();
            }
            
           
        }}
          
    
         
    
}
