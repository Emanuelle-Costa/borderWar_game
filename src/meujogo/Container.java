package meujogo;

import javax.swing.JFrame;

import meujogo.modelo.Nivel;

public class Container extends JFrame{

	public Container() {
		add(new Nivel());
		setTitle("War Game");
		setSize(1800, 950);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
	}
	
	
	
	public static void main (String[] args) {
		new Container();
	}
}
