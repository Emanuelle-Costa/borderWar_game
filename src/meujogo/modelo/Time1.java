package meujogo.modelo;

import javax.swing.ImageIcon;

public class Time1 extends Player {

	public Time1(int x, int y) {
		super(x, y);

	}
	
	@Override
	public void load() {
		ImageIcon player = new ImageIcon("img/azul.png");
		imagem = player.getImage();
		altura = imagem.getHeight(null);
		largura = imagem.getWidth(null);
	}


}
