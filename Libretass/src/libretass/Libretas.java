/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package libretass;

/**
 *
 * @author usuario
 */
public class Libretas {

    private String nombre;
    private String cedula;
    private String carrera;
    private double[] notas;

    public Libretas(String nombre, String cedula, String carrera, double[] notas) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.carrera = carrera;
        this.notas = notas;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
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

    public void setCedula(String cedula) {
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
        if (prom > 0 && prom < 7) {
            System.out.println("Usted esta reprobado\n");

        } else if (prom >= 7 && prom <= 10) {
            System.out.println("Usted esta aprobado\n");

        }

    }

}
