package firstgame.game;
import javax.swing.JFrame;


public class Frame {
    
    private JFrame frame;

    public Frame(GamePanel panel) {
        frame = new JFrame();


        frame.setSize(panel.xSize, panel.ySize);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setLocationRelativeTo(null);
        frame.pack();
        frame.setVisible(true);
    }
}
