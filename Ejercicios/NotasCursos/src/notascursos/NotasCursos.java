
package notascursos;

import java.util.Scanner;


public class NotasCursos {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc, estudiantes, materias;
        System.out.println("Ingrese el numero de materias: ");
        materias = sc.nextInt();
        System.out.println("Ingrese el numero de estudiantes: ");
        estudiantes = sc.nextInt();

        Metodos1 metodos = new Metodos1(estudiantes, materias);

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.ingresarMaterias();
                case 2 ->
                    metodos.ingresarEstudiantes();
                case 3 ->
                    metodos.generarNotas();
                case 4 ->
                    metodos.presentarMatrizNotas();
                case 5 ->
                    metodos.presentarNotaEstudiante();

            }

        } while (opc != 0);

    }

}
