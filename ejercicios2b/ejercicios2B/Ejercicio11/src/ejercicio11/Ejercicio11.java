package ejercicio11;

public class Ejercicio11 {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int opc;

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.insertar();
                case 2 ->
                    metodos.recorrer();
                case 3 ->
                    metodos.eliminar();

            }

        } while (opc != 0);
    }

}
