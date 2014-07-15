import java.util.ArrayList;


public class Motor extends Thread{
	
	private ArrayList personajes;
	private Ventana ventana;
	
	public Motor(){
		ventana = new Ventana(this);
		personajes = new ArrayList();
		this.start();
	}
	
	public void run(){
		while (true){
			try{
				Thread.sleep(15);
			}catch(Exception e){
				e.printStackTrace();
			}finally{
				ventana.obtenerPanel().repaint();
			}
		}
	}
	
	public ArrayList obtenerPersonaje(){
		return personajes;
	}

}
