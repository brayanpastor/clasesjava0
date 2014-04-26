/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primeraclase;
import java.util.Scanner;

/**
 *
 * @author Brayan
 */
public class funcionesprac {

    public static int factorial ( int b)
    {
        if(b<=0)
        {
            return 0;
                              
        }
        else
        {
            int fact=1;
            for(int i=0;i<=b;i++)
            {
               fact*=i;
            }        
            return fact;
        }
        
    
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner datos = new Scanner(System.in);
        System.out.println("ingrese numero");
        int x=datos.nextInt();
        System.out.println(factorial(x));
    }
    
}
