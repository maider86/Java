import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Ventana extends JFrame implements ItemListener{

	private JComboBox jcb_combo;
	private JLabel jlbl_label;
	private String[] archivos = {"N1.png", "N2.png"};
	private Icon[] iconos = {new ImageIcon(getClass().getResource(archivos[0])), new ImageIcon(getClass().getResource(archivos[1]))}; //getClass--> Irá a la carpeta de los .class
	
	public Ventana(){
		super("JComboBox");
		this.setLayout(new FlowLayout());
		this.definirVentana();
		this.setSize(400, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);		
	}
	
	private void definirVentana(){
		jcb_combo = new JComboBox(archivos);
		jlbl_label = new JLabel();
		jlbl_label.setIcon(iconos[0]); //Por defecto, aparecerá marcado el primer icono
		jcb_combo.addItemListener(this);
		
		add(jcb_combo);
		add(jlbl_label);
	}

	public void itemStateChanged(ItemEvent e) {
		jlbl_label.setIcon(iconos[jcb_combo.getSelectedIndex()]);
	}
	
}