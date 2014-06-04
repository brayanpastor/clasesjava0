
import java.sql.ResultSet;
import java.sql.SQLException;

public class c_categoria {

    private int[] codigo;
    private String[] nomcategoria;
    private static final conexiondb db = new conexiondb();
    private ResultSet r;//guarda toda la consulta que realizamos 
    private int ta = 0, ini = 0;

    public void llenar() throws SQLException {
        r = db.consulta_sql("select * from category");
        r.last();
        ta = r.getRow();
        codigo = new int[ta];
        nomcategoria = new String[ta];
        r.first();
        int i = 0;
        do {
            codigo[i] = r.getInt(1);
            nomcategoria[i] = r.getString(2);
            i++;

        } while (r.next());
        db.cerrar();
    }

    public int getcodigo(int i) {
        return codigo[i];

    }

    public String getnomcategoria(int i) {
        return nomcategoria[i];
    }

    public int primero() {
        ini = 0;
        return ini;

    }

    public int ultimo() {
        ini = ta - 1;
        return ini;

    }

    public int siguiente() {
        System.out.println(ini);
        if (ini < ta - 1) {

            ini++;

        } else {
            ini = ta - 1;

        }
        return ini;
    }

    public int anterior() {
        if (ini > 0) {
            ini--;
        } else {
            ini = primero();
        }
        return ini;
    }

    public int totalregistro() {
        return ta;
    }

}
