package pilasarreglos;

public class PilasArreglos {

    public static void main(String[] args) {
        Metodos1 metodos = new Metodos1();

        int opc;
        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.operacionPush();
                case 2 ->
                    metodos.operacionPop();

            }
        } while (opc != 0);
    }

}
