
package ejercicio3;


public class Nodo {
    int valor;
    Nodo sig;
    
    public Nodo(int valor){
    this.valor = valor;
    this.sig = null;
    }
}
    /*
    METODO BURBUJA EN LISTAS ENLAZADAS:
    public void burbuja() {
        int aux;
        Nodo i = head;
        if (i.sig != null) {
            while (i.sig != null) {
                Nodo j = i.sig;
                while (j != null) {
                    if (i.valor > j.valor) {
                        aux = j.valor;
                        j.valor = i.valor;
                        i.valor = aux;
                    }
                    j = j.sig;
                }

                i = i.sig;
            }

        } else {
            System.out.println("Ordenada...");
        }
    }*/