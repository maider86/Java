import java.awt.FlowLayout;
import java.awt.GridBagLayout;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class Calculadora extends JFrame implements KeyListener{

	private static final long serialVersionUID = 7111133779348732172L;
	
	private JTextField texto;
	private JLabel label;
	
	public Calculadora(){
		super ("Calculadora: Suma de dos números");
		this.setLayout(new FlowLayout());
		this.definirVentana();
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	public void definirVentana(){
		texto = new JTextField(20);
		label = new JLabel();
		
		add(texto);
		add(label);
		
		texto.addKeyListener(this);
	}
	
	public void keyTyped(KeyEvent e) {
		
	}

	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER){
			String linea = texto.getText();
			int num1 = Integer.parseInt(linea.substring(0, linea.indexOf("+")));
			int num2 = Integer.parseInt(linea.substring(linea.indexOf("+")+1, linea.length()));
			label.setText(String.valueOf(num1+num2)); //valueOf = para que la suma lo transforma en String
		}
	}

	public void keyReleased(KeyEvent e) {
		
	}
	
}
