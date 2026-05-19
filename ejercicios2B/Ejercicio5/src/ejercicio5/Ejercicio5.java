
package ejercicio5;

public class Ejercicio5 {

  
    public static void main(String[] args) {
       int opc; 
       Metodos metodos = new Metodos();
       
       do{
       opc = metodos.menu();
       switch(opc){
           case 1 ->
               metodos.insertarL();
           case 2 ->
               metodos.presentarL();
           case 3 ->
               metodos.listaR();
               
       }
       }while(opc!=0);
    }
    
}
