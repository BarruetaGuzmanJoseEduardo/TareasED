package Unidad;

import java.util.Collections;
import java.util.Stack;

/**
 *
 * @author Lalo
 */
public class MainStack {
    public static void main(String[] args) {
        
    Stack<String> pila= new Stack<>();
   

        //añadiendo objetos electrónicos
        System.out.println("vamos a añadir objetos a la pila");
        pila.push("dvd");
        pila.push("audífonos");
        pila.push("computadora");
        pila.push("celular");
        pila.push("televisión");
        pila.push("control");
        pila.push("consola");
        System.out.println("módem");
        //to string
        System.out.println("imprimiendo pila: " + pila);
       System.out.println("\n\n");
       
       
        //peek
        System.out.println("utilizando peek");
        System.out.println(pila.peek()); 
        System.out.println(pila);
        System.out.println("\n\n");
// eliminar

        String objeto = pila.pop();
        System.out.println("objeto eliminado: " + objeto);
        System.out.println("capacidad: " + pila.capacity());
      System.out.println("\n\n");
        //buscar
        if (pila.contains("caballo")) {
            System.out.println("la pila contiene \"bocinas\" ");
            
        }else{
        System.out.println("la pila no contiene \"bocinas\" ");
        }
        System.out.println("\n\n");
        
        
            //más operaciones
        System.out.println("primer objeto");
        System.out.println(pila.firstElement());
        System.out.println("último objeto");
        System.out.println(pila.lastElement());
        System.out.println(pila.toString());
        System.out.println("\n\n");
        
        //ordenar con Sort
System.out.println("ordenando la pila");
Collections.sort(pila);
for(String temporal: pila){
    System.out.println(temporal);
}
    System.out.println("imprimiendo la pila");
    System.out.println(pila);
System.out.println("\n\n");

        System.out.println("vaciando la pila");
        
        pila.clear();
        
        System.out.println("comprobando si la pila está vacía");
        if (pila.isEmpty()) {
            System.out.println("la pila está vacía");
        }
        System.out.println("modificando el tamaño de la pila a 15");
        pila.setSize(15);
        System.out.println("tamaño de la pila = " + pila.size());
}
    
}
