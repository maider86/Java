
public class StaticsYFinal {

	public static int num1; //Al ser Static, aunque se crean varios objetos, siempre comparten la misma variable
	public final int num2 = 100; //Al ser final, no se podrá modificar su valor
	
	public StaticsYFinal(){
		num1++;
	}
	
}
