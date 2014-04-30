package practicas;

import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class ejercicio5 {

    private static Scanner dato;

    public static void main(String[] args) {
        dato = new Scanner(System.in);
        System.out.println("INGRESE N1");
        double a = dato.nextDouble();
        System.out.println("INGRESE N2");
        double b = dato.nextDouble();
        System.out.println("INGRESE N3");
        double c = dato.nextDouble();
        String men = "ORDEN DE FORMA ASCENDENTE";
        double x = Math.max(a, b);
        double y = Math.max(a, c);
        double z = Math.max(b, c);
        
            if (x >= y && y >= z && x >= z) {
                System.out.println(men);
                System.out.println(a + "," + b + "," + c);
            }
          

            if (z >= y && z >= x && y >= x) {
                System.out.println(men);
                System.out.println(c + "," + b + "," + a);
            }
            if (x >= y && y <= z && x >= z) {
                System.out.println(men);
                System.out.println(b + "," + a + "," + c);
            }
        
    }

    }
