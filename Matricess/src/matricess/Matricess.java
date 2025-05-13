/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package matricess;

/**
 *
 * @author utpl
 */
public class Matricess {

    /**
     * @param args the command * @author utpl line arguments
     */
    public static void main(String[] args) {
         Metodos1 metodos = new Metodos1();

        int opc;
        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.leerMatriz();
                case 2 ->
                    metodos.presentarMatriz();
                case 3 -> 
                    metodos.matrizTranspuestadiag2();

            }
        } while (opc != 0);
    }

}
    
    

