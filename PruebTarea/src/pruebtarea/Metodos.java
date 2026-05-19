package pruebtarea;

import java.util.Scanner;

public class Metodos {

    Scanner sc;
    Nodo raizh;
    Nodo raizm;
    Alumno[] aula;

    public Metodos(int lim) {
        this.sc = new Scanner(System.in);
        this.raizh = null;
        this.raizm = null;
        this.aula = new Alumno[lim];

    }

    public int menu() {
        System.out.println("\nMENU PRINCIPAL: ");
        System.out.println("[1] Llenar datos en arreglo: ");
        System.out.println("[2] Enviar datos al arbol: ");
        System.out.println("[3] Presentar hombres que aprueban: ");
        System.out.println("[4] Presentar hombres que reprueban: ");
        System.out.println("[5] Presentar mujeres que aprueban: ");
        System.out.println("[6] Presentar mujeres que reprueban: ");
        System.out.println("[0] Abandonar programa: ");
        return sc.nextInt();
    }

    public void insertarDatos() {
        for (int i = 0; i < aula.length; i++) {
            System.out.println("Ingrese el id del estudiante(" + (i + 1) + "): "
                    + "");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese el nombre: ");
            String nombre = sc.nextLine();
            System.out.println("Ingrese el sexo(F/M): ");
            String sexo = sc.nextLine();
            System.out.println("Ingrese nota: ");
            double nota1 = sc.nextDouble();
            System.out.println("Ingrese nota: ");
            double nota2 = sc.nextDouble();
            System.out.println("Ingrese nota: ");
            double nota3 = sc.nextDouble();

            aula[i] = new Alumno(id, nombre, sexo, nota1, nota2, nota3);
        }
    }

    public void enviarArbol() {
        double prom;
        double aux;
        for (int i = 0; i < aula.length; i++) {
            aula[i].sexo = aula[i].sexo.toUpperCase();
            aux = (aula[i].nota1 + aula[i].nota2 + aula[i].nota3);
            prom = (aux / 3);
            if (aula[i].sexo.equals("F")) {
                raizm = insertarNodo(raizm, aula[i].id, aula[i].nombre, 
                        aula[i].sexo, prom);

            } else if (aula[i].sexo.equals("M")) {
                raizh = insertarNodo(raizh, aula[i].id, aula[i].nombre, 
                        aula[i].sexo, prom);
            }
        }

    }

    public Nodo insertarNodo(Nodo actual,int id,String nom,String sexo,double prom) {
        if (actual == null) {
            Nodo nuevo = new Nodo(id, nom, sexo, prom);
            return nuevo;
        } else if (id < actual.id) {
            actual.izq = insertarNodo(actual.izq, id,
                    nom, sexo, prom);
        } else {
            actual.der = insertarNodo(actual.der, id,
                    nom, sexo, prom);
        }
        return actual;
    }

    public void presentarHombreRepro() {
        System.out.println("\nREPROBADOS - HOMBRES:");
        recorrerReprobados(raizh);
    }

    public void presentarHombreApro() {
        System.out.println("\nAPROBADOS - HOMBRES:");
        recorrerAprobados(raizh);
    }

    public void presentarMujeresRepro() {

        System.out.println("\nREPROBADOS - MUJERES:");
        recorrerReprobados(raizm);
    }

    public void presentarMujeresApro() {

        System.out.println("\nAPROBADOS - MUJERES:");
        recorrerAprobados(raizm);
    }

    public void recorrerAprobados(Nodo actual) {
        if (actual != null) {
            recorrerAprobados(actual.izq);
            if (actual.promedio >= 7) {
                System.out.printf("\nId: %d\nNombre: %s\nSexo: %s\nPromedio: "
                        + "%.2f\n",
                        actual.id, actual.nombre, actual.sexo, actual.promedio);
                System.out.println("--------------------------");
            }
            recorrerAprobados(actual.der);
        }
    }

    public void recorrerReprobados(Nodo actual) {
        if (actual != null) {
            recorrerReprobados(actual.izq);
            if (actual.promedio < 7) {
                System.out.printf("\nId: %d\nNombre: %s\nSexo: %s\nPromedio: "
                        + "%.2f\n",
                        actual.id, actual.nombre, actual.sexo, actual.promedio);
                System.out.println("--------------------------");
            }
            recorrerReprobados(actual.der);
        }
    }
}
