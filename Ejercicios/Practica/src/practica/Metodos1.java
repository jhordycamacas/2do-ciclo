package practica;

import java.util.Scanner;
import java.io.*;

public class Metodos1 {

    Scanner sc;
    Alumno[] aula;
    int ev;
    File archivo;
    File archivo2;

    public Metodos1(int lim) {
        this.sc = new Scanner(System.in);
        this.aula = new Alumno[lim];
        this.ev = 0;
        this.archivo = new File("Mujeres.txt");
        this.archivo2 = new File("Varones.txt");
    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Insertar nuevo alumno: ");
        System.out.println("[2] Registrar Mujeres y Varones aprobados: ");
        System.out.println("[3] Presentar hombres y mujeres aporbados: ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();

    }

    public Alumno leerDatos() {
        float calif = 0;
        System.out.println("Ingrese ID: ");
        int id = sc.nextInt();
        System.out.println("Ingrese nombre: ");
        sc.nextLine();
        String nombre = sc.nextLine();
        System.out.println("Ingrese sexo (H)Hombre o (M)Mujer: ");
        char sexo = Character.toUpperCase(sc.next().charAt(0));
        System.out.println("Ingrese calificacion(1) entre 5 y 10: ");
        calif = calif + sc.nextFloat();
        System.out.println("Ingrese calificacion(2) entre 5 y 10: ");
        calif = calif + sc.nextFloat();
        System.out.println("Ingrese calificacion(3) entre 5 y 10: ");
        calif = calif + sc.nextFloat();

        calif = calif / 3;

        Alumno nuevo = new Alumno(id, nombre, sexo, calif);
        return nuevo;
    }

    public void llenarDatos() {
        if (ev < aula.length) {
            aula[ev] = leerDatos();
            ev++;

        } else {
            System.out.println("Aula llena...");
        }

    }

    public void registrar() {
        FileWriter escribir;
        FileWriter escribir2;
        PrintWriter linea;
        PrintWriter linea2;
        try {
            if (!archivo.exists() && !archivo2.exists()) {
                archivo2.createNewFile();
                archivo.createNewFile();

            }

        } catch (Exception e) {

        }

        try {
            escribir = new FileWriter(archivo, false);
            escribir2 = new FileWriter(archivo2, false);
            linea = new PrintWriter(escribir);
            linea2 = new PrintWriter(escribir2);
            for (int i = 0; i < ev; i++) {
                if (aula[i].sexo == 'M' && aula[i].promedio >= 7) {
                    linea.println("Id: " + aula[i].id + "\n" + "Nombre: "
                            + aula[i].nombre + "\n" + "Promedio: " + aula[i].promedio
                            + "\n=============");

                } else {
                    if (aula[i].sexo == 'H' && aula[i].promedio >= 7) {
                        linea2.println("Id: " + aula[i].id + "\n" + "Nombre: "
                                + aula[i].nombre + "\n" + "Promedio: " + aula[i].promedio
                                + "\n=============");

                    }

                }
            }
            linea.close();
            linea2.close();

        } catch (Exception e) {
        }

    }

    public void mostrar() {
        FileReader leer;
        FileReader leer2;
        BufferedReader temporal;
        BufferedReader temporal2;
        try {
            leer = new FileReader(archivo);
            leer2 = new FileReader(archivo2);
            temporal = new BufferedReader(leer);
            temporal2 = new BufferedReader(leer2);
            String nombre, cadena;
            float promedio;
            int id;
            System.out.println("\nPRESENTACION DE DATOS DE LAS MUJERES DESDE ARCHIVO: ");
            while ((cadena = temporal.readLine()) != null) {
                id = Integer.parseInt(cadena);
                cadena = temporal.readLine();
                nombre = cadena;
                cadena = temporal.readLine();
                promedio = Float.parseFloat(cadena);

                System.out.printf("Id: %d\nNombre: %s"
                        + "\nPromedio: %,2f\n",
                        id, nombre, promedio);
                System.out.println("-----------------------");

            }
            temporal.close();
            leer.close();
            System.out.println("\nPRESENTACION DE DATOS DE LOS VARONES DESDE ARCHIVO: ");
            while ((cadena = temporal2.readLine()) != null) {
                id = Integer.parseInt(cadena);
                cadena = temporal2.readLine();
                nombre = cadena;
                cadena = temporal2.readLine();
                promedio = Float.parseFloat(cadena);

                System.out.printf("Id: %d\nNombre: %s"
                        + "\nPromedio: %,2f\n",
                        id, nombre, promedio);
                System.out.println("-----------------------");

            }
            temporal2.close();
            leer2.close();
        } catch (Exception e) {
        }

    }

}
