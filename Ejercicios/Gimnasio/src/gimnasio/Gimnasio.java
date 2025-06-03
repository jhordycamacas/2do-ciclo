
package gimnasio;
import java.util.Scanner;

public class Gimnasio {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opc, limite;
        System.out.println("Ingrese el numero de clientes registrados antes de la apertura: ");
        limite = sc.nextInt();
        Metodos1 metodos = new Metodos1(limite);

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.llenarClientes();
                case 2 ->
                    metodos.presentarClientes();
                case 3 ->
                    metodos.calcularClientesDescuento();
                case 4 ->
                    metodos.presentarClientesDescuento();

            }
        } while (opc != 0);

    }

}
