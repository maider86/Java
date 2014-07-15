import javax.swing.JFrame;

public class Ventana extends JFrame{

	private static final long serialVersionUID = -6775489271518568856L;

	private Motor motor;
	private Panel panel;
	
	public Ventana(Motor motor){
		super("Personaje animado");
		this.motor = motor;
		this.setLayout(null);
		this.definirVentana();
		this.setSize(600, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void definirVentana(){
		panel = new Panel(motor);
		this.add(panel);
		this.addMouseListener(panel);
	}
	
	public Panel obtenerPanel(){
		return panel;
	}

}