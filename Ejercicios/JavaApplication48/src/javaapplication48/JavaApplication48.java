/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication48;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author usuario
 */
public class JavaApplication48 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
        Scanner sc = new Scanner (System.in);
        /*Persona persona = new Persona();
        persona.setNombre("Juan Carrion");
        persona.setDni(110938983);
        persona.setEdad(32);
        persona.setCorreo("juan12@gmial.com");
        //persona.MostrarDatos();
        //creamos el objeto del archivo serializado
        FileOutputStream fileOutputStream = new FileOutputStream("persona.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(persona);
        objectOutputStream.close();
        //leemos el objeto del archivo serializado
        FileInputStream fileInputStream = new FileInputStream("persona.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Persona conductorFichero = (Persona) objectInputStream.readObject();

        objectInputStream.close();
        System.out.println(conductorFichero);*/
        int lim;
        System.out.println("Ingrese el numero de materias: ");
        lim = sc.nextInt();
        sc.nextLine();
        Estudiante estudiante = new Estudiante(lim);
        System.out.println("Ingrese el nombre del estudiante: ");
        estudiante.setNombre(sc.nextLine());
        System.out.println("Ingrese el numero de ciclo en el que se encuentra: ");
        estudiante.setCiclo(sc.nextInt());
        sc.nextLine();
        estudiante.setMaterias(estudiante.leerMaterias());
        estudiante.setNotas(estudiante.leerNotas());
        estudiante.setPromedio(estudiante.calcularPromedio());
        estudiante.setNumApro(estudiante.numAprobados());
        estudiante.setNumRepro(estudiante.numReprobados());
        //estudiante.mostrarDatos();
        
        FileOutputStream fileOutputStream = new FileOutputStream("estudiante.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
        objectOutputStream.writeObject(estudiante);
        objectOutputStream.close();
        
        FileInputStream fileInputStream = new FileInputStream("estudiante.txt");
        ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

        Estudiante leerstring = (Estudiante) objectInputStream.readObject();

        objectInputStream.close();
        System.out.println(leerstring);
        
        
        
       
    }

}
