/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gimnasio;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Metodos1 {

    Scanner sc;
    String[] clientes;
    int[][] arreglo;
    String[] clientesDescuento;
    int ev;

    public Metodos1(int limite) {

        this.ev = 0;
        this.sc = new Scanner(System.in);
        this.clientes = new String[limite];
        this.arreglo = new int[clientes.length][6];
        this.clientesDescuento = new String[limite];

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Ingresar usuarios registrados antes de la apertura: ");
        System.out.println("[2] Presentar usuarios registrados antes de la apertura: ");
        System.out.println("[3] Calcular usuarios con descuento(20%): ");
        System.out.println("[4] Presentar usuarios con descuento(20%): ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();

    }

    public void llenarClientes() {
        System.out.println("\nINGRESO DE USUARIOS ANTES DE APERTURA: ");
        sc.nextLine();
        for (int i = 0; i < clientes.length; i++) {
            System.out.println("Ingrese cliente " + (i + 1) + ": ");
            clientes[i] = sc.nextLine();
        }

    }

    public void presentarClientes() {
        System.out.println("\nPRESENTAR USUARIOS REGISTRADOS ANTES DE APERTURA: ");
        for (int i = 0; i < clientes.length; i++) {
            System.out.print("Cliente " + (i + 1) + ": " + clientes[i]);
            System.out.println();

        }

    }

    public String obtenerDia(int num) {
        String dia = "";
        switch (num) {
            case 0 ->
                dia = "Lunes";
            case 1 ->
                dia = "Martes";
            case 2 ->
                dia = "Miercoles";
            case 3 ->
                dia = "Jueves";
            case 4 ->
                dia = "Viernes";
            case 5 ->
                dia = "Sabado";

        }
        return dia;

    }

    public void calcularClientesDescuento() {
        String dia;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                dia = obtenerDia(j);
                System.out.println("El cliente (" + (i + 1) + ") asistio el dia "
                        + dia + "?(Si(1)-No(0)): ");
                arreglo[i][j] = sc.nextInt();
            }
        }
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[0].length; j++) {
                suma += arreglo[i][j];
            }
            if (suma >= 3) {
                clientesDescuento[ev] = clientes[i];
                ev += 1;

            }
            suma = 0;
        }

    }

    public void presentarClientesDescuento() {
        System.out.println("\nCLIENTES CON EL 20% DE DESCUENTO: ");
        for (int i = 0; i < ev; i++) {
            System.out.print("Cliente " + (i + 1) + ": " + clientesDescuento[i]);
            System.out.println();
        }

    }

}
