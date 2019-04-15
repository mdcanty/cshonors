import acm.program.*;
import acm.graphics.*;
import java.awt.*;

public class tree extends GCompound {
    private GRect stump;
    private GOval leaves;

    public tree() {
        stump = new GRect(50, 100);
        stump.setFilled(true);
        stump.setColor(new Color(139, 69, 19));

        add(stump);

        leaves = new GOval(80, 80);
        leaves.setFilled(true);
        leaves.setColor(Color.GREEN);

        add(leaves);

        add(leaves, stump.getX() - 16,  (stump.getY() - 20));


    }
}
