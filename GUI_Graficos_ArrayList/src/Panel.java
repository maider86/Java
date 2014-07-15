import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import javax.swing.JPanel;

public class Panel extends JPanel implements MouseMotionListener{

	private static final long serialVersionUID = -9029032742979788016L;

	private ArrayList puntos;
	
	public Panel(){
		puntos = new ArrayList();
		this.setSize(400, 400);
		this.addMouseMotionListener(this);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 400, 400); //Para rellenar el fondo de blanco
		dibujarPuntos(g);
	}
	
	public void dibujarPuntos(Graphics g){
		for (int i = 0; i < puntos.size(); i++){
			g.setColor(Color.BLACK);
			Point aux = (Point) puntos.get(i);
			g.drawRect(aux.x, aux.y, 1, 1);
		}
	}
	
	public void mouseDragged(MouseEvent e) {
		Point p = new Point(e.getX(), e.getY()); //Crea un punto en donde pasa el ratón
		puntos.add(p); //Añade ese punto al ArrayList
		this.repaint();
	}

	public void mouseMoved(MouseEvent e) {
		
	}

}
