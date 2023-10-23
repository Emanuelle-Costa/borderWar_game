package meujogo.modelo;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.border.EmptyBorder;

public class TelaInicial extends JPanel{
	private JRadioButton level1, level2, level3;
	private JRadioButton player1, player2;
	private JButton jogarButton;

    public TelaInicial(ActionListener buttonListener) {
        setLayout(null);
        
        JPanel panel = new JPanel();
        panel.setBackground(Color.WHITE);
        panel.setBounds(750, 650, 300, 140);

        ImageIcon backgroundImageIcon = new ImageIcon("img/inicial.png");
        Image backgroundImage = backgroundImageIcon.getImage();
        int larguraContainer = 1800;
        int alturaContainer = 950;

       
        Image scaledBackgroundImage = backgroundImage.getScaledInstance(larguraContainer, alturaContainer, Image.SCALE_SMOOTH);
        ImageIcon scaledBackgroundImageIcon = new ImageIcon(scaledBackgroundImage);

        
        JLabel backgroundLabel = new JLabel(scaledBackgroundImageIcon);
        backgroundLabel.setBounds(0, 0, larguraContainer, alturaContainer);
        add(backgroundLabel);

        
        level1 = new JRadioButton("Iniciante");
        level2 = new JRadioButton("Normal");
        level3 = new JRadioButton("Avançado");
        

        ButtonGroup grupoBotoesRadio = new ButtonGroup();
        grupoBotoesRadio.add(level1);
        grupoBotoesRadio.add(level2);
        grupoBotoesRadio.add(level3);
        
        level1.setBounds(10, 10, 120, 40);
        level2.setBounds(10, 60, 120, 40);
        level3.setBounds(10, 110, 120, 40);
        
        
        player1 = new JRadioButton("Player 1");
        player2 = new JRadioButton("Player 2");

        ButtonGroup grupoBotoesRadioPlayer = new ButtonGroup();
        grupoBotoesRadioPlayer.add(player1);
        grupoBotoesRadioPlayer.add(player2);

        player1.setBounds(10, 190, 120, 40);
        player2.setBounds(10, 240, 120, 40);
 
        
        jogarButton = new JButton("Jogar");
        jogarButton.setBounds(140, 10, 150, 80);

        
        
        jogarButton.setForeground(Color.BLACK); 
        Font font = new Font("Arial", Font.BOLD, 36); 
        jogarButton.setFont(font);
        jogarButton.setBorder(new EmptyBorder(10, 20, 10, 20));
        
        
        panel.add(level1);
        panel.add(level2);
        panel.add(level3);
        panel.add(player1);
        panel.add(player2);
        panel.add(jogarButton);

        
        add(panel);
       
        jogarButton.addActionListener(buttonListener);
        
           
    }
    
    
    public boolean isOpcao1Selecionada() {
        return level1.isSelected();
    }
    public boolean isOpcao2Selecionada() {
        return level2.isSelected();
    }

    public boolean isOpcao3Selecionada() {
        return level3.isSelected();
    }
}


