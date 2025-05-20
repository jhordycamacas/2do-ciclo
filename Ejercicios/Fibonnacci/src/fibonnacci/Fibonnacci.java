/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package fibonnacci;

/**
 *
 * @author usuario
 */
public class Fibonnacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int limite = 10; 
        System.out.print("Serie Fibonacci hasta " + limite + " elementos: ");
        for (int i = 0; i < limite; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1)
            return n;
        else 
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}