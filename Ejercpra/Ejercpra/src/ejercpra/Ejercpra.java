/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercpra;

/**
 *
 * @author utpl
 */
public class Ejercpra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos obj = new Metodos();

        int opc;
        do {
            opc = obj.menu();
            switch (opc) {

                case 1 ->
                    obj.carXcar();
                case 2 ->
                    obj.repeticion();
                case 3 ->
                    obj.palindromo();
                case 4 ->
                    obj.contarvocales();
                case 5 ->
                    obj.tornado();

            }

        } while (opc != 0);
    }

}
