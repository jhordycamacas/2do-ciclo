package ejercicio3;

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
        System.out.println("[2] Eliminar mayor: ");
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

    public void eliminarMayor() {
        Nodo actual = head;
        Nodo mayor = head;
        Nodo anteriorMayor = null;
        Nodo anterior = null;
        if (listaVacia()) {
            System.out.println("La lista está vacía...");

        } else {

            while (actual != null) {
                if (actual.valor > mayor.valor) {
                    mayor = actual;
                    anteriorMayor = anterior;
                }
                anterior = actual;
                actual = actual.sig;
            }
        }

        if (anteriorMayor == null) {
            head = head.sig;
        } else {
            anteriorMayor.sig = mayor.sig;
        }

        if (mayor == tail) {
            tail = anteriorMayor;
        }

        System.out.println("El valor mayor " + mayor.valor + " ha sido eliminado...");
    }

    public void presentar() {
        Nodo actual = head;

        while (actual != null) {

            System.out.print(actual.valor + " - ");
            actual = actual.sig;
        }
        System.out.println("null");

    }
}
