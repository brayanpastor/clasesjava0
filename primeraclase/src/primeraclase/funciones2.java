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
public class funciones2 {
    
    static int fact=1;
     public static void factorial(int a){
           if(a<=0)
           {
               fact= 0;
           }
           else
           {
               
               for(int i=1;i<=a;i++)
               {
                   fact*=i;
               }
                   }
         
       
       }

    public static void main(String[] args) {
        // TODO code application logic here
         Scanner Datos = new Scanner(System.in);
         System.out.println("ingrese un numero");
        int x=Datos.nextInt();
        factorial(x);
        System.out.println(fact);
        
    }
            
    
    
}
