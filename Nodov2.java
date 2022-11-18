/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Unidad;

/**
 *
 * @author Lalo
 */
public class Nodov2 {
    String dato;
	int posicion;
	Nodov2 siguiente;
	
	
	public Nodov2(){}
	
	public Nodov2(int posicion){
		 siguiente=null;
		 this.dato=" ";
		 this.posicion=posicion;
	}
	public Nodov2 (String dato, int posicion)
	    {
	       siguiente=null;	
		   this.dato=dato;
		   this.posicion=posicion;
		}
		
	
	public Nodov2(String dato,int posicion, Nodov2 sigue)
		{
		  this.dato=dato;
		  this.posicion=posicion;
		  this.siguiente=sigue;
		}
		
		  	
	public String Obtener_Cadena()
		{
			return dato;
		}
		
	public int Obtener_Posicion()
		{
			return posicion;
		}	
			
}
