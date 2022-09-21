
package Unidad;

import java.util.Scanner;

/**
 *
 * @author Lalo
 */
public class Tablero {
     Casilla[][] matriz = new Casilla[10][10];
int celvivas;
int[][] matriz2 = new int[10][10];
     Scanner lector = new Scanner(System.in);
    Casilla casillam = new Casilla(false);
    Casilla casillav = new Casilla(true);
    public Tablero(int celvivas) {
       this.celvivas = celvivas;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz[i][j]= casillam;
            }

        }
        int y;
        int x;
        for (int cont = 0; cont < celvivas; cont++) {
            System.out.println("Introduzca el componente Y: ");
        y = lector.nextInt();
        System.out.println("Introduzca el componente X: ");
        x = lector.nextInt();
            matriz[y][x] = casillav;
            
            
        }
        System.out.println("tablero actual");
        System.out.println(this);
    }
    
    public int compararlados(int fila, int columna){
        int contadorvivas = 0;
        
         //arriba
        if (fila -1 >= 0) {
            if (((Casilla)matriz[fila-1][columna]).isCelviva()) {
                contadorvivas = contadorvivas+1;
            }
        }
        
        //izquierda

        if (columna -1 > -1) {
            if (((Casilla)matriz[fila][columna-1]).isCelviva()) {
                contadorvivas++;
            }
        }

         //izquierda arriba
        if (columna -1 > -1 && fila -1 > -1) {
            if (((Casilla)matriz[fila-1][columna-1]).isCelviva()) {
                contadorvivas++;
            }
        }

        //arriba derecha
        if (fila -1 > -1 && columna + 1 < 10 ) {
            if (((Casilla)matriz[fila-1][columna+1]).isCelviva()) {
                contadorvivas++;
            }
        }
        

        //derecha
        if (columna + 1 < 10 ) {
            if (((Casilla)matriz[fila][columna+1]).isCelviva()) {
                contadorvivas++;
            }
        }

        //derecha abajo
        if (columna + 1 < 10 && fila +1 < 10) {
            if (((Casilla)matriz[fila+1][columna+1]).isCelviva()) {
                contadorvivas++;
            }
        }

        //abajo
        if (fila + 1 < 10) {
            if (((Casilla)matriz[fila+1][columna]).isCelviva()) {
                contadorvivas++;
            }
        }

        
 
        //abajo izquierda
        if (fila +1 < 10 && columna -1 > -1) {
            if (((Casilla)matriz[fila+1][columna-1]).isCelviva()) {
                contadorvivas++;
            }
            
        }

        //ahora a encontrar los casos

return contadorvivas;
    }
    public void siguientegen(){
        int numvivas;
        
        Casilla[][] matriz3 = matriz;
    for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                numvivas = this.compararlados(i, j);
                
  
                matriz2[i][j] = numvivas;
                /*
                if (numvivas == 3) {
                    matriz2[i][j] = casillav;
                }
                if (numvivas > 3) {
                    matriz2[i][j] = casillam;
                }
                if (numvivas < 2) {
                    matriz2[i][j] = casillam;
                }
                if (numvivas == 2 && ((Casilla)matriz[i][j]).isCelviva()) {
                    matriz2[i][j] = casillav;
                }
*/
            }

        }
        System.out.println("matriz de contadores");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz2[i][j] + " ");
                
            }
            System.out.println("");
            
        }
    
        
        
        int buscavivas = 0;
            for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                
                buscavivas = matriz2[i][j] ;
                
                if (matriz[i][j].isCelviva() && (buscavivas == 2 || buscavivas == 3)) {
                    matriz3[i][j] = casillav;
                }
                if (buscavivas < 2) {
                    matriz3[i][j] = casillam;
                }
                if (matriz[i][j].isCelviva() && buscavivas > 3) {
                    matriz3[i][j] = casillam;
                }
                if (matriz[i][j].isCelviva() == false && buscavivas == 3) {
                    matriz3[i][j] = casillav;
                }

            }


        }
            System.out.println("siguiente generación");
            matriz = matriz3;
        System.out.println(this.toString());
        
    }

    @Override
    public String toString() {
        String mensajito = "";
        String mensajín = "";
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                mensajín = mensajín + matriz[i][j] + " ";
            }
            mensajín = mensajín + "\n";
        }
        return mensajín;
    }

}
