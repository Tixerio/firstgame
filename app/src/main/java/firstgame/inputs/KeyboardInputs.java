package firstgame.inputs;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import firstgame.game.GamePanel;

public class KeyboardInputs implements KeyListener {
    
    private GamePanel panel;
    public KeyboardInputs(GamePanel panel) {
        this.panel = panel;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()) {
            case KeyEvent.VK_A:
                panel.changeX(-5);
                break;
            case KeyEvent.VK_W:
                panel.changeY(-5);
                break;
            case KeyEvent.VK_S:
                panel.changeY(5);
                break;
            case KeyEvent.VK_D:
                panel.changeX(5);
                break;
        }
    }
}
