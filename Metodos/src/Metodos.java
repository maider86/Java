import java.util.*;

public class Metodos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		String input;
		System.out.println("Introduce el primer número entero");
		input = teclado.nextLine();
		int num1 = Integer.parseInt(input);
		System.out.println("Introduce el segundo número entero");
		input = teclado.nextLine();
		int num2 = Integer.parseInt(input);
		System.out.println("La resultado de la suma es: "+sumar(num1, num2));
	}

	public static int sumar (int num1, int num2){
		return (num1 + num2);
	}
}
