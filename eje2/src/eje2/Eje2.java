/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eje2;

/**
 *
 * @author utpl
 */
public class Eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Metodos metodos = new Metodos();

        int opc, num, ser, b, e;
        do {
            opc = metodos.menu();
            switch (opc) {
                case 1 -> {
                    System.out.println("Numero a calcular: ");
                    num = metodos.sc.nextInt();
                    System.out.println(metodos.factorial(num));
                }
                case 2 -> {
                    System.out.println("Ingrese el numero: ");
                    ser = metodos.sc.nextInt();
                    System.out.println(metodos.fibonaci(ser));

                }
                case 3 -> {
                    System.out.println("Ingrese la base: ");
                    b = metodos.sc.nextInt();
                    System.out.println("Ingrese el exponente: ");
                    e = metodos.sc.nextInt();
                    System.out.println(metodos.potencia(b, e));
                }

            }

        } while (opc != 0);
    }

}
