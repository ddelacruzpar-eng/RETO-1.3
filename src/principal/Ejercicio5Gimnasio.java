package principal;

import java.util.Scanner;

	public class Ejercicio5Gimnasio {
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Scanner teclado = new Scanner(System.in);
	
	        System.out.print("¿Cuántos usuarios se van a registrar? ");
	        int numeroUsuarios = teclado.nextInt();
	
	        int usuarioConMasMinutos = 0;
	        int maximoMinutos = 0;
	        int minutosTotalesTodos = 0;
	        int diasTotalesTodos = 0;
	
	        for (int usuario = 1; usuario <= numeroUsuarios; usuario=usuario+1) {
	            System.out.println("\nUsuario " + usuario); // "\n" significa salto de línea
	
	            System.out.print("¿Cuántos días ha acudido al gimnasio? ");
	            int diasAsistencia = teclado.nextInt();
	
	            int minutosTotalesUsuario = 0;
	            int diasMasDe60 = 0;
	
	            for (int dia = 1; dia <= diasAsistencia; dia=dia+1) {
	                System.out.print("Minutos realizados el día " + dia + ": ");
	                int minutos = teclado.nextInt();
	
	                minutosTotalesUsuario += minutos;
	
	                if (minutos > 60) {
	                    diasMasDe60=diasMasDe60+1;
	                }
	            }
	
	            double mediaMinutos = 0;
	
	            if (diasAsistencia > 0) {
	                mediaMinutos = (double) minutosTotalesUsuario / diasAsistencia;
	            }
	
	            System.out.println("\nResultados del usuario " + usuario + ":");
	            System.out.println("Total de minutos: " + minutosTotalesUsuario);
	            System.out.println("Media de minutos por día: " + mediaMinutos);
	            System.out.println("Días con más de 60 minutos: " + diasMasDe60);
	
	            if (minutosTotalesUsuario >= 300) {
	                System.out.println("Ha alcanzado el objetivo semanal.");
	            } 
	            
	            else {
	                System.out.println("No ha alcanzado el objetivo semanal.");
	            }
	
	            	minutosTotalesTodos += minutosTotalesUsuario;
	            	diasTotalesTodos += diasAsistencia;
	
	            if (minutosTotalesUsuario > maximoMinutos) {
	                maximoMinutos = minutosTotalesUsuario;
	                usuarioConMasMinutos = usuario;
	            }
	        }
	
	        System.out.println("\n--- Resumen final ---");
	        System.out.println("Usuario que realizó más minutos: Usuario " + usuarioConMasMinutos);
	        System.out.println("Minutos realizados por ese usuario: " + maximoMinutos);
	        System.out.println("Minutos totales de todos los usuarios: " + minutosTotalesTodos);
	        System.out.println("Días totales de entrenamiento: " + diasTotalesTodos);
	
	        teclado.close();
	}
	
}
