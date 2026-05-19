/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejer;

/**
 *
 * @author usuario
 */
public class Libro extends Recurso{
    private Integer isbn;
    private Integer numeroImpresiones;

    public Libro(Integer isbn, Integer numeroImpresiones, String autor, String titulo, int fecha) {
        super(autor, titulo, fecha);
        this.isbn = isbn;
        this.numeroImpresiones = numeroImpresiones;
    }

    public void setIsbn(Integer isbn) {
        this.isbn = isbn;
    }

    public void setNumeroImpresiones(Integer numeroImpresiones) {
        this.numeroImpresiones = numeroImpresiones;
    }

    public Integer getIsbn() {
        return isbn;
    }

    public Integer getNumeroImpresiones() {
        return numeroImpresiones;
    }

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", numeroImpresiones=" + numeroImpresiones + super.toString()+'}';
    }

  
    
}
