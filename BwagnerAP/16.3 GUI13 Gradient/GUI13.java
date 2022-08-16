import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI13 extends JFrame
{
    // constructor
    public GUI13()
    {
        // set frame attributes
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }

    public void paint(Graphics page)
    {
        super.paint(page);  // erase background

        int x = 50;
        int y = 50;
        int width = 400;
        int height = 400;

        for(int i = 0; i < 255; i++)
        {
            ++x;
            ++y;
            width -= 2;
            height -= 2;

            page.setColor(new Color(i, 111, 222));
            page.fillOval(x, y, width, height);
        }

    }

    // main method
    public static void main(String[] args)
    {
        GUI13 app = new GUI13();  // run program
    }
}