/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication31;

import java.util.PriorityQueue;

/**
 *
 * @author usuario
 */
public class JavaApplication31 {

    public static void main(String[] args) {
        PriorityQueue<Integer> cola = new PriorityQueue<>();
        
        cola.add(34);
        cola.add(2);
        cola.add(6);
        cola.add(5);
        int num = cola.poll();
        
        System.out.println(num);

    }

}
