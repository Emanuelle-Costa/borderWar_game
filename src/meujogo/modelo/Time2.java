package meujogo.modelo;

import javax.swing.ImageIcon;

public class Time2 extends Player{
	
	public Time2(int x, int y) {
		super(x, y);

	}

	@Override
	public void load() {
		ImageIcon player = new ImageIcon("img/green.png");
		imagem = player.getImage();
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
		
	}

}
