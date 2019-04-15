import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class COW extends GCompound {
    private GRect body, leg1, leg2;
    private GOval head, spot1, spot2;
    

    public COW() {
        int bodyWidth = 50;
        
        GRect body = new GRect(bodyWidth, bodyWidth / 2);
        GRect leg1 = new GRect(bodyWidth / 5, bodyWidth / 2);
        GRect leg2 = new GRect(bodyWidth / 5, bodyWidth / 2);

        GOval head = new GOval(bodyWidth / 2, bodyWidth / 2);
        GOval spot1 = new GOval(bodyWidth / 10, bodyWidth / 10);
        GOval spot2 = new GOval(bodyWidth / 10, bodyWidth / 10);

        add(body, 0, 0);
        add(leg1, body.getX(), body.getY() + (bodyWidth / 2));
        add(leg2, body.getX() + (bodyWidth - (bodyWidth / 5)), body.getY() + (bodyWidth / 2));
        add(head, body.getX() + (bodyWidth - 10), body.getY() - (bodyWidth / 4));
        add(spot1, body.getX() + (bodyWidth / 10), body.getY() + (bodyWidth / 10));
        add(spot2, body.getX() + (bodyWidth / 2), body.getY() + (bodyWidth / 6));
        
        body.setColor(Color.WHITE);
        body.setFilled(true);
        leg1.setColor(Color.WHITE);
        leg1.setFilled(true);
        leg2.setColor(Color.WHITE);
        leg2.setFilled(true);

        head.setColor(Color.WHITE);
        head.setFilled(true);
        spot1.setColor(Color.BLACK);
        spot1.setFilled(true);
        spot2.setColor(Color.BLACK);
        spot2.setFilled(true);


        
    
    }
}
