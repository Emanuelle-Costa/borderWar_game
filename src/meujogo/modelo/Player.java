package meujogo.modelo;

import java.awt.Image;

import javax.swing.ImageIcon;

public abstract class Player {
	
	private int x, y;
	private int dx, dy;
	protected Image imagem;
	protected int altura;
	protected int largura;
	
	
	
	public Player(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public abstract void load();

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

	public Image getImagem() {
		return imagem;
	}

	
}
