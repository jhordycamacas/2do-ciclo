/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package numerosprimos;

/**
 *
 * @author usuario
 */
public class NumerosPrimos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opc;

        Metodos1 metodos = new Metodos1();

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.llenarArreglo();
                case 2 ->
                    metodos.presentarArreglo();
            }
        } while (opc != 0);
    }
}
