package listasenlazadas;

import java.util.Scanner;

public class Metodos1 {

    Scanner sc;
    Nodo head;
    Nodo tail;

    public Metodos1() {
        this.sc = new Scanner(System.in);
        this.head = null;
        this.tail = null;
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Insertar: ");
        System.out.println("[2] Recorrer: ");
        System.out.println("[3] Insertar dato al inicio: ");
        System.out.println("[4] Insertar en orden: ");
        System.out.println("[5] Buscar: ");
        System.out.println("[6] Eliminar: ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();
    }

    public int leerDatos() {
        System.out.println("Ingrese el dato que desea ingresar");
        return sc.nextInt();

    }

    public boolean listaVacia() {
        return head == null;

    }

    public void insertar() {
        Nodo nuevo = new Nodo(leerDatos());
        if (listaVacia()) {
            head = nuevo;
            tail = nuevo;
        } else {

            tail.sig = nuevo;
            tail = nuevo;

        }
    }

    public void insOrden() {
        Nodo nuevo = new Nodo(leerDatos());
        if (listaVacia()) {
            head = nuevo;
        } else if (nuevo.valor < head.valor) {
            nuevo.sig = head;
            head = nuevo;

        } else {
            Nodo actual = head;
            while ((actual.sig != null) && (actual.sig.valor < nuevo.valor)) {
                actual = actual.sig;
            }
            nuevo.sig = actual.sig;
            actual.sig = nuevo;

        }

    }

    public void buscarDato() {

    }

    public void insInicio() {
        Nodo nuevo = new Nodo(leerDatos());
        if (listaVacia()) {
            head = nuevo;
        } else {
            nuevo.sig = head;
            head = nuevo;

        }

    }

    /*public void insertar() {
        Nodo nuevo = new Nodo(leerDatos());
        if (listaVacia()) {
            head = nuevo;
        } else {

            Nodo actual = head;
            while (actual.sig != null) {

                actual = actual.sig;
            }
            actual.sig = nuevo;

        }
    }*/
    public void recorrer() {
        Nodo actual = head;

        while (actual != null) {

            System.out.print(actual.valor + " - ");
            actual = actual.sig;
        }
        System.out.println("null");

    }

    public boolean secuencial(int valor) {
        Nodo actual = head;
        while (actual != null) {
            if (actual.valor == valor) {
                return true;
            }
            actual = actual.sig;
        }
        return false;

    }

    public void buscar() {
        int valor = leerDatos();
        if (secuencial(valor)) {
            System.out.println("Si esta...");
        } else {
            System.out.println("No esta...");
        }

    }

    public void eliminar() {
        int valor = leerDatos();
        if (listaVacia()) {
            System.out.println("No hay que eliminar...");

        } else if (valor == head.valor) {
            head = head.sig;

        } else {
            Nodo actual = head;
            while ((actual.sig != null) && (actual.sig.valor != valor)) {
                actual = actual.sig;

            }
            if (actual.sig == null) {
                System.out.println("No esta...");
            } else {
                actual.sig = actual.sig.sig;
            }

        }

    }
}
