package controlJava;

import auxiliar.Practicas;

public class Principal {
	
	public static void main(String[] args) {

		/* método constructor */

		/*Persona Juan = new Persona();
		int Pasos = Juan.caminar(20);*/
		
		/*Integer.parseInt("ab95f1");*/
		/*Ejercicios.serieFibonacci(20);*/
		
		
		Practicas practicas = new Practicas();
		// new Practicas().muestraNumerosDe1A1000();
		// practicas.muestraNumerosDe1A1000();
		// practicas.muestraNumeros3(20, 25);
		// practicas.generaAleatorios2(3,10,11);
		// practicas.estadisticaCadena("Las&%=\" PalmAs\\ de Gran CanarIa");
		// int [] numeros=practicas.generaAleatorios3(100, 1, 6);
		// int[] frecuencia = practicas.frecuenciaAparicion(100, 1, 8);
		// practicas.listaDiasSemana();
		// Estudiante[] lista = new Datos().getEstudiantes();
		// practicas.listaEstudiantes(new Datos().getEstudiantes());
		int[][] visitantesYear = { { 2, 4, 5, 1, 3, 2, 1, 1, 1, 3, 5, 1 },
				{ 23, 1, 56, 12, 32, 23, 17, 12, 11, 34, 45, 13 }, { 23, 3, 56, 12, 32, 23, 17, 12, 11, 34, 45, 12 },
				{ 23, 1, 56, 12, 32, 23, 17, 12, 11, 34, 45, 13 }, { 23, 4, 56, 12, 32, 23, 17, 12, 11, 34, 45, 10 },
				{ 23, 3, 56, 12, 32, 23, 17, 12, 11, 34, 45, 45 }, { 23, 1, 56, 12, 32, 23, 17, 12, 11, 34, 45, 37 }

		};
		String[] islas = { "GC", "LTE", "FTV", "TFE", "LPA", "GOM", "HIE" };
		String[] meses = { "ENE", "FEB", "MAR", "ABR", "MAY", "JUN", "JUL", "AGO", "SEP", "OCT", "NOV", "DIC" };

		/*
		 * int isla=2; int mes =7; System.out.println("Visitantes en "+ islas[isla]
		 * +" : " + practicas.visitantesIslaYear(isla, visitantesYear));
		 * System.out.println("Visitantes  en Canarias en el mes " + meses[mes]+ " : " +
		 * practicas.visitantesMesYear(mes, visitantesYear));
		 */

	/*	String[] misDatos = { "123","abc", "345", "1x2", "990" };
		//int[] res = practicas.convierteCadenasANumeros(misDatos);
		float saldo= 1000.0f;
		float[] movimientos= {10.0f, -5.0f,20.5f};
		
		float saldoFinal = practicas.calculaSaldo(saldo, movimientos);
		*/
		//int[] datos = practicas.generaAleatorios3(500, 1, 500);
		//practicas.ordenaEnteros(datos);
		//Arrays.sort(datos);
		/*String[] cadenas =  {"perro","gato","alce"};
		practicas.ordenaCadenas(cadenas);*/
		
		//System.out.println("El menor es: " + Ejercicios.calNumMenor (8, 5, 9, 7));
		
		//Ejercicios.imprimeAleatorios(5);
		
		int[] estadisticaDados = Ejercicios.generaEstadisticaAparicion(100, 1, 6);
		
		System.out.println("\nFin del Programa");
	}
	
}
