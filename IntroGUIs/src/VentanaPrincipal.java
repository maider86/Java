import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaPrincipal extends JFrame implements ActionListener{
	
	private JButton jbtn_boton;
	private JTextField jtxt_texto;
	private JLabel jlbl_label;
	
	public VentanaPrincipal(){
		super("Mi primer GUI"); //Titulo de la ventana
		this.definirVentana();
		this.setResizable(false); //Para no poder modificar el tama�o de la ventana
		this.setLocationRelativeTo(null); //Para que el primer pixel de la ventana aparezca centrada
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //Para que se cierre la ventana y adem�s el programa se descargue de la memoria
		this.setVisible(true); //Para que la ventana sea visible
	}

	public void definirVentana(){
		//Forma en la que se van a ordenar los componentes
		this.setLayout(new FlowLayout()); //Ordena los componentes a medida que se vayan agregando con el m�todo add
		jbtn_boton = new JButton("Enviar");
		jtxt_texto = new JTextField(20); //Como par�metro se le pasa la cantidad de columnas
		jlbl_label = new JLabel();
		this.add(jtxt_texto);
		this.add(jbtn_boton);
		this.add(jlbl_label);
		jbtn_boton.addActionListener(this); //Para relacionar el bot�n con el m�todo que va a manejar los eventos de este bot�n. Interfaz de escucha para los eventos de este bot�n
											//this = porque va a utilizar el m�todo que maneja el evento que ya est� implementado en la misma clase. Porque el m�todo (actionPerformed) se encuentra presente en la misma clase
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbtn_boton){
			jlbl_label.setText(jtxt_texto.getText()); //Obtener lo que esta en el cuadro de texto y setearlo en el label
		}
	}
	
}
