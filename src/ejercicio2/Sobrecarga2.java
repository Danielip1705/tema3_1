package ejercicio2;

public class Sobrecarga2 {
	public static int media(int num1, int num2) {
		double res = (num1 + num2) / 2;

		return (int) res;
	}
	public static double media(int num3, int num4, int num5) {
		double res=(num3+num4+num5)/3;
		return res;
	}
}
