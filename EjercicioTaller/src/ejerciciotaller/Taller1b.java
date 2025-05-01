/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerciciotaller;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Taller1b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc, lim;
        System.out.println("Ingrese el numero de estudiantes a encuestar: ");
        lim = sc.nextInt();
        Metodos1 metodos = new Metodos1(lim);

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.encuestar();
                case 2 ->
                    metodos.leerArchivo();

            }
        } while (opc != 0);
    }
}
