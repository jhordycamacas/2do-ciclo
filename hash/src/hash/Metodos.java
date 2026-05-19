package hash;

import java.util.Scanner;

public class Metodos {

    Nodo[] aula;
    Scanner sc;

    public Metodos(int lim) {
        this.sc = new Scanner(System.in);
        this.aula = new Nodo[lim];
        for (int i = 0; i < aula.length; i++) {
            aula[i] = null;
        }

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Insertar: ");
        System.out.println("[2] Recorrer: ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();

    }

    public int fHash(String nom) {
        int suma = 0;
        for (int i = 0; i < nom.length(); i++) {
            suma += (int) nom.charAt(i);
        }
        return (suma % aula.length);
    }

    public void insertaHash(int id, String nom, int key) {
        Nodo nuevo = new Nodo(id, nom);
        if (aula[key] == null) {
            aula[key] = nuevo;
        } else {
            Nodo actual = aula[key];
            while (actual.sig != null) {
                actual = actual.sig;
            }
            actual.sig = nuevo;
        }

    }

    public void insertar() {
        int id;
        String nombre;
        int key;
        System.out.println("Digite el id: ");
        id = sc.nextInt();
        sc.nextLine();
        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();

        key = fHash(nombre);
        insertaHash(id, nombre, key);

    }

    public void recorrer() {
        for (int i = 0; i < aula.length; i++) {
            if (aula[i] != null) {
                Nodo actual = aula[i];

                while (actual != null) {

                    System.out.print(actual.nombre + " ---- ");
                    actual = actual.sig;
                }
                System.out.println("null");
            } else {
                System.out.println("posicion " + i + " null");
            }

        }
    }

}
