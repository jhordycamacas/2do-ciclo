/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje2;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Metodos {

    Scanner sc;

    public Metodos() {
        this.sc = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL:");
        System.out.println("[1] Factorial de un numero: ");
        System.out.println("[2] N fobonacci: ");
        System.out.println("[3] Potencia de un numero: ");
        System.out.println("[0] Salir: ");
        return sc.nextInt();

    }

    public int factorial(int n) {
        if (n == 1) {
            return n;

        } else {
            return n * factorial(n - 1);

        }

    }

    public int potencia(int b, int e) {
        if (e == 1) {
            return b;

        } else {

            return b * potencia(b, e - 1);

        }

    }

    public int fibonaci(int n) {
        if ((n == 1) || (n == 0)) {
            return n;

        } else {
            return fibonaci(n - 1) + fibonaci(n - 2);

        }

    }

}
