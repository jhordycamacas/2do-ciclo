
package notascursos;

import java.util.Scanner;
import java.util.Random;

public class Metodos1 {

    int[][] notas;
    String[] estudiantes;
    String[] materias;
    Scanner sc;

    public Metodos1(int estudiantes, int materias) {
        this.sc = new Scanner(System.in);
        this.notas = new int[estudiantes][materias];
        this.estudiantes = new String[notas.length];
        this.materias = new String[notas[0].length];

    }

    public int menu() {

        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Ingresar nombre de materias: ");
        System.out.println("[2] Ingresar nombre de estudiantes: ");
        System.out.println("[3] Generar notas aleatoriamente: ");
        System.out.println("[4] Presentar matriz de notas: ");
        System.out.println("[5] Presentar nota de estudiante en especifico: ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();

    }

    public void ingresarMaterias() {
        sc.nextLine();
        for (int i = 0; i < materias.length; i++) {
            System.out.println("Ingrese materia (" + (i + 1) + "):  ");
            materias[i] = sc.nextLine();
        }

    }

    public void ingresarEstudiantes() {
        sc.nextLine();
        for (int i = 0; i < estudiantes.length; i++) {
            System.out.println("Ingresar estudiante (" + (i + 1) + "):  ");
            estudiantes[i] = sc.nextLine();
        }

    }

    public void generarNotas() {
        Random rand = new Random();
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                notas[i][j] = rand.nextInt(11);
            }
        }

    }

    public void presentarMatrizNotas() {
        System.out.println("NOTAS: \n");
        for (int i = 0; i < notas.length; i++) {
            for (int j = 0; j < notas[0].length; j++) {
                System.out.print(notas[i][j] + "  ");
            }
            System.out.println("\n");
        }

    }

    public void presentarNotaEstudiante() {
        int materia, estudiante;
        System.out.println("Ingrese el numero de estudiante que quiere obtener: ");
        estudiante = sc.nextInt();
        System.out.println("Ingrese el numero de materia que requiere del estudiante"
                + "(" + (estudiante) + "):");
        materia = sc.nextInt();

        System.out.printf("\nINFORMACION DEL ESTUDIANTE (" + (estudiante) + "):\n"
                + "%s tiene %d en %s", estudiantes[estudiante - 1], notas[estudiante - 1][materia - 1],
                materias[materia - 1]);

    }

}
