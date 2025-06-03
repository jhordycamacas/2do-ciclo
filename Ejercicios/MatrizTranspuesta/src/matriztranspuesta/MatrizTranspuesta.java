
package matriztranspuesta;
import java.util.Scanner;

public class MatrizTranspuesta {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);   
        int opc, limite;
        System.out.println("Ingrese el numero de columnas y filas de la matriz cuadrada: ");
        limite = sc.nextInt();
        
        Metodos1 metodos = new Metodos1(limite);


        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.generarMatriz();
                case 2 ->
                    metodos.presentarMatrizOriginal();
                case 3 -> 
                    metodos.matrizTranspuesta();

            }
        } while (opc != 0);
    }

}
    
    
    

