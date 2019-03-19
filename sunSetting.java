import acm.program.*;
import acm.util.*;
import acm.graphics.*;
import java.awt.*;

public class sunSetting extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 500;
    public static final int APPLICATION_LENGTH = 500;
    public void run () {
       setBackground(Color.BLUE);
       int x = 200;
       int y = 200;

       GOval sun = new GOval(x, y);
       sun.setColor(Color.YELLOW);
       sun.setFilled(true);
       add(sun, (APPLICATION_WIDTH / 2) - (x / 2), (APPLICATION_LENGTH / 2) - (y / 2) - 400);

       while(sun.getY() <= APPLICATION_LENGTH) {
           sun.move(0, 1);
           pause(5);
       }
       sun.setVisible(false);
       
       setBackground(Color.BLACK);
       
       GLabel bye = new GLabel("good night");
       bye.setFont("SansSerif-PLAIN-32");
       bye.setColor(Color.WHITE);
       add(bye, (APPLICATION_WIDTH / 2) - (y / 2), (APPLICATION_LENGTH / 2) - (x / 2));
       
    
    }
}
