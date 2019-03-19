import acm.program.*;
import acm.util.*;
import acm.graphics.*;
import java.awt.*;


public class flyUFO extends GraphicsProgram {
public static final int APPLICATION_WIDTH = 1000;
public static final int APPLICATION_HEIGHT = 1000;

    public void run () {
        
        int x = 0;

        GLabel coord = new GLabel("", 10, 50);
        coord.setFont("SansSerif-PLAIN-32");
        add(coord);
        

        GOval base = new GOval(100, 50);
        base.setColor(Color.RED);
        base.setFilled(true);
        //add(base, 500, 500);

        GOval head = new GOval(40, 40);
        head.setColor(Color.GREEN);
        head.setFilled(true);
        add(head, 50, 480);
        
        GOval eye = new GOval(15, 10);
        eye.setColor(Color.BLACK);
        eye.setFilled(true);
        add(eye, 80, 480);
        
        GOval helmet = new GOval(70, 50);
        helmet.setColor(Color.BLACK);
        add(helmet, 30, 470);
        
        GRect tail = new GRect(20, 10);
        tail.setColor(Color.YELLOW);
        add(tail, 0, 520);
        tail.setFilled(true);
        
        GOval light = new GOval(15, 15);
        light.setColor(Color.YELLOW);
        add(light, 110, 520);
        light.setFilled(true);
        
        add(base, 10, 500);
        do{

        
        while (head.getX() <= 1000) {
            base.move(1, 0);
            head.move(1, 0);
            eye.move(1, 0);
            helmet.move(1, 0);
            tail.move(1, 0);
            light.move(1, 0);
            pause(5);
            x++;
            
            if (x % 2 == 0) {
                light.setVisible(true);
            } else {
                light.setVisible(false);
            }

            coord.setLabel("X Coordinate " + base.getX());
            
            

                
         }

        head.setLocation(50, 480);
        eye.setLocation(80, 480);
        helmet.setLocation(30, 470);
        tail.setLocation(0, 520);
        base.setLocation(10, 500);
        light.setLocation(110, 520);

        
        } while (true);
                
        




    }
}
