package aerolinea;

import java.util.Scanner;

public class Metodos1 {

    Scanner sc;
    int[][] matriz;

    public Metodos1(int filas, int columnas) {
        this.sc = new Scanner(System.in);
        this.matriz = new int[filas][columnas];

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Observar estado de cada asiento(libre/ocupado): ");
        System.out.println("[2] Ocupar un asiento: ");
        System.out.println("[3] Liberar un asiento: ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();
    }

    public void presentarEstadoAsientos() {
        System.out.println("ESTADO DE ASIENTOS: ");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (matriz[i][j] == 1) {
                    System.out.print("[OCUPADO] ");
                } else {
                    System.out.print("[LIBRE] ");
                }
            }
            System.out.println();
        }

    }

    public void ocuparAsiento() {
        int fila, columna;
        System.out.println("Ingrese la fila en la que se encuentra el asiento a ocupar: ");
        fila = sc.nextInt();
        System.out.println("Ingrese la columna en la que se encuentra el asiento a ocupar: ");
        columna = sc.nextInt();
        if ((fila-1 >= 0 && fila-1 <= matriz.length) && (columna-1 >= 0 && columna-1 <= matriz[0].length)) {
            if (matriz[fila-1][columna-1] == 0) {
                matriz[fila-1][columna-1] = 1;
            } else {
                System.out.println("Ese asiento ya se encuentra ocupado...");
            }

        } else {
            System.out.println("No existe ese asiento...");
        }

    }
public void liberarAsiento() {
        int fila, columna;
        System.out.println("Ingrese la fila en la que se encuentra el asiento a liberar: ");
        fila = sc.nextInt();
        System.out.println("Ingrese la columna en la que se encuentra el asiento a liberar: ");
        columna = sc.nextInt();
        if ((fila-1 >= 0 && fila-1 <= matriz.length) && (columna-1 >= 0 && columna-1 <= matriz[0].length)) {
            if (matriz[fila-1][columna-1] == 1) {
                matriz[fila-1][columna-1] = 0;
            } else {
                System.out.println("Ese asiento ya se encuentra libre...");
            }

        } else {
            System.out.println("No existe ese asiento...");
        }

    }

}
