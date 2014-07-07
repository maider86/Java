import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Fontetizar extends JFrame implements ItemListener{

	private JTextField jtxt_texto;
	private JCheckBox jcb_negrita;
	private JCheckBox jcb_cursiva;
	private Font fuente; 
	
	public Fontetizar(){
		super("Fontetizar"); //Constructor del JFrame
		this.setLayout(new FlowLayout());
		this.definirVentana();
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
		
	}
	
	private void definirVentana(){
		jtxt_texto = new JTextField(20);
		jcb_negrita = new JCheckBox("Negrita"); //Como parámetro se pasa lo que aparecerá al lado del CheckBox
		jcb_cursiva = new JCheckBox("Cursiva");
		add(jtxt_texto);
		add(jcb_negrita);
		add(jcb_cursiva);
		jcb_negrita.addItemListener(this);
		jcb_cursiva.addItemListener(this);
	}

	public void itemStateChanged(ItemEvent e) { //Para manejar el cambio de eventos de los CheckBox
		if ((jcb_negrita.isSelected()) && (jcb_cursiva.isSelected())){
			//Cambiar el texto a negrita y a cursiva
			fuente = new Font("Serief", Font.BOLD|Font.ITALIC, 14); //| = Para combinar negrita y cursiva
			jtxt_texto.setFont(fuente);
		} else if (jcb_negrita.isSelected()){
			//Cambiar el texto a negrita
			fuente = new Font("Serief", Font.BOLD, 14);
			jtxt_texto.setFont(fuente);
		} else if (jcb_cursiva.isSelected()){
			//Cambiar el texto a cursiva
			fuente = new Font("Serief", Font.ITALIC, 14);
			jtxt_texto.setFont(fuente);
		}
		else{
			//Cambiar el texto al formato normal
			fuente = new Font("Serief", Font.PLAIN, 14);
			jtxt_texto.setFont(fuente);
		}
	}
	
	
	
}
