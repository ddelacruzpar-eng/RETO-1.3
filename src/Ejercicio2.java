package ejercicios_reto1_3;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int dni=0;
		int nºcarrera=0;
		int	minutos=0;
		int segundos=0;
		boolean salir=false;
	boolean salir2=false;
		int numeroparticipantes=0;
	int menosde1hora=0;
		int numerodeparticipantes=0;
		int registrodeminutos=0;
		int registrodesegundos=0;
		int Nºmaximo=9999999;
		
		while (salir2==false)
		{
		
		
			
		System.out.println("introduce el DNI: ");
		dni=Integer.parseInt(teclado.nextLine());
		numeroparticipantes=numeroparticipantes+1;
	
		
		System.out.println("¿En que carrera participaras individual o por parejas?");
		String carrera = teclado.nextLine();

	
		System.out.println("Nº carreras populares participadas:");
		nºcarrera=Integer.parseInt(teclado.nextLine());
		if (nºcarrera<3)
		{
			numerodeparticipantes=numerodeparticipantes+1;
		}
		
		System.out.println("Introduce los minutos realizados:  ");
		minutos=Integer.parseInt(teclado.nextLine());
		if (minutos<Nºmaximo)
		{
			Nºmaximo=minutos;
		
		}
			
		if (minutos>0)
			
		{
		
		
			registrodeminutos=minutos+registrodeminutos;
		}
		
		
		if (minutos<60)
		{
			System.out.println("A terminado en menos de 60 mins");
			menosde1hora=menosde1hora+1;
			
		}
		
		System.out.println("introduce los segundos realizados: ");
		segundos=Integer.parseInt(teclado.nextLine());
		while (salir==false)
		{
			if (segundos<60)
			{
				salir=true;
				registrodesegundos=segundos+registrodesegundos;
			}
			else 
			{
				System.out.println("error introduzca otro numero: ");
				segundos=Integer.parseInt(teclado.nextLine());
			}
		}
		System.out.println("¿se desea continuar registrando participantes?");
		boolean haymasparticipantes= Boolean.parseBoolean(teclado.nextLine());
		if (haymasparticipantes==false)
		{
			salir2=true;
		}


		}
		teclado.close();
		System.out.println("numero de participantes: "+numeroparticipantes);
		System.out.println("numero de participantes que terminaron en menos de 60 minutos: "+menosde1hora);
	System.out.println("numero de participantes que han participado en mas de 3 carreras: "+numerodeparticipantes);
System.out.println("el tiempo medio realizado por tosos los participantes es: "+((double)(registrodeminutos+((double)registrodesegundos/60)))/numeroparticipantes);
	System.out.println("el mejor tiempo registrado es: "+Nºmaximo);
	}
		
	
	}


