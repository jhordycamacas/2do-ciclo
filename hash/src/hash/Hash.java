package hash;

public class Hash {

    public static void main(String[] args) {
        int opc;
        Metodos metodos = new Metodos(4);

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.insertar();
                case 2 ->
                    metodos.recorrer();

            }
        } while (opc != 0);
    }

}
