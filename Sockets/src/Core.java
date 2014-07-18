import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Core {

	InputStreamReader isr = new InputStreamReader(System.in);
	BufferedReader br = new BufferedReader(isr);
	private String opcion;
	
	public Core(){
		System.out.println("¿Cómo desea ejecutar la aplicación?");
		System.out.println("1. Como Servidor");
		System.out.println("2. Como Cliente");
		
		try {
			opcion = br.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		if(opcion != null){
			if (opcion.equals("1")){
				Server server = new Server();
			}
			else if (opcion.equals("2")){
				Client client = new Client();
			}	
		}
	}
	
}