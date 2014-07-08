
public class Principal {

	public static void main(String[] args) {
		StaticsYFinal syf1 = new StaticsYFinal();
		System.out.println("Instancia del objeto syf1: "+syf1.num1);
		StaticsYFinal syf2 = new StaticsYFinal();
		System.out.println("Instancia del objeto syf1: "+syf1.num1);
		StaticsYFinal syf3 = new StaticsYFinal();
		System.out.println("Instancia del objeto syf1: "+syf1.num1);
		
		syf1.num1 = 4;
		System.out.println("Valor del objeto syf1 después de cambiar el valor al objeto syf1: "+syf1.num1);
		syf2.num1 = 3;
		System.out.println("Valor del objeto syf1 después de cambiar el valor al objeto syf2: "+syf1.num1);
		syf2.num1 = 10;
		System.out.println("Valor del objeto syf2 después de cambiar el valor al objeto syf3: "+syf2.num1);		
		
		
		Principal principal = new Principal();
		principal.metodo();
		metodoStatic();
	}
	
	public void metodo(){
		
	}

	public static void metodoStatic(){
		
	}
	
}
