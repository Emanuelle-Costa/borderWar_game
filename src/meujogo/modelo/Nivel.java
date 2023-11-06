package meujogo.modelo;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public abstract class Nivel extends JPanel implements ActionListener {
    private Image background;
    private List<Player> players;

    public Nivel(Image backgroundImage) {
        background = backgroundImage;
        players = new ArrayList<>();

        int numTime1 = new Random().nextInt(8) + 3; // Entre 3 e 10
        int numTime2 = new Random().nextInt(8) + 3;

        for (int i = 0; i < numTime1; i++) {
            players.add(new Time1(randomXTime1(), randomYTime1()));
        }

        for (int i = 0; i < numTime2; i++) {
            players.add(new Time2(randomXTime2(), randomYTime2()));
        }

        for (Player player : players) {
            player.load();
        }
    }

    public abstract int randomXTime1();

    public abstract int randomYTime1();

    public abstract int randomXTime2();

    public abstract int randomYTime2();

    
    public int generateRandomNumber(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }

    public void paint(Graphics g) {
        Graphics2D grafico = (Graphics2D) g;
        grafico.drawImage(background, 0, 0, getWidth(), getHeight(), this);

        for (Player player : players) {
            grafico.drawImage(player.getImagem(), player.getX(), player.getY(), this);
        }

        g.dispose();
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }
}
