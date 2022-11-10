package firstgame.game;

public class Game {
    public Game() {
        GamePanel panel = new GamePanel();
        Frame frame = new Frame(panel);
        panel.requestFocus();
    }
}
