package meujogo;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

import meujogo.modelo.Iniciante;
import meujogo.modelo.Nivel;
import meujogo.modelo.Normal;
import meujogo.modelo.Avancado;
import meujogo.modelo.TelaInicial;

public class Container extends JFrame {
    private JPanel cardPanel;
    private TelaInicial telaInicial;
    private Nivel nivel1; // Classe Iniciante
    private Nivel nivel2; // Classe Normal
    private Nivel nivel3; // Classe Avançado

    public Container() {
        setTitle("War Game");
        setSize(1300, 950);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);

        cardPanel = new JPanel(new CardLayout());

        telaInicial = new TelaInicial(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (telaInicial.isOpcao1Selecionada()) {
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardLayout.show(cardPanel, "nivel1");
                } else if (telaInicial.isOpcao2Selecionada()) {
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardLayout.show(cardPanel, "nivel2");
                } else if (telaInicial.isOpcao3Selecionada()) {
                    CardLayout cardLayout = (CardLayout) cardPanel.getLayout();
                    cardLayout.show(cardPanel, "nivel3");
                }
            }
        });

        ImageIcon n1 = new ImageIcon("img/facil.png");
        ImageIcon n2 = new ImageIcon("img/medio.png");
        ImageIcon n3 = new ImageIcon("img/dificil.png");

        nivel1 = new Iniciante(n1.getImage());
        nivel2 = new Normal(n2.getImage());
        nivel3 = new Avancado(n3.getImage());

        cardPanel.add(telaInicial, "telaInicial");
        cardPanel.add(nivel1, "nivel1");
        cardPanel.add(nivel2, "nivel2");
        cardPanel.add(nivel3, "nivel3");

        add(cardPanel);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Container();
    }
}
