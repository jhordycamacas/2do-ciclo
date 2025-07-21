package ejercicios14;

import java.util.Scanner;

public class Metodos {

    Scanner sc;
    Nodo raiz;
    int alt;
    int may;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.raiz = null;
        this.alt = 1;
        this.may = 1;

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Insertaar datos en arbol: ");
        System.out.println("[2] Calcular altura: ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();
    }

    public int leerDato() {
        int dato;
        System.out.println("Ingrese el dato: ");
        dato = sc.nextInt();
        return dato;
    }

    public boolean apuntaNulo(Nodo actual) {
        return actual == null;
    }

    public Nodo inserccion(Nodo actual, int dato) {

        if (apuntaNulo(actual)) {
            Nodo nuevo = new Nodo(dato);
            return nuevo;
        } else {
            if (dato > actual.valor) {
                actual.der = inserccion(actual.der, dato);

            } else {
                actual.izq = inserccion(actual.izq, dato);
            }

        }
        return actual;
    }

    public void insertar() {
        raiz = inserccion(raiz, leerDato());

    }

    public void calcularAltura() {
        recursivaalt(raiz);
        System.out.println("La altura es: " + may);
    }

    public void recursivaalt(Nodo raiz) {
        if (raiz != null) {
            if (alt > may) {
                may = alt;
            }

            alt++;
            recursivaalt(raiz.izq);
            recursivaalt(raiz.der);
            alt--;
        }
    }
}
