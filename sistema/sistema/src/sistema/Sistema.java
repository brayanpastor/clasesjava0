package sistema;
import java.util.Scanner;

public class Sistema {

    public static void main(String[] args) {
       Scanner datos = new Scanner(System.in); 
       Cliente c=new Cliente();
       Pais p=new Pais();
       System.out.println("Ingrese Codigo");
       c.setidcliente(Integer.parseInt(datos.nextLine()));
       System.out.println("Ingrese Cliente");
       c.setnomcliente(datos.nextLine());
       System.out.println("Ingrese pais");
       p.setnompais(datos.nextLine());
       c.registrarPais(p);
       System.out.println("Mostrar Cliente");
       System.out.println(c.getcliente());
       
       Ventas v[]=new Ventas[3];
        double suma=0;
        for(int z=0;z<3;z++){
           System.out.println("Ingrese Monto");
           double valor=Double.parseDouble(datos.nextLine());
            v[z]=new Ventas(1,1,"29/03/2014",c,valor);
            suma+=v[z].gettotal();
       }
       

      System.out.println("La Suma total de la Ventas de "+v[0].getcliente()+" es :"+suma);
        
    }

    
}
