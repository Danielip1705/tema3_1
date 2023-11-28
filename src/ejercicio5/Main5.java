package ejercicio5;

import java.util.Scanner;

public class Main5 {

	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Escriba cuantos numeros quieres que salgan en consola aleatoriamente");
		
		num = sc.nextInt();
		
		Sobrecarga5.numerosAleatorios(num);
		sc.close();
		
	}

}
