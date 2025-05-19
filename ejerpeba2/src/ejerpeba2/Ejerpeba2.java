/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerpeba2;

/**
 *
 * @author usuario
 */
public class Ejerpeba2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n = 4;
        try {
            int resultado = multiplicarDeNaUno(n);
            System.out.println("La multiplicación de " + n + " a 1 es: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int multiplicarDeNaUno(int n) {
        if (n < 1) {
            throw new IllegalArgumentException("No se permiten números negativos ni cero.");
        }
        if (n == 1) {
            return 1;
        }
        return n * multiplicarDeNaUno(n - 1);
    }

}
