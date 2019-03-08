// Basic graphics example.
import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class graphicsExample extends GraphicsProgram {
    public static final int APP_WIDTH = 1000;
    public static final int APP_HEIGHT = 1000;

    public void run () {
        setBackground(Color.BLACK); // Sets color of background.

        // Make objects and put them on screen.
        
        GOval ball = new GOval(100, 50); // Ball.
        ball.setColor(Color.WHITE);
        ball.setFilled(false);
        add(ball, 0, 0);

        GRect rect = new GRect(100, 40); // Rectangle.
        rect.setColor(Color.WHITE);
        rect.setFilled(true);
        add(rect, 500, 500);

        GLabel label = new GLabel ("Hello Class", 300, 300); // Label.
        add(label);
    }
}





