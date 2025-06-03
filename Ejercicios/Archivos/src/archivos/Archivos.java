
package archivos;

public class Archivos {

    public static void main(String[] args) {
        int opc;

        Metodos1 metodos = new Metodos1();

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.actualizarDato();
            }
        } while (opc != 0);
    }
}
