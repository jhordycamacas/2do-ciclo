package practica;
import java.util.Scanner;
public class Practica {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc, lim;
        System.out.println("Ingrese el numero de alumnos: ");
        lim = sc.nextInt();
        Metodos1 metodos = new Metodos1(lim);
        
        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.llenarDatos();
                case 2 ->
                    metodos.registrar();
                case 3 ->
                   metodos.mostrar();

            }

        } while (opc != 0);

    }

}
