package ejercicio6;

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
        System.out.println("[2] Presentar valores invertidos: ");
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

    public void presentar() {
        pilareversa(head);
    }

    public void pilareversa(Nodo raiz) {
        if (raiz != null) {
            pilareversa(raiz.sig);
            System.out.print(raiz.valor + " ");
        }
    }
}
