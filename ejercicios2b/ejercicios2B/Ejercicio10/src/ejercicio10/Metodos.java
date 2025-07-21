package ejercicio10;

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
        System.out.println("[1] Insertar: ");
        System.out.println("[2] Ordenar: ");
        System.out.println("[3] Presentar: ");
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
    }

    public void recorrer() {
        Nodo actual = head;

        while (actual != null) {

            System.out.print(actual.valor + " - ");
            actual = actual.sig;
        }
        System.out.println("null");

    }

}
