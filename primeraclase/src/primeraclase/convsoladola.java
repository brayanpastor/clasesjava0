package primeraclase;

import java.util.Scanner;


public class convsoladola {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        double soles = 0;
        double tipo = 0;
        double dolares=0;
        try {
            System.out.println("INGRESE SOLES");
            soles = datos.nextDouble();

        } catch (Exception e) {
            System.out.println("Solo acepta numeros");
        }
        try {
            System.out.println("INGRESE TIPO DE CAMBIO");
            tipo = datos.nextDouble();
        } catch (Exception e) {
            System.out.println("solo acepta numeros");
        }
         dolares=(soles/tipo);
         if("Infinity".equals(String.valueOf(dolares)))
         {
             System.out.println("division cero"); 
         }else{
         System.out.println("EN DOLARES "+ dolares );}
       
    }

}
