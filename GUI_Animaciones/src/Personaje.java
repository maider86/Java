import java.util.ArrayList;


public class Personaje extends Thread{
	
	private int cuadro;
	public int x;
	public int y;
	private Motor motor;
	
	public Personaje(int x, int y, Motor motor){
		cuadro = 0;
		this.x = x;
		this.y = y;
		this.motor = motor;
		this.start();		
	}
	
	public int obtenerCuadro(){
		return cuadro;
	}
	
	public void run(){
		while(cuadro < 19){
			try{
				Thread.sleep(100);
			}catch(Exception e){
				
			}
			cuadro++;
		}
		
		ArrayList vector = motor.obtenerPersonaje();
		for (int i = 0; i < vector.size(); i++){
			if (vector.get(i) == this){
				vector.remove(i);
			}
		}
	}

}