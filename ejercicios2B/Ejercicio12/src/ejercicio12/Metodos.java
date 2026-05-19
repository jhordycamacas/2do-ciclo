package ejercicio12;

import java.util.Scanner;

public class Metodos {

    Scanner sc;
    Nodo head;
    Nodo tail;
    Nodo head2;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.head = null;
        this.tail = null;
        this.head2 = null;
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Insertar: ");
        System.out.println("[2] Crear dos listas: ");
        System.out.println("[3] Presentar lista 1: ");
        System.out.println("[4] Presentar lista 2: ");
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

    public void mitad() {
        if (head == null || head.sig == null) {
            System.out.println("No hay suficientes nodos para particionar.");
            return;
        }

        head2 = head.sig;
        Nodo actual1 = head;
        Nodo actual2 = head2;

        while (actual2 != null && actual2.sig != null) {
            actual1.sig = actual2.sig;
            actual1 = actual1.sig;

            actual2.sig = actual1.sig;
            actual2 = actual2.sig;
        }

        actual1.sig = null;
    }

    public void presentar2() {

        recorrer(head2);
    }

    public void presentar1() {

        recorrer(head);
    }

    public void recorrer(Nodo actual) {

        while (actual != null) {

            System.out.print(actual.valor + " - ");
            actual = actual.sig;
        }
        System.out.println("null");

    }

}
