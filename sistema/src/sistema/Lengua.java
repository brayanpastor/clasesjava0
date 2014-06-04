package sistema;

import java.sql.ResultSet;
import java.sql.SQLException;
//import java.sql.Timestamp;

public class Lengua {

    private static conexiondb db = new conexiondb();
    private int ta = 0;
    private ResultSet rs;
    private int[] codigo;
    private String[] nombre;
    //private Timestamp fecha;

    public boolean llenar(String valor, int opcion) throws SQLException {
    String consulta = null;
    switch(opcion){
        case 0: consulta="select * from language"; break;
        case 1: consulta="select * from language where language_id="+valor;break;
        case 2: consulta="select * from language where name like '"+valor+"%'";break;    
    }
    rs=db.consulta_sql(consulta);
    rs.last();//vamos a la ultimo registro
    if(rs.getRow()>0)
    {
        ta=rs.getRow();//nos da el tamaño ejeplo si son 5 te devuelve 5
        rs.first();// vuelve al inicio para llenar
          codigo = new int[ta]; //damos el tamaño a cada atributo 
        nombre = new String[ta];//damos el tamaño a cada atributo
        for (int i = 0; i < ta; i++) {
            this.codigo[i] = rs.getInt(1);
            this.nombre[i] = rs.getString(2);
            rs.next();
            
        }
        db.cerrar();
        return true;
    }
    else{return false;}
  
     

    }

    public String getnombre(int cod) {
        return this.nombre[cod];
    }

    public int getcodigo(int cod) {
        return this.codigo[cod];
    }

    public int totalregistro() {
        return ta;
    }
    public  void insertar(String valor) throws SQLException
    {
        String consulta="insert into language(name,last_update) values ('"+valor+"')";
        db.insertar_valor(consulta);
    }
 
   

}
