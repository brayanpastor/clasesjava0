package proyectollamada;

public class Celular extends Telefono {

    private int minTotales;
    private int minUltimaLlama;

    public Celular(int pre, long num, Contacto con, int total, int ultima) {
        super(pre, num, con);
        this.minTotales = total;
        this.minUltimaLlama = ultima;
    }

    public int total() {
        return minTotales;
    }

    public void realizarLlamada(int minutos) {
        minTotales += minutos;
        minUltimaLlama = minutos;
    }

    public String buscarnumero(String nom) {
        if (nomContacto.getnombre().equals(nom)) {
            return getprefijo() + "-" + getnumero();
        } else {
            return "NO EXISTE";
        }

    }

}
