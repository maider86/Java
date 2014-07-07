
public class Bucles {

	public static void main(String[] args) {
		int cont = 0;
		
		while (cont < 10){
			System.out.println("Dentro del while: "+cont);
			cont++;
		}
		
		cont = 0;
		do{
			System.out.println("Dentro del Do-While: "+cont);
			cont++;
		}while(cont < 10);
		
		for(int i = 0; i < 10; i++){
			System.out.println("Dentro del For: "+i);
		}
		
		for(int i = 10; i > -1; i--){
			System.out.println("Dentro del For: "+i);
		}
	}

}
