package principal;

import java.util.Scanner;

public class Ejercicio1CO2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int numeroPersonas = pedirEnteroNoNegativo(teclado, "¿Cuántas personas se van a registrar? ");

		double totalGrupo = 0;

		for (int persona = 1; persona <= numeroPersonas; persona++) {
			System.out.println("\n===== PERSONA " + persona + " =====");

			double totalPersona = 0;
			int opcion;

			do {
				mostrarMenu();
				opcion = pedirEnteroEnRango(teclado, "Elige una opción: ", 1, 7);

				switch (opcion) {
				case 1:
					double kmCoche = pedirDoubleNoNegativo(teclado, "¿Cuántos kilómetros recorrió en coche? ");
					totalPersona += kmCoche * 0.21;
					break;

				case 2:
					double kmAutobus = pedirDoubleNoNegativo(teclado, "¿Cuántos kilómetros recorrió en autobús? ");
					totalPersona += kmAutobus * 0.10;
					break;

				case 3:
					double kmBicicleta = pedirDoubleNoNegativo(teclado, "¿Cuántos kilómetros recorrió en bicicleta? ");

					// La bicicleta genera 0 kg de CO2
					totalPersona += kmBicicleta * 0;
					break;

				case 4:
					int usoPlancha = pedirEnteroEnRango(teclado, "¿Usó la plancha? Escriba 1 para sí o 0 para no: ", 0,
							1);

					if (usoPlancha == 1) {
						double horasPlancha = pedirDoubleNoNegativo(teclado, "¿Cuántas horas utilizó la plancha? ");
						totalPersona += horasPlancha * 0.70;
					}
					break;

				case 5:
					double horasOrdenador = pedirDoubleNoNegativo(teclado, "¿Cuántas horas utilizó el ordenador? ");
					totalPersona += horasOrdenador * 0.08;
					break;

				case 6:
					double horasMovil = pedirDoubleNoNegativo(teclado, "¿Cuántas horas utilizó el móvil? ");
					totalPersona += horasMovil * 0.02;
					break;

				case 7:
					System.out.println("Finalizando actividades...");
					break;
				}

			} while (opcion != 7);

			System.out.printf("Total de CO2 emitido por la persona %d: %.2f kg%n", persona, totalPersona);

			totalGrupo += totalPersona;
		}

		System.out.printf("%nTotal de CO2 emitido por el grupo: %.2f kg%n", totalGrupo);

		teclado.close();
	}

	/**
	 * Muestra el menú de actividades.
	 */
	public static void mostrarMenu() {
		System.out.println("\n----- MENÚ DE ACTIVIDADES -----");
		System.out.println("1. Transporte en coche");
		System.out.println("2. Transporte en autobús");
		System.out.println("3. Transporte en bicicleta");
		System.out.println("4. Uso de plancha");
		System.out.println("5. Uso del ordenador");
		System.out.println("6. Uso del móvil");
		System.out.println("7. Finalizar actividades del día");
	}

	/**
	 * Pide un número entero que no puede ser negativo.
	 */
	public static int pedirEnteroNoNegativo(Scanner teclado, String mensaje) {
		while (true) {
			try {
				System.out.print(mensaje);
				int valor = Integer.parseInt(teclado.nextLine());

				if (valor >= 0) {
					return valor;
				}

				System.out.println("Error: el valor no puede ser negativo.");

			} catch (NumberFormatException e) {
				System.out.println("Error: debes introducir un número entero válido.");
			}
		}
	}

	/**
	 * Pide un número entero dentro de un rango.
	 */
	public static int pedirEnteroEnRango(Scanner teclado, String mensaje, int minimo, int maximo) {
		while (true) {
			try {
				System.out.print(mensaje);
				int valor = Integer.parseInt(teclado.nextLine());

				if (valor >= minimo && valor <= maximo) {
					return valor;
				}

				System.out.println("Error: introduce un valor entre " + minimo + " y " + maximo + ".");

			} catch (NumberFormatException e) {
				System.out.println("Error: debes introducir un número entero válido.");
			}
		}
	}

	/**
	 * Pide un número decimal que no puede ser negativo. Permite utilizar coma o
	 * punto decimal.
	 */
	public static double pedirDoubleNoNegativo(Scanner teclado, String mensaje) {
		while (true) {
			try {
				System.out.print(mensaje);

				String entrada = teclado.nextLine().replace(',', '.');
				double valor = Double.parseDouble(entrada);

				if (valor >= 0) {
					return valor;
				}

				System.out.println("Error: el valor no puede ser negativo.");

			} catch (NumberFormatException e) {
				System.out.println("Error: debes introducir un número válido.");
			}
		}
	}

}
