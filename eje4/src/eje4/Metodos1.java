/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eje4;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Metodos1 {

    Scanner sc;
    Alumno[] aula;
    int ev;

    public Metodos1() {
        this.sc = new Scanner(System.in);
        this.aula = new Alumno[10];
        this.ev = 0;
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL:");
        System.out.println("[1] Insertar nuevo alumno: ");
        System.out.println("[2] Presentar aula: ");
        System.out.println("[0] Salir: ");
        return sc.nextInt();

    }

    public Alumno leerDatos() {
        System.out.println("Ingrese ID: ");
        int id = sc.nextInt();
        System.out.println("Ingrese nombre: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        System.out.println("Ingrese sexo: ");
        char sexo = sc.next().charAt(0);
        System.out.println("Ingrese calificacion: ");
        float calif = sc.nextFloat();
        Alumno nuevo = new Alumno(id, nombre, sexo, calif);
        return nuevo;
    }

    public void leerAlumno() {
        if (ev < aula.length) {
            aula[ev] = leerDatos();
            ev++;

        } else {
            System.out.println("Aula llena...");
        }

    }

    public void presentarAula() {
        for (int i = 0; i < ev; i++) {
            System.out.println("ESTUDIANTE " + i + 1);
            System.out.println("Id: " + aula[i].id + "\nNombre: "
                    + aula[i].nombre + "\nSexo: " + aula[i].sexo
                    + "\nCalificacion: " + aula[i].calif);
            System.out.println("---------------------------");
        }

    }

}
