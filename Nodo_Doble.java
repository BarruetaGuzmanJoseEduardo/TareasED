
package Unidad;

public class Nodo_Doble<T> {

    private T datos;
    private Nodo_Doble<T> siguiente;
    private Nodo_Doble<T> ant;


    public Nodo_Doble() { 
    }

    public Nodo_Doble(T dato) { 
        this.datos = dato;
    }

    public Nodo_Doble(T dato, Nodo_Doble<T> siguiente, Nodo_Doble<T> Ant) {
         this.siguiente = siguiente;
       this.datos = dato;
        this.ant = Ant;
    }

//Métodos de acceso
    public Nodo_Doble<T> getsiguiente() {
        return siguiente;
    }

    public void setsiguiente(Nodo_Doble<T> siguiente) {
        this.siguiente = siguiente;
    }
    
    public Nodo_Doble<T> getant(){
        return ant;
    }
    
    public void setant(Nodo_Doble<T> Ant){
        this.ant = Ant;
    }

    public T getDato() {
        return datos;
    }

    public void setDato(T dato) {
        this.datos = dato;
    }

    //toString()
    @Override
    public String toString() {
        return "|" + datos + "| - ";
    }

    public String mostrarTodo() {
        return "[anterior: "+ this.getant() + "] - [Dato= " + datos + "] - [siguiente= " + this.getsiguiente() + "]";
    }
}