/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matricess;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Metodos1 {

    Scanner sc;
    int[][] A = new int[3][4];
    int[][] B = new int[4][2];
    int[][] R = new int[3][2];

    public Metodos1() {
        this.sc = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL:");
        System.out.println("[1] Insertar nueva matriz: ");
        System.out.println("[2] Presentar matriz: ");
        System.out.println("[3] Matriz Transpuesta: ");
        System.out.println("[4] Multiplicar: ");
        System.out.println("[0] Salir: ");
        return sc.nextInt();

    }

    public void leerMatriz(int[][] x) {

        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.println("Ingrese valor para la posicion " + i + " " + j + " :");
                x[i][j] = sc.nextInt();
            }
        }

    }

    public void presentarMatriz(int[][] x) {
        System.out.println("MATRIZ: \n");
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.print(x[i][j] + "  ");
            }
            System.out.println("\n");
        }

    }

    /*public void matrizTranspuesta() {
        int aux = 0;
        for (int i = 0; i < matriz.length - 1; i++) {
            for (int j = i + 1; j < matriz[0].length; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[j][i];
                matriz[j][i] = aux;
            }

        }

    }

   public void matrizTranspuesta2() {
        int aux = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                if (i < j) {
                    aux = matriz[i][j];
                    matriz[i][j] = matriz[j][i];
                    matriz[j][i] = aux;
                }
            }

        }

    }

    public void matrizTranspuestadiag2() {
        int aux = 0;
        int l = matriz.length - 1;
        for (int i = 0; i < matriz.length - 1; i++) {
            int k = matriz.length - 1;
            for (int j = 0; j < matriz[0].length - 1 - i; j++) {
                aux = matriz[i][j];
                matriz[i][j] = matriz[k][l];
                matriz[k][l] = aux;
                k--;
            }
            l--;
        }

    }*/

    public void multiplicar(int[][] x, int[][] y, int[][] z) {
        int sum;
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < y[0].length; j++) {
                sum = 0;
                for (int k = 0; k < x[0].length; k++) {
                    sum += x[i][k] * y[k][j];
                }
                z[i][j] = sum;
            }

        }

    }

    public void multiplicacion() {
        leerMatriz(A);
        leerMatriz(B);
        multiplicar(A, B, R);
        presentarMatriz(R);

    }

}
