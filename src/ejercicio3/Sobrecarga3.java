package ejercicio3;

public class Sobrecarga3 {
	public static int sumaEnteros(int num) {
		int res = 0;
		for (int i = 1; i <= num; i++) {
			res += i;
		}
		return res;
	}

	public static int sumaEnteros(int num1,int num2) {
		int res=0;
		int min= num1 < num2 ? num1:num2;
		int max= num1 > num2 ? num1:num2;
		for(int i =min;i<=max;i++) {
			res+=i;
		}
		return res;
	}
}
