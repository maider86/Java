
public class Operadores {

	public static void main(String[] args) {
		int num1 = 3;
		
		num1 += 3; //num1 = num1 + 3;
		System.out.println(num1);
		num1 -= 3;//num1 = num1 - 3;
		System.out.println(num1);
		num1 *= 3;//num1 = num1 * 3;
		System.out.println(num1);
		num1 /= 3;//num1 = num1 / 3;
		System.out.println(num1);
		
		num1++;
		System.out.println(num1);
		num1--;
		System.out.println(num1);
		
		System.out.println(++num1); //con num1++, primero muestra el valor y después lo incrementa en 1
	}

}
