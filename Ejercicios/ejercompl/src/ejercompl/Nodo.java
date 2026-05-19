
package ejercompl;


public class Nodo extends Persona {

    float promedio;
    Nodo sig;

    public Nodo(int id, String nombre, char sexo, float promedio) {
        super(id, nombre, sexo);
        this.promedio = promedio;
        this.sig = null;
    }

}
