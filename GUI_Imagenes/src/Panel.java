import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel implements MouseListener{

	private static final long serialVersionUID = -6170902421346851580L;

	private BufferedImage agua;
	private Point punto;
	
	public Panel(){
		punto = new Point(0,0);
		this.setSize(400, 400);
		this.addMouseListener(this);
		cargarImagenes();
	}
	
	public void cargarImagenes(){
		try{
			agua = ImageIO.read(getClass().getClassLoader().getResource("agua.jpg"));
		}catch(Exception e){
			System.out.println("No se ha encontrado la imagen");
		}
	}
	
	public void paintComponent(Graphics g){
		super.paintComponents(g);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 400, 400);
		g.drawImage(agua, punto.x, punto.y, null);
	}
	
	public void mouseClicked(MouseEvent e) {
		punto.x = e.getX();
		punto.y = e.getY();
		this.repaint();
	}

	public void mousePressed(MouseEvent e) {
		
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}
	
}
