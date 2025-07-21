package ejercicio2;

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
        System.out.println("[2] Calcular promedio: ");
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

    public void promedio() {
        Nodo actual = head;
        int suma = 0;
        int contador = 0;
        while (actual != null) {
            suma += actual.valor;
            contador++;
            actual = actual.sig;
        }

        double promedio;
        promedio = (double) (suma / contador);
        System.out.println("El promedio es: " + promedio + "\n");

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
