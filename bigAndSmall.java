import acm.program.*;
import acm.graphics.*;
import acm.util.*;
import java.awt.*;


public class bigAndSmall extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 1000;
    public static final int APPLICATION_LENGTH = 1000;
    public void run () {
        int x = 0;
 
        GOval circle = new GOval(100, 100);
        circle.setColor(Color.BLACK);
        circle.setVisible(true);
        add(circle);

        do {
            RandomGenerator rg = new RandomGenerator();
            circle.setLocation(rg.nextInt(0, 1000), rg.nextInt(0, 1000));
            x++;
            pause(1000);

        } while (x < 5);
        
        circle.setLocation(500, 500);
        
        for (int y = 1; x < 275; x++) {
            circle.scale(1.01);
            pause(5);
        } 
        
        for (int z = 1; x > 0; x--) {
            circle.scale(.99);
            pause(5);
        }
        
        
            
            
            
            

    }
}
