package avlc;

public class AVLC {

    public static void main(String[] args) {
        int opc;
        Metodos metodos = new Metodos();
        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.raizAVL = metodos.insertar(metodos.raizAVL,metodos.leerDato());
                case 2 -> {
                    System.out.println("\nPos - Orden: ");
                    metodos.recorridopos(metodos.raizAVL);
                }
            }
        } while (opc != 0);

    }

}
