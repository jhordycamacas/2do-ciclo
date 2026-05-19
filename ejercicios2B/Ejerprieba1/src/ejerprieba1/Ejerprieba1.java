package ejerprieba1;

public class Ejerprieba1 {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int opc;

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.insertar();
                case 2 ->
                    metodos.burbuja();
                case 3 ->
                    metodos.presentar();

            }

        } while (opc != 0);
    }

}
