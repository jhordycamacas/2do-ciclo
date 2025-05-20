/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package colasarreglos;

/**
 *
 * @author utpl
 */
public class ColasArreglos {

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
                    metodos.operacionPush();
                case 2 ->
                    metodos.operacionPop();

            }
        } while (opc != 0);
    }

}
