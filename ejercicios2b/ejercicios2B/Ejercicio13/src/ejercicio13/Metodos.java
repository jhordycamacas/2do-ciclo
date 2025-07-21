package ejercicio13;

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
        System.out.println("[2] Eliminar: ");
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

    public void eliminar() {
        Nodo actual = head;

        while (actual != null) {
            boolean repetido = false;
            Nodo busqueda = actual.sig;

            while (busqueda != null) {
                if (busqueda.valor == actual.valor) {
                    repetido = true;
                    break;
                }
                busqueda = busqueda.sig;
            }

            if (repetido) {
                int valorEliminar = actual.valor;

                Nodo aux = head;
                Nodo anterior = null;

                while (aux != null) {
                    if (aux.valor == valorEliminar) {
                        if (aux == head) {
                            head = head.sig;
                            aux = head;
                        } else {
                            anterior.sig = aux.sig;
                            aux = anterior.sig;
                        }
                    } else {
                        anterior = aux;
                        aux = aux.sig;
                    }
                }
                actual = head;
            } else {
                actual = actual.sig;
            }
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
