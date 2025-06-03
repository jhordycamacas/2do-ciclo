
package sumaparesimpares;

import java.util.Scanner;


public class Metodos1 {

    int[] arreglo;
    Scanner sc;

    public Metodos1(int limite) {
        this.arreglo = new int[limite];
        this.sc = new Scanner(System.in);

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Llenar arreglo: ");
        System.out.println("[2] Presentar arreglo: ");
        System.out.println("[3] Presentar suma de pares: ");
        System.out.println("[4] Presentar suma de impares: ");
        System.out.println("[0] Abandonar el programa: ");
        return sc.nextInt();

    }

    public void llenarArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println("Ingrese el numero: ");
            arreglo[i] = sc.nextInt();

        }

    }

    public void presentarArreglo() {
        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }

    }

    public void presentarSumaPares() {
        int sumaPares = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 == 0) {
                sumaPares += arreglo[i];
            }
        }
        System.out.println("La suma de pares es: " + sumaPares);
    }

    public void presentarSumaImpares() {
        int sumaImpares = 0;
        for (int i = 0; i < arreglo.length; i++) {
            if (arreglo[i] % 2 != 0) {

                sumaImpares += arreglo[i];
            }
        }
        System.out.println("La suma de impares: " + sumaImpares);
    }
}
