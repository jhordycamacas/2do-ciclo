package avlc;

public class Nodo {

    int valor;
    int fe;
    Nodo izq;
    Nodo der;

    public Nodo(int valor) {
        this.valor = valor;
        this.fe = 0;
        this.izq = null;
        this.der = null;
    }

}
