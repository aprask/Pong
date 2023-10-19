package Game.Internals;

import Game.GamePanel;

import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame
{
    private final GamePanel gamePanel;
    public GameFrame()
    {
        gamePanel = new GamePanel();
        this.add(gamePanel);
        this.setTitle("Pong");
        this.setResizable(false);
        this.setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }


    public GamePanel getGamePanel() {
        return gamePanel;
    }
}
