package JavaApplication14;
import java.util.Scanner;
public class JavaApplication14 {


    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);  
        int num, suma, con;
        con = 0;
        suma = 0;
        do {
            System.out.println("Ingrese numero");
            num = leer.nextInt();
            if (num ==0){
                System.out.println("Se capturó el numero cero");
                break;
            }
            if (num > 0) {
               suma = suma + num;
            }
            con++;
        }while (con < 20 );
        System.out.println("Suma"+suma);
     }}