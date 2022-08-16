import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI01 extends JFrame
{
    // constructor
    public GUI01()
    {
        // set frame attributes
        setLayout(null);                                             // no layout will be used
        setSize(400, 300);                                           // sets size of frame window
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);              // activate close icon
        getContentPane().setBackground(new Color(50, 120, 200));     // set background color
        setVisible(true);                                            // show frame
    }

    // main method
    public static void main(String[] args)
    {
        GUI01 app = new GUI01();    // run program
    }
}