package ejercicio12;

public class Ejercicio12 {

    public static void main(String[] args) {
        Metodos metodos = new Metodos();
        int opc;
        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.insertar();
                case 2 ->

                    metodos.mitad();
                case 3 ->
                    metodos.presentar1();
                case 4 ->
                    metodos.presentar2();
            }

        } while (opc != 0);
    }

}
