import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class UFO extends GCompound {
    private GOval body, bubble, alien;

    public UFO() {
        
        int bodyWidth = 100;
        
        body = new GOval(bodyWidth, bodyWidth / 2);
        body.setFilled(true);
        body.setColor(Color.RED);

        bubble = new GOval(bodyWidth / 2, bodyWidth / 2);

        alien = new GOval(bodyWidth / 5, bodyWidth / 5);
        alien.setFilled(true);
        alien.setColor(Color.GREEN);

        add(bubble, .26 * bodyWidth , 0);
        add(alien, .4 * bodyWidth, bubble.getY() + 15);
        add(body, 0, .26 * bodyWidth);

    }
}
