
package Unidad;
public class Lista_Doble<T> {

    Nodo_Doble<T> head;
    int rozmiar;

    public Lista_Doble() {
        this.head = null;
        this.rozmiar = 0;
    }

    public boolean estáVacía() {
        return this.head == null;
    }

    public int getRozmiar() {
        return rozmiar;&
    }

    public void agregarAlFinal(T valor) {
        Nodo_Doble<T> Nuevo = new Nodo_Doble(valor);
        if (this.estáVacía()) {
            this.head = Nuevo;
        } else {
            Nodo_Doble<T> Aux = this.head;
            while (Aux.getsiguiente() != null) {
                Aux = Aux.getsiguiente();
                Nuevo.setant(Aux);
            }
            Aux.setsiguiente(Nuevo);
 Aux = null;
            Nuevo = null;
        }
    }

    public void agregarAlInicio(T valor) {
        Nodo_Doble<T> Aux = new Nodo_Doble(valor);
        if (this.estáVacía()) {
            this.head = Aux;
        } else {
            Aux.setsiguiente(head);
            head = Aux;
        }
    }

    public void agregarDespuesDe(int posición, T valor) {
        Nodo_Doble Aux = new Nodo_Doble(valor);
        Nodo_Doble Tem = this.head;
        for (int contador = 1; contador <= posición - 1; contador++) {
            Tem = Tem.getsiguiente();
        }
        Aux.setsiguiente(Tem.getsiguiente());
        Tem.setsiguiente(Aux);
        Tem.setant(Tem.getant());
    }

    public void eliminar(int posición) {
        Nodo_Doble Aux = head;
        if (this.estáVacía()) {
            System.out.println("Lista vacia, llénala primero alcornoque");
        } else {
            if (posición > head.toString().length()) {
                System.out.println("La posición introducida no existe en esta lista, alcornoque");
            } else {
                for (int contador = 1; contador < posición - 1; contador++) {
                    Aux = Aux.getsiguiente();
                }
            }
        }

        Aux.setsiguiente(Aux.getsiguiente().getsiguiente());
        Aux.setant(Aux.getant());
    }

    public void eliminarElPrimero() {
        Nodo_Doble Aux = head;
        if (this.estáVacía()) {
            head = Aux;
        } else {
            head = Aux.getsiguiente();
        }
    }

    public void eliminarElFinal() {
        Nodo_Doble Aux = head;
        if (this.estáVacía()) {
            head = Aux;
        } else {
            while (Aux.getsiguiente().getsiguiente() != null) {
                Aux = Aux.getsiguiente();
            }
            Aux.setsiguiente(null);
        }
    }

    public int buscarValor(T valor) {
        Nodo_Doble Aux = head;
        int posición = 1;
       
            while (Aux.getDato() != valor) {
                
                Aux = Aux.getsiguiente();
                posición++;
                if (Aux ==null) {
                System.out.println("no pudimos encontrar el valor");
                return 0;
              
               
            }
                
            }
            System.out.println("encontramos el valor en la posición");
        return posición;
        
    }

   public void actualizarValor(T valor, T actualizado) {
        Nodo_Doble Aux = head;
      Aux = head;


       
            while (Aux.getDato() != valor) {
                System.out.println(Aux);
                
                Aux = Aux.getsiguiente();
                
                if (Aux ==null) {
                System.out.println("no pudimos encontrar el valor");
return;
              
               
            } if(Aux.getDato()==valor){
                System.out.println("encontramos el valor para actualizar");
  Aux.setDato(actualizado);
                }
            }
            System.out.println("encontramos el valor para actualizar");
  Aux.setDato(actualizado);
        
    }

    public void transversal() {
        Nodo_Doble nodo_actual = this.head;
        while (nodo_actual != null) {
            System.out.print(nodo_actual);
            nodo_actual = nodo_actual.getsiguiente();
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        Lista_Doble head = new Lista_Doble();
        head.agregarAlInicio(42);
        head.agregarAlFinal(112);
        head.agregarAlFinal(2455);
        head.agregarAlFinal(312);
        head.agregarAlFinal(27);
        head.agregarAlFinal(12);
        head.transversal();
        head.actualizarValor(312, 4);
        head.eliminarElFinal();
        head.transversal();
        head.eliminarElPrimero();
        head.transversal();
        head.eliminar(3);
    
        head.transversal();
        head.agregarDespuesDe(2, 145);
        head.transversal();
        head.agregarAlFinal(12);
        head.agregarAlInicio(56);
        head.agregarAlFinal(3);
        head.transversal();
        System.out.println(head.buscarValor(56));
    }

}