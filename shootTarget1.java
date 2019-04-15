import acm.program.*;
import acm.graphics.*; 
import java.awt.event.*;
import java.awt.* ;

public class shootTarget1 extends GraphicsProgram {
     public static final int APPLICATION_WIDTH = 800;
     public static final int APPLICATION_HEIGHT = 500;
     
     final int WAIT = 5;
     final int DIAM = 50;
     final int MAX_TIME = 8000;  //10 seconds
     
     int clicksOnBall, clicksOnRect, time, redBallXJump, redBallYJump; 
     double blueRectXJump, blueRectYJump;
     
     GImage redBall;
     GImage blueRect;
     GLabel clicksOnBallLabel;
     GLabel clicksOnRectLabel;
     
     public void init( ) {
          time = 0;
          redBallXJump = 1;
          redBallYJump = 1;
          blueRectXJump = 2;
          blueRectYJump = 2;
          
          
          redBall = new GImage("images/ancom.png");
         // redBall.setFilled(true);
          //redBall.setColor(Color.RED);
          add(redBall, 90, 40);
          redBall.scale(.05);

          blueRect = new GImage("images/ancap.png");
         // blueRect.setFilled(true);
         // blueRect.setColor(Color.BLUE);
          add(blueRect, 130, 80);
          blueRect.scale(.05);
          
          clicksOnBall = 0;
          clicksOnBallLabel = new GLabel("Ball click count: " + clicksOnBall);
          clicksOnBallLabel.setFont("*-BOLD-16");
          add(clicksOnBallLabel, 0, 16);

          clicksOnRect = 0;
          clicksOnRectLabel = new GLabel("Rectangle click count: " + clicksOnBall);
          clicksOnRectLabel.setFont("*-BOLD-16");
          add(clicksOnRectLabel, 200, 16);
       
          
          displayInstructions();
          addMouseListeners();
          
       /*   add(redBall, 90, 40);
          add(blueRect, 130, 80);
          
          redBallXJump = 2;
          redBallYJump = 2;
          blueRectXJump = 4;
          blueRectYJump = 4;
          
          */
          
          
          
     } //init
     
     public void mousePressed(MouseEvent e) {

          double x = e.getX( );
          double y = e.getY( );   
          GObject theObject = getElementAt(x, y);
          
          if (theObject == redBall) {
          
               clicksOnBall++; 
               clicksOnBallLabel.setLabel("Ball click count: "+ clicksOnBall);
          }

          if  (theObject == blueRect) {
              clicksOnRect += 2;
              clicksOnRectLabel.setLabel("Rectangle click count: " + clicksOnRect);
          }

     } //mousePressed
     public void run( )
     {
          while(true) {
               pause(WAIT);
               time = time + WAIT;
               if (time > MAX_TIME) 
               {
                    break; //exit the game loop
               }
               if (redBall.getY( ) <= 0) //at top of window?
               {
                    redBallYJump = 1;
               }
               else if (redBall.getY( )+DIAM >= APPLICATION_HEIGHT) //at bottom?
               {
                    redBallYJump = -1;
               }
               else if (redBall.getX( ) <= 0) //at left?
               {
                    redBallXJump = 1;
               }
               else if (redBall.getX( )+DIAM >= APPLICATION_WIDTH) //at right?
               {
                    redBallXJump = -1;
               }
               redBall.move(redBallXJump, redBallYJump);
               
               if (blueRect.getY( ) <= 0) //at top of window?
               {
                    blueRectYJump = 1;
               }
               else if (blueRect.getY( )+DIAM >= 500) //at bottom?
               {
                    blueRectYJump = -1;
               }
               else if (blueRect.getX( ) <= 0) //at left?
               {
                    blueRectXJump = 1;
               }
               else if (blueRect.getX( )+DIAM >= 800) //at right?
               {
                    blueRectXJump = -1;
               }
               
               blueRect.move(blueRectXJump, blueRectYJump);
          } 
          
          pause(WAIT);
          displayInstructions();
          
          time = 0;
          while(true) //game loop 
          {
               pause(WAIT);
               time = time + WAIT;
               if (time > MAX_TIME) 
               {
                    break; //exit the game loop
               }
               if (redBall.getY( ) <= 0) //at top of window?
               {
                    redBallYJump = 1;
               }
               else if (redBall.getY( )+DIAM >= APPLICATION_HEIGHT) //at bottom?
               {
                    redBallYJump = -1;
               }
               else if (redBall.getX( ) <= 0) //at left?
               {
                    redBallXJump = 1;
               }
               else if (redBall.getX( )+DIAM >= APPLICATION_WIDTH) //at right?
               {
                    redBallXJump = -1;
               }
               redBall.move(redBallXJump, redBallYJump);
               
               if (blueRect.getY( ) <= 0) //at top of window?
               {
                    blueRectYJump = -1;
               }
               else if (blueRect.getY( )+DIAM >= 500) //at bottom?
               {
                    blueRectYJump = -1;
               }
               else if (blueRect.getX( ) <= 0) //at left?
               {
                    blueRectXJump = 1;
               }
               else if (blueRect.getX( )+DIAM >= 800) //at right?
               {
                    blueRectXJump = -1;
               }
               
               blueRect.move(blueRectXJump, blueRectYJump);
          }

//game loop
     } //run
     
     public void displayInstructions( )
     {
          GLabel sign1 = new GLabel("Click on the red ball");
          GLabel sign2 = new GLabel("-- click to start --");
          sign1.setFont("*-BOLD-20");
          sign2.setFont("*-BOLD-20");
          add(sign1, 320, 200);
          add(sign2, 340, 220);
          waitForClick( );
          remove(sign1);
          remove(sign2);
     } //displayInstructions
     
   
     
}
