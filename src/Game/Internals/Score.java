package Game.Internals;

import java.awt.*;

public class Score
{
    private static int width;
    private static int height;
    private int player1Score;
    private int player2Score;
    public Score(int width, int height)
    {

    }

    public void displayScore(Graphics score)
    {

    }
    public static int getWidth() {
        return width;
    }

    public static void setWidth(int width) {
        Score.width = width;
    }

    public static int getHeight() {
        return height;
    }

    public static void setHeight(int height) {
        Score.height = height;
    }

    public int getPlayer1Score() {
        return player1Score;
    }

    public void setPlayer1Score(int player1Score) {
        this.player1Score = player1Score;
    }

    public int getPlayer2Score() {
        return player2Score;
    }

    public void setPlayer2Score(int player2Score) {
        this.player2Score = player2Score;
    }
}
