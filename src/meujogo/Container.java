package meujogo;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;

import meujogo.modelo.Nivel;
import meujogo.modelo.TelaInicial;

public class Container extends JFrame{
	  	private JPanel cardPanel;
	    private TelaInicial telaInicial;
	    private Nivel nivel;

	public Container() {
		setTitle("War Game");
		setSize(1800, 950);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		this.setResizable(false);
		setVisible(true);
		
		cardPanel = new JPanel(new CardLayout());

		telaInicial = new TelaInicial(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (telaInicial.isOpcao1Selecionada()) {
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardLayout.show(cardPanel, "nivel");
                }
            }
        });
        nivel = new Nivel();

        cardPanel.add(telaInicial, "telaInicial");
        cardPanel.add(nivel, "nivel");

        add(cardPanel);

        setVisible(true);
	}
	
	
	
	public static void main (String[] args) {
		new Container();
	
	}
}
