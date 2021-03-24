package caso2;

import java.util.Scanner;

public class caso10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.println("Horas: ");
		float h = sc.nextFloat();
		
		System.out.println("Tarifa por hora: ");
		float th = sc.nextFloat();
		
		System.out.println("Minutos: ");
		int min = sc.nextInt();
		
		float importe = (float) h * th;
		
		float bono = 0;
		if(h > 60)
			bono = (float) (importe * 0.13);
		else
			bono = (float) (importe * 0.04);
		
		float desc = 0;
		if(min > 15)
			desc = (float)(importe * 0.03);
		
		float por_h = (float)(h / 70)* 100;
		
		System.out.println("---------------------------");
		System.out.println("====R E S U L T A D O S====");
		System.out.println("---------------------------");
		System.out.println("Trabajador: " + nombre);
		System.out.println("Horas Trabajadas: " + h);
		System.out.println("Tarifa por hora: " + th);
		System.out.println("Importe: " + importe);
		System.out.println("Bono: " + bono);
		System.out.println("Descuento: " + desc);
		System.out.println("Meta alcanzada: " + por_h + "%");

	}

}
