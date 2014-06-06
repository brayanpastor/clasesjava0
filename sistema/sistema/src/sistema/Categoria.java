package sistema;
import java.sql.ResultSet;
import java.sql.Timestamp;

public class Categoria {
    //Atributos
    private int codigo=0;
    private String nombre=null;
    private Timestamp fecha=null;

    //metodos o acciones
    public void setNombre(String nom){
        this.nombre=nom;
    }
    
    public String getNombre(){
        return nombre;
    }
    
   public int getCodigo(){
         return codigo;
    }

   public String Mostrar(){
         return codigo+" "+nombre;
    }

    public Categoria(int cod, String nom,Timestamp fec ){
     this.codigo=cod;
     this.nombre=nom;
     this.fecha=fec;        
    }
    
}
