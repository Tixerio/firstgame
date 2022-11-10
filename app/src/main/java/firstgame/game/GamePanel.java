package firstgame.game;

import java.awt.Graphics;
import javax.swing.JPanel;

import firstgame.Characters.Enemy;
import firstgame.inputs.KeyboardInputs;
import firstgame.inputs.MouseInputs;

public class GamePanel extends JPanel {

    MouseInputs mouseInputs = new MouseInputs(this);
    private int xCoordinate = 0, yCoordinate = 0;
    public int xSize = 400, ySize = 400;

    public GamePanel() {

        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

    public void changeX(int value) {
        this.xCoordinate += value;
        repaint();
    }

    public void changeY(int value) {
        this.yCoordinate += value;
        repaint();
    }

    Enemy e;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillRect(100 + xCoordinate, 100 + yCoordinate, 50, 50);
        g.fillRect(e.xPosition, e.yPosition, 50, 50); //enemy
    }
}