/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication47;

import java.util.Scanner;

public class Metodos1 {

    Scanner sc;
    double num1;
    double num2;
    double res;

    public Metodos1() {
        this.sc = new Scanner(System.in);
        this.num1 = 0;
        this.num2 = 0;
        this.res = 0;

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Suma: ");
        System.out.println("[2] Resta: ");
        System.out.println("[3] Multiplicacion: ");
        System.out.println("[4] Division: ");
        System.out.println("[5] Potencia: ");
        System.out.println("[6] Raiz: ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();

    }

    public void suma() {
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextDouble();

        res = num1 + num2;

        System.out.println("La suma es: " + res);

    }

    public void resta() {
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextDouble();

        res = num1 - num2;
        System.out.println("La resta es: " + res);

    }

    public void multiplicacion() {
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextDouble();

        res = num1 * num2;
        System.out.println("La multiplicacion es: " + res);

    }

    public void division() {
        System.out.println("Ingrese el divisor: ");
        num1 = sc.nextDouble();
        System.out.println("Ingrese el dividendo: ");
        num2 = sc.nextDouble();
        if (num2 == 0) {
            System.out.println("No es posible dividir para 0");

        } else {
            res = num1 / num2;
        }
        System.out.printf("La division es: %.2f", res);

    }

    public void potencia() {
        System.out.println("Ingrese la base: ");
        num1 = sc.nextDouble();
        System.out.println("Ingrese la potencia: ");
        num2 = sc.nextDouble();

        res = Math.pow(num1, num2);

        System.out.printf("El %.2f elevado al %.2f es: %.2f", num1, num2, res);

    }

    public void raiz() {
        System.out.println("Ingrese el numero a operar: ");
        num1 = sc.nextDouble();

        res = Math.sqrt(num1);

        System.out.printf("La raiz es: %.2f", res);
    }
}
