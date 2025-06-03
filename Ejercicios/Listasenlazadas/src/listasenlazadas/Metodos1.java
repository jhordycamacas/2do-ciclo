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

}
