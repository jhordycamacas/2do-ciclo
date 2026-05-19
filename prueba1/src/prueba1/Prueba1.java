package prueba1;

import java.util.Scanner;

public class Prueba1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamanio la matriz:");
        int tamanio = sc.nextInt();
        Metodos metodos = new Metodos(tamanio);
        int opc;

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.llenarMatriz();
                case 2 ->
                    metodos.presentarMatriz();
                case 3 ->
                    metodos.cambiarDatos();
                case 4 ->
                    metodos.presentarArbol();

            }

        } while (opc != 0);
    }

}
