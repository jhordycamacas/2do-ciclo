
package pruebtarea;


public class Nodo {

    int id;
    String nombre;
    String sexo;
    double promedio;
    Nodo izq;
    Nodo der;

    public Nodo(int id, String nombre, String sexo, double promedio) {
        this.id = id;
        this.nombre = nombre;
        this.sexo = sexo;
        this.promedio = promedio;
        this.izq = null;
        this.der = null;
    }
}