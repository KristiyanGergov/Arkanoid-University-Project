package game.com;

import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Paddle extends Sprite {

    private int dx;

    public Paddle() {

        ImageIcon ii = new ImageIcon("Images/paddle.gif");
        image = ii.getImage();

        imageWidth = image.getWidth(null);
        imageHeight = image.getHeight(null);

        resetState();
    }

    public void move() {

        x += dx;

        if (x <= 0) {
            x = 0;
        }

        if (x >= Constants.WIDTH - imageWidth) {
            x = Constants.WIDTH - imageWidth;
        }
    }

    public void keyPressed(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = -1;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 1;
        }
    }

    public void keyReleased(KeyEvent e) {

        int key = e.getKeyCode();

        if (key == KeyEvent.VK_LEFT) {
            dx = 0;
        }

        if (key == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }

    private void resetState() {

        x = Constants.INIT_PADDLE_X;
        y = Constants.INIT_PADDLE_Y;
    }
}