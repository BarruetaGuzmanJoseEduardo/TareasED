/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad;

/**
 *
 * @author Lalo
 */
public class ColaPrioridad_Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ColaPrioridad colaPrioridad = new ColaPrioridad();
        System.out.println("vamoos");
        colaPrioridad.inserta("Juanón", 1);
        colaPrioridad.inserta("Ramìrez", 3);
        colaPrioridad.inserta("Pèrez", 2);
        colaPrioridad.inserta("Jair", 1);
        colaPrioridad.inserta("Lòpez", 4);
        colaPrioridad.inserta("Paco", 4);
        colaPrioridad.inserta("Juana", 2);

        System.out.println(colaPrioridad);
        
    }
    
}
