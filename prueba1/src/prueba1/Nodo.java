/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba1;

/**
 *
 * @author usuario
 */
public class Nodo {

    int valor;
    int fila, columna;
    Nodo izq, der;

    public Nodo(int valor, int fila, int columna) {
        this.valor = valor;
        this.fila = fila;
        this.columna = columna;
        this.izq = null;
        this.der = null;
    }
}

