package ej1;

import java.util.Arrays;
import java.util.Scanner;

public class MainAlumno {
	static Scanner lee = new Scanner(System.in);
	public static void main(String[] args) {
		//Array donde se guardan los alumnos
		 Alumno[] alumnos = new Alumno[30];
		 int posicion =0;
		int opcionUser=0; //opcion del usuario para el switch
		
		do {
		menu();
		System.out.println("Por favor introduzca una opcion: ");
		opcionUser=lee.nextInt();
		switch (opcionUser) {
		case 1:
			listadoAlumnos(alumnos);
			break;
		case 2:
			posicion = posLibre(alumnos);
			if(posicion<0) {
				System.out.println("No hay espacio para añadir un alumno nuevo.");
			}else{
				alumnoNuevo(alumnos,posicion);
				System.out.println("Alumno añadido con exito.");
			}
			break;
		case 3:
			
			break;
		case 4:
			borrarAlumno(alumnos);
			break;
		case 5:
			despedida();
			break;
			
		default:
			System.out.println("Opcion no contemplada.");
			break;
			
		}//fin del switch
		}while(opcionUser!=5); //fin del DOwhile
	}//fin del main
	public static void menu() {
		System.out.println("ALUMNOS/AS");
		System.out.println("======================================");
		System.out.println("1. Listado.");
		System.out.println("2. Nuevo Alumno.");
		System.out.println("3. Modificar.");
		System.out.println("4. Borrar.");
		System.out.println("5. Salir.");
	}//fin del menu
	
	public static void listadoAlumnos(Alumno[] alumnos) {
		//for (int i=0;i<alumnos.length;i++) {
			//if (alumnos[i] !=null) {
				System.out.println(Arrays.asList(alumnos));
			//}
		//}
	}//Fin de lafuncion que lista los alumnos en caso de que existan 
	
	public static int posLibre(Alumno[] alumnos) {
		int libre =0;
		while (libre<alumnos.length && alumnos[libre] != null) {
			libre++;
		}
		if (libre == alumnos.length) {
			libre = -1;
		}
		return libre;
	}//Fin de la funcion que comprueba si hay una posicion libre
	
	public static int alumnoNuevo(Alumno[] alumnos, int posicion) {
		System.out.println("Por favor introduzca el nombre del alumno: ");
		String nombre =lee.next();
		System.out.println("Por favor introduzca la nota media del alumno");
		double notaMedia=lee.nextDouble();
		alumnos[posicion] = new Alumno(nombre, notaMedia);
		return posicion;
	}
	//terminar este mañana
	public static void modificaAlumno(Alumno[] alumnos) {
		String nombre="";
		double notaMedia=0;
	}//fin de modifica alumno 
	
	public static void borrarAlumno(Alumno[] alumnos) {
		int posicion=0;
		String nombre = "";
		System.out.println("Introduzca el nombre del alumno que quiere borrar:");
		nombre = lee.next();
		if(posicion>=0 && nombre!=null) {
			alumnos[posicion] = null;
			System.out.println("Alumno eliminado con exito.");
		}
		else{
			System.out.println("No es posible eliminar un alumno que no existe.");
		}
	}//fin de la funcion "borrarAlumno"
	
	public static void despedida() {
		System.out.println("Fin del programa.");
		System.out.println("Hasta luego!");
	}
}
