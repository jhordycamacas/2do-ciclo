package factorial;

public class Factorial {

    public static void main(String[] args) {
        int opc;

        Metodos1 metodos = new Metodos1();

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.almacenarArreglo();
                case 2 ->
                    metodos.presentarArreglo();
                case 3 ->
                    metodos.almacenarFactorial();
                case 4 ->
                    metodos.presentarFactorial();
            }
        } while (opc != 0);
    }
}


