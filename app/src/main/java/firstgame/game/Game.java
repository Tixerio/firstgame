package firstgame.game;

public class Game implements Runnable {

    private Thread thread;
    private final int FPS_SET = 120;
    GamePanel panel;
    Frame frame;


    public Game() {
        panel = new GamePanel();
        frame = new Frame(panel);
        panel.setFocusable(true);
        panel.requestFocus(); 
        startGameLoop();
    }

    private void startGameLoop() {
        thread = new Thread(this);
        thread.start();
    }

    public void run() {

        double timePerFrame = 1000000000.0 / FPS_SET;
		long lastFrame = System.nanoTime();
		long now = System.nanoTime();

		int frames = 0;
		long lastCheck = System.currentTimeMillis();

        while(true) {
            
            now = System.nanoTime();
			if (now - lastFrame >= timePerFrame) {
				panel.repaint();
				lastFrame = now;
				frames++;
			}

			if (System.currentTimeMillis() - lastCheck >= 1000) {
				lastCheck = System.currentTimeMillis();
				System.out.println("Frames: " + frames);
				frames = 0;
			}
        }
    }
}
