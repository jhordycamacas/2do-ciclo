package ejercicio9;

import java.util.Scanner;

public class Metodos {

    Scanner sc;
    Nodo head;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.head = null;
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Insertar datos en lista: ");
        System.out.println("[2] Presentar lista: ");
        System.out.println("[3] Invertir lista original: ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();
    }

    public int leerDatos() {
        System.out.println("Ingrese el dato que desea: ");
        return sc.nextInt();
    }

    public boolean listaVacia(Nodo actual) {
        return actual == null;
    }

    public void insertar(int a) {
        Nodo nuevo = new Nodo(a);
        if (listaVacia(head)) {
            head = nuevo;
        } else {
            Nodo actual = head;
            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = nuevo;
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

    public void invertida() {
        Nodo anterior = null;
        Nodo actual = head;
        Nodo siguiente;

        while (actual != null) {
            siguiente = actual.sig;
            actual.sig = anterior;
            anterior = actual;
            actual = siguiente;
        }

        head = anterior;
    }
}
