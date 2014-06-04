package sistema;
public class Pais {
    private int idpais ;
    private String nompais;

   public String getnompais(){ // Devolver Nombre Pais
       return nompais;
   } 
   
   public int getidpais(){ // Devolver Nombre Pais
       return idpais;
   } 
   
   public void setidpais(int id){ //Cambiar Nombre Pais
      this.idpais=id;
   } 
   
   public void setnompais(String nom){ //Cambiar Nombre Pais
      this.nompais=nom;
   } 
   
   public String getpais(){ // Devolver Nombre Pais
       return idpais+" "+nompais;
   } 
   
  // public Pais(int id, String nom){ // Constructor
   // this.idpais=id;
   // this.nompais=nom;
   //}
    
            
    
    
}
