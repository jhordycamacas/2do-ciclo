/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejer3;

/**
 *
 * @author utpl
 */
public class Ejer3 {

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
                    metodos.leerCompleto();
                case 2 ->
                    metodos.presentar();
                case 3 ->
                    metodos.burbuja();
                case 4 ->
                    metodos.binaria();

            }
        } while (opc != 0);
    }

}
