import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class drawStar extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 1000;
    public static final int APPLICATION_HEIGHT = 1000;
    public void run () {
        setBackground(Color.WHITE);

        GLine top = new GLine(500, 0, 425, 175);
        top.setColor(Color.BLACK);
        add(top);
        GLine left = new GLine(425, 175, 200, 175);
        left.setColor(Color.BLACK);
        add(left);
        GLine leftIn = new GLine(200, 175, 375, 325);
        leftIn.setColor(Color.BLACK);
        add(leftIn);
        GLine leftOut = new GLine(375, 325, 330, 525);
        leftOut.setColor(Color.BLACK);
        add(leftOut);
        GLine bottomLeft = new GLine(330, 525, 500, 425);
        bottomLeft.setColor(Color.BLACK);
        add(bottomLeft);
        GLine bottomRight = new GLine(500, 425, 660, 525);
        bottomRight.setColor(Color.BLACK);
        add(bottomRight);
        GLine rightIn = new GLine(660, 525, 610, 340);
        rightIn.setColor(Color.BLACK);
        add(rightIn);
        GLine rightOut = new GLine(610, 340, 800, 175);
        rightOut.setColor(Color.BLACK);
        add(rightOut);
        GLine right = new GLine(800, 175, 570, 175);
        right.setColor(Color.BLACK);
        add(right);
        GLine last = new GLine(570, 175, 500, 0);
        last.setColor(Color.BLACK);
        add(last);
        
     
        
    


        }
}
