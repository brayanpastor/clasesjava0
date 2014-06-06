package sistema;
import com.mysql.jdbc.Connection; //Conexion
import java.sql.DriverManager; // Driver
import java.sql.ResultSet; // Registro
import java.sql.SQLException;
import java.sql.Statement; //Instancia
import java.util.Scanner;
public class basededatos {
//variables  
private static Connection conexion;  
private static final String bd="sakila";  
private static final String user="root";  
private static final String password="";  
private static final String host="localhost";  
private static final String server="jdbc:mysql://"+host+"/"+bd;  
    
    public static void main(String[] args) throws SQLException {
        conexion = (Connection) DriverManager.getConnection(server,user,password);  
        Statement s = conexion.createStatement();
        Scanner datos = new Scanner(System.in);
        System.out.println("Ingrese Actor a buscar: ");
        String buscar=datos.nextLine();
        ResultSet rs = s.executeQuery ("select * from actor where first_name like '"+buscar+"%'");
        rs.last(); // Registro Ultimo
        System.out.println("Total de Registros: "+rs.getRow()); //Registro Actual
        rs.first(); //Registro Primero
        System.out.println(" Nro ---- Actor   ");  
        do { // Siguiente Registro
              System.out.println(rs.getRow()+" "+rs.getString ("first_name")+" " +rs.getString("last_name"));  
        }while (rs.next());
        rs.close();
        s.close();
        conexion.close();  
     }  
}
