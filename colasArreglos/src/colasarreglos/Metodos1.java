/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package colasarreglos;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Metodos1 {

    Scanner sc;
    int[] cola;
    int tope;
    int frente;

    public Metodos1() {
        this.sc = new Scanner(System.in);
        this.cola = new int[10];
        this.tope = -1;
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL:");
        System.out.println("[1] Operacion Push: ");
        System.out.println("[2] Operacion Pop: ");
        System.out.println("[0] Salir: ");
        return sc.nextInt();

    }

    public boolean colaLlena() {
        return (tope == cola.length - 1);

    }

    public int leerNumero() {
        int n;
        System.out.println("Ingrese un elemento: ");
        n = sc.nextInt();

        return n;

    }

    public void operacionPush() {
        int n;
        if (!colaLlena()) {
            n = leerNumero();
            tope++;
            cola[tope] = n;

        } else {
            System.out.println("Error Overflow...");

        }

    }

    public boolean colaVacia() {
        return (tope == -1);

    }

    public void desplazarizq(int num) {
        for (int i = num; i < tope ; i++) {
            cola[i] = cola[i + 1];

        }

    }

    public void operacionPop() {
        if (!colaVacia()) {

            System.out.println(cola[0]);
            desplazarizq(0);
            tope--;
        } else {
            System.out.println("Error Pila Vacia...");
        }

    }

}
