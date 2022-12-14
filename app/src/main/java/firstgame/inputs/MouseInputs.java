package firstgame.inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import firstgame.game.GamePanel;

public class MouseInputs implements MouseListener, MouseMotionListener{

    private GamePanel panel;
    public MouseInputs(GamePanel panel) {
        this.panel = panel;
    }

    @Override
    public void mouseDragged(MouseEvent e) {
        
    }
    @Override
    public void mouseMoved(MouseEvent e) {
       panel.setRectPos(e.getX(), e.getY());
    }
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked");
    }
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }
}
