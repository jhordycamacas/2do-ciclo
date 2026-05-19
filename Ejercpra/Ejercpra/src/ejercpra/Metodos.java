/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercpra;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Metodos {

    Scanner sc = new Scanner(System.in);

    public int menu() {
        System.out.println("\nMENU PRINCIPAL");
        System.out.println("[1] Impresion caracter por caracter: ");
        System.out.println("[2] Repeticion de caracter: ");
        System.out.println("[3] Determinar palindromo: ");
        System.out.println("[4] Contar vocales: ");
        System.out.println("[5] Tornado: ");
        System.out.println("[0] Salir: ");
        return sc.nextInt();
    }

    public String leerCadena() {
        String cadena;
        sc.nextLine();
        System.out.println("Digite la cadena: ");
        cadena = sc.nextLine();
        return cadena;

    }

    public void carXcar() {
        String cadena = leerCadena();
        for (int i = 0; i < cadena.length(); i++) {
            System.out.print(cadena.charAt(i) + " ");

        }
    }

    public void repeticion() {
        String cadena = leerCadena();
        System.out.println("Escoga el caracter a analizar: ");
        char caracter = sc.next().charAt(0);
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (caracter == cadena.charAt(i)) {
                contador++;

            }

        }
        System.out.println("Numero de veces que se repite es: " + contador);
    }

    public String eliminaespacios(String cadena) {
        return cadena.replace(" ", "");

    }

    public void palindromo() {
        String cadena = leerCadena();
        boolean bandera = true;
        cadena = eliminaespacios(cadena);
        for (int i = 0; i < cadena.length() / 2; i++) {
            if (cadena.charAt(i) != cadena.charAt(cadena.length() - 1 - i)) {
                bandera = false;
                break;

            }
        }

        if (bandera) {
            System.out.println("Si es un palindromo");

        } else {
            System.out.println("No es un palindromo");

        }

    }

    public void contarvocales() {
        String cadena = leerCadena();
        String vocales = "aeiouAEIOU";
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (vocales.contains(cadena.substring(i, i + 1))) {
                contador++;
            }

        }
        System.out.println("Existen " + contador + " vocales");
    }

    public void tornado() {
        String cadena = leerCadena();
        for (int i = 0; i <= cadena.length()/2; i++) {
            System.out.println(cadena.substring(i, cadena.length() - i));

        }

    }
}
