/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercompl;

/**
 *
 * @author usuario
 */
public class Estudiantes extends Persona {

    float[] notas;

    public Estudiantes(int id, String nombre, char sexo, float[] notas) {
        super(id, nombre, sexo);
        this.notas = notas;
    }

    public float getPromedio() {
        float aux = 0;
        for (int i = 0; i < notas.length; i++) {
            aux = aux + notas[i];
        }
        aux = aux / notas.length;
        return aux;
    }

}
