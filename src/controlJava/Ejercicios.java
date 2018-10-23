package controlJava;

import java.util.Random;

import modelo.Persona;

public class Ejercicios {

	// Probando "parseInt"
	
	public int convierteCadena(String cadena) {
		int variable = Integer.parseInt(cadena);
		return variable;
		
	}
	
	public void pruebasAPI(){
/*			//1. Imprime por consola el valor de 2 eleevado a 3.
				//Usa la clase estática java.lang.math y su método pow
				public int pow (int num) {
					int
				}
			
			//2. Imprime un valor aleatorio entre 1 y 100.
				//Usa la clase java.util.Random
			
			//3. En la cadena "LAS PALMAS DE GRAN CANARIA", imprime "GRAN".
				//Usar el método substring de la clase Java.lang.String.*/
					
		}
	
	public static void serieFibonacci (int cuantos){
		int x=0;
		int y=1;
		int z=x+y;
		System.out.print(x + ", " + y + ", ");
		for (int i = 0; i < cuantos; i++) {
			z=x+y;
			x=y;
			y=z;
			System.out.print( z + ", ");
		}
		
	}
	
	public static int calNumMenor(int a, int b, int c) {
		if (a<b)
			return a;
		if (a>b)
			return b;
		else
			return c;
		
	}
	
	public static int calNumMenor(int a, int b, int c, int d) {
		if (a<b)
			if (a<c)
				if (a<d)
					return a;
				else
					return d;
			else if (c<a)
				return c;
			else
				return a;
		else if (b<a)
			return b;
		else
			return a;
		
	}
	
	public static void imprimeAleatorios(int n){
		Random rnd = new Random();
			for (int i = 0; i < n; i++) {
				System.out.println(n = 1 + rnd.nextInt(100));
			}
	}
	
	public int[] imprimeAleatorios(int n, int bajo, int alto){
		Random rnd = new Random();
			for (int i = 0; i < n; i++) {
				n = 1 + rnd.nextInt();
				
			}
			return null;
	}
	
	
	public static int[] generaEstadisticaAparicion(int n, int inferior, int superior){
		int[] resultado;
		resultado = new int[superior - inferior + 1];
		Random rnd = new Random();
		int numero = 10;
		for (int i = 0; i < n; i++){
			numero = inferior + rnd.nextInt(superior - inferior + 1);
			resultado[numero - i]++;
		}
		return resultado;
	}
	
	
}


