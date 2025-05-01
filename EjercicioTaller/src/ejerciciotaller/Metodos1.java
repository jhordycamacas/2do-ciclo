/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerciciotaller;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author utpl
 */
public class Metodos1 {

    Scanner sc;
    Datos[] miEncuesta;
    File archivo;
    int cont;

    public Metodos1(int lim) {
        this.sc = new Scanner(System.in);
        this.miEncuesta = new Datos[lim];
        this.archivo = new File("miEncuesta.txt");
        this.cont = lim;
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Encuestar: ");
        System.out.println("[2] Presentar desde archivo: ");
        System.out.println("[2] Presentar desde arreglo: ");
        System.out.println("[0] Abandonar el programa: ");
        return sc.nextInt();

    }

    public void encuestar() {
        FileWriter escribir;
        PrintWriter linea;
        int cedula, numMat;
        String nombre = "", tema = "";
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (Exception e) {
        }

        try {
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            for (int i = 0; i < cont; i++) {

                System.out.println("Digite la cedula: ");
                cedula = sc.nextInt();
                System.out.println("Digite numero de materias: ");
                numMat = sc.nextInt();
                sc.nextLine();
                System.out.println("Digite nombre del docente: ");
                nombre = sc.nextLine();
                System.out.println("Digite el tema problema: ");
                tema = sc.nextLine();

                linea.println(cedula + "\n" + numMat + "\n" + nombre + "\n" + tema);
            }
            linea.close();
        } catch (Exception e) {
        }

    }
}
