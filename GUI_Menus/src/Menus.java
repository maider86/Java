import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menus extends JFrame implements ActionListener{

	private static final long serialVersionUID = 4650153920146738746L;

	private JMenuBar barra;
	private JMenu archivo;
	private JMenu edicion;
	private JMenuItem abrir;
	private JMenuItem copiar;

	public Menus (){
		super ("Menu de navegación");
		this.setLayout(null);
		this.definirVentana();
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void definirVentana() {
		barra = new JMenuBar();
		archivo = new JMenu("Archivo");
		edicion = new JMenu("Edicion");
		barra.add(archivo);
		barra.add(edicion);
		abrir = new JMenuItem("Abrir");
		copiar = new JMenuItem("Copiar");
		archivo.add(abrir);
		edicion.add(copiar);
		
		this.setJMenuBar(barra); //Para mostrar la barra con todos los componentes
		
		abrir.addActionListener(this);
		copiar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == abrir){
			System.out.println("Se ha pulsado el botón ABRIR");
		}
		if (e.getSource() == copiar){
			System.out.println("Se ha pulsado el botón COPIAR");
		}
	}
	
}
