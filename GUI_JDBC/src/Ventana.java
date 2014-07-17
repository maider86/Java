import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class Ventana extends JFrame implements ActionListener {

	private static final long serialVersionUID = -8851140711810198712L;

	private final String[] encabezados = {"Nombre", "Apellido", "Telefono"};
	
	private DefaultTableModel dtm = new DefaultTableModel();
	private JTable personTable = new JTable(dtm);
	private BDManagement bdm = new BDManagement();
	
	private JMenuBar menuBar;
	private JMenu actionMenu;
	private JMenuItem addMenuItem;
	private JMenuItem removeMenuItem;
	private JMenuItem readMenuItem;
	private JScrollPane scroll;
	private VentanaAddPerson ventanaAddPerson;
	
	private List<Integer> idPersonas = new ArrayList<Integer>();
	
	public Ventana(){
		super("GUI con Base de Datos");
		this.setLayout(null);
		this.setSize(420, 465);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addComponents();
		this.setVisible(true);
	}
	
	public void fillTable(){
		dtm.setRowCount(0);
		dtm.setColumnCount(0);
		dtm.setColumnIdentifiers(encabezados);
		idPersonas.clear();
		try{
			ResultSet aux = bdm.getStatement().executeQuery("SELECT * FROM personas");
			while (aux.next()){
				Object[] fila = {aux.getObject(2), aux.getObject(3), aux.getObject(4)};
				idPersonas.add((Integer)aux.getObject(1));
				dtm.addRow(fila);
			}
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
	
	public void addComponents(){
		menuBar = new JMenuBar();
		this.setJMenuBar(menuBar);
		actionMenu = new JMenu("Acciones");
		menuBar.add(actionMenu);
		addMenuItem = new JMenuItem("Agregar Registro");
		removeMenuItem = new JMenuItem("Eliminar Registro");
		readMenuItem = new JMenuItem("Leer Registros");
		actionMenu.add(addMenuItem);
		actionMenu.add(removeMenuItem);
		actionMenu.add(readMenuItem);
		addMenuItem.addActionListener(this);
		removeMenuItem.addActionListener(this);
		readMenuItem.addActionListener(this);
		
		dtm.setColumnIdentifiers(encabezados);
		
		//personTable.setEnabled(false);
		
		scroll = new JScrollPane(personTable);
		scroll.setBounds(0, 0, 400, 400);
		this.add(scroll);
	}
	
	public void deleteRows (int[] rowsSelected){
		for (int i = 0; i < rowsSelected.length; i++){
			String query = "DELETE FROM personas WHERE idpersonas = "+idPersonas.get(rowsSelected[i]);
			try{
				bdm.getStatement().executeUpdate(query);
			}catch (SQLException e){
				e.printStackTrace();
			}
		}
		this.fillTable();
	}
	
	public void addRow(Persona persona){
		String query = "INSERT INTO personas (nombre, apellido, telefono) VALUES ('"+persona.getNombre()+"', '"+persona.getApellido()+"', '"+persona.getTelefono()+"')";
		try{
			bdm.getStatement().executeUpdate(query);
		}catch (Exception e){
			e.printStackTrace();
		}
		this.fillTable();
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == addMenuItem){
			ventanaAddPerson = new VentanaAddPerson(this);
		}
		else if (e.getSource() == removeMenuItem){
			this.deleteRows(personTable.getSelectedRows());
		}
		else if (e.getSource() == readMenuItem){
			this.fillTable();
		}
		else if (e.getSource() == ventanaAddPerson.getBtnAgregar()){
			Persona persona = new Persona (ventanaAddPerson.getTxtNombre().getText(), ventanaAddPerson.getTxtApellido().getText(), ventanaAddPerson.getTxtTelefono().getText());
			this.addRow(persona);
			ventanaAddPerson.dispose();
		}
	}
}