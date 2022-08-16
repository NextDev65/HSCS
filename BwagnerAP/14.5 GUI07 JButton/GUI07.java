import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI07 extends JFrame
{
    // Step 1 : create JButton variable
    private JButton ok;
    private JButton cancel;

    public GUI07()
    {
        // Step 2 : create a JButton object and store its reference in the JButton variable
        ok = new JButton("OK");
        cancel = new JButton("Cancel");

        // ok
        ok.setLocation(100,400);
        ok.setSize(80, 30);

        // cancel
        cancel.setLocation(300,400);
        cancel.setSize(80, 30);

        // Step 4: add the JButton to the content pane of the frame
        getContentPane().add(ok);
        getContentPane().add(cancel);


        // set frame attributes
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setBackground(Color.white);
        setVisible(true);
    }

    // main method
    public static void main(String[] args)
    {
        GUI07 app = new GUI07();  // run program
    }
}