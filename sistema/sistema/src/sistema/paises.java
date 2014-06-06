package sistema;
public class paises {
    private int codigo; //atributos
    private String nombre;

    //metodos
    public paises(){ // constructor
       this.codigo=0;
       this.nombre="";
    }
    
    public void mostrar_pais(){
    System.out.println(this.codigo+" === "+this.nombre);
    }
    
    public void setcodigo(int cod){
       this.codigo=cod;
    }
    
    public void setnombre(String nom){
        this.nombre=nom;
    }
    
    public int getcodigo(){
        return codigo;
    }
    
    public String getnombre(){
        return nombre;
    }
}
