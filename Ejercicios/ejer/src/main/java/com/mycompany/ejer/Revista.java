/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejer;

/**
 *
 * @author usuario
 */
public class Revista extends Recurso{
    private Integer numeroEdi;
    private String url;

    public Revista(Integer numeroEdi, String url, String autor, String titulo, int fecha) {
        super(autor, titulo, fecha);
        this.numeroEdi = numeroEdi;
        this.url = url;
    }

    public Integer getNumeroEdi() {
        return numeroEdi;
    }

    public String getUrl() {
        return url;
    }

    public void setNumeroEdi(Integer numeroEdi) {
        this.numeroEdi = numeroEdi;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public String toString() {
        return "Revista{" + "numeroEdi=" + numeroEdi + ", url=" + url + super.toString()+'}';
    }
    
}
