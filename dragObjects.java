import acm.graphics.*; 
import acm.program.*; 
import java.awt.*; 
import java.awt.event.*; 
public class DragObjects extends GraphicsProgram { 
  GRect rect; 
  GOval oval; 
  GObject gobj; 
  double lastX, lastY; 
  public void init( ) { 
    rect = new GRect(1, 1, 150, 100); 
    rect.setFilled(true); 
    rect.setColor(Color.RED); 
    add(rect); oval = new GOval(300, 115, 100, 70); 
    oval.setFilled(true); 
    oval.setColor(Color.GREEN); 
    add(oval); 
    addMouseListeners( ); } //init 
  public void mousePressed(MouseEvent e) { 
    lastX = e.getX( ); 
    lastY = e.getY( ); 
    gobj = getElementAt(lastX, lastY); 
    if (gobj != null) { 
      gobj.sendToFront(); } 
  } //mousePressed 
  public void mouseDragged(MouseEvent m) { 
    if (gobj != null) { 
      int xDisplacement = (int) (m.getX( ) - lastX); 
      int yDisplacement = (int) (m.getY( ) - lastY); 
gobj.move(xDisplacement, yDisplacement); 
lastX = m.getX( ); 
lastY = m.getY( ); } 
} //mouseDragged 
public void run( ) { /*nothing to do here */ 
} 
}