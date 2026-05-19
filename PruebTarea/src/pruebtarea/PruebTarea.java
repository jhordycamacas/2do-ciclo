package pruebtarea;

import java.util.Scanner;

public class PruebTarea {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero de estudiantes: ");
        int lim = sc.nextInt();
        Metodos metodos = new Metodos(lim);

        int opc;
        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.insertarDatos();
                case 2 ->
                    metodos.enviarArbol();
                case 3 ->
                    metodos.presentarHombreApro();
                case 4 ->
                    metodos.presentarHombreRepro();
                case 5 ->
                    metodos.presentarMujeresApro();
                case 6 ->
                    metodos.presentarMujeresRepro();

            }

        } while (opc != 0);
    }

}
