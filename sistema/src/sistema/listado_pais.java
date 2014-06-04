package sistema;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class listado_pais {
        //atributos
        static String bd="libreria";  
        static String user="root";  
        static String password="";  
        static String host="localhost";  
        static String server="jdbc:mysql://"+host+"/"+bd; 
        
    public static void main(String[] args){
        Connection con=null;  
            try {
                con = DriverManager.getConnection(server,user,password);
            } catch (SQLException ex) {
                System.out.println("no se puede acceder a la Base de Datos");
            }
        Statement s = null;
            try {
                s = con.createStatement();
            } catch (SQLException ex) {
                System.out.println("no se puede crear la Instancia");
            }
        ResultSet rs=null;
            try {
                rs = s.executeQuery ("select * from pais");
            } catch (SQLException ex) {
                System.out.println("Consulta erronea");
            }
        System.out.println(" Nro ---- Pais   ");  
            try {
                rs.first();
            } catch (SQLException ex) {
                 System.out.println("No se puede ir al primer registro");
            }
            try {
                do {
                    try {
                        System.out.println(rs.getInt("pais_id")+" "+rs.getString ("nombre"));
                    } catch (SQLException ex) {
                        System.out.println("No se puede mostrar los registro");
                    }
                }while(rs.next());
            } catch (SQLException ex) {
                  System.out.println("No puede mostrar los datos");
            }
            try {
                rs.close();
            } catch (SQLException ex) {
               System.out.println("no se puede cerrar la consulta");
            }
            try {
                s.close();
            } catch (SQLException ex) {
                 System.out.println("no se puede cerrar la consulta");
            }
            try {  
                con.close();
            } catch (SQLException ex) {
                 System.out.println("no se puede cerrar la conexion");
            }
    }
    
}
