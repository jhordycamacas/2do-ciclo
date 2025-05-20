/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package numerosprimos;

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

    public void llenarArreglo() {
        int contador = 0;
        int numero = 2;
        while (contador < arreglo.length) {
            int divisores = 0;

            for (int i = 1; i <= numero; i++) {
                if (numero % i == 0) {
                    divisores++;
                }
            }

            if (divisores == 2) {
                arreglo[contador] = numero;
                contador++;
            }

            numero++;
        }
    }

    public void presentarArreglo() {

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

    }

}
