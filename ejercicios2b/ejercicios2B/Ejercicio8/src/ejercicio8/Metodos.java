package ejercicio8;

import java.util.Scanner;

public class Metodos {

    Scanner sc;
    Nodo head;
    Nodo tail;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.head = null;
        this.tail = null;
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Insertaar datos en lista: ");
        System.out.println("[2] Presentar lista: ");
        System.out.println("[3] Eliminar por limite: ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();
    }

    public int leerDatos() {
        System.out.println("Ingrese el dato que desea: ");
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

    public void recorrer() {
        Nodo actual = head;

        while (actual != null) {

            System.out.print(actual.valor + " - ");
            actual = actual.sig;
        }
        System.out.println("null");

    }

    public void eliminar() {
        int limite = leerDatos();
        if (listaVacia()) {
            System.out.println("La lista está vacía...");
            return;
        }

        while (head != null && head.valor > limite) {
            head = head.sig;
        }

        Nodo actual = head;

        while (actual != null && actual.sig != null) {
            if (actual.sig.valor > limite) {
                actual.sig = actual.sig.sig;
            } else {
                actual = actual.sig;
            }
        }
        System.out.println("La lista queda asi: ");
        recorrer();
    }

}
