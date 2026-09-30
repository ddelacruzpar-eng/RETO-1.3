package extra;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);

		int alumnos;
		int covid;
		int vacunas;
		int mesVacuna;
		int mesProteccion;

		int noVacunados = 0;

		System.out.print("¿Cuántos alumnos hay?: ");
		alumnos = cs.nextInt();

		for (int i = 1; i <= alumnos; i++) {

			System.out.println("\n--- ALUMNO " + i + " ---");

			System.out.print("¿Ha pasado la COVID-19? (1 = Sí, 2 = No): ");
			covid = cs.nextInt();

			System.out.print("¿Cuántas vacunas tiene?: ");
			vacunas = cs.nextInt();

			if ((covid == 1 && vacunas < 1) || (covid == 2 && vacunas < 2)) {

				noVacunados++;

				System.out.println("No tiene la pauta completa.");

			} else {

				System.out.print("¿En qué mes se puso la última vacuna? (1-12): ");
				mesVacuna = cs.nextInt();

				mesProteccion = mesVacuna + 6;

				if (mesProteccion > 12) {
					mesProteccion = mesProteccion - 12;
				}

				System.out.println("Tiene la pauta completa.");
				System.out.println("Está protegido hasta el mes: " + mesProteccion);
			}
		}

		System.out.println("\nRESULTADO");
		System.out.println("Alumnos sin pauta completa: " + noVacunados);

		cs.close();
	}
}