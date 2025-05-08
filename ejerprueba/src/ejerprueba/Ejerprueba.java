/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerprueba;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Ejerprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc, dato;
        System.out.println("Cuantos registros se realizaran?");
        dato = sc.nextInt();
        Metodos metodos = new Metodos(dato);
        do {

            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.registrar();
                case 2 ->
                    metodos.leerDatos();
                case 3 ->
                    metodos.leerDatosArreglo();

            }
        } while (opc != 0);

    }

}
