package hash;

public class Nodo {

    int id;
    String nombre;
    Nodo sig;

    public Nodo(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
        this.sig = null;
    }

}
