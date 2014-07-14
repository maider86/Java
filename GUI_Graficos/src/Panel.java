import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class Panel extends JPanel implements MouseListener{
	
	private static final long serialVersionUID = -7726300252760245086L;
	
	private int y = 0;
	private int x = 0;
	
	public Panel(){
		this.setSize(400, 400);
		this.addMouseListener(this);
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 400, 400);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, 40, 40);
	}

	public void mouseClicked(MouseEvent e) {
		y = e.getY();
		x = e.getX();
		this.repaint(); //llama al método paintComponent
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
