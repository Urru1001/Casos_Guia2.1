package caso2;

import java.util.Scanner;

public class caso6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Sueldo: ");
		float sueldo = sc.nextFloat();
		
		float impuesto = 0;
		
		if (sueldo > 2800)
			impuesto = (float)(sueldo * 0.05);
		else 
			impuesto = (float)(sueldo * 0.02);
		
		System.out.println("Impuesto calculado: " + impuesto);

	}

}
