
package archivos;

import java.io.*;
import java.util.Scanner;


public class Metodos1 {

    Scanner sc;
    File archivo;
    File archivo2;
    public Metodos1() {
        this.archivo = new File("Actualizados.txt");
        this.archivo2 = new File("Deudas.txt");
        this.sc = new Scanner(System.in);

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Actualizar datos: ");
        System.out.println("[0] Abandonar el programa: ");
        return sc.nextInt();

    }

    public void actualizarDato() {
        FileReader leer;
        BufferedReader temporal;
        FileWriter escribir;
        PrintWriter linea;
        try {
            if (!archivo.exists()) {
                archivo.createNewFile();
            }
        } catch (Exception e) {
        }
        try {
            escribir = new FileWriter(archivo);
            linea = new PrintWriter(escribir);
            leer = new FileReader(archivo2);
            temporal = new BufferedReader(leer);

            String cadena;
            String dato;
            while ((cadena = temporal.readLine()) != null) {
                dato = cadena.replace("Central de Riesgo", "Liberado");

                linea.println(dato + "\n");

            }
            temporal.close();
            leer.close();
            linea.close();

        } catch (Exception e) {
        }

    }
}
