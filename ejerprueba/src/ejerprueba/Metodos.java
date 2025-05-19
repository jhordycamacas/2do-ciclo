/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerprueba;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author usuario
 */
public class Metodos {

    Scanner sc;
    Datos[] miRegistro;
    File archivo;
    int cont;

    public Metodos(int lim) {
        this.sc = new Scanner(System.in);
        this.miRegistro = new Datos[lim];
        this.archivo = new File("miRegistro.txt");
        this.cont = lim;

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Registrar centro de salud: ");
        System.out.println("[2] Presentar desde archivo: ");
        System.out.println("[3] Presentar desde arreglo: ");
        System.out.println("[0] Abandonar el programa: ");
        return sc.nextInt();
    }

    public void registrar() {
        FileWriter escribir;
        PrintWriter linea;
        String nombre, provincia, ciudad = "";
        int cambien, cammal;
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

                System.out.println("Digite nombre del centro de salud: ");
                sc.nextLine();
                nombre = sc.nextLine();
                System.out.println("Digite la provincia: ");
                provincia = sc.nextLine();
                System.out.println("Digite la ciudad: ");
                ciudad = sc.nextLine();
                System.out.println("Digite el numero de camillas en buen estado: ");
                cambien = sc.nextInt();
                System.out.println("Digite el numero de camillas en mal estado: ");
                cammal = sc.nextInt();
                
                linea.println(nombre + "\n" + provincia + "\n" + ciudad + "\n" + cambien
                        + "\n" + cammal);
            }
            linea.close();

        } catch (Exception e) {
        }

    }

    public void leerDatos() {
        FileReader leer;
        BufferedReader temporal;
        int cont = 0;
        int cambien, cammal;
        String nombre, provincia, ciudad, cadena = "";
        try {
            leer = new FileReader(archivo);
            temporal = new BufferedReader(leer);
            System.out.println("\nPRESENTACION DE DATOS DESDE ARCHIVO: ");
            while (cadena != null) {
                cadena = temporal.readLine();
                nombre = cadena;
                cadena = temporal.readLine();
                provincia = cadena;
                cadena = temporal.readLine();
                ciudad = cadena;
                cadena = temporal.readLine();
                cambien = Integer.parseInt(cadena);
                cadena = temporal.readLine();
                cammal = Integer.parseInt(cadena);

                if (cadena != null) {
                    System.out.printf("Nombre del centro: %s\nProvincia: %s"
                            + "\nCiudad: %s\nCamillas en buen estadp: %d\n"
                            + "Camillas en mal estado: %d\n",
                            nombre, provincia, ciudad, cambien, cammal);
                    System.out.println("-----------------------");
                    miRegistro[cont] = new Datos(nombre, provincia, ciudad, cambien, cammal);
                    cont++;
                }
            }
            temporal.close();
            leer.close();
        } catch (Exception e) {
        }

    }

    public void leerDatosArreglo() {
        System.out.println("PRESENTACION DE ARCHIVOS DESDE ARREGLO: ");
        for (int i = 0; i < miRegistro.length; i++) {
            System.out.printf("Nombre del centro: %s\nProvincia: %s"
                    + "\nCiudad: %s\nCamillas en buen estado: %d\n"
                    + "Camillas en mal estado: %d\n",
                    miRegistro[i].nombre, miRegistro[i].provincia,
                    miRegistro[i].ciudad, miRegistro[i].cambien,
                    miRegistro[i].cammal);
            System.out.println("-----------------");

        }

    }

}
