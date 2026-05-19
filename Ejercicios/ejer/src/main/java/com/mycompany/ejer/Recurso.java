/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejer;

/**
 *
 * @author usuario
 */
public class Recurso {
    private String autor;
    private String titulo;
    private int fecha;

    public Recurso(String autor, String titulo, int fecha) {
        this.autor = autor;
        this.titulo = titulo;
        this.fecha = fecha;
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getFecha() {
        return fecha;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Recurso{" + "autor=" + autor + ", titulo=" + titulo + ", fecha=" + fecha + '}';
    }
    
    
}
