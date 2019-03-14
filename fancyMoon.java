import acm.program.*;
import acm.util.*;
import acm.graphics.*;
import java.awt.*;

public class fancyMoon extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_LENGTH = 500;
    public void run () {
        int x = 300;
        int y = 300;
        setBackground(Color.BLACK);

        GOval moon = new GOval(x, y);
        moon.setColor(Color.WHITE);
        moon.setFilled(true);
        add(moon, 0 /*(APPLICATION_WIDTH / 2) - (x / 2)*/, /* APPLICATION_LENGTH / 2 - (y / 2) + 200*/ 0);

        while(moon.getY() <= 500) {
            moon.move(.8, 1);
            moon.scale(.995);
            pause(7);
        }
        
        pause(1000);
        moon.setColor(Color.ORANGE);
        pause(500);
        setBackground(Color.RED);

    }
}

    


