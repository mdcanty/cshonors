import acm.program.*;
import acm.graphics.*;
import java.awt.*;
import acm.util.*;

public class starryNight extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 1000;
    public static final int APPLICATION_HEIGHT = 1000;
    int TIME = 60;
    public void run () {
        setBackground(Color.BLACK);
        
        

    
        GOval red = new GOval(25, 25);
        red.setColor(Color.RED);
        red.setFilled(true);
        red.setVisible(true);
        
 


        GOval blue = new GOval(50, 50);
        blue.setColor(Color.BLUE);
        blue.setFilled(true);
        blue.setVisible(true);


        GOval yellow = new GOval(75, 75);
        yellow.setColor(Color.YELLOW);
        yellow.setFilled(true);
        yellow.setVisible(true);
 

        GOval white = new GOval(50, 50);
        white.setColor(Color.WHITE);
        white.setFilled(true);
        white.setVisible(true);





     
        
        
        do {

            RandomGenerator rg = new RandomGenerator();
            pause(100);

            red.setVisible(false);

            add(red, rg.nextInt(200, 800), rg.nextInt(200, 800));
            red.setVisible(true);
            add(red, rg.nextInt(200, 800), rg.nextInt(200, 800));

            pause(100);

            blue.setVisible(false);

            add(blue, rg.nextInt(200, 800), rg.nextInt(200, 800));
            blue.setVisible(true);
            add(blue, rg.nextInt(200, 800), rg.nextInt(200, 800));

            pause(100);

            yellow.setVisible(false);

            add(yellow, rg.nextInt(200, 800), rg.nextInt(200, 800));
            yellow.setVisible(true);
            add(yellow, rg.nextInt(200, 800), rg.nextInt(200, 800));
            
            pause(100);

            white.setVisible(false);

            add(white, rg.nextInt(200, 800), rg.nextInt(200, 800));
            white.setVisible(true);
            add(white, rg.nextInt(200, 800), rg.nextInt(200, 800));






        

        



 


        


       } while (true);
    }
}
