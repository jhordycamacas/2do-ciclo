
package ejerciciotallerenclase;
import java.util.Scanner;

public class EjercicioTallerEnClase {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc, estudiantes;
        System.out.println("Ingrese el numero de estudiantes: ");
        estudiantes = sc.nextInt();
        Metodos1 metodos = new Metodos1(estudiantes);

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.llenarArreglo();
                case 2 -> 
                    metodos.presentarMatriz();
                case 3 ->
                    metodos.promedioAlumno();
                case 4 ->
                    metodos.aprobados();
                case 5 -> 
                    metodos.reprobado();
                case 6 -> 
                    metodos.promedioMateria();

            }
        } while (opc != 0);
    }
}
