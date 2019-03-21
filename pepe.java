import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.*;

public class pepe extends GraphicsProgram {
public static final int APPLICATION_WIDTH = 1000;
public static final int APPLICATION_HEIGHT = 1000;
    public void run () {

        GImage plane = new GImage("images/plane.png");
        // add(plane, 20, 500);
        
        GImage pepeGhost = new GImage("images/pepe-ghost.gif");
        
        GImage max = new GImage("images/max.png");
        
        GImage mew = new GImage("images/mew.png");
        
        do {
            add(plane, 0, 500);
            plane.scale(.5);
            while (plane.getX() < 1100) {
                plane.move(1, 0);
                pause(3);
            }
            
            plane.scale(1.5);
            remove(plane);
            
            pepeGhost.scale(.5);
            add(pepeGhost,500, -200);
            while (pepeGhost.getY() < 1100) {
                pepeGhost.move(0, 1);
                pause(3);
            }
            
            pepeGhost.scale(1.5);
            
            remove(pepeGhost);
            
            add(max, 1200, 500);
            max.scale(.5);
            while (max.getX() > 0) {
                max.move(-1, 0);
                pause(2);
            }
            max.scale(1.5);
            remove(max);
            
            add(mew, 1000, 700);
            
            RandomGenerator rg = new RandomGenerator();
            
            while (mew.getY() > 0) {
                mew.move(-2, -1);
                pause(1);
            }
            
            
            remove(mew);
                
            
            
            
                
            
            
        } while (true);


    }
}
