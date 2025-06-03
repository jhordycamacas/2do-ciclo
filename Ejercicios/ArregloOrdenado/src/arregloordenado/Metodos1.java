
package arregloordenado;

import java.util.Scanner;


public class Metodos1 {

    int[] arreglo;
    Scanner sc;
    int ev;

    public Metodos1(int limite) {
        this.arreglo = new int[limite];
        this.sc = new Scanner(System.in);
        this.ev = 0;

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Llenar arreglo: ");
        System.out.println("[2] Presentar arreglo: ");
        System.out.println("[3] Ordenar arreglo: ");
        System.out.println("[0] Abandonar el programa: ");
        return sc.nextInt();

    }

    public void llenarArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el numero: ");
            arreglo[i] = sc.nextInt();

        }
        ev = arreglo.length;

    }

    public void presentarArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

    }
    
     public void burbuja() {
        int aux;
        for (int i = 0; i < ev - 1; i++) {
            for (int j = i + 1; j < ev; j++) {
                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;

                }

            }

        }

    }
   
}
