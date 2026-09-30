package principal;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1. Obtener la fecha y hora actual
		Scanner teclado = new Scanner(System.in);
		LocalDateTime ahora = LocalDateTime.now();
		LocalDate fechaActual = ahora.toLocalDate();
		int necesitanRevision = 0;
		int noNecesitanRevision = 0;
		// 2. Crear el formato personalizado en español
		DateTimeFormatter formatoTexto = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy ", new Locale("es", "ES"));
		// 3. Aplicar el formato y mostrar en pantalla
		String resultado = ahora.format(formatoTexto);
		System.out.println("La Fecha actual es " + resultado + " (si-1/no-0):");

		int Fecha = teclado.nextInt();
		boolean FechaCorrectos = (Fecha == 1);
		if (Fecha == 0) {
			System.out.println("Eres estupido");
			return; // Si estás dentro de main()
		}

		// si sale negativo es porque la fecha dentro del parentesis es positerior a
		// ahora
		// System.out.println(ahora.compareTo( ahora.plusDays(366)));
		// System.out.println(ahora.compareTo( ahora));
		System.out.print("¿Cuántas bicicletas desea registrar? ");
		int cantidadBicicletas = teclado.nextInt();
		for (int i = 1; i <= cantidadBicicletas; i++) {

			System.out.println("\nBicicleta " + i);

			System.out.print("Ingrese el número de registro de la bicicleta: ");
			String id = teclado.next();

			System.out.print("Día de la última revisión: ");
			int dia = teclado.nextInt();

			System.out.print("Mes de la última revisión: ");
			int mes = teclado.nextInt();

			System.out.print("Año de la última revisión: ");
			int año = teclado.nextInt();

			LocalDate fechaRevision = LocalDate.of(año, mes, dia);
			LocalDate fechaLimite = fechaActual.minusYears(1);

			if (fechaRevision.isBefore(fechaLimite)) {
				System.out.println("Esta bicicleta necesita revisión.");
				necesitanRevision++;
			} else {
				System.out.println("Esta bicicleta NO necesita revisión.");
				noNecesitanRevision++;
			}
		}

		System.out.println("\n--- RESUMEN ---");
		System.out.println("Bicicletas que necesitan revisión: " + necesitanRevision);
		System.out.println("Bicicletas que no necesitan revisión: " + noNecesitanRevision);

		teclado.close();
	}

}