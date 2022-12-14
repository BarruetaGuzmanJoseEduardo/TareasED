package Unidad;

import java.util.ArrayList;


public class Trabajador {

   private int numtrab, horasextra, añoingreso;
   private String nombres, paterno, materno;
   private double sueldo;
   

   public Trabajador(int numtrab, String nombres, String paterno, String materno, int horasextra, double sueldo, int añoingreso) {
        this.numtrab = numtrab;
        this.horasextra = horasextra;
        this.añoingreso = añoingreso;
        this.nombres = nombres;
        this.paterno = paterno;
        this.materno = materno;
        this.sueldo = sueldo;
    }

    public int getNumtrab() {
        return numtrab;
    }

    public void setNumtrab(int numtrab) {
        this.numtrab = numtrab;
    }

    public int getHorasextra() {
        return horasextra;
    }

    public void setHorasextra(int horasextra) {
        this.horasextra = horasextra;
    }

    public int getAñoingreso() {
        return añoingreso;
    }

    public void setAñoingreso(int añoingreso) {
        this.añoingreso = añoingreso;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getPaterno() {
        return paterno;
    }

    public void setPaterno(String paterno) {
        this.paterno = paterno;
    }

    public String getMaterno() {
        return materno;
    }

    public void setMaterno(String materno) {
        this.materno = materno;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
   public double calcularsueldofinal () {
    double sueldofin;
    sueldofin = sueldo + (276.5 * horasextra);
    this.setSueldo(sueldofin);
    return sueldofin;
}
  public static void calcularsueldobonus (ArrayList listatrabajo) { 
      int cont = 0;
      int año = 0;
              int mayor = 0;
              int índicemayor = 0;
              
    for (Object item: listatrabajo) {
        
       año = ((Trabajador)item).getAñoingreso();
        
              if (cont == 0) {
                mayor = año;
            }
            

            if (año > mayor) {
                mayor = año;
                índicemayor = cont;

            }
            
  
           

    cont++;      
    }
    cont--;
      System.out.println("trabajador más reciente");
    System.out.println("bienvenido " + ((Trabajador)listatrabajo.get(índicemayor)).getNombres() + " " + ((Trabajador)listatrabajo.get(índicemayor)).getPaterno() + " eres el empleado más nuevo");
   
       cont = 0;
       int índicemenor = 0;
       int menor = 0;
         for (Object item: listatrabajo) {
        
        
       año = ((Trabajador)item).getAñoingreso();
        
              if (cont == 0) {
                menor = año;
            }
            

            if (año < menor) {
                menor = año;
                índicemenor = cont;

            }
            
           
           cont++;
    }
     cont--;
     double sueldobonus = ((Trabajador)listatrabajo.get(índicemenor)).getSueldo();
      System.out.println("trabajador más antiguo");
      ((Trabajador)listatrabajo.get(índicemenor)).setSueldo(sueldobonus + sueldobonus*.03);
         System.out.println("felicidades " + ((Trabajador)listatrabajo.get(índicemenor)).getNombres() + " " + ((Trabajador)listatrabajo.get(índicemenor)).getPaterno() + " eres el empleado de mayor antiguedad");
}


    @Override
    public String toString() {
        return "Trabajador: " + "Número de trabajador: " + numtrab + ", nombre: " + nombres +  ", apellido paterno: " + paterno + ", apellido materno: " + materno + ", a\u00f1o de ingreso=" + añoingreso + ", sueldo: " + sueldo;
    }
   
}

