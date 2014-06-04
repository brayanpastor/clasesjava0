package practicas;
import java.util.Scanner;

public class ejercicio3 {
    
    public static void main(String[] args) {
        Scanner dato =new Scanner(System.in);
        System.out.println("INGRESE PRIMER NUMERO");
        double a=dato.nextDouble();
        System.out.println("INGRESE SEGUNDO NUMERO");
        double b=dato.nextDouble();
         if(a==b)
        {
            System.out.println("LOS VALORES INGRESADO SON IGUALES");
        }
         if(a!=b){
        System.out.println("EL MAYOR ES "+ Math.max(a, b));
        System.out.println("EL MINIMO ES " + Math.min(a, b));
         }
       
    }
    
}
