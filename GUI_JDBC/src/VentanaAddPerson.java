import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class VentanaAddPerson extends JFrame{

	private static final long serialVersionUID = -3088800592196759616L;
	
	private JTextField txtNombre;
	private JTextField txtApellido;
	private JTextField txtTelefono;
	
	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblTelefono;
	
	private JButton btnAgregar;
	
	private Ventana ventana;
	
	public VentanaAddPerson(Ventana ventana){
		super("Agregar persona");
		this.ventana = ventana;
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLayout(new FlowLayout());
		this.setSize(500, 150);
		this.setComponents();
		this.setVisible(true);
	}
	
	public void setComponents(){
		lblNombre = new JLabel("Nombre: ");
		this.add(lblNombre);
		txtNombre = new JTextField(15);
		this.add(txtNombre);
		
		lblApellido = new JLabel("Apellido: ");
		this.add(lblApellido);
		txtApellido = new JTextField(15);
		this.add(txtApellido);
		
		lblTelefono = new JLabel("Telefono: ");
		this.add(lblTelefono);
		txtTelefono = new JTextField(9);
		this.add(txtTelefono);
		
		btnAgregar = new JButton("Agregar");
		btnAgregar.addActionListener(ventana);
		
		this.add(btnAgregar);
	}

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtApellido() {
		return txtApellido;
	}

	public void setTxtApellido(JTextField txtApellido) {
		this.txtApellido = txtApellido;
	}

	public JTextField getTxtTelefono() {
		return txtTelefono;
	}

	public void setTxtTelefono(JTextField txtTelefono) {
		this.txtTelefono = txtTelefono;
	}

	public JButton getBtnAgregar() {
		return btnAgregar;
	}

	public void setBtnAgregar(JButton btnAgregar) {
		this.btnAgregar = btnAgregar;
	}
	
}