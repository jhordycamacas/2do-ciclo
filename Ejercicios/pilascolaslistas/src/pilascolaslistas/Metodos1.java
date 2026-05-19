/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilascolaslistas;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Metodos1 {

    Scanner sc;
    Nodo pila;
    Nodo cima;
    int tope;

    public Metodos1() {
        this.sc = new Scanner(System.in);
        this.pila = null;
        this.cima = null;
        this.tope = -1;
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Push: ");
        System.out.println("[2] Pop: ");
        System.out.println("[3] Presentar: ");
        System.out.println("[4] Pop-Colas: ");
        System.out.println("[0] Salir");
        return sc.nextInt();
    }

    public int leerDato() {
        System.out.println("Ingrese el dato: ");
        int valor = sc.nextInt();
        return valor;

    }

    public boolean pilaVacia() {
        return pila == null;

    }

    public void push() {
        Nodo nuevo = new Nodo(leerDato());
        if (pilaVacia()) {
            pila = nuevo;
            cima = nuevo;

        } else {
            cima.sig = nuevo;
            cima = nuevo;

        }

    }

    public void pop() {
        if (pilaVacia()) {
            System.out.println("No hay elementos...");

        } else {
            System.out.println(cima.valor);
            if (pila == cima) {
                pila = null;
                cima = null;
            } else {
                Nodo actual = pila;
                while (actual.sig != cima) {
                    actual = actual.sig;

                }
                actual.sig = null;
                cima = actual;
            }

        }

    }

    public void recorrer() {
        Nodo actual = pila;

        while (actual != null) {

            System.out.print(actual.valor + " - ");
            actual = actual.sig;
        }
        System.out.println("null");

    }

    public void popcola() {
        if (pilaVacia()) {
            System.out.println("No hay elementos...");

        } else {
            System.out.println(pila.valor);
            pila = pila.sig;
            if (pilaVacia()) {
                cima = null;
            }
        }

    }
}
