import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ExcepcionesYStreams {

	public ExcepcionesYStreams(){
		InputStreamReader isr = new InputStreamReader(System.in); //System.in = porque la entrada de datos será la consola
		BufferedReader br = new BufferedReader(isr);
		String message = null;
		
		try{
			System.out.print("Escriba un mensaje: ");
			message = br.readLine();
		}catch(Exception e){
			System.out.println(e.getCause()); //Para obtener la causa del error
		}
		System.out.println("El mensaje que has escrito es: "+message);
	}
	
}
