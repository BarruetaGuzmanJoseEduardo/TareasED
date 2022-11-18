/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Unidad;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Lalo
 */
public class Quijote{

	public static void main(String[] args) {
	
		int contador = 0;
                char letractual;
                        int contador_a= 0;
                        int contador_b= 0;
                        int contador_c= 0;
                        int contador_d= 0;
                        int contador_e= 0;
                        int contador_f= 0;
                        int contador_g= 0;
                        int contador_h= 0;
                        int contador_i= 0;
                        int contador_j= 0;
                        int contador_k= 0;
                        int contador_l= 0;
                        int contador_m= 0;
                        int contador_n= 0;
                        int contador_o= 0;
                        int contador_p= 0;
                        int contador_q= 0;
                        int contador_r= 0;
                        int contador_s= 0;
                        int contador_t= 0;
                        int contador_u= 0;
                        int contador_v= 0;
                        int contador_w= 0;
                        int contador_x= 0;
                        int contador_y= 0;
                        int contador_z= 0;
                        //mayúsculas
                        int contador_A= 0;
                        int contador_B= 0;
                        int contador_C= 0;
                        int contador_D= 0;
                        int contador_E= 0;
                        int contador_F= 0;
                        int contador_G= 0;
                        int contador_H= 0;
                        int contador_I= 0;
                        int contador_J= 0;
                        int contador_K= 0;
                        int contador_L= 0;
                        int contador_M= 0;
                        int contador_N= 0;
                        int contador_O= 0;
                        int contador_P= 0;
                        int contador_Q= 0;
                        int contador_R= 0;
                        int contador_S= 0;
                        int contador_T= 0;
                        int contador_U= 0;
                        int contador_V= 0;
                        int contador_W= 0;
                        int contador_X= 0;
                        int contador_Y= 0;
                        int contador_Z= 0;
		try {
			BufferedReader br = new BufferedReader(new FileReader("C:/Users/laloe/Downloads/el_quijote.txt"));

			System.out.println("TEXTO LEIDO");
			System.out.println("----- -----\n");
			

			String linea = br.readLine();
			while (linea != null) {
System.out.println(linea);
                                for (int contadorlínea = 0; contadorlínea < linea.length(); contadorlínea++) {
                     
                                letractual = linea.charAt(contadorlínea);

                                    if (letractual == 'a') {
                                        contador_a++;     
                                        continue;
                                    }
                                    if (letractual == 'b') {
                                        contador_b++;     
                                        continue;
                                    }
                                    if (letractual == 'c') {
                                        contador_c++;     
                                        continue;
                                    }
                                    if (letractual == 'd') {
                                        contador_d++;     
                                        continue;
                                    }
                                    if (letractual == 'e') {
                                        contador_e++;
                                        continue;
                                    }
                                    if (letractual == 'f') {
                                        contador_f++;  
                                        continue;
                                    }
                                    if (letractual == 'g') {
                                        contador_g++;   
                                        continue;
                                    }
                                    if (letractual == 'h') {
                                        contador_h++;  
                                        continue;
                                    }
                                    if (letractual == 'i') {
                                        contador_i++;  
                                        continue;
                                    }
                                    if (letractual == 'j') {
                                        contador_j++;  
                                        continue;
                                    }
                                    if (letractual == 'k') {
                                        contador_k++;
                                        continue;
                                    }
                                    if (letractual == 'l') {
                                        contador_l++;    
                                        continue;
                                    }
                                    if (letractual == 'm') {
                                        contador_m++;  
                                        continue;
                                    }
                                    if (letractual == 'n') {
                                        contador_n++;    
                                        continue;
                                    }
                                    if (letractual == 'o') {
                                        contador_o++;   
                                        continue;
                                    }
                                    if (letractual == 'p') {
                                        contador_p++;    
                                        continue;
                                    }
                                    if (letractual == 'q') {
                                        contador_q++;   
                                        continue;
                                    }
                                    if (letractual == 'r') {
                                        contador_r++;    
                                        continue;
                                    }
                                    if (letractual == 's') {
                                        contador_s++;   
                                        continue;
                                    }
                                    if (letractual == 't') {
                                        contador_t++;  
                                        continue;
                                    }
                                    if (letractual == 'u') {
                                        contador_u++;     
                                        continue;
                                    }
                                    if (letractual == 'v') {
                                        contador_v++;     
                                        continue;
                                    }
                                    if (letractual == 'w') {
                                        contador_w++;     
                                        continue;
                                    }
                                    if (letractual == 'x') {
                                        contador_x++;  
                                        continue;
                                    }
                                    if (letractual == 'y') {
                                        contador_y++;     
                                        continue;
                                    }
                                    if (letractual == 'z') {
                                        contador_z++;     
                                        continue;
                                    }
                                    
                                    
                                    //mayúsculas
                                    
                                     if (letractual == 'A') {
                                        contador_A++;   
                                        continue;
                                    }
                                    if (letractual == 'B') {
                                        contador_B++;     
                                        continue;
                                    }
                                    if (letractual == 'C') {
                                        contador_C++;   
                                        continue;
                                    }
                                    if (letractual == 'D') {
                                        contador_D++;  
                                        continue;
                                    }
                                    if (letractual == 'E') {
                                        contador_E++;   
                                        continue;
                                    }
                                    if (letractual == 'F') {
                                        contador_F++;   
                                        continue;
                                    }
                                    if (letractual == 'G') {
                                        contador_G++;    
                                        continue;
                                    }
                                    if (letractual == 'H') {
                                        contador_H++;  
                                        continue;
                                    }
                                    if (letractual == 'I') {
                                        contador_I++;  
                                        continue;
                                    }
                                    if (letractual == 'J') {
                                        contador_J++;  
                                        continue;
                                    }
                                    if (letractual == 'K') {
                                        contador_K++;    
                                        continue;
                                    }
                                    if (letractual == 'L') {
                                        contador_L++;  
                                        continue;
                                    }
                                    if (letractual == 'M') {
                                        contador_M++;  
                                        continue;
                                    }
                                    if (letractual == 'N') {
                                        contador_N++;    
                                        continue;
                                    }
                                    if (letractual == 'O') {
                                        contador_O++;  
                                        continue;
                                    }
                                    if (letractual == 'P') {
                                        contador_P++;   
                                        continue;
                                    }
                                    if (letractual == 'Q') {
                                        contador_Q++;   
                                        continue;
                                    }
                                    if (letractual == 'R') {
                                        contador_R++;  
                                        continue;
                                    }
                                    if (letractual == 'S') {
                                        contador_S++;  
                                        continue;
                                    }
                                    if (letractual == 'T') {
                                        contador_T++;    
                                        continue;
                                    }
                                    if (letractual == 'U') {
                                        contador_U++;  
                                        continue;
                                    }
                                    if (letractual == 'V') {
                                        contador_V++;
                                        continue;
                                    }
                                    if (letractual == 'W') {
                                        contador_W++; 
                                        continue;
                                    }
                                    if (letractual == 'X') {
                                        contador_X++; 
                                        continue;
                                    }
                                    if (letractual == 'Y') {
                                        contador_Y++;   
                                        continue;
                                    }
                                    if (letractual == 'Z') {
                                        contador_Z++;   
                                        
                                    }
                                    
                                    
				//Leemos siguiente línea
				
			}
                                linea = br.readLine();

                        }
			br.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("\nPalabras contadas: " + contador);
                System.out.println("caracter a contados: " + contador_a);
                System.out.println("caracter b contados: " + contador_b);
                System.out.println("caracter c contados: " + contador_c);
                System.out.println("caracter d contados: " + contador_d);
                System.out.println("caracter e contados: " + contador_e);
                System.out.println("caracter f contados: " + contador_f);
                System.out.println("caracter g contados: " + contador_g);
                System.out.println("caracter h contados: " + contador_h);
                System.out.println("caracter i contados: " + contador_i);
                System.out.println("caracter j contados: " + contador_j);
                System.out.println("caracter k contados: " + contador_k);
                System.out.println("caracter l contados: " + contador_l);
                System.out.println("caracter m contados: " + contador_m);
                System.out.println("caracter n contados: " + contador_n);
                System.out.println("caracter ñ contados: " + contador_ñ);
                System.out.println("caracter o contados: " + contador_o);
                System.out.println("caracter p contados: " + contador_p);
                System.out.println("caracter q contados: " + contador_q);
                System.out.println("caracter r contados: " + contador_r);
                System.out.println("caracter s contados: " + contador_s);
                System.out.println("caracter t contados: " + contador_t);
                System.out.println("caracter u contados: " + contador_u);
                System.out.println("caracter v contados: " + contador_v);
                System.out.println("caracter w contados: " + contador_w);
                System.out.println("caracter x contados: " + contador_x);
                System.out.println("caracter y contados: " + contador_y);
                System.out.println("caracter z contados: " + contador_z);
                //mayus
                System.out.println("caracter A contados: " + contador_A);
                System.out.println("caracter B contados: " + contador_B);
                System.out.println("caracter C contados: " + contador_C);
                System.out.println("caracter D contados: " + contador_D);
                System.out.println("caracter E contados: " + contador_E);
                System.out.println("caracter F contados: " + contador_F);
                System.out.println("caracter G contados: " + contador_G);
                System.out.println("caracter H contados: " + contador_H);
                System.out.println("caracter I contados: " + contador_I);
                System.out.println("caracter J contados: " + contador_J);
                System.out.println("caracter K contados: " + contador_K);
                System.out.println("caracter L contados: " + contador_L);
                System.out.println("caracter M contados: " + contador_M);
                System.out.println("caracter N contados: " + contador_N);
                System.out.println("caracter O contados: " + contador_O);
                System.out.println("caracter P contados: " + contador_P);
                System.out.println("caracter Q contados: " + contador_Q);
                System.out.println("caracter R contados: " + contador_R);
                System.out.println("caracter S contados: " + contador_S);
                System.out.println("caracter T contados: " + contador_T);
                System.out.println("caracter U contados: " + contador_U);
                System.out.println("caracter V contados: " + contador_V);
                System.out.println("caracter W contados: " + contador_W);
                System.out.println("caracter X contados: " + contador_X);
                System.out.println("caracter Y contados: " + contador_Y);
                System.out.println("caracter Z contados: " + contador_Z);

	}

}