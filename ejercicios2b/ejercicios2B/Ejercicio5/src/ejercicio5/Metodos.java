package ejercicio5;

import java.util.Scanner;

public class Metodos {

    Scanner sc;
    Nodo headL;
    Nodo tailL;
    Nodo headR;
    Nodo tailR;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.headL = null;
        this.tailL = null;
        this.headR = null;
        this.tailR = null;
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL:");
        System.out.println("[1] Insertar número en lista L: ");
        System.out.println("[2] Mostrar lista L: ");
        System.out.println("[3] Generar y mostrar lista R: ");
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

    public void insertarL() {
        Nodo nuevo = new Nodo(leerDatos());
        if (listaVacia(headL)) {
            headL = nuevo;
            tailL = nuevo;
        } else {

            tailL.sig = nuevo;
            tailL = nuevo;

        }
    }

    public void presentarL() {
        Nodo actual = headL;

        while (actual != null) {

            System.out.print(actual.valor + " - ");
            actual = actual.sig;
        }
        System.out.println("null");

    }

    public void listaR() {

        Nodo actual = headL;
        while (actual != null) {
            int valorActual = actual.valor;
            int contador = 0;

            Nodo temp = headL;
            while (temp != null) {
                if (temp.valor == valorActual) {
                    contador++;
                    if (contador > 1) {
                        break;
                    }
                }
                temp = temp.sig;
            }

            if (contador > 1) {
                Nodo auxR = headR;
                while (auxR != null && auxR.valor != valorActual) {
                    auxR = auxR.sig;
                }

                if (auxR == null) {
                    Nodo nuevo = new Nodo(valorActual);
                    if (headR == null) {
                        headR = nuevo;
                        tailR = nuevo;
                    } else {
                        tailR.sig = nuevo;
                        tailR = nuevo;
                    }
                }
            }

            actual = actual.sig;
        }

        if (headR == null) {
            System.out.println("No hay elementos repetidos en la lista L.");
        } else {
            System.out.print("Lista R (repetidos): ");
            Nodo temp = headR;
            while (temp != null) {
                System.out.print(temp.valor + " - ");
                temp = temp.sig;
            }
            System.out.println("null");
        }
    }

}
