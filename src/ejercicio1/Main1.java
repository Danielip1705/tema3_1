package ejercicio1;

import java.util.Scanner;

public class Main1 {

	public static void main(String[] args) {
		int num1, num2, resE;
		double num3, num4, resD;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba dos numeros enteros");
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		System.out.println("Escriba dos numeros con decimales");
		num3= sc.nextDouble();
		num4= sc.nextDouble();
		resE= Sobrecarga1.suma(num1, num2);
		resD= Sobrecarga1.suma(num3, num4);
		System.out.println("Resultado entero: "+resE);
		System.out.println("Resultado decimal: "+resD);
	}

}
