import acm.program.*;
import acm.graphics.*;

public class runUFO extends GraphicsProgram {
    public void run () {
        final int WAIT = 20;

        UFO u1 = new UFO();
        add(u1, 0, 0);

        UFO u2 = new UFO();
        add(u2, 700, 0);
        
        tree t1 = new tree();
        add(t1, 500, 500);
        
        tree t2 = new tree();
        add(t2, 700, 700);
        
        while(true) {
            pause(WAIT);
            u1.move(1, 1);
            u2.move(-1, 1);
            
        }
    }
}
    
