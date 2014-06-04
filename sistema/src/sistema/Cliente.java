package sistema;
public class Cliente {
    private int idcliente ; private String nomcliente;
    private String ruc;    private String direccion;
    private String telefono;    private String ciudad;
    private Pais pais;

   public String getnomcliente(){ // Devolver Nombre Pais
       return nomcliente;
   } 
   
   public int getidcliente(){ // Devolver Nombre Pais
       return idcliente;
   } 
   
   public void setidcliente(int id){ //Cambiar Nombre Pais
      this.idcliente=id;
   } 
   
   public void setnomcliente(String nom){ //Cambiar Nombre Pais
      this.nomcliente=nom;
   } 
   
   public String getcliente(){ // Devolver Nombre Pais
       return idcliente+" "+nomcliente+" "+pais.getnompais();
   } 
   
  public void registrarPais(Pais nuevo){
    this.pais=nuevo;
    }
   
  public void consultarPais(String nom){
  
  
  }
  
  // public Pais(int id, String nom){ // Constructor
   // this.idpais=id;
   // this.nompais=nom;
   //}
    
            
    
    
}
