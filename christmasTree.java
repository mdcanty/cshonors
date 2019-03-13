import acm.program.*;
import acm.util.*;
import acm.graphics.*;
import java.awt.*;


public class christmasTree extends GraphicsProgram {
    public static final int APPLICATION_WIDTH = 1000;
    public static final int APPLICATION_HEIGHT = 1000;
    public void run () {
        setBackground(Color.BLACK);
        GPolygon tree = new GPolygon();
        tree.setColor(new Color(76, 139, 39)); // Dark green for tree.
        tree.setFilled(true);
        tree.addVertex(500, 0);   //   ^
        tree.addVertex(650, 200); //     \
        tree.addVertex(550, 200); //     -
        tree.addVertex(700, 350); //     \
        tree.addVertex(550, 350); //     -
        tree.addVertex(750, 500); //     \
        tree.addVertex(250, 500); //  --
        tree.addVertex(450, 350); // /
        tree.addVertex(300, 350); // -
        tree.addVertex(450, 200); // /
        tree.addVertex(350, 200); // -
        add(tree);
        
        GRect stump = new GRect(100, 200);
        stump.setColor(new Color(153, 102, 0));
        stump.setFilled(true);
        add(stump, 450, 500);
        

        do {
        GOval light = new GOval(20, 20);
        light.setFilled(true);
        RandomGenerator rg = new RandomGenerator();
        int color = rg.nextInt(1, 4);
        
        if (color == 1) {
            light.setColor(new Color(76, 139, 39));
        } else if (color == 2) {
            light.setColor(Color.YELLOW);
        } else if (color == 3) {
            light.setColor(Color.WHITE);
        } else {
            light.setColor(Color.RED);
        }
        add(light, 560, 300);
        light.setVisible(false);
        pause(100);
        light.setVisible(true);

        
        GOval light2 = new GOval(20, 20);
        light2.setFilled(true);
        color = rg.nextInt(1, 4);
        light2.setVisible(false);
        pause(100);
        light2.setVisible(true);
        if (color == 1) {
            light2.setColor(new Color(76, 139, 39));
        } else if (color == 2) {
            light2.setColor(Color.YELLOW);
        } else if (color == 3) {
            light2.setColor(Color.WHITE);
        } else {
            light2.setColor(Color.RED);
        }
        add(light2, 450, 250);
        light2.setVisible(false);
        pause(100);
        light2.setVisible(true);
         
        GOval light3 = new GOval(20, 20);
        light3.setFilled(true);
        color = rg.nextInt(1, 4);
        light3.setVisible(false);
        pause(100);
        light3.setVisible(true);
        if (color == 1) {
            light3.setColor(new Color(76, 139, 39));
        } else if (color == 2) {
            light3.setColor(Color.YELLOW);
        } else if (color == 3) {
            light3.setColor(Color.WHITE);
        } else {
            light3.setColor(Color.RED);
        }
        add(light3, 420, 100);
        light3.setVisible(false);
        pause(100);
        light3.setVisible(true);
            
        

        GOval light4 = new GOval(20, 20);
        light4.setFilled(true);
        color = rg.nextInt(1, 4);
        light4.setVisible(false);
        pause(100);
        light4.setVisible(true);
        if (color == 1) {
            light4.setColor(new Color(76, 139, 39));
        } else if (color == 2) {
            light4.setColor(Color.YELLOW);
        } else if (color == 3) {
            light4.setColor(Color.WHITE);
        } else {
            light4.setColor(Color.RED);
        }
        add(light4, 500, 112);
        light4.setVisible(false);
        pause(100);
        light4.setVisible(true);
            
        

        GOval light5 = new GOval(20, 20);
        light5.setFilled(true);
        color = rg.nextInt(1, 4);
        light5.setVisible(false);
        pause(100);
        light5.setVisible(true);
        if (color == 1) {
            light5.setColor(new Color(76, 139, 39));
        } else if (color == 2) {
            light5.setColor(Color.YELLOW);
        } else if (color == 3) {
            light5.setColor(Color.WHITE);
        } else {
            light5.setColor(Color.RED);
        }
        add(light5, 540, 234);
        light5.setVisible(false);
        pause(100);
        light5.setVisible(true);
            
        } while (true);

        
            
        
        
        
        
    }
}
