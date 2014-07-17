import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class BDManagement {

	private final static String driver = "com.mysql.jdbc.Driver";
	private final static String db = "jdbc:mysql://localhost:3306/nikojavatutorialschema";
	private final static String user = "root";
	private final static String password = "passroot";
	
	private Connection connection;
	private Statement st;
	
	public BDManagement(){
		try{
			Class.forName(driver);
			connection = DriverManager.getConnection(db, user, password);
			st = connection.createStatement();
			System.out.println("Conexión con la base de datos");
		}catch(Exception e){
			System.out.println("No se pudo conectar a la base de datos");
		}
	}
	
	public void showAll(){
		try{
			ResultSet rs = st.executeQuery("SELECT * FROM personas");
			while (rs.next()){
				System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
			}
		}catch (Exception e){
			System.out.println("Error al realizar la consulta");
		}
	}
}