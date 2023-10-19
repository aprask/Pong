package Game;

import Game.Internals.GameFrame;

public class Window
{
    private GameFrame gameFrame;
    public void openWindow()
    {
        gameFrame = new GameFrame();
    }

    public GameFrame getGameFrame() {
        return gameFrame;
    }

    public void setGameFrame(GameFrame gameFrame) {
        this.gameFrame = gameFrame;
    }
}
