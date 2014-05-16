package basedatos;

import java.sql.ResultSet;
import java.sql.SQLException;

public class Listado {

    public static void main(String[] args) throws SQLException {
        BaseDatos db = new BaseDatos();
        ResultSet rs = db.consulta_sql("select * from country");
        rs.first();
        do {
            System.out.println(rs.getInt("country_id") + " " + rs.getString("country"));

        } while (rs.next());
        db.cerrar();
    }

}
