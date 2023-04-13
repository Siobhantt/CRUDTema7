package gestisimal;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainGestimal {
	static Scanner lee = new Scanner(System.in);
	static Articulo[] arrayArticulos = new Articulo[0];
	public static void main(String[] args) {
		int opcionUser = 0;
		
		int posicion = 0;
		do {
			menu();
			System.out.println("Por favor introduzca una opcion: ");
			opcionUser = lee.nextInt();
			lee.nextLine();
			switch (opcionUser) {
			case 1:
				listaArticulos();
				break;
			case 2:
				articuloNuevo();
				break;
			case 3:
				borrarArticulo();
				break;
			case 4:
				modificaArticulo();
				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			default:
				System.out.println("Opcion no contemplada.");
				break;
			}
		} while (opcionUser != 7);
	}

	public static void menu() {
		System.out.println("GESTISIMAL");
		System.out.println("Seleccione una de las siguientes opciones:");
		System.out.println("1. Listado");
		System.out.println("2. Alta");
		System.out.println("3. Baja");
		System.out.println("4. Modificacion");
		System.out.println("5. Entrada de mercancia");
		System.out.println("6. Salida de mercancia");
		System.out.println("7. Salir");
	}

	public static void listaArticulos() {
		System.out.println("================ARTICULOS================");
		for (int i = 0; i < arrayArticulos.length; i++) {
			if (arrayArticulos[i].getCodigo() != null) {
				System.out.println(arrayArticulos[i]);
				System.out.println();
			} // fin del if
		} // fin del for
	}// fin del metodo

	public static void espacioInsertar() {
		arrayArticulos = Arrays.copyOf(arrayArticulos, arrayArticulos.length + 1);
	}

	public static void articuloNuevo() {

		System.out.println("Por favor introduzca el codigo del articulo: ");
		String codigo = lee.next();
		System.out.println("Por favor introduzca la descripcion del articulo: ");
		String descripcion = lee.next();
		System.out.println("Por favor introduzca el precio de compra del articulo: ");
		double precioCompra = lee.nextDouble();
		System.out.println("Por favor introduzca el precio de venta del articulo del articulo: ");
		double precioVenta = lee.nextDouble();
		System.out.println("Por favor introduzca la cantidad de stock del articulo: ");
		int stock = lee.nextInt();

		espacioInsertar();

		arrayArticulos[arrayArticulos.length - 1] = new Articulo(codigo, descripcion, precioCompra, precioVenta, stock);

	}//fin del metodo
	

	public static void borrarArticulo() {
		String codigo;
		System.out.println("Introduzca el codigo del articulo que quiere eliminar:");
		codigo =lee.next();
		for(int i =0;i<arrayArticulos.length;i++) {
			if(codigo.equals(arrayArticulos[i].getCodigo())) {
				arrayArticulos[i].setCodigo(null);
			}
		}
		
	}//fin del metodo
	
	public static void modificaArticulo() {
		String codigo;
		String descripcion;
		double precioCompra=0;
		double precioVenta=0;
		int stock=0;
		int opcionUser=0;
		do {
		System.out.println("Por favor introduzca el codigo del articulo que quiere modificar");
		codigo = lee.next();
		opciones();
		switch (opcionUser) {
		case 1 :
			System.out.println("Introduzca los cambios en la descripcion: ");
			descripcion = lee.nextLine();
			for (int i=0;i<arrayArticulos.length;i++) {
				if(codigo.equals(arrayArticulos[i].getCodigo())) {
					arrayArticulos[i].setDescripcion(descripcion);
				}
			}
			break;
		case 2 :
			System.out.println("Introduzca los cambios en el precio de compra: ");
			descripcion = lee.nextLine();
			for (int i=0;i<arrayArticulos.length;i++) {
				if(codigo.equals(arrayArticulos[i].getCodigo())) {
					arrayArticulos[i].setPrecioCompra(precioCompra);
				}
			}
			break;
		case 3 :
			System.out.println("Introduzca los cambios en el precio de venta: ");
			descripcion = lee.nextLine();
			for (int i=0;i<arrayArticulos.length;i++) {
				if(codigo.equals(arrayArticulos[i].getCodigo())) {
					arrayArticulos[i].setPrecioCompra(precioVenta);
				}
			}
			break;
		case 4:
			System.out.println("Modificado con exito.");
			break;
		default :
			System.out.println("Opcion no contemplada.");
			break;
		}
		}while (opcionUser!=4);
	}
	
	public static void opciones() {
		System.out.println("Introduzca lo que quiere modificar del articulo: ");
		System.out.println("1. Descripcion.");
		System.out.println("2. Precio compra.");
		System.out.println("3. Precio venta.");
	}
}
