import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI10 extends JFrame
{
    // constructor
    public GUI10()
    {
        // set frame attributes
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.black);
        setVisible(true);
    }

    public void paint(Graphics page)
    {
        super.paint(page);  // erase background
        for (int counter = 0; counter < 300; counter++)
        {
			if(counter % 2 == 0)
			{
			   page.setColor(Color.blue);
			}
			else
			{
			   page.setColor(Color.yellow);
			}

			int x2 = (int)(Math.random() * 500);
			int y2 = (int)(Math.random() * 500);

			page.drawLine(250, 250, x2, y2);
        }
    }

    // main method
    public static void main(String[] args)
    {
        GUI10 app = new GUI10();  // run program
    }
}