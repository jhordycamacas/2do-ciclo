package ejercicio9;

public class Ejercicio9 {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int opc;

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.insertar(metodos.leerDatos());
                case 2 ->
                    metodos.recorrer();
                case 3 ->
                    metodos.invertida();

            }

        } while (opc != 0);
    }

}
