
package Unidad;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import java.util.Scanner;

/**
 *
 * @author Lalo
 */
public class mainTrabajadoresADT {

    public static void main(String[] args) {

        Scanner escritor = new Scanner(System.in);

        String[][] datosCSV = deCSVaMatriz("C:/Users/laloe/Downloads/junio.dat");

        if (datosCSV != null) { //para comprobar que sí se lea el archivo

            System.out.println("Archivo leído");

            for (int fila = 0; fila < datosCSV[fila].length; fila++) {

                if (datosCSV[fila][0] != null) { 

                    for (int col = 0; col < datosCSV[col].length; col++) {
//imprimiendo la matriz
                        System.out.print(datosCSV[fila][col] + " ");

                    }

                    System.out.println();

                }

            }

        } else {

            System.out.println("Error al leer el archivo");
        }
        ArrayList<Trabajador> Trabajadores = new ArrayList();
        Object object = new Object();
        for (int i = 1; i < datosCSV.length; i++) {
            if (datosCSV[i][0]==null) {
break;                
            }

            Trabajadores.add(new Trabajador(Integer.parseInt(datosCSV[i][0]), datosCSV[i][1], datosCSV[i][2], datosCSV[i][3], Integer.parseInt(datosCSV[i][4]), Double.parseDouble(datosCSV[i][5]), Integer.parseInt(datosCSV[i][6])));      
            
        }
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("salarios base");
        for (Trabajador item: Trabajadores) {
            System.out.println(item);
    // Hacer algo con el elemento
}
        System.out.println("");
        System.out.println("");
        System.out.println("");
        System.out.println("salarios con horas extra");
        for (Trabajador item: Trabajadores) {
            ((Trabajador)item).calcularsueldofinal();
            System.out.println(item);
    // Hacer algo con el elemento
}
Trabajador.calcularsueldobonus(Trabajadores);
        System.out.println("");
        System.out.println("");
        System.out.println("");
System.out.println("salarios con bono de antiguedad");
        for (Trabajador item: Trabajadores) {
          
            System.out.println(item);
    // Hacer algo con el elemento
}
    }

    private static String[][] deCSVaMatriz(String rutaCSV) {

        try {

            Scanner lector = new Scanner(new File(rutaCSV));

            String[][] matriz = new String[110][100];

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

}
