package Unidad;

/**
 *
 * @author Lalo
 */
import java.util.*;

public class MainArraylist {

public static void main(String args[]) {

ArrayList<String> listaA = new ArrayList<String>();           

// Agregando objetos a la lista, útiles
listaA.add("goma");
listaA.add("lápiz");
listaA.add("pluma");
listaA.add("color amarillo");
listaA.add("tijeras");
        //supongamos que olvidamos añadir un objeto, podemos incluirlo con un índice
        listaA.add(4, "cuaderno");

// ahora podemos imprimirlo usando su método to String, que viene implícito
//en la llamada a la lista desde el print
System.out.println("La lista tiene los siguientes objetos: " + listaA);
System.out.println("\n\n");


//limpiando el arraylist con clear
listaA.clear();
System.out.println("el arraylist ahora está vacío: " + listaA);
    System.out.println("comprobemos esto con su método isEmpty");
// vamos a comprobar si el arreglo está vacío
if (listaA.isEmpty()) {
        System.out.println("efectivamente, el arraylist está vacío");
    } else {
    System.out.println("no, el arraylist no está vacío");
    }
    System.out.println("\n\n");
//llenando la listaA con comida
System.out.println("llenando la lista con comida");
listaA.add("chilaquiles");
listaA.add("enchiladas");
listaA.add("pozole");
listaA.add("mole");
listaA.add("zapato");
    System.out.println(listaA);
    //eliminando elemento
    System.out.println("eliminando elemento que no pertenece a la lista");
        listaA.remove(listaA.size()-1);
        System.out.println(listaA);
        
System.out.println("\n\n");

// El último indice de un objeto
System.out.println("obteniendo último índice de un objeto");
System.out.println("El último índice del mole es: " + listaA.lastIndexOf("mole"));
System.out.println("\n\n");


//Obtiene la casilla de un objeto
System.out.println("obteniendo la casilla de un objeto");
System.out.println("El índice del mole es: " + listaA.indexOf("mole"));
System.out.println("\n\n");

// clonando la lista
System.out.println("clonando la lista");
Object clon = listaA.clone();        
System.out.println("lista clonada: " + clon);
System.out.println("\n\n");


// buscando un objeto
System.out.println("buscando el objeto camotes");
if (listaA.contains("camotes")) {
        System.out.println("hay camotes");
    } else {
    System.out.println("no hay camotes");
    }

System.out.println("\n\n");

//ordenar con Sort
System.out.println("ordenando el arraylist");
Collections.sort(listaA);
for(String temporal: listaA){
    System.out.println(temporal);
}
    System.out.println("imprimiendo arraylist ordenado alfabéticamente");
    System.out.println(listaA);
System.out.println("\n\n");

// Obtener un objeto con un índice
System.out.println("obteniendo un elemento con el índice 1");
System.out.println("El objeto en el índice 1 es: " + listaA.get(1));
System.out.println("\n\n");


    System.out.println("impresión final");
System.out.println("El arraylist tiene los siguintes objetos: " + listaA);
    System.out.println("el tamaño del arraylist es");
    System.out.println(listaA.size());
}

}