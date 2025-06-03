package practica2;

import java.util.Scanner;

public class Practica2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc, numempl;
        System.out.println("Ingrese el numero de empleados: ");
        numempl = sc.nextInt();
        Metodos1 metodos = new Metodos1(numempl);
        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.llenarHoras();
                case 2 ->
                    metodos.llenarDatos();
                case 3 -> 
                    metodos.presentarMatriz();
                case 4 ->
                    metodos.presentarInforme();

            }

        } while (opc != 0);

    }

}
