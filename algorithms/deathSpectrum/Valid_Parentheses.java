package EjercicioAlgoritmos;

import java.util.Scanner;

public class Valid_Parentheses {

		public static void parenthesis_pair(String s) {
			//Inicializacion de variables
			int size = s.length();
			int iter = 0;
			int tipo1=0, tipo2=0, tipo3=0;
			boolean state =true;
			if(size>0 && size< 105) {	
				while(iter<size && state == true) {
					//Validacion inicial de paridad
					if(!(size % 2==0)) state = false;
					//Conteo de parentesis por parejas
					switch(s.charAt(iter)) {
						case '(': tipo1++;
									break;
						case '{': tipo2++;
									break;
						case '[': tipo3++;
									break;
						case ')': if(tipo1 ==0) state =false;
									 tipo1--;
									 break;
						case '}': if(tipo2 ==0) state =false;
									tipo2--;
									break;
						case ']': if(tipo3 ==0) state =false;
									tipo3--;
									break;
						default: 
								state = false;
					}
					iter+=1;
				}
				//Resultado obtenido de la funcion
				System.out.println(state);
			}else {
				System.out.println("La entrada se encuentra  fuera del rango establecido");
			}
		}
	
		
	public static void main(String[] args) {	
		//Scanner sc = new Scanner(System.in);
		//String s = sc.next();
		String s = "(()[])"; //Entrada de datos estatica
		 parenthesis_pair(s);
		//sc.close();
		}

}
