package primeraclase;

public class Trabajador {

    int codigo;
    String nombre;
    char sexo;
    String fechanac;

    public Trabajador(int cod, String nom, char sex, String fecha) {
        this.codigo = cod;
        this.nombre = nom;
        this.sexo = sex;
        this.fechanac = fecha;
    }

    public int getcodigo() {
        return codigo;

    }

    public void setcodigo(int cod) {
        this.codigo = cod;

    }

    public int edad() {
        String anio = fechanac.substring(6, 10);
        return (2014 - Integer.parseInt(anio));

    }

    public static void main(String[] args) {
        Trabajador t1 = new Trabajador(1, "luis", 'm', "01/12/1990");
        System.out.println(t1.getcodigo());
        // t1.setcodigo(5);
        t1.codigo = 5;
        System.out.println(t1.getcodigo());
        System.out.println(t1.edad());
    }

}
