/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matriztranspuesta;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Metodos1 {

    Scanner sc;
    int[][] matriz;

    public Metodos1(int limite) {
        this.sc = new Scanner(System.in);
        this.matriz = new int[limite][limite];

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL:");
        System.out.println("[1] Generar matriz aletoriamente: ");
        System.out.println("[2] Presentar matriz original: ");
        System.out.println("[3] Matriz Transpuesta: ");
        System.out.println("[0] Salir: ");
        return sc.nextInt();

    }

    public void generarMatriz() {
        Random rand = new Random();
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rand.nextInt(99) + 1;
            }
        }
    }
    
    
     public void presentarMatrizOriginal() {
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

    }


}
