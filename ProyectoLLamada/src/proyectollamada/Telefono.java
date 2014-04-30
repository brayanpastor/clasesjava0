package proyectollamada;

public abstract class Telefono  {
    protected int prefijo;
    protected long numero;
    protected Contacto nomContacto;
    
    /*CREANDO UN CONTRUCTOR*/
    public Telefono (int pre, long num, Contacto con)
    {
     this.prefijo=pre;
     this.numero=num;
     this.nomContacto=con;
    }
    /*=========================*/
    
    public String getcontacto()
    {
        return nomContacto.getnombre();
    }
    
    public void agregarcontacto(Contacto nuevo)
    {
        this.nomContacto=nuevo;
    }
    public int getprefijo()
    {
    return prefijo;
    
    }
    public void setPrefijo(int num)
    {
     this.prefijo=num;
    
    }
    
    public long getnumero(){
    return numero;
    }
    
    public void setnumero(long nuevo)
    {
        this.numero=nuevo;
    
    }
}
