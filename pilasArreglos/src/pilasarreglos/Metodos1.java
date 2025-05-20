/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pilasarreglos;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Metodos1 {

    Scanner sc;
    int[] pila;
    int tope;

    public Metodos1() {
        this.sc = new Scanner(System.in);
        this.pila = new int[10];
        this.tope = -1;
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL:");
        System.out.println("[1] Operacion Push: ");
        System.out.println("[2] Operacion Pop: ");
        System.out.println("[0] Salir: ");
        return sc.nextInt();

    }

    public boolean pilaLlena() {
        return (tope == pila.length - 1);

    }

    public int leerNumero() {
        int n;
        System.out.println("Ingrese un elemento: ");
        n = sc.nextInt();

        return n;

    }

    public void operacionPush() {
        int n;
        if (!pilaLlena()) {
            n = leerNumero();
            tope++;
            pila[tope] = n;

        } else {
            System.out.println("Error Overflow...");

        }

    }

    public boolean pilaVacia() {
        return (tope == -1);

    }

    public void operacionPop() {
        if (!pilaVacia()) {

            System.out.println(pila[tope]);
            tope--;
        } else {
            System.out.println("Error Pila Vacia...");
        }

    }

}
