/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author usuario
 */
public class Ejer {

    public static void main(String[] args) {
        System.out.println("POLIMORFISMO");
        Recurso libro = new Libro(2,500,"Pepe","El principito",2007);
        Recurso revista = new Revista (5,"comunismotxt.com","Luis","Comunismo desde 1",2008);
        Recurso tesis = new Tesis("UTPL",2017,"Jesus","IA",2017);
        
        List <Recurso> lista = new ArrayList<>();
        lista.add(libro);
        lista.add(revista);
        lista.add(tesis);
        
        for(Recurso p:lista){
            System.out.println(p.toString());
        
        }
        
    }
}
