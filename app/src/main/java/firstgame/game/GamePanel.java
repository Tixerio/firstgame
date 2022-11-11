package firstgame.game;

import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;
import java.io.FileInputStream;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import firstgame.inputs.KeyboardInputs;
import firstgame.inputs.MouseInputs;

public class GamePanel extends JPanel {

    MouseInputs mouseInputs = new MouseInputs(this);
    private float xCoordinate = 100, yCoordinate = 100;
    public int xSize = 400, ySize = 400;  
    private BufferedImage img, subImg;  

    public GamePanel() {

        importImg();

        setPanelSize();
        addKeyListener(new KeyboardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);
    }

  
	private void importImg() {

		try {
			img =  ImageIO.read(new FileInputStream("D:/Programmieren/Java/firstgame/res/player_sprites.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	} 

    private void setPanelSize() {
        Dimension size = new Dimension(1280, 800);
        setMinimumSize(size);
        setPreferredSize(size);
        setMaximumSize(size);
    }

    public void changeX(int value) {
        this.xCoordinate += value;
    }

    public void changeY(int value) {
        this.yCoordinate += value;
    }

    public void setRectPos(int x, int y) {
        this.xCoordinate = x;
        this.yCoordinate = y;
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        subImg = img.getSubimage(1*64, 8*40, 64, 40);
        g.drawImage(subImg, (int) xCoordinate, (int) yCoordinate, 128, 80, null);

       //g.drawImage(null, x, y, null)
    }
}