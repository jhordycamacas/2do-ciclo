
package ejercicio1;

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
        System.out.println("[1] Insertar datos: ");
        System.out.println("[2] Insertar dato por referencia: ");
        System.out.println("[3] Presentar lista: ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();

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

    public int leerDatos() {
        System.out.println("Ingrese el dato que desea ingresar");
        return sc.nextInt();

    }

    public boolean listaVacia() {
        return head == null;

    }

    public void insertarDato() {
        System.out.println("Ingrese la referencia: ");
        int referencia = sc.nextInt();

        Nodo actual = head;
        while (actual != null && actual.valor != referencia) {
            actual = actual.sig;
        }
        if (listaVacia()) {
            System.out.println("Lista vacia...");
        } else if (actual == null) {
            System.out.println("No se encuentra la referencia...");
        } else {
            Nodo nuevo = new Nodo(leerDatos());
            nuevo.sig = actual.sig;
            actual.sig = nuevo;
            if (actual == tail) {
                tail = nuevo;
            }
        }

    }

    public void presentarLista() {
        Nodo actual = head;

        while (actual != null) {

            System.out.print(actual.valor + " - ");
            actual = actual.sig;
        }
        System.out.println("null");

    }

}
