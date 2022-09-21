
package Unidad;

/**
 *
 * @author Lalo
 */
public class PruebaCel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Casilla casilla = new Casilla(true);
        Casilla casilla2 = new Casilla(false);
        System.out.println(casilla);
        System.out.println(casilla2);
        int generacionespedidas = 10;
        System.out.println("ahora el tablero");
        Tablero tablero = new Tablero(4);
        
        System.out.println(tablero);
        for (int contador = 0; contador < generacionespedidas; contador++) {
            System.out.println("calculando la siguiente generación");
            tablero.siguientegen();
            
        }
        
    }
    
}
