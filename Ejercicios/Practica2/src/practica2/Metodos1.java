package practica2;

import java.util.Scanner;
import java.util.Random;

public class Metodos1 {

    int[][] matriz;
    Empleado[] empleados;
    Scanner sc;
    int ev;

    public Metodos1(int lim) {

        this.matriz = new int[lim][5];
        this.empleados = new Empleado[lim];
        this.sc = new Scanner(System.in);
        this.ev = 0;

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Ingresar horas aleatoriamente: ");
        System.out.println("[2] Ingresar empleado: ");
        System.out.println("[3] Presentar matriz de horas: ");
        System.out.println("[4] Presentar informe de empleados: ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();

    }

    public Empleado leerDatos() {
        System.out.println("Ingrese codigo: ");
        int codigo = sc.nextInt();
        System.out.println("Ingrese nombre: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        int h_normal = 0;
        int h_extra = 0;
        for (int j = 0; j < 5; j++) {
            int horas_dia = matriz[ev][j];
            if (horas_dia <= 8) {
                h_normal += horas_dia;
            } else {
                h_normal += 8;
                h_extra += (horas_dia - 8);
            }
        }

        Empleado nuevo = new Empleado(codigo, nombre, h_normal, h_extra);
        return nuevo;
    }

    public void llenarDatos() {
        if (ev < empleados.length) {
            empleados[ev] = leerDatos();
            ev++;

        } else {
            System.out.println("No hay mas espacio...");
        }

    }

    public void llenarHoras() {
        Random rand = new Random();

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                matriz[i][j] = rand.nextInt(8) + 5;
            }
        }

    }

    public void presentarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "   ");
            }
            System.out.println();
        }

    }

    public void presentarInforme() {
        double subtotal;
        double subtotal2;
        double sueldo;
        for (int i = 0; i < ev; i++) {
            subtotal = (empleados[i].h_normal * 5.50);
            subtotal2 = (empleados[i].h_extra * 8);
            sueldo = subtotal + subtotal2;
            System.out.printf("Codigo: %d\nNombre: %s\nNumero de horas normales"
                    + ": %d, subtotal: %.2f\nNumero de horas tiempo extra: %d"
                    + ",subtotal: %.2f\nSUELDO DE LA SEMANA: %.2f\n", empleados[i].codigo,
                    empleados[i].nombre, empleados[i].h_normal, subtotal, empleados[i].h_extra,
                    subtotal2, sueldo);
            System.out.println("============================");
        }

    }
}
