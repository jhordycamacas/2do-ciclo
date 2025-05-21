/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package libretass;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Libretass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCalif = 0;
        System.out.println("Ingrese el numero de notas a ingresar: ");
        numCalif = sc.nextInt();
        double[] notas = new double[numCalif];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese nota (" + (i + 1) + "): ");
            notas[i] = sc.nextDouble();
        }

        Libretas metodo = new Libretas("Jhordy", "1302393", "Computacion", notas);
        metodo.mostrarDatos();
        double prom = metodo.obtenerPromedio();
        String cual = metodo.obtenerCualitativa(prom);

        metodo.presentar(prom, cual);
        metodo.mostrarEstado(prom);
    }

}
