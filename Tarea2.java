package Unidad;

/**
 *
 * @author Lalo
 */
public class Tarea2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) { 

        System.out.println("programa del arregloADT");
        ArregloADT arregloADT = new ArregloADT(5);
        arregloADT.setelemento(0, "hola");
        arregloADT.setelemento(1, "mundo");
        arregloADT.setelemento(2, "en");
        arregloADT.setelemento(3, "un");
        arregloADT.setelemento(4, "ADT");
        System.out.println("imprimiendo arreglo");
        System.out.println(arregloADT.toString());
        System.out.println("el tamaño del arreglo es:");
        System.out.println(arregloADT.gettamanio());
        System.out.println("imprimiendo índice 2");
        System.out.println(arregloADT.getelemento(2));
        System.out.println("imprimiendo índice 4");
        System.out.println(arregloADT.getelemento(4));
        System.out.println("limpiando arreglo");
        arregloADT.limpiar();       
        System.out.println(arregloADT.toString());
    }
}
