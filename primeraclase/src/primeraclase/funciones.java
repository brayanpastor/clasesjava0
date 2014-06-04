/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package primeraclase;
import java.util.Scanner;//recibir las variables por teclado
/**
 *
 * @author Brayan
 */
public class funciones {
    
     public static int factorial(int a){
           if(a<=0)
           {
               return 0;
           }
           else
           {
               int fact=1;
               for(int i=1;i<=a;i++)
               {
                   fact*=i;
               }
           return fact;
           }
         
       
       }

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner Datos = new Scanner(System.in);//para ingresar datos por teclado
        /*System.out.println("Ingrese valor");
        int a=Datos.nextInt();
        System.out.println("Ingrese valor b");
        int b= Datos.nextInt();
        String cadena=(a>b)? a + " mayor que"+b : a +" menor que"+b;
        System.out.println(cadena);*/
       /* for (int i=1;i<100;i++)
        {
            if(i% 2==0)
            {
            System.out.println(i);
            }
        
        }*/
        System.out.println("ingrese un numero");
        int x=Datos.nextInt();
        System.out.println(factorial(x));
       /* int con=1, fact=1;
        do
        {
            fact=fact*con;
            con++;
            
             
        }while(con<=x);
        System.out.println("el factorial de "+ x +" es");
       System.out.println(fact);
       */
       
     
        
        /* int b=Datos.nextInt();
        
        if(a>b)
        {
            System.out.println(a+" mayor que "+b);
        }
        else{System.out.println(a+" menor que "+b);}*/
    }
    
}

 