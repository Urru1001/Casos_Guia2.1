package caso2;

import java.util.Scanner;

public class caso3o3 {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingres numero 1: ");
		int n1 = sc.nextInt();
		
		System.out.print("Ingres numero 2: ");
		int n2 = sc.nextInt();
		
		System.out.print("Ingres numero 3: ");
		int n3 = sc.nextInt();
		
		System.out.print("Ingres numero 4: ");
		int n4 = sc.nextInt();
		
		String mensaje = "";
		
		if (n1 == n2 && n1 == n3 && n1 == n4)
			mensaje = "Los numeros son iguales";
		else if (n1 > n2 && n1 > n3 && n1 > n4)
		mensaje = "El primer numero " + n1 + " es mayor";
		else if (n2 > n1 && n2 > n3 && n2 > n4)
			mensaje = "El segundo numero " + n2 + " es mayor";
		else if (n3 > n1 && n3 > n2 && n3 > n4)
			mensaje = "El tercer numero " + n3 + " es mayor";
		else 
			mensaje = "El cuarto numero " + n4 + " es mayor";
		
		System.out.println("\n------R E S U L T A D O------");
		System.out.println("Mensaje: " + mensaje);

	}

}
