package Game;

import Game.Internals.Ball;
import Game.Internals.Paddle;
import Game.Internals.Score;
import Game.Internals.User;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class GamePanel extends JPanel
{
    private final static int WIDTH = 1000;
    private final static int HEIGHT = 555;
    private static final Dimension SIZE = new Dimension(WIDTH, HEIGHT);
    Thread gameThread;
    Image image;
    Graphics graphics;
    Random random;
    Paddle paddle1;
    Paddle paddle2;
    Ball ball;
    Score score;
    User user;
    public GamePanel()
    {
        paddle();
        ball();
        score = new Score(WIDTH, HEIGHT);
        this.setFocusable(true);
        this.addKeyListener(new AL());
    }
    public void paintComponent(Graphics image)
    {
        image.setColor(Color.BLACK);
        image.setClip(0,0,WIDTH,HEIGHT);
    }
    public void ball()
    {

    }
    public void paddle()
    {

    }
    public void paint(Graphics graphics)
    {

    }

    public class AL extends KeyAdapter
    {
        public void keyPressed(KeyEvent e)
        {}
        public void keyReleased(KeyEvent e)
        {}
    }
}
