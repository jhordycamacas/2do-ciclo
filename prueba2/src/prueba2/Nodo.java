/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba2;

/**
 *
 * @author usuario
 */
public class Nodo {

    int valor;
    int cont;
    Nodo izq;
    Nodo der;

    public Nodo(int valor) {
        this.valor = valor;
        this.cont = 1;
        this.izq = null;
        this.der = null;
    }
}

