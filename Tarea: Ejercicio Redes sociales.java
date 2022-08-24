
package Unidad;
import java.io.File;
import java.io.FileNotFoundException;

import java.util.Scanner;

/**
 *
 * @author Lalo
 */
public class Tarea1 {

    public static void main(String[] args) {

        Scanner escritor = new Scanner(System.in);

        String[][] datosCSV = deCSVaMatriz("C:/Users/laloe/Downloads/presenciaredes.csv");

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
        System.out.println("diferencia de followers en twitter de enero a julio");

        System.out.println("mostrando la diferencia de seguidores en Twitter entre el mes de enero y junio");
        System.out.println(Double.parseDouble(datosCSV[8][3]) - Double.parseDouble(datosCSV[8][8]));
        System.out.println("diferencia de visualizaciones de YouTube");
        System.out.println("1 para Enero");
        System.out.println("2 para Febrero");
        System.out.println("3 para Marzo");
        System.out.println("4 para Abril");
        System.out.println("5 para Mayo");
        System.out.println("6 para Junio");
        boolean MesBien = false;
        int MesFinal = 0;
        int MesInicio = 0;
        while (MesBien == false) {
            System.out.println("Nota: El mes de inicio debe ser menor al mes final");
            System.out.println("escoje el mes de inicio"); //fila 16
            MesInicio = escritor.nextInt();
            System.out.println("escoje el mes final");
            MesFinal = escritor.nextInt();

            if (MesFinal > MesInicio & MesInicio < 6 & MesInicio > 0 & MesFinal < 6 & MesFinal > 0) {
                MesBien = true;
            } else {
                MesBien = false;

            }
        }
        MesFinal = MesFinal + 2;
        MesInicio += 2;
        System.out.println("la diferencia de visualizaciones de youtube "
                + "entre el mes de " + datosCSV[0][MesInicio]
                + " y el mes de " + datosCSV[0][MesFinal]);

        System.out.println(Math.abs(Double.parseDouble(datosCSV[16][MesInicio]) - Double.parseDouble(datosCSV[16][MesFinal])));

//tw 10 fb 3
//fb
        System.out.println("calculando promedio de crecimiento de Facebook");
        for (int col = 3; col < 9; col++) {
            datosCSV[3][col] = datosCSV[3][col].substring(0, datosCSV[3][col].length() - 1);

        }
        double suma = 0;

        double valor1;

        for (int col = 3; col < 9; col++) {

            valor1 = Double.parseDouble(datosCSV[3][col]);
            suma = valor1 + suma;

        }
        System.out.println("el promedio de crecimiento en Facebook es de:");
        double promediofb = suma / 6;
        System.out.println(promediofb + "%");

        System.out.println("calculando promedio de crecimiento de Twitter");
        for (int col = 3; col < 9; col++) {
            datosCSV[10][col] = datosCSV[10][col].substring(0, datosCSV[10][col].length() - 1);

        }
        suma = 0;

        for (int col = 3; col < 9; col++) {
            valor1 = Double.parseDouble(datosCSV[10][col]);
            suma = valor1 + suma;

        }
        System.out.println("el promedio de crecimiento en Twitter es de:");
        double promediotw = suma / 6;
        System.out.println(promediotw + "%");

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

}
