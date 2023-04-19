/*
 public static void main(String[] args) {
Scanner leer = new Scanner();
System.out.println("Ingresa tu edad");
String nombre = leer.nextInt();

System.out.println("Ingresa tu nombre");
int edad = leer.next();
}

 */

package javaapplication8;
import java.util.Scanner;

public class JavaApplication8 {

    
 public static void main(String[] args) {
 Scanner leer = new Scanner(System.in);
 System.out.println("Ingresa tu edad");
   String nombre = leer.nextLine();

System.out.println("Ingresa tu nombre");
int edad = leer.nextInt();
}
}