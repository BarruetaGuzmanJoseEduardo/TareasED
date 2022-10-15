/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Unidad;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Laberinto {
 static String[][] datosCSV = deCSVaMatriz("C:/Users/laloe/Downloads/maze.csv");
    final static char C = ' ', X = 'x', S = 's', E = 'e', V = '.';

    final static int START_I = 0, START_J = 0;
    final static int END_I = 9, END_J = 9;
    
    private static final char[][] laberinto = new char[10][10];

    public int tamLaberinto() {
        return laberinto.length;
    }

    public void imprimir() {
        for (int i = 0; i < tamLaberinto(); i++) {
            for (int j = 0; j < tamLaberinto(); j++) {
                System.out.print(laberinto[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }
    }

    public char marcar(int i, int j, char valor) {
        assert (isInMaze(i, j));
        char tmp = laberinto[i][j];
        laberinto[i][j] = valor;
        return tmp;
    }

    public char marcar(MazePos pos, char value) {
        return marcar(pos.i(), pos.j(), value);
    }

    public boolean isMarked(int i, int j) {
        assert (isInMaze(i, j));
        return (laberinto[i][j] == V);
    }

    public boolean isMarked(MazePos pos) {
        return isMarked(pos.i(), pos.j());
    }

    public boolean isClear(int i, int j) {
        assert (isInMaze(i, j));
        return (laberinto[i][j] != X && laberinto[i][j] != V);
    }

    public boolean isClear(MazePos pos) {
        return isClear(pos.i(), pos.j());
    }

    //true if cell is within maze 
    public boolean isInMaze(int i, int j) {
        if (i >= 0 && i < tamLaberinto() && j >= 0 && j < tamLaberinto()) {
            return true;
        } else {
            return false;
        }
    }

    //true if cell is within maze 
    public boolean isInMaze(MazePos pos) {
        return isInMaze(pos.i(), pos.j());
    }

    public boolean isFinal(int i, int j) {
        return (i == Laberinto.END_I && j == Laberinto.END_J);
    }

    public boolean isFinal(MazePos pos) {
        return isFinal(pos.i(), pos.j());
    }

    @Override
    public char[][] clone() {

        char[][] mazeCopy = new char[tamLaberinto()][tamLaberinto()];
        for (int i = 0; i < tamLaberinto(); i++) {
            System.arraycopy(laberinto[i], 0, mazeCopy[i], 0, tamLaberinto());
        }
        return mazeCopy;
    }

    public void restaurar(char[][] savedMaze) {
        for (int i = 0; i < tamLaberinto(); i++) {
            for (int j = 0; j < tamLaberinto(); j++) {
                laberinto[i][j] = savedMaze[i][j];
            }
        }
    }

    public static void main(String[] args) {
 Scanner escritor = new Scanner(System.in);

     

        if (datosCSV != null) { //para comprobar que sí se lea el archivo

            System.out.println("Archivo leído");

            for (int fila = 0; fila < 10; fila++) {

                if (datosCSV[fila][0] != null) { 

                    for (int col = 0; col < 10; col++) {
//imprimiendo la matriz
                        System.out.print(datosCSV[fila][col] + " ");

                    }

                    System.out.println();

                }

            }

        } else {

            System.out.println("Error al leer el archivo");
        }
        //convirtiendo matriz a string
        String Stringsote= "";
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
               Stringsote = Stringsote + datosCSV[i][j];
                
            }
            
        }
        System.out.println(Stringsote);
        int l = 0;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
              laberinto[i][j]=Stringsote.charAt(l);
                      l= l+1;
                
            }
            
        }
        
        
        
        Laberinto maze = new Laberinto();
        maze.imprimir();

        System.out.println("\n\nEncuentra una ruta con una pila: ");
        maze.resolverConPila();

        System.out.println("\n\nEncuentra una ruta con una cola: ");
        maze.resolverConCola();

        System.out.println("\n\nEncuentra una ruta recursiva: ");
        maze.resolverRecursion();

    }

    //El objetivo es encontrar un camino de principio a fin 
    //******************
    //Esta solución utiliza una pila para realizar un seguimiento de la posible 
    //estados / posiciones para explorar; que marca el laberinto para recordar la
    // posiciones que ya ha explorado.
    public void resolverConPila() {

        //guardar el laberinto
        char[][] savedMaze = clone();

        //declaran las ubicaciones de pila
        Stack<MazePos> candidatos = new Stack<>();

        //inserte el inicio
        candidatos.push(new MazePos(START_I, START_J));

        MazePos crt, next;
        while (!candidatos.empty()) {

            //obtener la posición actual
            crt = candidatos.pop();

            if (isFinal(crt)) {
                break;
            }

            //marcar la posición actual
            marcar(crt, V);

            //poner sus vecinos en la cola
            next = crt.irNorte();
            if (isInMaze(next) && isClear(next)) {
                candidatos.push(next);
            }
            next = crt.IrEste();
            if (isInMaze(next) && isClear(next)) {
                candidatos.push(next);
            }
            next = crt.IrOeste();
            if (isInMaze(next) && isClear(next)) {
                candidatos.push(next);
            }
            next = crt.irSur();
            if (isInMaze(next) && isClear(next)) {
                candidatos.push(next);
            }
        }

        if (!candidatos.empty()) {
            System.out.println("Hay una solución!");
        } else {
            System.out.println("No hay solución!");
        }
        imprimir();

        //restaurar el laberinto
        restaurar(savedMaze);
    }


    public void resolverConCola() {

        char[][] savedMaze = clone();

        LinkedList<MazePos> candidates = new LinkedList<>();

        candidates.add(new MazePos(START_I, START_J));

        MazePos crt, next;
        while (!candidates.isEmpty()) {

            crt = candidates.removeFirst();

            if (isFinal(crt)) {
                break;
            }

            marcar(crt, V);

            next = crt.irNorte();
            if (isInMaze(next) && isClear(next)) {
                candidates.add(next);
            }
            next = crt.IrEste();
            if (isInMaze(next) && isClear(next)) {
                candidates.add(next);
            }
            next = crt.IrOeste();
            if (isInMaze(next) && isClear(next)) {
                candidates.add(next);
            }
            next = crt.irSur();
            if (isInMaze(next) && isClear(next)) {
                candidates.add(next);
            }
        }

        if (!candidates.isEmpty()) {
            System.out.println("hay una solución!");
        } else {
            System.out.println("no hay solución!");
        }
        imprimir();

        //restaurar el laberinto
        restaurar(savedMaze);
    }


    public void resolverRecursion() {

        if (solve(new MazePos(START_I, START_J))) {
            System.out.println("la solución: ");
        } else {
            System.out.println("no hay solución");
        }
        imprimir();

    }

    public boolean solve(MazePos pos) {

        //base case
        if (!isInMaze(pos)) {
            return false;
        }
        if (isFinal(pos)) {
            return true;
        }
        if (!isClear(pos)) {
            return false;
        }

        //posición actual debe ser clara
        assert (isClear(pos));

//        recurso 
//        primera Marcar esta ubicación
        marcar(pos, V);

        //tratar de ir hacia el sur
        if (solve(pos.irSur())) {

            return true;
        }

        //más al oeste 
        if (solve(pos.IrOeste())) {

            return true;
        }

        //else irNorte 
        if (solve(pos.irNorte())) {

            return true;
        }

        //más al este
        if (solve(pos.IrEste())) {

            return true;
        }

        marcar(pos, C);

        //if none of the above returned, then there is no solution
        return false;
    }
      private static String[][] deCSVaMatriz(String rutaCSV) {

        try {

            Scanner lector = new Scanner(new File(rutaCSV));

            String[][] matriz = new String[30][30];

            int fila = 0; //Para recorrer filas de la matriz

            String linea = lector.nextLine();

            while (lector.hasNextLine()) {

                if (matriz[fila].toString().endsWith(",")) {
                    fila++;
                } else {
                    matriz[fila] = linea.split(","); //Separamos datos de la linea CSV leida e insertamos en matriz4

                }

                fila++; //APuntamos a la siguiente fila

                linea = lector.nextLine(); //Leemos siguiente línea
            }

            matriz[fila] = linea.split(",");
            lector.close();

            //Finalizada la lectura de archivo CSV, retornamos la matriz con los datos
            return matriz;

        } catch (FileNotFoundException e) {

            System.out.println("No se encuentra fichero: " + rutaCSV);

            return null;

        }

    }
};

class MazePos {

    int i, j;

    public MazePos(int i, int j) {
        this.i = i;
        this.j = j;
    }

    ;
    public int i() {
        return i;
    }

    public int j() {
        return j;
    }

    public void print() {
        System.out.println("(" + i + "," + j + ")");
    }

    public MazePos irNorte() {
        return new MazePos(i - 1, j);
    }

    public MazePos irSur() {
        return new MazePos(i + 1, j);
    }

    public MazePos IrEste() {
        return new MazePos(i, j + 1);
    }

    public MazePos IrOeste() {
        return new MazePos(i, j - 1);
    }

}