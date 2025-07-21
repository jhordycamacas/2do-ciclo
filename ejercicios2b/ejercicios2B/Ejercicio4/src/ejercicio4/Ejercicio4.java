
package ejercicio4;

public class Ejercicio4 {


    public static void main(String[] args) {
        
    
        Metodos metodos = new Metodos();
        int opc;

        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 ->
                    metodos.insertar1();
                case 2 ->
                    metodos.insertar2();
                case 3 ->
                    metodos.combinar();
                case 4 ->
                    metodos.presentar1();
                case 5 ->
                    metodos.presentar2();
                case 6 -> 
                    metodos.presentar3();
            }

        } while (opc != 0);
    }

}