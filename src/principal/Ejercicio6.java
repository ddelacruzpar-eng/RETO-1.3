package principal;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner cs = new Scanner(System.in);

		int jugadores;
		int partidas;

		int puntos;
		int enemigos;

		int puntuacionTotal;
		int enemigosTotal;
		double puntuacionMedia;

		int mayorPuntuacion = 0;
		int jugadorMayorPuntuacion = 0;

		int puntuacionTotalTodos = 0;
		int enemigosTotalTodos = 0;

		System.out.print("Cuántos jugadores se van a registrar?: ");
		jugadores = cs.nextInt();

		for (int i = 1; i <= jugadores; i++) {

			System.out.println("\n--- JUGADOR " + i + " ---");

			System.out.print("Cuántas partidas ha jugado?: ");
			partidas = cs.nextInt();

			puntuacionTotal = 0;
			enemigosTotal = 0;

			for (int j = 1; j <= partidas; j++) {

				System.out.println("\nPartida " + j);

				System.out.print("Puntos conseguidos: ");
				puntos = cs.nextInt();

				System.out.print("Enemigos derrotados: ");
				enemigos = cs.nextInt();

				puntuacionTotal = puntuacionTotal + puntos;
				enemigosTotal = enemigosTotal + enemigos;

				if (puntos > 1000) {
					puntuacionTotal = puntuacionTotal + 100;
					System.out.println("Bonus de 100 puntos.");
				}
			}

			puntuacionMedia = (double) puntuacionTotal / partidas;

			System.out.println("\n--- RESULTADOS JUGADOR " + i + " ---");
			System.out.println("Puntuación total: " + puntuacionTotal);
			System.out.println("Enemigos derrotados: " + enemigosTotal);
			System.out.println("Puntuación media por partida: " + puntuacionMedia);

			if (puntuacionTotal > mayorPuntuacion) {
				mayorPuntuacion = puntuacionTotal;
				jugadorMayorPuntuacion = i;
			}

			puntuacionTotalTodos = puntuacionTotalTodos + puntuacionTotal;
			enemigosTotalTodos = enemigosTotalTodos + enemigosTotal;
		}

		System.out.println("\nRESULTADO FINAL");
		System.out.println("Jugador con mayor puntuación: Jugador " + jugadorMayorPuntuacion);
		System.out.println("Mayor puntuación: " + mayorPuntuacion);
		System.out.println("Puntuación total de todos los jugadores: " + puntuacionTotalTodos);
		System.out.println("Enemigos derrotados entre todos: " + enemigosTotalTodos);

		cs.close();
	}
}