
public class SentenciaIF {

	public static void main(String[] args) {
		int num1 = 1;

		if(num1 < 4){
			System.out.println("El valor del n�mero es menor que 4");
		}
		else if (num1 > 4){
			System.out.println("El valor del n�mero es mayor que 4");	
		}
		else{
			System.out.println("El valor del n�mero es 4");
		}

		switch(num1){
		case 0:
			System.out.println("El valor del n�mero es 0");
			break;
		case 1:
			System.out.println("El valor del n�mero es 1");
			break;
		case 2:
			System.out.println("El valor del n�mero es 2");
			break;
		default:
			System.out.println("El valor del n�mero es distinto de 0, 1 o 2");
		}
	}

}
