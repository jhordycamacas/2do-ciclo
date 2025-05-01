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
        System.out.println("[3] Presentar desde arreglo: ");
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
            escribir = new FileWriter(archivo);
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

    public void leerArchivo() {
        FileReader leer;
        BufferedReader temporal;
        int cont = 0;
        int cedula, numMat;
        String nombre, tema, cadena = "";
        try {
            leer = new FileReader(archivo);
            temporal = new BufferedReader(leer);
            System.out.println("\nPRESENTACION DE DATOS: ");
            while (cadena != null) {
                cadena = temporal.readLine();
                cedula = Integer.parseInt(cadena);
                cadena = temporal.readLine();
                numMat = Integer.parseInt(cadena);
                cadena = temporal.readLine();
                nombre = cadena;
                cadena = temporal.readLine();
                tema = cadena;
                if (cadena != null) {
                    System.out.printf("Cedula: %d\nNumero de Materias: %d"
                            + "\nNombre: %s\nTema Problema: %s\n",
                            cedula, numMat, nombre, tema);
                    System.out.println("-----------------------");
                    miEncuesta[cont] = new Datos(cedula, nombre, numMat, tema);
                    cont++;
                }
            }
            temporal.close();
            leer.close();
        } catch (Exception e) {
        }

    }

    public void recorrer() {
        for (int i = 0; i < miEncuesta.length; i++) {
            System.out.println("------------");
            System.out.printf("Cedula: %d\nNumero de Materias: %d"
                    + "\nNombre: %s\nTema Problema: %s\n",
                    miEncuesta[i].cedula, miEncuesta[i].numMat,
                    miEncuesta[i].nombre, miEncuesta[i].tema);

        }

    }

}
