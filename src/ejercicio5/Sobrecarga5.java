package ejercicio5;

public class Sobrecarga5 {
	public static void numerosAleatorios(int num) {
		int aleatorio;
		for (int i = 1;i<num;i++) {
			aleatorio = (int) Math.random();
			System.out.println(aleatorio);
		}
		
	}
}
