/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejr1;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author utpl
 */
public class Metodos {

    Scanner sc = new Scanner(System.in);
    File archivo = new File("myArchivo.txt");

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Escribir en el archivo: ");
        System.out.println("[2] Leer desde el archivo: ");
        System.out.println("[0] Abandonar el programa: ");
        return sc.nextInt();

    }

    public void escribirArchivo() {
        FileWriter escribir;
        PrintWriter linea;
        String nombre, dir, correo;
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (Exception e) {
        }
        sc.nextLine();
        System.out.println("Digite el nombre: ");
        nombre = sc.nextLine();
        System.out.println("Digite la direccion: ");
        dir = sc.nextLine();
        System.out.println("Digite el correo: ");
        correo = sc.nextLine();
        try {
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.println(nombre + "\n" + dir + "\n" + correo);
            linea.close();
        } catch (Exception e) {
        }

    }

    public void leerArchivo() {
        FileReader leer;
        BufferedReader temporal;
        String nombre, dir, correo, cadena = "";
        try {
            leer = new FileReader(archivo);
            temporal = new BufferedReader(leer);
            System.out.println("\nPRESENTACION DE DATOS: ");
            while (cadena != null) {
                cadena = temporal.readLine();
                nombre = cadena;
                cadena = temporal.readLine();
                dir = cadena;
                cadena = temporal.readLine();
                correo = cadena;
                if (cadena != null) {
                    System.out.printf("Nombre: %s\nDireccion: %s\nCorreo: %s\n",
                            nombre, dir, correo);

                }
            }
            temporal.close();
            leer.close();
        } catch (Exception e) {
        }

    }

}
