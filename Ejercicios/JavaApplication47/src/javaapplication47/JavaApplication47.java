/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication47;

/**
 *
 * @author usuario
 */
public class JavaApplication47 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos1 metodos = new Metodos1();

        int opc;
        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.suma();
                case 2 ->
                    metodos.resta();
                case 3 ->
                    metodos.multiplicacion();
                case 4 ->
                    metodos.division();
                case 5 ->
                    metodos.potencia();
                case 6 ->
                    metodos.raiz();

            }

        } while (opc != 0);

    }

}
