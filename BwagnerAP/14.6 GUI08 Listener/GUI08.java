import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

                                             // Step 1: make frame a listener
public class GUI08 extends JFrame implements ActionListener
{
    // instance variables
    private JButton button;
    private JButton circ;

    // constructor
    public GUI08()
    {
        // create button
        button = new JButton("Change Color");
        circ = new JButton("Draw Circle");

        // set button attributes
        button.setLocation(175,50);
        button.setSize(150, 50);

        circ.setLocation(175,100);
        circ.setSize(150, 50);

        // add button to frame
        getContentPane().add(button);
        getContentPane().add(circ);

        // Step 2: register listener with button
        button.addActionListener(this);
        circ.addActionListener(this);

        // set frame attributes
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // Step 3: add an actionPerformed method
    public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == button)             // identify source
        {
            int r = (int)(Math.random() * 256);     // red intensity: 0..255
            int g = (int)(Math.random() * 256);     // green intensity: 0..255
            int b = (int)(Math.random() * 256);     // blue intensity:0..255
            Color color = new Color(r, g, b);       // make custom color
            getContentPane().setBackground(color);  // change background of frame
        }
        if(event.getSource() == circ)             // identify source
        {
        	Graphics page = getGraphics();

			int r = (int)(Math.random() * 256);  // random red
			int g = (int)(Math.random() * 256);  // random green
			int b = (int)(Math.random() * 256);  // random blue

			Color myColor = new Color(r, g, b);   // create color
			page.setColor(myColor);               // set graphics object to new color

			int x = (int)(Math.random() * 500);
			int y = (int)(Math.random() * 500);

			page.fillOval(x, y, 100, 100);
        }
    }

    // main method
    public static void main(String[] args)
    {
        GUI08 app = new GUI08();  // run program
    }
}