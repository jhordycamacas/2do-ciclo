package arboles;

import java.util.Scanner;

public class Metodos {

    Scanner sc;
    Nodo raiz;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.raiz = null;

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Insertar datos: ");
        System.out.println("[2] Presentar recorridos(pre-in-pos): ");
        System.out.println("[3] Eliminar dato: ");
        System.out.println("[0] Abandonar prograna: ");
        return sc.nextInt();

    }

    public int leerDato() {
        int dato;
        System.out.println("Ingrese el dato: ");
        dato = sc.nextInt();
        return dato;
    }

    public boolean apuntaNulo(Nodo actual) {
        return actual == null;
    }

    public Nodo inserccion(Nodo actual, int dato) {

        if (apuntaNulo(actual)) {
            Nodo nuevo = new Nodo(dato);
            return nuevo;
        } else {
            if (dato > actual.dato) {
                actual.der = inserccion(actual.der, dato);

            } else {
                actual.izq = inserccion(actual.izq, dato);
            }

        }
        return actual;
    }

    public void insertar() {
        raiz = inserccion(raiz, leerDato());

    }

    public void recorridoin(Nodo actual) {
        if (!apuntaNulo(actual)) {
            recorridoin(actual.izq);
            System.out.print(actual.dato + " ");
            recorridoin(actual.der);
        }

    }

    public void recorridopre(Nodo actual) {
        if (!apuntaNulo(actual)) {
            System.out.print(actual.dato + " ");
            recorridopre(actual.izq);
            recorridopre(actual.der);
        }
    }

    public void recorridopos(Nodo actual) {
        if (!apuntaNulo(actual)) {
            recorridopos(actual.izq);
            recorridopos(actual.der);
            System.out.print(actual.dato + " ");
        }
    }

    /*SOLUCION EXPOSICION
    public void eliminar() {
        raiz = eliminarNodo(raiz, leerDato());
    }

    public Nodo eliminarNodo(Nodo actual, int dato) {
        if (apuntaNulo(actual)) {
            System.out.println("Error...");
            return null;
        }

        if (dato < actual.dato) {
            actual.izq = eliminarNodo(actual.izq, dato);
        } else if (dato > actual.dato) {
            actual.der = eliminarNodo(actual.der, dato);
        } else {
            // Caso 1: 
            if (actual.izq == null && actual.der == null) {
                return null;
            }

            // Caso 2:
            if (actual.izq == null) {
                return actual.der;
            } else if (actual.der == null) {
                return actual.izq;
            }

        // Caso 3:
            Nodo nuevo = encontrarMinimo(actual.der);
            actual.dato = nuevo.dato;
            actual.der = eliminarNodo(actual.der, nuevo.dato);
        }

        return actual;
    }

    public Nodo encontrarMinimo(Nodo actual) {
        while (actual.izq != null) {
            actual = actual.izq;
        }
        return actual;
    }*/
    //SOLUCION CLASE
    public void eliminar() {
        raiz = eliminacion(raiz, leerDato());
    }

    public Nodo eliminacion(Nodo actual, int dato) {
        if (!apuntaNulo(actual)) {
            if (dato < actual.dato) {
                actual.izq = eliminacion(actual.izq, dato);
            } else if (dato > actual.dato) {
                actual.der = eliminacion(actual.der, dato);
            } else {
                Nodo aux = actual;
                if (aux.izq == null) {
                    return aux.der;
                } else if (aux.der == null) {
                    return aux.izq;
                } else {
                    aux.dato = reemplazar(aux);
                }
            }
        } else {
            System.out.println("No existe el elemento...");

        }
        return actual;
    }

    public int reemplazar(Nodo actual) {
        Nodo p = actual;
        Nodo a = actual.izq;
        while (a.der != null) {
            p = a;
            a = a.der;
        }
        int aux = a.dato;
        if (p == actual) {
            p.izq = a.izq;

        } else {
            p.der = a.izq;
        }
        return aux;
    }
}
