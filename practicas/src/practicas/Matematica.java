package practicas;

import java.util.Scanner;

public class Matematica {

    private static Scanner datos;

    public static void main(String[] args) {
        datos = new Scanner(System.in);
        System.out.println("INGRESE PRIMER NUMERO");
        double a = datos.nextDouble();
        System.out.println("INGRESE SEGUNDO NUMERO");
        double b = datos.nextDouble();
        System.out.println("el mayor de los numeros es " + Math.max(a, b));
        System.out.println("El menor es " + Math.min(a, b));
        System.out.println("INGRESE RADIO");
        double c = datos.nextDouble();
        System.out.println("el radio " + Math.PI * Math.pow(c, 2));
        System.out.println("INGRESE DECIMAL");
        double d = datos.nextDouble();
        System.out.println("floor" + Math.floor(d));
        System.out.println("ceil" + Math.ceil(d));
        System.out.println("Round " + Math.round(d));
    }

}
