
package ejercicio7;

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
        System.out.println("[2] Presentar orden por medio del numero:\n"
                + "(1)Ascendente -- (2)Descendente -- (0)Sin orden");
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

    public int ordenamiento(Nodo head) {
         boolean ascendente = true;
        boolean descendente = true;
        if (head == null || head.sig == null) {
            return 1;
        }

        Nodo actual = head;
        while (actual.sig != null) {
            if (actual.valor < actual.sig.valor) {
                descendente = false;
            } else if (actual.valor > actual.sig.valor) {
                ascendente = false;
            }

            if (!ascendente && !descendente) {
                break;
            }

            actual = actual.sig;
        }

        if (ascendente) {
            return 1;
        } else if (descendente) {
            return 2;
        } else {
            return 0;
        }
    }

    public void orden() {
        System.out.println("Respuesta: ");
        System.out.println(ordenamiento(head));
    }
}
