import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class center extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_LENGTH = 500;
    public void run () {
        int x = 100;
        int y = 100;
        GOval circle = new GOval(x, y);
        circle.setColor(Color.BLACK);
        circle.setLocation(((APPLICATION_LENGTH / 2) - (y / 2)), ((APPLICATION_WIDTH / 2) - (x / 2)));
        circle.setVisible(true);
        add(circle);
    }
}

        
