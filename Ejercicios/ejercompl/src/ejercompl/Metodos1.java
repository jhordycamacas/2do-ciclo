/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercompl;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Metodos1 {

    Estudiantes[] alumnos;
    Scanner sc;
    int ev;
    Nodo head;
    Nodo tail;

    public Metodos1(int lim) {
        this.alumnos = new Estudiantes[lim];
        this.sc = new Scanner(System.in);
        this.ev = 0;
        this.head = null;
        this.tail = null;

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Insertar el arreglo: ");
        System.out.println("[2] Recorrer arreglo: ");
        System.out.println("[3] Generar lista: ");
        System.out.println("[4] Reporte chicas que aprueban: ");
        System.out.println("[5] Reporte chicos que aprueban: ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();

    }

    public Estudiantes leerDatos() {
        int id;
        String nombre;
        char sexo;
        float[] notas = new float[3];
        System.out.println("Ingrese el id del estudiante: ");
        id = sc.nextInt();
        System.out.println("Ingrese el nombre del estudiante: ");
        sc.nextLine();
        nombre = sc.nextLine();
        System.out.println("Ingrese el sexo Masculino(M)-Femenino(F):");
        sexo = sc.next().charAt(0);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Ingrese calificacion (" + (i + 1) + "): ");
            notas[i] = sc.nextFloat();
        }

        Estudiantes nuevo = new Estudiantes(id, nombre, sexo, notas);
        return nuevo;

    }

    public void llenarArreglo() {
        if (ev < alumnos.length) {
            alumnos[ev] = leerDatos();
            ev++;
        } else {
            System.out.println("Aula llena...");
        }

    }

    public void recorrerArreglo() {
        for (int i = 0; i < ev; i++) {
            System.out.printf("Id: %d\nNombre: %s\n", alumnos[i].id, alumnos[i].nombre);
        }

    }

    public boolean nodoVacio(Nodo actual) {
        return actual == null;

    }

    public void insertar(int id, String nombre, char sexo, float prom) {
        Nodo nuevo = new Nodo(id, nombre, sexo, prom);
        if (nodoVacio(head)) {
            head = nuevo;
            tail = nuevo;
        } else {

            tail.sig = nuevo;
            tail = nuevo;

        }
    }

    public void generarLista() {
        if (ev != 0) {
            for (int i = 0; i < ev; i++) {
                insertar(alumnos[i].id, alumnos[i].nombre, alumnos[i].sexo, alumnos[i].getPromedio());
            }
        } else {
            System.out.println("No existen datos...");
        }
    }

    public void reporte(char sexo) {
        if (!nodoVacio(head)) {
            Nodo actual = head;
            while (!nodoVacio(actual)) {
                if ((actual.sexo == sexo) && (actual.promedio >= 7)) {
                    System.out.printf("Nombre: %s\nAPROBADO/A con: %.2f\n", actual.nombre, actual.promedio);
                }
                actual = actual.sig;
            }
        } else {
            System.out.println("No existen datos...");
        }

    }

}
