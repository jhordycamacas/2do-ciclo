package ejercicio11;

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
        System.out.println("[3] Eliminar: ");
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

    public void eliminarPos(int x, int n) {
        if (head == null) {
            System.out.println("La lista está vacía.");
        } else if (x < 1 || n < 1) {
            System.out.println("Posición o cantidad no válida.");
        } else {
            Nodo actual = head;

            if (x == 1) {
                int contador = 0;
                while (contador < n && actual != null) {
                    actual = actual.sig;
                    contador++;
                }
                head = actual;
            } else {
                int contador = 1;
                while (contador < x - 1 && actual != null) {
                    actual = actual.sig;
                    contador++;
                }

                if (actual == null || actual.sig == null) {
                    System.out.println("La posición está fuera de la "
                            + "lista.");
                } else {
                    Nodo temp = actual.sig;
                    int eliminados = 0;
                    while (eliminados < n && temp != null) {
                        temp = temp.sig;
                        eliminados++;
                    }
                    actual.sig = temp;
                }
            }
        }
    }

    public void eliminar() {
        int a, b;
        System.out.println("Ingrese el numero de nodos a eliminar: ");
        b = sc.nextInt();
        System.out.println("Ingrese la posicion: ");
        a = sc.nextInt();
        eliminarPos(a,b);
    }

}
