
package calcularmedia;


public class CalcularMedia {


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
                case 3 ->
                    metodos.mediaEstudiante();
                case 4 -> 
                    metodos.mediaMateria();
                case 5 -> 
                    metodos.mediaClase();

            }
        } while (opc != 0);
    }
}