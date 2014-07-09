
public class Main {

	public static void main(String[] args) {
		System.out.println(Math.PI);
		System.out.println(Math.pow(Math.PI, 2)); //Para elevar PI al cuadrado
		System.out.println(4*Math.atan(1)); //Para sacar PI
		System.out.println((int) (Math.random()*40)); //Para obtener número aleatorios entre 0 y 40. Se pone int, porque Math.random() muestra números con decimales
		System.out.println((int) (Math.random()*(50-10+1))+10); //Para obtener número aleatorios entre 10 y 50
		
		Perro perro = new Perro();
		System.out.println(perro);
	}

}