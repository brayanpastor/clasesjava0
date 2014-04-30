package proyectollamada;

public class menu {

    public static void main(String[] args) {
        /*Contacto c = new Contacto();
        c.setnombre("BRAYAN");
        String nomb = c.getnombre();
        System.out.println(nomb);*/
      /*  Telefono tel=new Telefono(42, 521018, new Contacto("luis"));
        System.out.println(tel.getprefijo());
        System.out.println(tel.getnumero());
        System.out.println(tel.getcontacto());*/
        
        
        Celular ce=new Celular(42, 521018, new Contacto("luis"),40,40);
       // System.out.println(ce.getprefijo());
        ce.realizarLlamada(20);
        String bus = ce.buscarnumero("luis");
        System.out.println(ce.total());
        System.out.println(bus);
           
       
    }

}
