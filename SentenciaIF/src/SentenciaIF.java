
public class SentenciaIF {

	public static void main(String[] args) {
		int num1 = 1;

		if(num1 < 4){
			System.out.println("El valor del número es menor que 4");
		}
		else if (num1 > 4){
			System.out.println("El valor del número es mayor que 4");	
		}
		else{
			System.out.println("El valor del número es 4");
		}

		switch(num1){
		case 0:
			System.out.println("El valor del número es 0");
			break;
		case 1:
			System.out.println("El valor del número es 1");
			break;
		case 2:
			System.out.println("El valor del número es 2");
			break;
		default:
			System.out.println("El valor del número es distinto de 0, 1 o 2");
		}
	}

}
