import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Fontetizar extends JFrame implements ItemListener{

	private JTextField jtxt_texto;
	private JRadioButton jrb_negrita;
	private JRadioButton jrb_cursiva;
	private JRadioButton jrb_ambos;
	private JRadioButton jrb_plano;
	private ButtonGroup bg_grupo; //Entre los botones agregados al grupo, sólo se permite una selección única
	
	public Fontetizar(){
		super("Fontetizar con RadioButton");
		this.setLayout(new FlowLayout());
		this.definirVentana();
		this.setSize(550, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
	
	private void definirVentana(){
		jtxt_texto = new JTextField(20);
		jrb_negrita = new JRadioButton("Negrita"); //Como paramétro se le pasa lo que aparecerá al lado del RadioButton
		jrb_cursiva = new JRadioButton("Cursiva");
		jrb_ambos = new JRadioButton("Ambos");
		jrb_plano = new JRadioButton("Plano");
		bg_grupo = new ButtonGroup();
		
		add(jtxt_texto);
		add(jrb_negrita);
		add(jrb_cursiva);
		add(jrb_ambos);
		add(jrb_plano);
		
		bg_grupo.add(jrb_negrita);
		bg_grupo.add(jrb_cursiva);
		bg_grupo.add(jrb_ambos);
		bg_grupo.add(jrb_plano);
		
		jrb_negrita.addItemListener(this);
		jrb_cursiva.addItemListener(this);
		jrb_ambos.addItemListener(this);
		jrb_plano.addItemListener(this);
	}
	
	private Font obtenerFuente(int num){
		Font resultado = null;
		
		switch(num){
			case 0:
				resultado = new Font ("Serief", Font.BOLD, 14);
				break;
			case 1: 
				resultado = new Font ("Serief", Font.ITALIC, 14);
				break;
			case 2: 
				resultado = new Font ("Serief", Font.BOLD|Font.ITALIC, 14);
				break;
			case 3: 
				resultado = new Font ("Serief", Font.PLAIN, 14);
				break;
		}
		
		return resultado;
	}
	
	public void itemStateChanged(ItemEvent e) {
		if (jrb_negrita.isSelected()){
			jtxt_texto.setFont(obtenerFuente(0));
		}
		else if (jrb_cursiva.isSelected()){
			jtxt_texto.setFont(obtenerFuente(1));
		}
		else if (jrb_ambos.isSelected()){
			jtxt_texto.setFont(obtenerFuente(2));
		}
		else if (jrb_plano.isSelected()){
			jtxt_texto.setFont(obtenerFuente(3));
		}
	}
	
}