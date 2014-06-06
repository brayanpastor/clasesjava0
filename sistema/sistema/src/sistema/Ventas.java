package sistema;
import java.util.*;

public class Ventas {
    private int idventa ; 
    private int tipo;
    private String fecha; 
    private double total;
    private Cliente cliente;

 public double gettotal(){
 return total;
 }   
  
 public String getcliente(){
 return cliente.getnomcliente();
 }   
 
 
  public void registrarCliente(Cliente nuevo){
    this.cliente=nuevo;
    }
   
  public void consultarCliente(String nom){
   
  }
  
   public Ventas(int id, int ti, String fe, Cliente c, double to){ // Constructor
   this.idventa=id;
   this.tipo=ti;
   this.fecha =fe;
   this.cliente=c;
   this.total=to;
  }
    
            
    
    
}
