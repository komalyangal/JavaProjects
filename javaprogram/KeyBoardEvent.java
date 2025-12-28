import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyBoardEvent extends JFrame implements KeyListener {

    int x=10,y=20;
    String msg="Key Event";
    // Constructor
    public KeyBoardEvent() {
        // Set frame properties
        setTitle("KeyBoard Events Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        getContentPane().setBackground(Color.WHITE);
        setVisible(true);

        // Add the KeyListener to the frame
        addKeyListener(this);
        
    }

    public void keyPressed(KeyEvent e)
    {
    	msg="Key Pressed"+e.getKeyCode();
    	  getContentPane().setBackground(Color.black);
    	repaint();
    }
   

	public void keyReleased(KeyEvent e)
    {
    	msg="Key Released"+e.getKeyCode();
    	  getContentPane().setBackground(Color.yellow);
    	repaint();
    }
  public void keyTyped(KeyEvent e)
  {
	  msg="Key typed"+e.getKeyCode();
	  msg+=e.getKeyChar();
	  getContentPane().setBackground(Color.pink);
	  repaint();
  }
    public void paint(Graphics g)
    {
    	super.paint(g);
    	 g.setColor(Color.BLACK);
    	g.drawString(msg,x,y);
    }

    // Main method to  create the frame
    public static void main(String[] args) {
        new KeyBoardEvent();
    }
}

