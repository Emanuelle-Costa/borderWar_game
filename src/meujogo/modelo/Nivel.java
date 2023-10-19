package meujogo.modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class Nivel extends JPanel implements ActionListener{

	private Image background;
	private List<Player> players;
	
	
	public Nivel() {
		ImageIcon easy = new ImageIcon("img/mapa1.png");
		background = easy.getImage();
		
		players = new ArrayList<>();
		
		players.add(new Time1(700, 150)); 
		players.add(new Time1(300, 300));
        players.add(new Time1(500, 400)); 
        players.add(new Time1(800, 500));
        players.add(new Time1(500, 650)); 
        
        
        players.add(new Time2(1300, 200));
        players.add(new Time2(1450, 500)); 
        players.add(new Time2(1100, 400)); 
        players.add(new Time2(1200, 650));
        
        
		for(Player player : players) {
			player.load();
		}
	}
	
	public void paint(Graphics g) {
		Graphics2D grafico = (Graphics2D) g;
		grafico.drawImage(background, 0, 0, getWidth(), getHeight(), this);
		
		for(Player player : players) {
			grafico.drawImage(player.getImagem(), player.getX(), player.getY(), this);
		}
		
		g.dispose();
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		repaint();
	}
}
