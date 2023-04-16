package cuentacorriente;

import java.util.Arrays;
import java.util.Scanner;

import cuentacorriente.CuentaCorriente.Sexo;

public class MainCuenta {

	static Scanner lee = new Scanner(System.in);
	static CuentaCorriente[] cuentas = new CuentaCorriente[0];

	public static void main(String[] args) {
		int opcionUser = 0;

		do {
			menuAdmin();
			opcionUser = lee.nextInt();

			switch (opcionUser) {
			case 1:
				// C
				nuevaCuenta();
				break;
			case 2:
				// R
				listaCuentas();
				break;
			case 3:
				// U

				break;
			case 4:
				// D
				break;
			case 5:

				break;
			case 6:

				break;
			case 7:

				break;
			default:
				System.out.println("Opcion no contemplada");
				break;
			}
		} while (opcionUser != 7);

	}

	public static void listaCuentas() {
		for (int i = 0; i < cuentas.length; i++) {
			if (!cuentas[i].getDNI().isEmpty()) {
				System.out.println(i);
			}
		}
	}

	public static void espacioCuenta() {
		cuentas = Arrays.copyOf(cuentas, cuentas.length + 1);
	}

	public static void nuevaCuenta() {
		String dni = "";
		String nombre = "";
		double saldo = 0;
		String sexo = "";

		System.out.println("Por favor introduzca el DNI del propietario de la cuenta: ");
		dni = lee.next();
		System.out.println("Por favor introduzca el nombre del propietario de la cuenta:");
		nombre = lee.next();
		System.out.println("Por favor introduzca el saldo de la cuenta: ");
		saldo = lee.nextDouble();
		System.out.println("Por favor introduzca el sexo: ");
		sexo = lee.next();
		espacioCuenta();
		cuentas[cuentas.length - 1] = new CuentaCorriente(dni, nombre, saldo, sexo);
		System.out.println("Usuario registrado.");
	}

	public static void menuAdmin() {
		System.out.println("Seleccione una de las siguientes opciones disponibles: ");
		System.out.println("1. Listado de usuarios.");
		System.out.println("2. Alta de usuario.");
		System.out.println("3. Actualizar datos. ");
		System.out.println("4. Baja de usuario.");
		System.out.println("5. Solicitud de extracion de fondos.");
		System.out.println("6. Solicitud de ingreso de fondos.");
		System.out.println("7. Salir del programa.");
	}
	
		public static void menuAct() {
			System.out.println("Seleccione los datos del usuario que desea actualizar: ");
			System.out.println("1. DNI.");
			System.out.println("2. Nombre.");
			System.out.println("3. Sexo.");
			System.out.println("4. Salir al menú principal.");
		}
	
	public static void actualizarCuenta() {
		int opcion = 0;
		String dni;
		String newDni;
		System.out.println("Recuerde contar con la documentacion del usuario para realizar los cambios correspondientes.");
		System.out.println("Por favor introduzca el dni del usuario: ");
		dni = lee.next();
		do {
			menuAct();
			opcion = lee.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Por favor introduzca los cambios en el DNI.");
				newDni = lee.next();
				for (int i=0;i<cuentas.length;i++) {
					if(dni.equalsIgnoreCase(cuentas[i].getDNI())) {
						cuentas[i].setDNI(newDni);
					}
				}
				break;
			case 2:
				break;
			case 3:
				break;
			case 4:
				break;
			default :
				System.out.println("Opcion no contemplada.");
			}
		} while (opcion != 4);
	}
}
