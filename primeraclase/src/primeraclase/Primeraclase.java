package primeraclase;

public class Primeraclase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int ab=3;
        System.out.println(ab);
        System.out.println("operaciones basicas");
        double a=5 , b=3;
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(Math.round(a/b));//redondea
        System.out.println(a*b);
        System.out.println(Math.pow(a,b));//potencia
        System.out.println(++a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println("operadores de comparacion");
        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a==b);
        //System.out.println(a===b);
        System.out.println(a!=b);
        System.out.println("CONDICIONES");
        System.out.println(a>b && b>10);
        System.out.println(a<10 || a<0);
    }
    
}
