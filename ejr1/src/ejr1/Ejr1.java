/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejr1;

/**
 *
 * @author utpl
 */
public class Ejr1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int opc;
        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.escribirArchivo();
                //case 2 ->
                 //   metodos.leerArchivo();

            }

        } while (opc != 0);
    }

}
