package prueba1b;

import java.util.Scanner;

public class Auto {

    String marca;
    String modelo;
    String placa;
    double[] metros;
    double[] velocidad;
    double[] tiempo;
    double promtiempo;
    double promespacio;
    Scanner sc;

    public Auto() {
        this.sc = new Scanner(System.in);
    }

    public Auto(String marca, String modelo, String placa, double[] metros, double[] velocidad, double[] tiempo, double promtiempo, double promespacio) {
        this.marca = marca;
        this.modelo = modelo;
        this.placa = placa;
        this.metros = metros;
        this.velocidad = velocidad;
        this.tiempo = tiempo;
        this.promtiempo = promtiempo;
        this.promespacio = promespacio;

    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setMetros(double[] metros) {
        this.metros = metros;
    }

    public void setVelocidad(double[] velocidad) {
        this.velocidad = velocidad;
    }

    public void setTiempo(double[] tiempo) {
        this.tiempo = tiempo;
    }

    public void setPromtiempo(double promtiempo) {
        this.promtiempo = promtiempo;
    }

    public void setPromespacio(double promespacio) {
        this.promespacio = promespacio;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public double[] getMetros() {
        return metros;
    }

    public double[] getVelocidad() {
        return velocidad;
    }

    public double[] getTiempo() {
        return tiempo;
    }

    public double getPromtiempo() {
        return promtiempo;
    }

    public double getPromespacio() {
        return promespacio;
    }

    public void preguntarDatos() {
        System.out.println("Ingrese la marca del auto: ");
        this.marca = sc.nextLine();
        System.out.println("Ingrese el modelo del auto: ");
        this.modelo = sc.nextLine();
        System.out.println("Ingrese la placa del auto: ");
        this.placa = sc.nextLine();
        double[] aux1 = new double[4];
        double[] aux2 = new double[4];
        double[] aux3 = new double[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresar metros de aceleracion(m): ");
            aux1[i] = sc.nextDouble();
        }
        this.metros = aux1;
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresar Velocidad alcanzada por metros de aceleracion(km/h): ");
            aux2[i] = sc.nextDouble();
        }
        this.velocidad = aux2;
        for (int i = 0; i < 4; i++) {
            System.out.println("Ingresar Tiempo alcanzado para la velocidad versus tiempo(s): ");
            aux3[i] = sc.nextDouble();
        }
        this.tiempo = aux3;

    }

    public void calcularTiempo(double[] datos) {
        double aux = 0;
        for (int i = 0; i < datos.length; i++) {
            aux += datos[i];
        }
        aux = (aux / datos.length);
        this.promtiempo = aux;
    }

    public void calcularEspacio(double[] datos) {
        double aux = 0;
        for (int i = 0; i < datos.length; i++) {
            aux += datos[i];
        }
        aux = (aux / datos.length);
        this.promespacio = aux;

    }

    public void calcularMes(String dato) {
        String[] aux = new String[8];
        String mes = "";
        for (int i = 0; i < aux.length; i++) {
            aux[i] = dato.substring(i, (i + 1));
        }
        if (aux[7].equals("0")) {
            mes = "Noviembre";

        } else if (aux[7].equals("1")) {
            mes = "Febrero";

        } else if (aux[7].equals("2")) {
            mes = "Marzo";

        } else if (aux[7].equals("3")) {
            mes = "Abril";

        } else if (aux[7].equals("4")) {
            mes = "Mayo";

        } else if (aux[7].equals("5")) {
            mes = "Junio";

        } else if (aux[7].equals("6")) {
            mes = "Julio";

        } else if (aux[7].equals("7")) {
            mes = "Agosto";

        } else if (aux[7].equals("8")) {
            mes = "Septiembre";

        } else if (aux[7].equals("9")) {
            mes = "Octubre";

        }

        System.out.println("El mes de matriculacion es: " + mes);

    }

    public void presentarDatos() {
        System.out.printf("Marca: %s\nModelo: %s\nPlaca: %s\nValores: \n", marca, modelo, placa);
        for (int i = 0; i < metros.length; i++) {
            System.out.printf("%.2f seg     %.2f metros     %.2f km/h\n", tiempo[i], metros[i], velocidad[i]);
        }
        calcularMes(placa);
        System.out.printf("El tiempo promedio al alcanzar los 100km/h es: %.2f seg\n"
                + "El espacio promedio al alcanzar los 100km/h es: %.2f metros\n", promtiempo, promespacio);

    }

    public void hallarMenorTiempo(double a, double b, double c, double d) {
        double[] aux = {a, b, c, d};
        double menor = aux[0];
        for (int i = 0; i < aux.length; i++) {
            if (menor > aux[i]) {
                menor = aux[i];

            }
        }
        System.out.println("\nEl menor tiempo en alcanzar los 100km/h es: " + menor + "seg");

    }

    public void hallarMayorEspacio(double a, double b, double c, double d) {
        double[] aux = {a, b, c, d};
        double mayor = aux[0];
        for (int i = 0; i < aux.length; i++) {
            if (mayor < aux[i]) {
                mayor = aux[i];

            }
        }
        System.out.println("El mayor espacio que se logra hasta alcanzar  los 100km/h es: " + mayor + " metros\n");

    }

}
