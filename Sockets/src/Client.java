import java.io.ObjectInputStream;
import java.net.Socket;

public class Client {

	private Socket socket;
	private ObjectInputStream ois; //Recibe los objectos que envía el Server
	
	public Client(){
		try{
			socket = new Socket("localhost", 9999); //localhost = dirección IP
			ois = new ObjectInputStream(socket.getInputStream());
			System.out.println((String)ois.readObject());
			ois.close();
			socket.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}