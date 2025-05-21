/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aerolinea;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Aerolinea {

    /**
     * @param args the command line arguments
     */
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
               // case 3 ->
                   // metodos.liberarAsiento();

            }

        } while (opc != 0);
    }

}
