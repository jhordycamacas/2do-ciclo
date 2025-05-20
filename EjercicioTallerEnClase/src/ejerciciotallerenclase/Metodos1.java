
package ejerciciotallerenclase;

import java.util.Random;
import java.util.Scanner;

public class Metodos1 {

    float[][] arreglo;
    Scanner sc;
    int ev;

    public Metodos1(int estudiantes) {
        this.arreglo = new float[estudiantes][6];
        this.sc = new Scanner(System.in);

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Llenar arreglo aleatoriamente: ");
        System.out.println("[2] Presentar matriz: ");
        System.out.println("[3] Nota promedio de cada estudiante: ");
        System.out.println("[4] Estudiantes que aprobaron: ");
        System.out.println("[5] Estudiantes que reprobaron: ");
        System.out.println("[6] Nota promedio de cada materia: ");
        System.out.println("[0] Abandonar el programa: ");
        return sc.nextInt();

    }

    public void llenarArreglo() {
        Random rand = new Random();
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {

                arreglo[i][j] = rand.nextInt(10 - 5 + 1) + 5;

            }
        }

    }
public void presentarMatriz(){
    for (int i = 0; i < arreglo.length; i++) {
        for (int j = 0; j < arreglo[0].length; j++) {
            System.out.print(arreglo[i][j]+ " ");   
        }
        System.out.println();
    }

}
    public void promedioAlumno() {
        float promedio = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                promedio += arreglo[i][j];
            }
            promedio = promedio / arreglo[0].length;
            System.out.println("Promedio del estudiante " + (i + 1) + ": " + promedio);
            promedio = 0;
        }

    }

    public void aprobados() {
        int aprobados = 0;
        for (int j = 0; j < arreglo[0].length; j++) {
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i][j] >= 7) {
                    aprobados++;
                }
            }
            System.out.println("Numero de estudiantes aprobados en materia " + (j + 1) + ": " + aprobados);
            aprobados = 0;
        }
    }

    public void reprobado() {
        int reprobados = 0;
        for (int j = 0; j < arreglo[0].length; j++) {
            for (int i = 0; i < arreglo.length; i++) {
                if (arreglo[i][j] < 7) {
                    reprobados++;
                }
            }
            System.out.println("Numero de estudiantes reprobados en materia " + (j + 1) + ": " + reprobados);
            reprobados = 0;
        }
    }

    public void promedioMateria() {
        float promedio = 0;
        for (int j = 0; j < arreglo[0].length; j++) {
            for (int i = 0; i < arreglo.length; i++) {
                promedio += arreglo[i][j];
            }
            promedio = promedio / arreglo[0].length;
            System.out.println("Promedio de materia " + (j + 1) + " : " + promedio);
            promedio = 0;
        }
    }

}
