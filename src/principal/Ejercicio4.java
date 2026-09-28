package principal;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);

		double precioAdulto = 9;
		double precioInfant = 6;

		double totalAPagar;
		double totalIPagar;
		double totalPagar;

		double totalP = 0;

		int clientes;

		int entAdulto;
		int entTotalCliente;
		int entTotalA = 0;

		int entInfant;
		int entTotalI = 0;

		int maxEntradas = 0;
		int clienteMasEntradas = 0;

		System.out.println("Introduce el numero de clientes que deseas registrar.");
		clientes = cs.nextInt();

		for (int contador = 1; contador <= clientes; contador++) {

			System.out.println("Introduce la cantidad de entradas de adulto que ha comprado el cliente " + contador);
			entAdulto = cs.nextInt();

			System.out.println("Introduce la cantidad de entradas infantiles que ha comprado el cliente " + contador);
			entInfant = cs.nextInt();

			entTotalA = entTotalA + entAdulto;
			entTotalI = entTotalI + entInfant;

			totalAPagar = entAdulto * precioAdulto;
			totalIPagar = entInfant * precioInfant;

			totalPagar = totalAPagar + totalIPagar;

			entTotalCliente = entAdulto + entInfant;

			if (entTotalCliente >= 5) {
				totalPagar = totalPagar * 0.90;
			}

			if (entTotalCliente > maxEntradas) {
				maxEntradas = entTotalCliente;
				clienteMasEntradas = contador;
			}

			totalP = totalP + totalPagar;

			System.out.println("Has comprado " + entAdulto + " entradas de adulto.");
			System.out.println("Has comprado " + entInfant + " entradas infantiles.");
			System.out.println("El total de entradas son: " + entTotalCliente + ".");
			System.out.println("Precio a pagar: " + totalPagar + " €");
		}

		System.out.println();
		System.out.println("----- RESUMEN -----");
		System.out.println("Dinero total recaudado: " + totalP + " €");
		System.out.println("Total de entradas de adulto: " + entTotalA);
		System.out.println("Total de entradas infantiles: " + entTotalI);
		System.out.println("El cliente que más entradas compró fue el cliente " + clienteMasEntradas + " con "
				+ maxEntradas + " entradas.");

	}
}