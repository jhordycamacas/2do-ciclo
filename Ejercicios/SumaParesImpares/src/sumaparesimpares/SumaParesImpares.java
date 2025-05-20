/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sumaparesimpares;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class SumaParesImpares {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
        int opc, limite;
        System.out.println("Ingrese el numero de elementos para el arreglo: ");
        limite = sc.nextInt();
        Metodos1 metodos = new Metodos1(limite);

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.llenarArreglo();
                case 2 ->
                    metodos.presentarArreglo();
                case 3 ->
                    metodos.presentarSumaPares();
                case 4 ->
                    metodos.presentarSumaImpares();

            }
        } while (opc != 0);
    }
}
   