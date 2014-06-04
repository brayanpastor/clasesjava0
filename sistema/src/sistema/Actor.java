package sistema;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;

public class Actor {
    //Atributos
    private int codigo=0;
    private String nombre=null;
    private String apellido=null;
    private Timestamp fecha=null;
    
    //metodos o acciones
    public void setNombre(String nom){
        this.nombre=nom;
    }
    
    public void setApellido(String ape){
        this.apellido=ape;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public String getApellido(){
         return apellido;
    }
    
    public int getCodigo(){
         return codigo;
    }
    
    public String completoActor(){
    return nombre+" "+apellido;
    }
    
    public Actor(int cod, String nom, String ape, Timestamp fec ){
     this.codigo=cod;
     this.nombre=nom;
     this.apellido=ape;
     this.fecha=fec;        
     
    }
    
}
