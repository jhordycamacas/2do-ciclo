package ejercicio1;

public class Ejercicio1 {

    public static void main(String[] args) {
        int opc;

        Metodos metodos = new Metodos();
        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.insertar();
                case 2 ->
                    metodos.insertarDato();
                case 3 -> 
                    metodos.presentarLista();

            }

        } while (opc != 0);
    }

}
