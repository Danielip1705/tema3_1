package ejercicio3;

import java.util.Scanner;

public class Main3 {

	public static void main(String[] args) {
		int num, num1,num2,resnum,resnum1;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba hasta que numero quieres sumar(empezando desde 1)");
		num = sc.nextInt();
		
		System.out.println("Escriba hasta que numero quieres sumar(insertando el comienzo y el final)");
		num1 = sc.nextInt();
		num2=sc.nextInt();
		
		resnum = Sobrecarga3.sumaEnteros(num);
		resnum1 = Sobrecarga3.sumaEnteros(num1, num2);
		System.out.println("1 hasta N = " +resnum);
		System.out.println("N hasta N = " +resnum1);
	}

}
