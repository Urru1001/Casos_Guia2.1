package caso2;

import java.util.Scanner;

public class caso13 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Ingrese numero 1: ");
		float n1 = sc.nextFloat();
		System.out.println("Ingrese numero 2: ");
		float n2 = sc.nextFloat();
		System.out.println("Operacion[1-6]: ");
		int op = sc.nextInt();
		float solucion = 0;
		String operacion = "";
		
		switch (op) {
		
		case 1:
			operacion = "Suma";
			 solucion = n1 + n2;
			 break;
		case 2:
			operacion = "Resta";
			solucion = n1 - n2;
			break;
		case 3:
			operacion = "Multiplicacion";
			solucion = n1 * n2;
			break;
		case 4:
			operacion = "Division";
			solucion = n1 / n2;
			break;
		case 5:
			operacion = "Resto entero";
			solucion = n1 % n2;
			break;
		case 6:
			operacion = "Promedio";
			solucion = (n1 + n2) / 2;
			break;
		default:
			operacion = "Desconocido";
			solucion = 0;
			
		}
		
		System.out.println("-------------------------------");
		System.out.println("------R E S U L T A D O S------");
		System.out.println("-------------------------------");
		System.out.println("Numero 1: " + n1);
		System.out.println("Numero 2: " + n2);
		System.out.println("Operacion: " + operacion);
		if ((op == 4 || op == 5)&& n2 == 0)
			System.out.println("Imposible dividir entre 0");
		else
			System.out.println("Resultado: " + solucion);
		

	}

}
