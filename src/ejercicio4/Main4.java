package ejercicio4;

import java.util.Scanner;

public class Main4 {

	public static void main(String[] args) {
		int num;
		String cadena;
		boolean comp, comp1;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba un numero");
		num = sc.nextInt();
		System.out.println("Escriba true o false");
		cadena = sc.next();
		comp=Sobrecarga4.parseToBoolean(num);
		comp1=Sobrecarga4.parseToBoolean(cadena);
		System.out.println("Resultado con int: " +comp);
		System.out.println("Resultado con String: "+comp1);
		sc.close();
		
	}

}
