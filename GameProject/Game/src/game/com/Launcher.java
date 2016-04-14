package game.com;

import java.awt.*;

public class Launcher {
    public static void main(String[] args) {

        EventQueue.invokeLater(() -> {
            Breakout game = new Breakout();
            game.setVisible(true);
        });
    }
}
