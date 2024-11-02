import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Sherlock {
	
	public static List<List<String>> OrdenPorClaves(String input[] ) {
		Map<String, List<String>> mapaPalabras = new LinkedHashMap<>(); //Similar a un diccionario de python (k,v) 
		//LinkedHasMap a diferencia de HashMap mantiene el orden de insersion de los datos
		
		//Recorrido de Vector de palabras con forEch
		for(String elemento: input) {
			char letras[] = elemento.toCharArray();  //Conversion a un arreglo de caracteres
			Arrays.sort(letras);
			 String clave = new String(letras); //Creacion de las llaves
			
			//Asignacion de elemento al map con su correspondiente clave
			//mapaPalabras.computeIfAbsent(clave, k -> new ArrayList<>()).add(elemento);
			if (!mapaPalabras.containsKey(clave)) {
			    mapaPalabras.put(clave, new ArrayList<>()); //Clave, valor(esto debe ser una lista)
			}
			mapaPalabras.get(clave).add(elemento);
		}
		return  new ArrayList<>(mapaPalabras.values()); //Lista de valores de salida
	}
	public static void main(String[] args) {
		String  input[] = {"eat","tea","tan","ate","nat","bat"};
		System.out.println("Input: "+ Arrays.toString(input));
		//Metodo Sherlock
		List<List<String>> Output = OrdenPorClaves(input); //Se genera un objeto - lista de listas con los valores de cada clase
		 System.out.println("Output: " + Output);
		 //mapaPalabras.forEach((key, value) -> System.out.println("Llave: " + key + ", Valor: " + value)); Si quiere var el Map completo 	
	}
}
