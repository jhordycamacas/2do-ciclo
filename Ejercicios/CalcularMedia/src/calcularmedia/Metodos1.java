
package calcularmedia;

import java.util.Random;
import java.util.Scanner;


public class Metodos1 {

    float[][] notas;
    Scanner sc;

    public Metodos1() {
        this.notas = new float[20][4];
        this.sc = new Scanner(System.in);

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Llenar arreglo aleatoriamente: ");
        System.out.println("[2] Presentar matriz: ");
        System.out.println("[3] Media de cada estudiante: ");
        System.out.println("[4] Media de cada materia: ");
        System.out.println("[5] Media de toda la clase: ");
        System.out.println("[0] Abandonar el programa: ");
        return sc.nextInt();

    }

    public void llenarArreglo() {
        Random rand = new Random();
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {

                notas[i][j] = rand.nextInt(10 - 0 + 1) + 0;

            }
        }

    }

    public void presentarArreglo() {
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print(notas[i][j] + " ");
            }
            System.out.println();
        }

    }

    public void mediaEstudiante() {
        float media = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                media += notas[i][j];
            }
            media = media / notas[0].length;
            System.out.println("La media del estudiante(" + (i + 1) + ") es: " + media);
            media = 0;
        }
    }

    public void mediaMateria() {
        float media = 0;
        for (int j = 0; j < notas[0].length; j++) {
            for (int i = 0; i < notas.length; i++) {
                media += notas[i][j];
            }
            media = media / notas.length;
            System.out.println("La media de la materia (" + (j + 1) + ") es: " + media);
            media = 0;
        }

    }

    public void mediaClase() {
        float media = 0;
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                media += notas[i][j];
            }
        }
        media = media / (notas.length * notas[0].length);
        System.out.println("La media total de la clase es: " + media);

    }

}
