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
            linea.println(nombre+"\n"+dir+"\n"+correo);
            linea.close();
        } catch (Exception e) {
        }

    }

}
