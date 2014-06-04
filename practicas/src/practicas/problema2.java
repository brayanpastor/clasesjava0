
package practicas;
import java.util.Scanner;

public class problema2 {
private static Scanner dato;
    public static void main(String[] args) {
        dato =new Scanner(System.in);
        try{
        System.out.println("INGRESE NUMERO");
        double x=dato.nextDouble();
        double res= 1/(Math.pow(x, 2)-1);
    
        System.out.println(res);
        }
        catch (Exception e) {
            System.out.println("DATO NO VALIDO. INGRESE NUMERO");
        }
    }
    
}
