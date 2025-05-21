/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libretass;

import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class Libretas {

    Scanner sc;
    private String nombre;
    private int[] cedula;
    private String carrera;
    private double[] notas;

    public Libretas(String nombre, int[] cedula, String carrera, double[] notas) {
        this.sc = new Scanner(System.in);
        this.nombre = nombre;
        this.cedula = new int[10];
        this.carrera = carrera;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public int[] getCedula() {
        return cedula;
    }

    public String getCarrera() {
        return carrera;
    }

    public double[] getNotas() {
        return notas;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCedula(int[] cedula) {
        this.cedula = cedula;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public void setNotas(double[] notas) {
        this.notas = notas;
    }

    @Override
    public String toString() {
        return "Libretas{" + "nombre=" + nombre + ", cedula=" + cedula + ", carrera=" + carrera + ", notas=" + notas + '}';
    }

    public void mostrarDatos() {
        System.out.printf("\nPRESENTACION DE DATOS: \nNombre: %s\nCedula:"
                + " %s\nCarrera: %s\nCalificaciones: \n", nombre, cedula, carrera);
        for (int i = 0; i < notas.length; i++) {
            System.out.println("      " + notas[i]);
        }

    }

    public double obtenerPromedio() {
        double promedio = 0;
        for (int i = 0; i < notas.length; i++) {
            promedio += notas[i];
        }
        promedio = promedio / notas.length;
        return promedio;

    }

    public String obtenerCualitativa(double prom) {
        String cualitativa = "";
        if (prom > 0 && prom <= 4) {
            cualitativa = "Regular";

        } else {
            if (prom >= 4.1 && prom <= 7) {

                cualitativa = "Malo";

            } else {
                if (prom >= 7.1 && prom <= 9) {
                    cualitativa = "Bueno";

                } else {
                    if (prom >= 9.1 && prom <= 10) {

                        cualitativa = "Sobresaliente";
                    }
                }
            }

        }

        return cualitativa;
    }

    public void presentar(double prom, String cual) {
        System.out.printf("El promedio de notas de %s es:  %.2f\n", nombre, prom);
        System.out.printf("La nota cualitativa de %s es:  %s\n", nombre, cual);
    }

    public void mostrarEstado(double prom) {
        if (prom >= 0 && prom < 7) {
            System.out.println("Usted esta reprobado\n");

        } else if (prom >= 7 && prom <= 10) {
            System.out.println("Usted esta aprobado\n");

        }

    }
    public static int convertirDigito(int numero) {
    while (numero >= 10) {           
        int suma = 0;
        while (numero > 0) {         
            suma += numero % 10;    
            numero /= 10;            
        }
        numero = suma;              
    }
    return numero;                   
    }

    public void verificarCedula() {
        System.out.println("Ingresar cedula numero por numero: \n");
        for (int i = 0; i < cedula.length; i++) {
            System.out.println("Numero (" + (i + 1) + "): ");
            cedula[i] = sc.nextInt();
        }
        int[] aux2 = new int[2];
        int contador = 2;
        int[] resultado = new int[9];
        for (int i = 0; i < cedula.length - 1; i++) {
            if (i % 2 != 0) {
                contador = 1;
                resultado[i] = cedula[i] * contador;

            } else {
                resultado[i] = cedula[i] * contador;
            }
            if(resultado[i] >= 10){
            resultado[i] = convertirDigito(resultado[i]);
            }
            
            
        }
    }

}
