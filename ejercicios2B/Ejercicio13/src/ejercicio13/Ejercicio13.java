package ejercicio13;

public class Ejercicio13 {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int opc;

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.insertar();
                case 2 ->
                    metodos.eliminar();
                case 3 ->
                    metodos.recorrer();

            }

        } while (opc != 0);
    }

}
