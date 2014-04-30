package practicas;
import java.util.Scanner;

public class texto {
    private static Scanner dato;
    
    public static void main(String[] args) {
        dato=new Scanner(System.in);
        System.out.println("INGRESE NOMBRE");
        String cadena=dato.nextLine();
        System.out.println("tamaño de cadena " + cadena.length());
    }
    
}
