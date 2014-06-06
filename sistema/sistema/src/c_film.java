
import java.sql.ResultSet;
import java.sql.SQLException;

public class c_film {

    //atributos 
    private int[] codigo;
    private String[] film;
    private String[] descripcion;
    private String[] anioestreno;
    private int[] lenguaje;
    private String[] duracion;
    private String[] ranking;
    private String[] precio;
    private String[] tipopublico;
    private String[] adicional;
    
    private static final conexiondb db = new conexiondb();
    private ResultSet rs;//guarda toda la consulta que realizamos 
    private int ta = 0, ini = 0;

    public void llenar(int tip, String condicion1, String condicion2, String tabla) throws SQLException {
         String consulta="";
         switch (tip)
         {   case 1:  consulta="select * from "+tabla;
             break;
             case 2:  consulta="select * from "+tabla+" where "+condicion1+" like '"+condicion2+ "%'";
             break;
             case 3:  consulta="select * from "+tabla+" where "+condicion1+" = '"+condicion2+"'";
             break;
              case 4:  consulta="select * from "+tabla+" where "+condicion1+" and "+condicion2;
             break;
         }
         System.out.println(consulta);
        /* if(tip==1){
             consulta="select * from film";
         }else 
         {
             consulta="select * from film where "+campo+" like '"+valor+ "%'";             
         }*/
        rs = db.consulta_sql(consulta);
        ta = db.ultimo();
        if (ta > 0) {
            codigo = new int[ta];
            film = new String[ta];
            
           // descripcion = new String[ta];
           // lenguaje = new int[ta];
            rs.first();
            int i = 0;
            do {
                this.codigo[i] = rs.getInt(1);
                this.film[i] = rs.getString(2);
               // this.descripcion[i] = rs.getString(3);

                //this.lenguaje[i] = rs.getInt(5);
                i++;

            } while (rs.next());
            db.cerrar();

        }

    }

    public int totalregistro() {
        return ta;

    }

    public int primero() {
        ini = 0;
        return ini;

    }

    public int ultimo() {
        ini = ta;
        return ini;

    }

    public int siguiente() {

        if (ini >= ta) {

            ini = ta;

        } else {
            ini += 1;

        }
        return ini;
    }

    public int anterior() {
        if (ini > 0) {
            ini -= 1;
        } else {
            ini = 0;
        }
        return ini;
    }

    //metodos o acciones
    public int getcodigo(int i) {
        return codigo[i];

    }

    public String getfilm(int i) {
        return film[i];
    }

    public String getdescripcion(int i) {
        return descripcion[i];

    }

    void llenar(int i, String string, String string0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
