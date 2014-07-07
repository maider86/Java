
public class Vectores {

	public static void main(String[] args) {
		int num[] = new int[5];
		
		num[0] = 1;
		num[1] = 5;
		num[2] = 6;
		num[3] = 10;
		num[4] = 14;
		obtenerNum(num, 3);
	}

	public static void obtenerNum(int num[], int position){
		System.out.println(num[position]);
	}
	
}
