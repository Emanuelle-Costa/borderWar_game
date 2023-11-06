package meujogo.modelo;

import java.awt.Dimension;
import java.awt.Image;

public class Iniciante extends Nivel {
    
	public Iniciante(Image backgroundImage) {
        super(backgroundImage);
       
        
    }
    


    @Override
    public int randomXTime1() {
        return generateRandomNumber(300, 500);
    }

    @Override
    public int randomYTime1() {
        return generateRandomNumber(180, 350);
    }

    @Override
    public int randomXTime2() {
        return generateRandomNumber(620, 850);
    }

    @Override
    public int randomYTime2() {
        return generateRandomNumber(100, 470);
    }
}
