package firstgame.game;
import javax.swing.JFrame;


public class Frame {
    
    private JFrame frame;

    public Frame(GamePanel panel) {
        frame = new JFrame();

        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setVisible(true);
    }
}
