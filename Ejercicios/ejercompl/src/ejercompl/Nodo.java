/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercompl;

/**
 *
 * @author usuario
 */
public class Nodo extends Persona {

    float promedio;
    Nodo sig;

    public Nodo(int id, String nombre, char sexo, float promedio) {
        super(id, nombre, sexo);
        this.promedio = promedio;
        this.sig = null;
    }

}
