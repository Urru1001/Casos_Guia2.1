package caso2;

import java.util.Scanner;

public class caso14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Alumno: ");
		String nombre = sc.nextLine();
		System.out.println("Carrera[DS,RC,DG]: ");
		String carrera = sc.nextLine();
		System.out.println("Turno[M,T,N]: ");
		String turno = sc.nextLine();
		
		float monto = 0;
		
		switch (carrera) {
		
		case "DS":
			monto = 1500;
			break;
		case "RC":
			monto = 1400;
			break;
		case "DG":
			monto = 1300;
			break;
		default:
			monto = 0;
		}
		
		float desc = 0;
		String nom_t = "";
		
		switch (turno) {
		
		case "M":
			nom_t = "Mañana";
			desc = monto * 0.1f;
			break;
		case "T":
			nom_t = "Tarde";
			desc = monto * 0.2f;
			break;
		case "N":
			nom_t = "Noche";
			desc = monto * 0.15f;
		    break;
		default:
			desc = 0;
		}
		
		System.out.println("-------------------------------");
		System.out.println("------R E S U L T A D O S------");
		System.out.println("-------------------------------");
		System.out.println("Monto: " + monto);
		System.out.println("Nombre del turno: " + nom_t);
		System.out.println("Descuento: " + desc);
		System.out.println("Total a pagar: " + (monto - desc));
		System.out.println("Equivalente en dolares: " + ((monto - desc) / 3.33));
		

	}

}
