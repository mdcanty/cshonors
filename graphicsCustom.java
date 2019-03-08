import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class graphicsCustom extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 1000;
    public static final int APPLICATION_LENGTH = 1000;
    public void run () {


        setBackground(Color.BLACK);

        GOval outerCircle = new GOval(250, 250);
        outerCircle.setColor(Color.WHITE);
        outerCircle.setFilled(true);
        add(outerCircle, 500, 500);
        
        GOval innerCircle = new GOval(200, 200);
        innerCircle.setColor(Color.BLACK);
        innerCircle.setFilled(true);
        add(innerCircle, 525, 525);
        
        GRect leftA = new GRect(25, 200);
        leftA.setColor(Color.WHITE);
        leftA.setFilled(true);
        add(leftA, 550, 525);
        
        GRect middleA = new GRect(140, 25);
        middleA.setColor(Color.WHITE);
        middleA.setFilled(true);
        add(middleA, 575, 540);
        
        GRect rightA = new GRect(25, 180);
        rightA.setColor(Color.WHITE);
        rightA.setFilled(true);
        add(rightA, 680, 530);
        
        GRect bottomA = new GRect(125, 25);
        bottomA.setColor(Color.WHITE);
        bottomA.setFilled(true);
        add(bottomA, 575, 600);
        
        GLabel anarchy = new GLabel("ΜΟΛΩΝ ΛΑΒΕ");
        anarchy.setColor(Color.WHITE);
        add(anarchy, 575, 800);
        
        
        
     
        
    }
    
    
}
