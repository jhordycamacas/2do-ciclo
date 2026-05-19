package avlc;

import java.util.Scanner;

public class Metodos {

    Scanner sc;
    Nodo raizAVL;
    boolean h;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.raizAVL = null;
        this.h = false;

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Insertar datos en AVL: ");
        System.out.println("[2] Recorrio posOrden: ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();

    }

    public int leerDato() {
        System.out.println("Ingrese el valor: ");
        return sc.nextInt();

    }

    public boolean esNulo(Nodo actual) {
        return actual == null;

    }

    public Nodo rotacionII(Nodo actual, Nodo x) {

        actual.izq = x.der;
        x.der = actual;
        actual.fe = 0;
        x.fe = 0;
        return x;

    }

    public Nodo rotacionDD(Nodo actual, Nodo x) {

        actual.der = x.izq;
        x.izq = actual;
        actual.fe = 0;
        x.fe = 0;
        return x;

    }

    public Nodo rotacionID(Nodo actual, Nodo x) {
        Nodo aux = x.der;
        actual.izq = aux.der;
        x.der = aux.izq;
        aux.der = actual;
        aux.izq = x;
        actual.fe = 0;
        x.fe = 0;
        return aux;

    }

    public Nodo rotacionDI(Nodo actual, Nodo x) {
        Nodo aux = x.izq;
        actual.der = aux.izq;
        x.izq = aux.der;
        aux.izq = actual;
        aux.der = x;
        actual.fe = 0;
        x.fe = 0;
        return aux;

    }

    public Nodo insertar(Nodo actual, int valor) {
        if (!esNulo(actual)) {
            Nodo nuevo = new Nodo(valor);
            h = true;
            return nuevo;
        } else if (valor < actual.valor) {
            actual.izq = insertar(actual.izq, valor);
            if (h) {
                if (actual.fe == -1) {
                    if (actual.izq.fe == -1) {
                        actual = rotacionII(actual, actual.izq);
                    } else {
                        actual = rotacionID(actual, actual.izq);
                    }
                    h = false;
                } else if (actual.fe == 0) {
                    actual.fe = -1;
                    h = false;
                } else {
                    actual.fe = 0;
                    h = false;
                }

            }

        } else {
            actual.der = insertar(actual.der, valor);
            if (h) {
                if (actual.fe == -1) {
                    actual.fe = 0;
                    h = false;
                } else if (actual.fe == 0) {
                    actual.fe = 1;
                    h = false;
                } else {
                    actual.fe = 0;
                    if (actual.der.fe == 1) {
                        actual = rotacionDD(actual, actual.der);
                    } else {
                        actual = rotacionDI(actual, actual.der);
                    }
                    h = false;
                }

            }
        }

        return actual;
    }
}
