/*

 */
package javaapplication10;
import java.util.Scanner;

public class JavaApplication10 {
    

  
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
         int opcion;
        System.out.println("ingrese el tipo de de motor que desea");
        opcion = leer.nextInt();
        
        switch (opcion){
            case 1:{
                System.out.println("La bomba es de agua ");
                }
              break;
              
            case 2:{
                 System.out.println("la bomba es de gasolina");
            }
            break;
              case 3:{
                 System.out.println("la bomba es de pasta alimetica");
            }
            break;
              default :{
                 System.out.println("no existe un valor valido para tipo de bomba");
            }
           
                      
        
                        }
    }
   }
