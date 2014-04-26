
package primeraclase;

import java.util.Scanner;

/**
 *
 * @author Brayan
 */
public class Matematicas {

   
    public static void main(String[] args) {
        Scanner Datos=new Scanner(System.in);
        /*System.out.println("INGRESE NUMERO 1");
        int a= Datos.nextInt();
        System.out.println("INGESE NUMERO 2");
        int b=Datos.nextInt();
      //  System.out.println("el mayor es "+ Math.max(a, b));//identifica quien es el mayor de los dos numeros
        System.out.println("el minimo es "+Math.min(a, b));       
        System.out.println("INGRESE RADIO");
        double c=Datos.nextDouble();
        System.out.println("el area del circulo "+ (Math.PI*Math.pow(c, 2)));*/
        System.out.println("INGRESE DECIMAL");
        double d=Datos.nextDouble();
        System.out.println("floor" + Math.floor(d));
        System.out.println("ceil" + Math.ceil(d));
        System.out.println("Round " + Math.round(d));
    }
    
}
