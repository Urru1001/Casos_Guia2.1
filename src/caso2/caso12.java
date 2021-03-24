package caso2;

import java.util.Scanner;

public class caso12 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Empleado: ");
		String empleado = sc.nextLine();
		
		System.out.print("nivel [1-4]: ");
		int nivel = sc.nextInt();
		
		System.out.println("Sueldo: ");
		float sueldo = sc.nextFloat();
		
		float incremento = 0;
		
		switch (nivel) {
		
		case 1:
			incremento = 0.045f;
			break;
		case 2: 
			incremento = 0.06f;
			break;
		case 3:
			incremento = 0.085f;
		case 4:
			incremento = 0.11f;
		default:
			incremento = 0;
		}
		
		float nuevo_sueldo = sueldo * (1 + incremento);
		
		System.out.println("-------------------------------");
		System.out.println("------R E S U L T A D O S------");
		System.out.println("-------------------------------");
		System.out.println("Empleado: " + empleado);
		System.out.println("Nivel: " + nivel);
		System.out.println("Sueldo: " + sueldo);
		System.out.println("Incremento: " + incremento + " %");
		System.out.println("Nuevo sueldo: " + nuevo_sueldo);

	}

}
