import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Panel extends JPanel implements MouseListener{
	
	private static final long serialVersionUID = -7726300252760245086L;
		
	private BufferedImage personaje;
	private Motor motor;
	
	public Panel(Motor motor){
		this.motor = motor;
		this.setSize(600, 600);
		this.cargarPersonaje();
	}

	public void cargarPersonaje(){
		try{
			personaje = ImageIO.read(getClass().getClassLoader().getResource("personajeSprites.png"));
		}catch(Exception e){
			System.out.println("No se ha encontrado la imagen");
		}
	}
	
	public void paintComponent(Graphics g){
		super.paintComponent(g);
		g.setColor(Color.WHITE);
		g.fillRect(0, 0, 600, 600);
		dibujarPersonajes(g);
	}
	
	public void dibujarPersonajes(Graphics g){
		if (motor.obtenerPersonaje().size() != 0){
			ArrayList aux = motor.obtenerPersonaje();
			for (int i = 0; i < aux.size(); i++){
				Personaje exp = (Personaje) aux.get(i);
				g.drawImage(personaje, exp.x, exp.y, exp.x+32, exp.y+32, exp.obtenerCuadro()*32, 0, exp.obtenerCuadro()*32+32, 32, null);
			}
		}
	}
	
	public void mouseClicked(MouseEvent e) {
		
	}

	public void mousePressed(MouseEvent e) {
		motor.obtenerPersonaje().add(new Personaje(e.getX(), e.getY(), motor));
	}

	public void mouseReleased(MouseEvent e) {
		
	}

	public void mouseEntered(MouseEvent e) {
		
	}

	public void mouseExited(MouseEvent e) {
		
	}
	
}
