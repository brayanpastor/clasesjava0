
import sistema.*;
import java.sql.*;

public class conexiondb {

    private static Connection con;
    private static Statement s;
    private static ResultSet rs;
    private static final String Driver = "com.mysql.jdbc.Connection"; //Conexion
    private static final String bd = "sakila";
    private static final String user = "root";
    private static final String password = "";
    private static final String host = "localhost";
    private static final String server = "jdbc:mysql://" + host + "/" + bd;

    public static Statement conectar() {
        try {
            Class.forName(Driver);
            con = (Connection) DriverManager.getConnection(server, user, password);
        } catch (SQLException e) {
            System.out.println("Error" + e.getMessage());
        } catch (ClassNotFoundException ex) {
            System.out.println("No se puede Conectar");
        }
        try {
            s = con.createStatement();
        } catch (SQLException ex) {
            System.out.println("Error en la Instancia");
        }
        return s;

    }

    public ResultSet consulta_sql(String consulta) {
        conectar();
        try {
            rs = s.executeQuery(consulta);

        } catch (SQLException ex) {
            System.out.println("No se puede consultar");
        }
        return rs;
    }

    public void cerrar() {
        try {
            rs.close();
            s.close();
            con.close();
        } catch (SQLException ex) {
            System.out.println("No se puede cerrar Base de Datos");
        }
    }

    public void insertar_valor(String con) throws SQLException {
        conectar();
        s.executeQuery(con);

    }

    public int ultimo() throws SQLException {
        rs.last();

        return rs.getRow();

    }

}
