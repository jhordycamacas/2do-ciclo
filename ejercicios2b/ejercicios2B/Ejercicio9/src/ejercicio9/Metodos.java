package ejercicio9;

import java.util.Scanner;

public class Metodos {

    Scanner sc;
    Nodo head;
    Nodo headi;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.head = null;
        this.headi = null;
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Insertaar datos en lista: ");
        System.out.println("[2] Presentar lista: ");
        System.out.println("[3] Crear lista con datos invertida: ");
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

    public void insertarin(int a) {
        Nodo nuevo = new Nodo(a);
        if (listaVacia(headi)) {
            headi = nuevo;
        } else {

            Nodo actual = headi;
            while (actual.sig != null) {

                actual = actual.sig;
            }
            actual.sig = nuevo;

        }
    }

    public void recorrer() {
        System.out.println("Desea imprimir la lista original(1) o la "
                + "inveritda(2): ");
        int num = sc.nextInt();
        if (num == 1) {
            Nodo actual = head;

            while (actual != null) {

                System.out.print(actual.valor + " - ");
                actual = actual.sig;
            }
            System.out.println("null");

        } else if (num == 2) {
            Nodo actual = headi;

            while (actual != null) {

                System.out.print(actual.valor + " - ");
                actual = actual.sig;
            }
            System.out.println("null");
        }
    }

    public void invertida() {
        headi = null;
        pilareversa(head);
    }

    public void pilareversa(Nodo raiz) {
        if (raiz != null) {
            pilareversa(raiz.sig);
            insertarin(raiz.valor);
        }
    }

}
