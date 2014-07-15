
public class Hilo extends Thread{

	private int hilo;
	
	public void run(){
		
		try{
			Thread.sleep((long)(Math.random()*5)*1000); //Para que se duerma entre 0 y 5 segundos
		}catch(Exception e){
		}
		System.out.println("Terminó el hilo número: "+hilo);
		
	}
	
	public Hilo(int hilo){
		this.hilo = hilo;
	}
	
}