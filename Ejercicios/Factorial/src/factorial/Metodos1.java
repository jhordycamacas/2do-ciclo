/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factorial;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Metodos1 {

    int[] arreglo;
    int[] factorial;
    Scanner sc;

    public Metodos1() {
        this.arreglo = new int[10];
        this.factorial = new int[10];
        this.sc = new Scanner(System.in);

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Ingresar numeros: ");
        System.out.println("[2] Presentar arreglo: ");
        System.out.println("[3] Calcular factorial: ");
        System.out.println("[4] Presentar factoriales: ");
        System.out.println("[0] Abandonar el programa: ");
        return sc.nextInt();

    }

    public void almacenarArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese numero " + (i + 1));
            arreglo[i] = sc.nextInt();
        }

    }

    public void presentarArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

    }

    public int factorial(int n) {
        if (n == 1) {
            return n;

        } else {
            return n * factorial(n - 1);

        }

    }

    public void almacenarFactorial() {
        for (int i = 0; i < factorial.length; i++) {
            factorial[i] = factorial(arreglo[i]);
        }

    }

    public void presentarFactorial() {
        for (int i = 0; i < factorial.length; i++) {
            System.out.println(factorial[i]);
        }

    }
}
