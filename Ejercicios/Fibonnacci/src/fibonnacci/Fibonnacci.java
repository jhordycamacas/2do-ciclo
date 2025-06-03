
package fibonnacci;


public class Fibonnacci {

    public static void main(String[] args) {
         int opc;
        Metodos1 metodos = new Metodos1();

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.llenarArreglo();
                case 2 ->
                    metodos.presentarArreglo();
            }
        } while (opc != 0);
    }
}