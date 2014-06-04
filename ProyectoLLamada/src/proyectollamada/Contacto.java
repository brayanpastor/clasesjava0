package proyectollamada;

public class Contacto {

    private String nombre;
    /*CONTRUCTOR DE CONTACTO*/
    public Contacto(String nom)
    {
    this.nombre=nom;
    }
    //========================

    public String getnombre() {
        return nombre;
    }

    public void setnombre(String nom) {
        this.nombre = nom;
    }
}
