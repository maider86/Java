import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	private ServerSocket serverSocket;
	private Socket socket;
	private ObjectOutputStream oos;
	
	public Server(){
		try{
			serverSocket = new ServerSocket(9999); //9999 = Puerto
			socket = serverSocket.accept();
			oos = new ObjectOutputStream(socket.getOutputStream());
			oos.writeObject("¡Bienvenido cliente!");
		}catch(Exception e){
			e.printStackTrace();
		}
		this.closeSocket();
	}

	public void closeSocket(){
		try{
			oos.close();
			socket.close();
			serverSocket.close();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}