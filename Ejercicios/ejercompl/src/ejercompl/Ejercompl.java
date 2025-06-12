/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercompl;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejercompl {

    /**
     * @param args the command line arguments
     */
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
                    metodos.reporte('M');
                case 5 ->
                    metodos.reporte('F');

            }
        } while (opc != 0);
    }
}
