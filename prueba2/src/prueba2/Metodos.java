package prueba2;

import java.util.Scanner;

public class Metodos {

    Scanner sc;
    Nodo raiz;
    int[][] matriz;

    public Metodos(int a) {
        this.sc = new Scanner(System.in);
        this.raiz = null;
        this.matriz = new int[a][a];

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Llenar matriz: ");
        System.out.println("[2] Presentar matriz: ");
        System.out.println("[3] Enviar datos a un arbol: ");
        System.out.println("[4] Presentar arbol:");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();
    }

    public void llenarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("Ingrese el valor para [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }
    }

    public void presentarMatriz() {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                System.out.print(matriz[i][j] + "  ");
            }
            System.out.println();
        }
    }

    public Nodo insertar(Nodo actual, int valor) {

        if (actual == null) {
            Nodo nuevo = new Nodo(valor);
            return nuevo;
        }

        if (valor < actual.valor) {
            actual.izq = insertar(actual.izq, valor);
        } else if (valor > actual.valor) {
            actual.der = insertar(actual.der, valor);
        } else {
            actual.cont ++;
        }

        return actual;
    }

    public void cambiarDatos() {

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[0].length; j++) {
                raiz = insertar(raiz, matriz[i][j]);
            }
        }

    }

    public boolean apuntaNulo(Nodo actual) {
        return actual == null;
    }

    public void recorridoin(Nodo actual) {
        if (!apuntaNulo(actual)) {
            recorridoin(actual.izq);
            System.out.printf("Valor: %d - Repeticiones: %d\n", actual.valor, actual.cont);
            recorridoin(actual.der);
        }

    }

    public void presentarArbol() {
        System.out.println("DATOS DESDE EL ARBOL: ");
        recorridoin(raiz);

    }
}
