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
				actualizarCuenta();
				break;
			case 4:
				// D
				bajaUsuario();
				break;
			case 5:
				sacarDinero();
				break;
			case 6:
				ingresarDinero();
				break;
			case 7:
				fin();
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
				System.out.println(cuentas[i]);
				System.out.println();
			}
		}
		System.out.println();
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
		System.out.println("1. Alta de usuario.");
		System.out.println("2. Listado de usuarios.");
		System.out.println("3. Actualizar datos. ");
		System.out.println("4. Baja de usuario.");
		System.out.println("5. Solicitud de extracion de fondos.");
		System.out.println("6. Solicitud de ingreso de fondos.");
		System.out.println("7. Salir del programa.");
		System.out.print(":");
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
		String nombre;
		String sexo;
		System.out.println(
				"Recuerde contar con la documentacion del usuario para realizar los cambios correspondientes.");
		System.out.println("Por favor introduzca el dni del usuario: ");
		dni = lee.next();
		do {
			menuAct();
			opcion = lee.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Por favor introduzca los cambios en el DNI.");
				newDni = lee.next();
				for (int i = 0; i < cuentas.length; i++) {
					if (dni.equalsIgnoreCase(cuentas[i].getDNI())) {
						cuentas[i].setDNI(newDni);
					}
				}
				break;
			case 2:
				System.out.println("Por favor introduzca los cambios en el nombre.");
				nombre = lee.next();
				for (int i = 0; i < cuentas.length; i++) {
					if (dni.equalsIgnoreCase(cuentas[i].getDNI())) {
						cuentas[i].setNombre(nombre);
					}
				}
				break;
			case 3:
				System.out.println("Por favor introduzca los cambios en el sexo.");
				sexo = lee.next();
				for (int i = 0; i < cuentas.length; i++) {
					if (dni.equalsIgnoreCase(cuentas[i].getDNI())) {
						cuentas[i].setSexo(sexo);
					}
				}
				break;
			case 4:
				System.out.println("Fin del area de modificaciones.");
				break;
			default:
				System.out.println("Opcion no contemplada.");
			}
		} while (opcion != 4);
	}

	public static void bajaUsuario() {
		String dni;
		System.out.println("Por favor introduzca el DNI del usuario que quiere retirar del sistema: ");
		dni = lee.next();
		for (int i = 0; i < cuentas.length; i++) {
			if (dni.equalsIgnoreCase(cuentas[i].getDNI())) {
				cuentas[i].setDNI(null);
			}
		}
		System.out.println("Usuario dado de baja.");
		System.out.println();
	}

	public static void sacarDinero() {
		String dni = "";
		double cantidad = 0;
		double actualSaldo;

		System.out.println("Introduzca el dni del propietario de la cuenta: ");
		dni = lee.next();
		System.out.println("Introduzca la cantidad a retirar: ");
		cantidad = lee.nextDouble();
		for (int i = 0; i < cuentas.length; i++) {
			if (dni.equalsIgnoreCase(cuentas[i].getDNI())) {
				actualSaldo = cuentas[i].getSaldo();
				if (actualSaldo >= cantidad) {
					cuentas[i].setSaldo(actualSaldo - cantidad);
					System.out.println("Retirada exitosa!");
					System.out.println("Su nuevo saldo es: " + cuentas[i].getSaldo());
				}
				else {
					System.err.println("La cantidad que desea retirar es mayor a sus fondos");
				}
			}
		}
	}
	public static void ingresarDinero() {
		String dni = "";
		double cantidad = 0;
		double actualSaldo;

		System.out.println("Introduzca el dni del propietario de la cuenta: ");
		dni = lee.next();
		System.out.println("Introduzca la cantidad a depositar: ");
		cantidad = lee.nextDouble();
		for (int i = 0; i < cuentas.length; i++) {
			if (dni.equalsIgnoreCase(cuentas[i].getDNI())) {
				actualSaldo = cuentas[i].getSaldo();
					cuentas[i].setSaldo(actualSaldo + cantidad);
					System.out.println("Deposito exitoso!");
					System.out.println("Su nuevo saldo es: " + cuentas[i].getSaldo());
				
			}
		}
	}
	public static void fin() {
		System.out.println("Hasta luego! (;");
	}

}
