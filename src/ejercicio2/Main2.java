package ejercicio2;

import java.util.Scanner;

import ejercicio1.Sobrecarga1;

public class Main2 {

	public static void main(String[] args) {
		int num1, num2, num3, num4, num5;
		double mediaD,mediaE;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba las notas (2 notas)");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Escriba las notas (3 notas)");
		num3= sc.nextInt();
		num4= sc.nextInt();
		num5= sc.nextInt();
		mediaE= Sobrecarga2.media(num1, num2);
		mediaD= Sobrecarga2.media(num3, num4, num5);
		System.out.println("Media entero: "+mediaE);
		System.out.println("Media decimal: "+mediaD);
		sc.close();

	}

}
