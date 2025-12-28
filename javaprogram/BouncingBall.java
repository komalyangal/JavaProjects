import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BouncingBall extends JPanel implements Runnable {
    private int x = 50;  // Initial X position of the ball
    private int y = 50;  // Initial Y position of the ball
    private int diameter = 30; // Diameter of the ball
    private int xSpeed = 3;  // Horizontal speed
    private int ySpeed = 3;  // Vertical speed
    private boolean running = false; // Movement status

    public BouncingBall() {
        setBackground(Color.WHITE);
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
                if (!running) {
                    running = true;
                    new Thread(BouncingBall.this).start();
                }
            }
        });
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, diameter, diameter);
    }

    @Override
    public void run() {
        while (running) {
            x += xSpeed;
            y += ySpeed;

            // Check for collision with the edges and reverse direction
            if (x <= 0 || x + diameter >= getWidth()) {
                xSpeed = -xSpeed;
            }
            if (y <= 0 || y + diameter >= getHeight()) {
                ySpeed = -ySpeed;
            }

            // Repaint the panel to update the ball's position
            repaint();

            // Pause for a short duration to control the animation speed
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Bouncing Ball");
        BouncingBall panel = new BouncingBall();
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
