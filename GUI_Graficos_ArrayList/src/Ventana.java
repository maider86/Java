import javax.swing.JFrame;

public class Ventana extends JFrame{

	private static final long serialVersionUID = -6775489271518568856L;

	public Ventana(){
		super("Graficos");
		this.setLayout(null);
		this.definirVentana();
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void definirVentana(){
		Panel panel = new Panel();
		add(panel);
	}

}