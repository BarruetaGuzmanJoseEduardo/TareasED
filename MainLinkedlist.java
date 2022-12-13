package Unidad;

/**
 *
 * @author Lalo
 */


import java.util.*;
public class MainLinkedlist {
public static void main(String args[]) {

LinkedList<String> lista = new LinkedList<String>();
    System.out.println("trataremos la lista ligada como una cadena");
//llenando la lista
lista.add("eslabón2");
lista.add("eslabón3");
lista.add("eslabón4");
lista.add("eslabón5");
lista.add("eslabón6");


//imprimiendo lista
System.out.println("lista ligada: " +lista);
    System.out.println("\n\n");
    
    System.out.println("comprobando si la lista está vacía");
    if (lista.isEmpty()) {
        System.out.println("la lista está vacía");
    } else {
        System.out.println("la lista no está vacía");
    }
    System.out.println("\n\n");
    
//agregando al prinicipio y final de la lista
System.out.println("vamos a agregar un objeto al inicio y al final");
lista.addFirst("Primer eslabón");
lista.addLast("Último eslabón");
System.out.println("así está la lista después de agregar los objetos: " +lista);
System.out.println("\n\n");


//tamaño
System.out.println("imprimiendo tamaño de la lista");
System.out.println("tamaño de lista: " + lista.size() );
System.out.println("\n\n");


//buscando un elemento
System.out.println("vamos a buscar el elemento eslabón30");
if (lista.contains("eslabón30")){   
System.out.println("Ese elemento está en la lista");
}else{
    
System.out.println("Ese elemento no está en la lista");
}
System.out.println("\n\n");



//usando método get
System.out.println("usando el get para obtener el objeto del índice 0");
Object item = lista.get(0);
System.out.println("Primer item: " +item);
System.out.println("\n\n");

//modificando un índice
lista.set(0, "nuevo eslabón");
Object item2 = lista.get(0);
System.out.println("Primer item despues de modificarse : " + item2);
    System.out.println(lista);
    System.out.println("\n\n");

//borrando en primer y último índice
System.out.println("borrando primer y último índice");
lista.removeFirst();
lista.removeLast();
System.out.println("borramos el primer y último índice: \n"+lista);
System.out.println("\n\n");

//eliminando con un índice
lista.add(0, "Nuevo item");
lista.remove(2);
System.out.println("lista: " +lista); 
System.out.println("\n\n");


//la lista está vacía?



//posición de un item
System.out.println("vamos a encontrar la posición de un objeto");
System.out.println("posición del eslabón2");
lista.indexOf("eslabón2");
System.out.println("\n\n");

    System.out.println("modificando un objeto");
lista.set(4, "eslabón 5 nuevo");
    System.out.println("imprimiendo lista actualizada");
    System.out.println("lista actualizada");
    System.out.println(lista);
    
lista.removeAll(lista);
    System.out.println("lista vaciada");
    System.out.println(lista);
}

}