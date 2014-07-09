import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class VentanaChat extends JFrame implements ActionListener, KeyListener{

	private static final long serialVersionUID = 3252232561322747128L;

	private JTextArea area;
	private JScrollPane scroll;
	private JTextField texto;
	private JButton boton;

	public VentanaChat(){
		super("GridBagLayout"); //Llama al constructor de la clase JFrame
		this.setLayout(new GridBagLayout());
		this.definirVentana();
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public void definirVentana(){
		GridBagConstraints gbc = new GridBagConstraints();

		area = new JTextArea();
		scroll = new JScrollPane(area); //Como parámetro se le pasa el componente al que le afectará la barra de desplazamiento
		texto = new JTextField(20);
		boton = new JButton("Enviar");

		//Definición de las restricciones para el TextArea y el Scroll
		area.setEditable(false);
		gbc.gridx = 0; //Columna en la que empezará
		gbc.gridy = 0; //Fila en la que empezará
		gbc.gridwidth = 2; //Cantidad de columnas que ocupará
		gbc.gridheight = 1; //Cantidad de filas que ocupará
		gbc.weightx = 1.0; 
		gbc.weighty = 1.0;
		gbc.fill = GridBagConstraints.BOTH; //Que crezca a ambos lados
		add(scroll,gbc);

		//Definición de las restricciones para el TextField 
		gbc.gridx = 0;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 1.0; 
		gbc.weighty = 0.0; //Para que mantenga su ancho original
		gbc.fill = GridBagConstraints.HORIZONTAL;
		add(texto,gbc);

		//Definición de las restricciones para el Button
		gbc.gridx = 1;
		gbc.gridy = 1;
		gbc.gridwidth = 1;
		gbc.gridheight = 1;
		gbc.weightx = 0.0; 
		gbc.weighty = 0.0;
		gbc.fill = GridBagConstraints.NONE; //Para que no crezca
		add(boton,gbc);

		boton.addActionListener(this);
		texto.addKeyListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == boton){
			area.append(texto.getText()+"\n");
			texto.setText(""); //Vaciar el TextField
		}
	}

	public void keyTyped(KeyEvent e) { //El tiempo que se mantiene pulsada la tecla

	}

	public void keyPressed(KeyEvent e) { //El momento en el que se pulsa la tecla
		//El componente que debe escuchar el evento de la tecla es el textField
		switch(e.getKeyCode()){ //Obtiene el número de la tecla que se haya pulsado
			case KeyEvent.VK_ENTER:
				area.append(texto.getText()+"\n");
				texto.setText(""); //Vaciar el TextField
				break;
		}
	}

	public void keyReleased(KeyEvent e) { //El momento en el que se suelta la tecla

	}
}