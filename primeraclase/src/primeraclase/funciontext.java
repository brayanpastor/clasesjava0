package primeraclase;
import java.util.Scanner;

public class funciontext {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner datos=new Scanner(System.in);
       // System.out.println("INGRESE NOMBRE");
       // String cadena=datos.nextLine();
        /*System.out.println("longitud " + cadena.length());
        System.out.println("Mayuscula " + cadena.toUpperCase());
        System.out.println("Minuscula " + cadena.toLowerCase());
        System.out.println("la"+ cadena);
        System.out.println(cadena.concat(" pastor"));
        //System.out.println(cadena.charAt(1));//TOMA LA LA LETRA dependediendo de su posicion de la cadena
        System.out.println(cadena.indexOf("a"));//devuelve la posicion de la cadena
        System.out.println(cadena.lastIndexOf("a"));
        System.out.println(cadena.substring(3,6));
        System.out.println(cadena.equalsIgnoreCase("TARAPOTO"));
        System.out.println(cadena.equalsIgnoreCase("TARAPOTO"));
        System.out.println(cadena.compareTo("TARAPOTO"));
        System.out.println(cadena.replace("brayan", "sabe"));
        System.out.println("CONVIRTIENDO EN ARRAYS CHAR[]");
        System.out.println(cadena.hashCode());*/
                
       /*char[] valor = cadena.toCharArray();//lo convierte en un array tipo char
       for(int i=0;i<valor.length;i++)
       {
           System.out.println(valor[i]);
       
       }*/
                
         
         /*for(int i=0; i<cadena.length();i++)
        {
            System.out.println(cadena.charAt(i));
        }*/
        
        /*System.out.println("convirtiendo numero a cadena");
        int v1=5 , v2=8;
        System.out.println(String.valueOf(v1) + String.valueOf(v2));
        String x="8" , y="5";
        System.out.println(Integer.parseInt(x)+Integer.parseInt(y));*/
        
        //VALOR ABSOLUTO
      /*System.out.println("ingrese numero");
      double x=datos.nextDouble();
      System.out.println("convirtiendo a valor absoluto");
        System.out.println(Math.abs(x));*/
        /*DE MENOS A MAYO*/
       /*System.out.println("primer numero");
        int a=datos.nextInt();
        System.out.println("segundo numero");
        int b=datos.nextInt();
        System.out.println("tercer numero");
        int c=datos.nextInt();
        int aux=0;
      for(int i=1;i<3;i++){
        
        if(a>b)
        {
            aux=a;
            a=b;
            b=aux;
        
        }
        if(b>c)
        {
            aux=b;
            b=c;
            c=aux;
        }
        if(a>c)
        {
            aux=a;
            a=c;
            c=aux; 
        
        }
     }
        
        System.out.print(a+",");
        System.out.print(b+",");   
        System.out.print(c+","); */
        System.out.println("numero");
        String valor=datos.nextLine();
        String reves="";
       
        for(int i=valor.length()-1;i>=0;i--)
        {
            reves+=String.valueOf(valor.charAt(i));
           
        }
        
         System.out.println(reves);
        
        
    }
    
    
}
