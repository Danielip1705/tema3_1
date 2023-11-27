package ejercicio4;

public class Sobrecarga4 {
	public static boolean parseToBoolean(int num) {
		boolean comp=true;
		switch(num) {
		case 0:
			comp=false;
			break;
		case 1:
			comp=true;
			break;
			default:
				System.out.println("Solo se admiten los numeros 0 y 1");
		}
		
		return comp;
	}
	public static boolean parseToBoolean(String cadena) {
		
		boolean comp=true;
		switch(cadena) {
		case "false":
			comp=false;
			break;
		case"true":
			comp=true;
			break;
			default:
				System.out.println("Solo se permite las cadenas true no false");
		}
		return comp;
	}
	
}
