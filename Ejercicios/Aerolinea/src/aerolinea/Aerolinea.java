
package aerolinea;

import java.util.Scanner;


public class Aerolinea {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc, filas, columnas;
        System.out.println("Ingrese cuantas filas de asientos hay: ");
        filas = sc.nextInt();
        System.out.println("Ingrese cuantos asientos hay en cada fila: ");
        columnas = sc.nextInt();

        Metodos1 metodos = new Metodos1(filas, columnas);

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.presentarEstadoAsientos();
                case 2 ->
                    metodos.ocuparAsiento();
               case 3 ->
                    metodos.liberarAsiento();

            }

        } while (opc != 0);
    }

}
