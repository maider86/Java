
public class OperadoresLogicos {

	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 4;
		String message = "HOLA";
		boolean valor = false;
		
		//and = &&
		//or = ||
		//!= = es distinto
		//! = No
		if ((num1 == 5) && (message.equals("HOLA"))){
			System.out.println("El valor del número es 5 y el mensaje es HOLA");
		}
		if ((num1 == 5) || (message.equals("HOLA"))){
			System.out.println("El valor del número es 5 o el mensaje es HOLA");
		}
		if ((num1 != num2)){
			System.out.println("Los valores de los números son distintos");
		}
		if ((num1 == num2)){
			System.out.println("Los valores de los números son iguales");
		}
		if (!valor){
			System.out.println("Es verdadero");			
		}
	}

}
