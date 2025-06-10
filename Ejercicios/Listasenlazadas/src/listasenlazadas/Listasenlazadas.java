/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listasenlazadas;



/**
 *
 * @author usuario
 */
public class Listasenlazadas {

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
                    metodos.insertar();
                case 2 ->
                    metodos.recorrer();
                case 3 ->
                    metodos.insInicio();
                case 4 ->
                    metodos.insOrden();
                case 5 -> 
                    metodos.buscar();
                case 6 ->
                    metodos.eliminar();

            }

        } while (opc != 0);
    }

}
