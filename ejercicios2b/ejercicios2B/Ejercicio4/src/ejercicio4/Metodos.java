package ejercicio4;

import java.util.Scanner;

public class Metodos {

    Scanner sc;
    Nodo head1;
    Nodo head2;
    Nodo tail1;
    Nodo tail2;
    Nodo headcomb;
    Nodo tailcomb;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.head1 = null;
        this.head2 = null;
        this.tail1 = null;
        this.tail2 = null;
        this.headcomb = null;
        this.tailcomb = null;
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Insertar dato en lista 1: ");
        System.out.println("[2] Insertar dato en lista 2: ");
        System.out.println("[3] Lista combinada: ");
        System.out.println("[4] Recorrer la lista 1: ");
        System.out.println("[5] Recorrer la lista 2: ");
        System.out.println("[6] Recorrer la lista 3: ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();
    }

    public int leerDatos() {
        System.out.println("Ingrese el dato que desea ingresar");
        return sc.nextInt();

    }

    public boolean listaVacia(Nodo actual) {
        return actual == null;

    }

    public void insertar1() {
        Nodo nuevo = new Nodo(leerDatos());
        if (listaVacia(head1)) {
            head1 = nuevo;
            tail1 = nuevo;
        } else if (nuevo.valor < head1.valor) {

            nuevo.sig = head1;
            head1 = nuevo;
        } else {
            Nodo actual = head1;
            while (actual.sig != null && actual.sig.valor < nuevo.valor) {
                actual = actual.sig;
            }
            nuevo.sig = actual.sig;
            actual.sig = nuevo;

            if (nuevo.sig == null) {
                tail1 = nuevo;
            }
        }
    }

    public void insertar2() {
        Nodo nuevo = new Nodo(leerDatos());
        if (listaVacia(head2)) {
            head2 = nuevo;
            tail2 = nuevo;
        } else if (nuevo.valor < head2.valor) {

            nuevo.sig = head2;
            head2 = nuevo;
        } else {
            Nodo actual = head2;
            while (actual.sig != null && actual.sig.valor < nuevo.valor) {
                actual = actual.sig;
            }
            nuevo.sig = actual.sig;
            actual.sig = nuevo;

            if (nuevo.sig == null) {
                tail2 = nuevo;
            }
        }
    }

    public void combinar() {
        Nodo actual = new Nodo(0);
        Nodo tail = actual;

        Nodo actual1 = head1;
        Nodo actual2 = head2;

        while (actual1 != null && actual2 != null) {
            int menor;

            if (actual1.valor < actual2.valor) {
                menor = actual1.valor;
                actual1 = actual1.sig;
            } else if (actual1.valor > actual2.valor) {
                menor = actual2.valor;
                actual2 = actual2.sig;
            } else {
                menor = actual1.valor;
                actual1 = actual1.sig;
                actual2 = actual2.sig;
            }

            if (tail == actual || tail.valor != menor) {
                tail.sig = new Nodo(menor);
                tail = tail.sig;
            }
        }

        while (actual1 != null) {
            if (tail == actual || tail.valor != actual1.valor) {
                tail.sig = new Nodo(actual1.valor);
                tail = tail.sig;
            }
            actual1 = actual1.sig;
        }

        while (actual2 != null) {
            if (tail == actual || tail.valor != actual2.valor) {
                tail.sig = new Nodo(actual2.valor);
                tail = tail.sig;
            }
            actual2 = actual2.sig;
        }

        headcomb = actual.sig;
    }

    public void recorrer(Nodo head) {
        Nodo actual = head;

        while (actual != null) {

            System.out.print(actual.valor + " - ");
            actual = actual.sig;
        }
        System.out.println("null");

    }

    public void presentar1() {
        recorrer(head1);
    }

    public void presentar2() {
        recorrer(head2);
    }

    public void presentar3() {
        recorrer(headcomb);
    }

}
