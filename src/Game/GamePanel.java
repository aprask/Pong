package Game;

import javax.swing.*;
import java.awt.*;

public class Game extends JPanel
{
    private final static int WIDTH = 640;
    private final static int HEIGHT = 480;
    public void paintComponent(Graphics image)
    {
        image.setColor(Color.BLACK);
        image.setClip(0,0,WIDTH,HEIGHT);
    }
}
