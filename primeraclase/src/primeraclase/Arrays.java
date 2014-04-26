package primeraclase;

import java.util.Scanner;

/**
 *
 * DECLARACION int valor[]=null String [] Mes int valor1[]=new int[10]
 *
 */
public class Arrays {

    public static void main(String[] args) {
        int arreglo[] = new int[5];
        int max = 0;
        int cont = 0;
        Scanner datos = new Scanner(System.in);
        try {
            for (int i = 0; i < 5; i++) {
                System.out.println("INGRESE VALOR " + (i + 1) + ":");
                arreglo[i] = datos.nextInt();

            }
            for (int x : arreglo) {
                if (max < x) {
                    max = x;
                }
            }
            for (int x : arreglo) {
                // if(max==x) cont++;
                cont += (max == x) ? 1 : 0;

            }
            System.out.println("el numero mayor es" + max);
            System.out.println("el mayor se repite: " + cont);
        } 
        catch (Exception e) {
            System.out.println("dato no valido" + e.toString());
        }

        /*String mes[] = {"enero", "febrero", "marzo"};
         for ( int y=0;y<mes.length;y++ ) {
         System.out.println(mes[y]);
         }
         for(String DATOS:mes)
         {
         System.out.println(DATOS);
         }*/
        /*  int valor[]= new int[10];
         for(int i=0;i<10;i++)
         {
         valor[i]=i;
         }

         for(int i=0;i<10;i++)
         {
         System.out.println(valor[i]);
         }*/
    }

}
