
package ejercompl;

import java.util.Scanner;


public class Ejercompl {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de estudiantes: ");
        int limite = sc.nextInt();
        Metodos1 metodos = new Metodos1(limite);
        int opc;

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.llenarArreglo();
                case 2 ->
                    metodos.recorrerArreglo();
                case 3 ->
                    metodos.generarLista();
                case 4 ->
                    metodos.reporte('F');
                case 5 ->
                    metodos.reporte('M');

            }
        } while (opc != 0);
    }
}
