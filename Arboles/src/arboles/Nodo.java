package arboles;

public class Nodo {

    int dato;
    Nodo izq;
    Nodo der;

    public Nodo(int dato) {
        this.dato = dato;
        this.izq = null;
        this.der = null;
    }
}
