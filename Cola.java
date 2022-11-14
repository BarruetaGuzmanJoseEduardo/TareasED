
package Unidad;

/**
 *
 * @author Lalo
 */
 public class Cola {
 private static final int MAXTAM = 3;
 private int frente;
 private int ultimo;
 private int []cola;
 public Cola(){
  frente = 0;
  ultimo = -1;
  cola = new int [MAXTAM];
 }
 public void insertarQ(int elemento)throws Exception{
  if (!ColaLlena())
   cola[++ultimo]= elemento;
  else
   throw new Exception ("Error en la cola: Cola llena");
  
 }
 
 public int eliminarQ() throws Exception{
  if (!ColaVacia())
   return cola[frente++];
  else
   throw new Exception ("Cola vacia");
 }
 
 public void BorrarQ(){
  frente = 0;
  ultimo = -1;
 }
 
 public int frenteQ()throws Exception{
  if (!ColaVacia())
   return cola[frente];
  else
   throw new Exception ("Cola vacia");
 }
 
 public boolean ColaVacia(){
  return frente > ultimo;
 }
 
 public boolean ColaLlena(){
  return ultimo == MAXTAM - 1;
 }
 
 
}