
package sistema;

import java.sql.SQLException;

public class Prac_lengua {
    
    public static void main(String[] args) throws SQLException {
        Lengua l = new Lengua();
      
        if(l.llenar("e",2)){
        for (int i = 0; i < l.totalregistro(); i++) {
            System.out.println(l.getcodigo(i) + " " + l.getnombre(i));
        }}else{System.out.println("no existe registro");}
    }
    
}
