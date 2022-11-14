
package Unidad;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author Lalo
 */
public class Cola_Main {

static int n=0,elemento=0;
 
 public static void main(String[] args)throws Exception {
  Cola k=new Cola();
  BufferedReader b=new BufferedReader
    (new InputStreamReader(System.in));
 
  
  do{

   System.out.println("menú");
   System.out.println("1. insertar elemento");
   System.out.println("2. eliminar elemento");
   System.out.println("3. ¿la cola está vacía?");
   System.out.println("4. elemento al frente de la cola");
   System.out.println("5. borrar ");
   System.out.println("6. ¿la cola está llena?");
   System.out.println("7. fin");
   n=Integer.parseInt(b.readLine());
   if(n==1){
    if(k.ColaLlena()){
     System.out.println("la cola está llena, no es posible ingresar más elementos");
    }else
    System.err.print("ingrese elemento");
    elemento=Integer.parseInt(b.readLine());
    k.insertarQ(elemento);
   }
   if(n==2){
    if(k.ColaVacia()){
     System.err.println("la cola está vacía, no se puede eliminar");
    }else
    System.out.println(k.eliminarQ());
   }
   if(n==3){
    if(k.ColaVacia()){
     System.out.println("la cola está vacía");
    }else
     System.out.println("la cola no está vacía");
   }
   if(n==4){
    if(k.ColaVacia()){
     System.err.println("no hay elemento siguiente, cola vacía");
    }else
    System.out.println("el primer elemento es: "+k.frenteQ());
    
   }
   if(n==5){
    k.BorrarQ();
    
   }
   if(n==6){
    k.ColaLlena();
    if(k.ColaLlena()){
     System.out.println("cola llena");
    }else
     System.out.println("la cola no está llena");
   }
   if(n==7){
    System.exit(0);
   }
   
   
   
  }while(n!=7);
  
  
  
 }

}
    

