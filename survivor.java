import acm.graphics.*; 
import acm.program.*; 
import java.awt.*; 
import java.awt.event.*; 
public class survivor extends GraphicsProgram { 
    public static final int APPLICATION_WIDTH = 800;
    public static final int APPLICATION_HEIGHT = 500;

    int clicksOnBall, clicksOnRect, time, time2, redBallXJump, redBallYJump;
    GImage redBall;
    

    GRect rect; 
    GOval oval; 
    GObject gobj; 
    double lastX, lastY, clock; 
    public void init( ) { 

        time = 0;
        time2 = 0;
        redBallXJump = 1;
        redBallYJump = 1;

        redBall = new GImage("images/ancap.png");
        redBall.scale(.05);
        add(redBall, 500, 40);
        
        
      /*  rect = new GRect(1, 1, 150, 100); 
        rect.setFilled(true); 
        rect.setColor(Color.RED); 
        add(rect); */ oval = new GOval(50, 50, 50, 50); 
        oval.setFilled(true); 
        oval.setColor(Color.BLACK); 
        add(oval); 
        addMouseListeners( );
    } //init 
  public void mousePressed(MouseEvent e) { 
     lastX = e.getX( ); 
     lastY = e.getY( ); 
     gobj = getElementAt(lastX, lastY); 
     if (gobj != null) { 
         gobj.sendToFront(); 
     } 
  } //mousePressed 
  public void mouseDragged(MouseEvent m) { 
    if (gobj != null) { 
        int xDisplacement = (int) (m.getX( ) - lastX); 
        int yDisplacement = (int) (m.getY( ) - lastY); 
        gobj.move(xDisplacement, yDisplacement); 
        lastX = m.getX( ); 
        lastY = m.getY( ); 
    } 
  } //mouseDragged 
  public void run( ) {
      GLabel clockDisplay = new GLabel("Timer: ");
      clockDisplay.setFont("*-BOLD-16");
      while(true) {
          pause(5);
          time += 5;
          pause(1);
              clock = clock += 1;
             
              clockDisplay.setLabel("Timer: " + clock / 1000);
              
              add(clockDisplay, 500, 500);
              
              if (clock >= 3000) {
                  clockDisplay.setLabel("LEVEL 3 - Timer: " + clock);
                  if (redBall.getY() <= 0) {
              redBallYJump = 8;
               } else if (redBall.getY() + 50 >= APPLICATION_HEIGHT) {
              redBallYJump = -8;
               } else if (redBall.getX() <= 0) {
              redBallXJump = 8;
               } else if (redBall.getX() + 50 >= APPLICATION_WIDTH) {
              redBallXJump = -8;
               }
              } else if (clock >= 2000) {
                    clockDisplay.setLabel("LEVEL 2 - Timer: " + clock);
                    if (redBall.getY() <= 0) {
                      redBallYJump = 4;
                    } else if (redBall.getY() + 50 >= APPLICATION_HEIGHT) {
                        redBallYJump = -4;
                    } else if (redBall.getX() <= 0) {
                        redBallXJump = 4;
                    } else if (redBall.getX() + 50 >= APPLICATION_WIDTH) {
                        redBallXJump = -4;
                    }
              }
                  
              else {
          if (redBall.getY() <= 0) {
              redBallYJump = 2;
          } else if (redBall.getY() + 50 >= APPLICATION_HEIGHT) {
              redBallYJump = -2;
          } else if (redBall.getX() <= 0) {
              redBallXJump = 2;
          } else if (redBall.getX() + 50 >= APPLICATION_WIDTH) {
              redBallXJump = -2;
          }
              }
          redBall.move(redBallXJump, redBallYJump);
          
          GRectangle rbBox = redBall.getBounds();
          GRectangle oBox = oval.getBounds();
          
          if (rbBox.intersects(oBox) == true) {
              break;
          }
          
    
    
  } 
}
}
