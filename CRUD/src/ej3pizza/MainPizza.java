package ej3pizza;

import java.util.Arrays;
import java.util.Scanner;

import ej3pizza.Pizza.Estado;

public class MainPizza {
	static Scanner lee = new Scanner(System.in);
	static Pizza[] arrayPizzas = new Pizza[0];

	public static void main(String[] args) {
		int codigoP = 0;
		int opcionUser = 0;

		do {
			menu();
			System.out.println("Por favor introduzca la opcion que desee: ");
			opcionUser = lee.nextInt();

			switch (opcionUser) {
			case 1:
				listadoP();
				break;
			case 2:
				nuevoPedido();
				break;
			case 3:
				servida();
				break;
			case 4:
				adios();
				break;
			default:
				System.out.println("Opcion no contemplada :(");
				break;
			}
		} while (opcionUser != 4);
	}// FIN DEL MAIN

	public static void menu() {
		System.out.println();
		System.out.println("Dispone de las siguientes opciones: ");
		System.out.println("1. Listado de pizzas.");
		System.out.println("2. Nuevo pedido");
		System.out.println("3. Pizza servida");
		System.out.println("4. Salir");
	}

	public static void listadoP() {
		Estado pedida = Pizza.Estado.Pedida;
		System.out.println("Las pizzas que se han pedido hasta ahora: ");
		System.out.println("========================================================");
		System.out.println();
		for (Pizza unidad : arrayPizzas) {
			if (unidad.getEstado().equals(pedida)) {
				System.out.println(unidad);
				System.out.println();
			}
		}
	}// FIN DEL METODO LISTADO

	public static void espacioNuevo() {
		arrayPizzas = Arrays.copyOf(arrayPizzas, arrayPizzas.length + 1);
	}

	public static void nuevoPedido() {
		int codigo = 0;
		String tipo = "";
		Estado estado;
		String tamaño = "";

		System.out.println("Por favor introduzca el codigo de la pizza: ");
		codigo = lee.nextInt();
		System.out.println("Por favor introduzca el tipo de la pizza: ");
		tipo = lee.next();
		estado = Pizza.Estado.Pedida;
		System.out.println("Por favor introduzca el tamaño de la pizza: ");
		tamaño = lee.next();
		espacioNuevo();
		arrayPizzas[arrayPizzas.length - 1] = new Pizza(codigo, tipo, estado, tamaño);
		System.out.println("Pedido registrado correctamente.");
		System.out.println("Marchando pizza... (;");
	}

	public static void servida() {
		int codigo = 0;
		Estado estado;
		estado = Pizza.Estado.Servida;
		System.out.println("Introduzca el codigo de la pizza entregada: ");
		codigo = lee.nextInt();
		for (Pizza unidad : arrayPizzas) {
			if (unidad.getCodigo() == codigo) {
				unidad.setEstado(estado);
			}
		}
		System.out.println("La pizza ha sido servida!");
	}// fin del metodo

	public static void adios() {
		System.out.println("Finalizando programa, hasta luego!");
	}
}
