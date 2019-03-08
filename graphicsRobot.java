import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class graphicsRobot extends GraphicsProgram {
    public static final int APP_WIDTH = 500;
    public static final int APP_LENGTH = 500;

    public void run () {
        setBackground(Color.BLUE);

        GRect rect = new GRect(250, 250); // Robot's body.
        rect.setColor(Color.GRAY);
        rect.setFilled(true);
        add(rect, 250, 250);

        GOval head = new GOval(150, 150); // Robot's head.
        head.setColor(Color.GRAY);
        head.setFilled(true);
        add(head, 300, 100);
        
        GRect leftLeg = new GRect(50, 250); // Left leg.
        leftLeg.setColor(Color.GRAY);
        leftLeg.setFilled(true);
        add(leftLeg, 300, 500);
        
        GRect rightLeg = new GRect(50, 250); // Right leg.
        rightLeg.setColor(Color.GRAY);
        rightLeg.setFilled(true);
        add(rightLeg, 400, 500);
                     


        
    }
}


