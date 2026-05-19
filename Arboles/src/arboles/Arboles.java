package arboles;

public class Arboles {

    public static void main(String[] args) {
        int opc;
        Metodos metodos = new Metodos();
        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.insertar();
                case 2 -> {
                    System.out.println("Pre - Orden: ");
                    metodos.recorridopre(metodos.raiz);
                    System.out.println("\nIn - Orden: ");
                    metodos.recorridoin(metodos.raiz);
                    System.out.println("\nPos - Orden: ");
                    metodos.recorridopos(metodos.raiz);

                }
                case 3 ->
                    metodos.eliminar();
            }

        } while (opc != 0);

    }

}
