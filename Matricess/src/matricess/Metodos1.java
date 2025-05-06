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
    int[][] matriz = new int[4][4];

    public Metodos1() {
        this.sc = new Scanner(System.in);
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL:");
        System.out.println("[1] Insertar nueva matriz: ");
        System.out.println("[2] Presentar matriz: ");
        System.out.println("[3] Matriz Transpuesta: ");
        System.out.println("[0] Salir: ");
        return sc.nextInt();

    }

    public void leerMatriz() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Ingrese valor para la posicion " + i + " " + j + " :");
                matriz[i][j] = sc.nextInt();
            }
        }

    }

    public void presentarMatriz() {
        System.out.println("MATRIZ: \n");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println("\n");
        }

    }

    public void matrizTranspuesta() {
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

}


