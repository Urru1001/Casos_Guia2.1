package caso2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class caso9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.println("Ingrese nombre del alumno(a): ");
		String nombre = sc.nextLine();
		
		System.out.println("Ingrese nota 1: ");
		float nota1 = sc.nextInt();
		
		System.out.println("Ingrese nota 2: ");
		float nota2 = sc.nextInt();
		
		System.out.println("Ingrese numero de asistencia [1-12]: ");
		int asistencia = sc.nextInt();
		
		
		float promedio = nota1 * 0.3f + nota2 * 0.7f ;
		float pa = asistencia / 12 * 100;
		
		String estado = "Desaprobado";
		
		if (promedio >= 13 && pa >= 70)
			estado = "Aprobado";
		
		System.out.println("\n------R E S U L T A D O------");
		System.out.println("Alumno(a): " + nombre.toUpperCase());
		System.out.println("Promedio: " + df.format(promedio));
		System.out.println("Asistencia: " + df.format(pa) + "%");
		System.out.println("Estado: " + estado);
		
	}

}
