/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejer3;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Metodos1 {

    Scanner sc;
    int[] arreglo;
    int ev;

    public Metodos1() {
        this.sc = new Scanner(System.in);
        this.arreglo = new int[10];
        this.ev = 0;
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL:");
        System.out.println("[1] Insertar completo: ");
        System.out.println("[2] Recorrer arreglo: ");
        System.out.println("[3] Eliminar: ");
        System.out.println("[0] Salir: ");
        return sc.nextInt();

    }

    public int leerDato() {
        System.out.println("Ingrese dato: ");
        return sc.nextInt();

    }

    public void leerCompleto() {
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = leerDato();

        }
        ev = arreglo.length;

    }

    public void presentar() {
        for (int i = 0; i < ev; i++) {
            System.out.printf("Valor del arreglo en posicion[%d]: %d\n", i,
                    arreglo[i]);

        }

    }

    public int secuencial(int num) {
        for (int i = 0; i < ev; i++) {
            if (num == arreglo[i]) {
                return i;
            }
        }
        return -1;

    }

    public void buscarElemento() {
        int num = leerDato();
        int res = secuencial(num);
        if (res != -1) {
            System.out.println("El " + num + " esta en la posicion " + res);
        } else {
            System.out.println("No existe el " + num);

        }

    }

    public void insInicio() {
        if (ev < arreglo.length) {
            recorrerDer(0);
            arreglo[0] = leerDato();
            ev++;
        } else {
            System.out.println("No hay espacio\n");
        }
    }

    public void recorrerDer(int num) {
        for (int i = ev; i > num; i--) {
            arreglo[i] = arreglo[i - 1];

        }

    }

    public void analizarDato() {
        int num = leerDato();
        int res = num;
        if (secuencial(num) == -1) {
            arreglo[ev] = res;
            ev++;

        } else {
            System.out.println("EL numero ya existe dentro del arreglo");
        }

    }

    public void insOrden() {
        if (ev < arreglo.length) {
            int num = leerDato();
            int pos = 0;
            while ((pos < ev) && (num > arreglo[pos])) {
                pos++;
            }
            recorrerDer(pos);
            arreglo[pos] = num;
            ev++;

        } else {
            System.out.println("No hay espacio...");
        }

    }

    public void recorrerIzq(int num) {
        for (int i = num; i < ev - 1; i++) {
            arreglo[i] = arreglo[i + 1];

        }

    }

    public void eliminar() {
        int num = leerDato();
        int pos = secuencial(num);
        if (pos != -1) {
            recorrerIzq(pos);
            ev--;

        } else {
            System.out.println("No esta...");

        }

    }

    public void burbuja() {
        int aux;
        for (int i = 0; i < ev - 1; i++) {
            for (int j = i + 1; j < ev; j++) {
                if (arreglo[i] > arreglo[j]) {
                    aux = arreglo[i];
                    arreglo[i] = arreglo[j];
                    arreglo[j] = aux;

                }

            }

        }

    }
}
