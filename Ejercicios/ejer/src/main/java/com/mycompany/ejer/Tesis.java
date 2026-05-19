/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejer;

/**
 *
 * @author usuario
 */
public class Tesis extends Recurso{
    private String uni;
    private int fecha;

    public Tesis(String uni, int fecha1, String autor, String titulo, int fecha) {
        super(autor, titulo, fecha);
        this.uni = uni;
        this.fecha = fecha1;
    }

    public void setUni(String uni) {
        this.uni = uni;
    }

    public void setFecha1(int fecha) {
        this.fecha = fecha;
    }

    public String getUni() {
        return uni;
    }

    public int getFecha1() {
        return fecha;
    }

    @Override
    public String toString() {
        return "Tesis{" + "uni=" + uni + ", fecha=" + fecha + super.toString()+'}';
    }
    

    
    
}
