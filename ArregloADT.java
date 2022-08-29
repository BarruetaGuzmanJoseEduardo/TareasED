package Unidad;

import java.util.ArrayList;

/**
 *
 * @author Lalo
 */
public class ArregloADT {
    int tamanio;
    ArrayList<Object> listaGenérica = new ArrayList(this.tamanio);
    //usé los mismos métodos del arraylist, aunque también se pudo haber hecho
    //con métodos reinventados en un array normal, pero no sería dinámico
    public ArregloADT(int tamanio){
    this.tamanio = tamanio;
        System.out.println("Arreglo generado con un tamaño de " + tamanio + " casillas");
 
        for (int i = 0; i < tamanio; i++) {
            listaGenérica.add(null);      
        }

        System.out.println(listaGenérica);
    
    }
    
    public int gettamanio() {       
       return listaGenérica.size();
    }
    
    public void setelemento(int índice, Object objeto) {
        listaGenérica.set(índice, objeto);        
    }
    
    public Object getelemento(int índice) {
        return listaGenérica.get(índice);        
    }
    
    public void limpiar(){
    for (int i = 0; i < tamanio; i++) {
            listaGenérica.set(i, null);      
        }
    }
    @Override
    public String toString(){
    return listaGenérica.toString();
    }
}
