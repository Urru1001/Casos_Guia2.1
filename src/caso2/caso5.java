package caso2;

import java.util.Scanner;

public class caso5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingres precio: ");
		float precio = sc.nextFloat();
		
		System.out.print("Ingres cantidad: ");
		int cantidad = sc.nextInt();
		
		float total = precio * cantidad;
		
		float dscto = 0;
		
		if (cantidad > 8) dscto = (float) 0.1 * total;
		
		float neto = total - dscto;
		
		System.out.println("\n------R E S U L T A D O------");
		System.out.println("Total: " + total);
		System.out.println("Descuento: " + dscto);
		System.out.println("Neto: " + (total - dscto));

	}

}
