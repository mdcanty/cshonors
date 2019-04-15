import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class alienAbduction extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 1000;
    public static final int APPLICATION_HEIGHT = 1000;
    public void run () {
        
        GImage beam = new GImage("images/AMF copy.gif");
        beam.setVisible(false);
        beam.scale(.20);
        
        setBackground(Color.BLUE);
        
        final int WAIT = 20;
        
        GRect grass = new GRect(APPLICATION_WIDTH, APPLICATION_HEIGHT / 3);
        grass.setColor(new Color(52, 135, 35));
        grass.setFilled(true);
        

        add(grass, 0, APPLICATION_HEIGHT - 200);
        
        tree t1 = new tree();
        add(t1, 0, grass.getY() - 50);
        
                
        tree t2 = new tree();
        add(t2, 400, grass.getY() - 50);
                
        tree t3 = new tree();
        add(t3, 600, grass.getY() - 50);
                
        tree t4 = new tree();
        add(t4, 800, grass.getY() - 50);

        
        UFO u1 = new UFO();
        add(u1, -200, APPLICATION_HEIGHT / 2);
        
        COW c1 = new COW();
        add(c1, 500, grass.getY() - 50);
        
        COW c2 = new COW();
        add(c2, 700, grass.getY() - 50);
        
        COW c3 = new COW();
        add(c3, 200, grass.getY() - 50);
        
        
        do {
            
            c1.setVisible(true);
                    
        
        add(c1, 500, grass.getY() - 50);
            while(u1.getX() <= c1.getX()) {
                u1.move(1, 0);
                pause(5);
            }
            
            pause(1000);
            
            
            
            while(c1.getY() >= u1.getY() + 70) {
                beam.setVisible(true);
                add(beam, u1.getX() + 20, u1.getY() + 70);
                c1.move(0, -1);
                pause(5);
            }
            
            beam.setVisible(false);
            
            pause(1000);
            
            c1.setVisible(false);
            
            while(c1.getX() <= APPLICATION_WIDTH) {
                c1.move(1, 0);
                u1.move(1, 0);
                pause(3);
            }
            
            
            
            u1.setLocation(-200, APPLICATION_HEIGHT / 2);
            c1.setLocation(550, grass.getY() - 50);
        
        
        
        }while(true);
 
        
    }
}
