/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication48;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Estudiante implements Serializable {

    String nombre;
    int ciclo;
    String[] materias;
    double promedio;
    int numApro;
    int numRepro;
    double[] notas;

    public Estudiante(int lim) {
        this.materias = new String[lim];
        this.notas = new double[lim];

    }

    public Estudiante(String nombre, int ciclo, String[] materias, double promedio, int numApro, int numRepro, double[] notas) {
        this.nombre = nombre;
        this.ciclo = ciclo;
        this.materias = materias;
        this.promedio = promedio;
        this.numApro = numApro;
        this.numRepro = numRepro;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCiclo() {
        return ciclo;
    }

    public String[] getMaterias() {
        return materias;
    }

    public double getPromedio() {
        return promedio;
    }

    public int getNumApro() {
        return numApro;
    }

    public int getNumRepro() {
        return numRepro;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCiclo(int ciclo) {
        this.ciclo = ciclo;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void setNumApro(int numApro) {
        this.numApro = numApro;
    }

    public void setNumRepro(int numRepro) {
        this.numRepro = numRepro;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    public void calcularAproRepro(double[] notas) {
        numApro = 0;
        numRepro = 0;
        for (int i = 0; i < notas.length; i++) {
            if (notas[i] >= 7) {
                numApro += 1;

            } else {
                numRepro += 1;

            }
        }

    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + ", ciclo=" + ciclo + ", materias=" + Arrays.toString(materias) + ", promedio=" + promedio + ", numApro=" + numApro + ", numRepro=" + numRepro + ", notas=" + Arrays.toString(notas) + '}';
    }

    public String[] leerMaterias() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < materias.length; i++) {
            System.out.println("Ingrese el nombre de la materia(" + (i + 1) + "): ");
            materias[i] = sc.nextLine();
        }
        return materias;

    }

    public double[] leerNotas() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < materias.length; i++) {
            System.out.println("Ingrese nota de la materia(" + (i + 1) + "): ");
            notas[i] = sc.nextDouble();
        }
        return notas;

    }

    public double calcularPromedio() {
        double promedio = 0;
        for (int i = 0; i < materias.length; i++) {
            promedio += notas[i];
        }
        promedio = promedio / materias.length;
        return promedio;
    }

    public int numAprobados() {
        numApro = 0;
        for (int i = 0; i < materias.length; i++) {
            if (notas[i] >= 7) {
                numApro += 1;

            }
        }

        return numApro;
    }

    public int numReprobados() {
        numRepro = 0;
        for (int i = 0; i < materias.length; i++) {
            if (notas[i] < 7) {
                numRepro += 1;

            }
        }

        return numRepro;
    }

    public void mostrarDatos() {
        System.out.printf("\nNombre: %s\nCiclo: %d\nMaterias: \n", nombre, ciclo);
        for (int i = 0; i < materias.length; i++) {
            System.out.printf("%s:      %.2f\n", materias[i], notas[i]);
        }

        System.out.printf("Promedio: %.2f\nNumero de materias aprobadas: %d\n"
                + "Numero de materias reprobadas: %d\n", promedio, numApro, numRepro);
    }

}
