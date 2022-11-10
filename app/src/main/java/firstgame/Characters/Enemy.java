package firstgame.Characters;

import firstgame.game.GamePanel;

public class Enemy extends GamePanel {

    GamePanel panel;

    public int getRandom(int max, int min) {
        return (int)Math.floor(Math.random()*(max-min+1)+min);
    }

    public int xPosition, yPosition;

    public Enemy() {
        xPosition = getRandom(panel.xSize-25, 25);
        yPosition = getRandom(panel.ySize-25, 25);
    }
}
