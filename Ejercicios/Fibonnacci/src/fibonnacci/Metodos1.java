/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fibonnacci;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Metodos1 {

    int[] arreglo;
    Scanner sc;

    public Metodos1() {
        this.arreglo = new int[10];
        this.sc = new Scanner(System.in);

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Llenar arreglo: ");
        System.out.println("[2] Presentar arreglo: ");
        System.out.println("[0] Abandonar el programa: ");
        return sc.nextInt();

    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public void llenarArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = fibonacci(i);
        }

    }

    public void presentarArreglo() {

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo);
        }

    }

}
