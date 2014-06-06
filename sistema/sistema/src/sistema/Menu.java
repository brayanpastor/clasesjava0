package sistema;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) throws SQLException {
        ArrayList lista = new ArrayList();
        conexiondb db = new conexiondb();
        ResultSet rs=db.consulta_sql("Category", 0);
        System.out.println("Mostrar Datos de Categoria: ");
        rs.first();
        do { 
            Categoria c=new Categoria(rs.getInt(1),rs.getString(2),rs.getTimestamp(3));
            lista.add(c);//
         }while (rs.next());// Siguiente Registro
         
         for(int i=0;i<lista.size();i++){
             Categoria c = (Categoria)lista.get(i);
            System.out.println(c.Mostrar());
         }
        
 
    }
    
}
