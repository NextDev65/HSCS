import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI03 extends JFrame
{
    private JLabel dont;
    private JLabel mess;
    private JLabel with;
    private JLabel texas;

    // constructor
    public GUI03()
    {
        // JLabel label
        dont = new JLabel("Don't");
        mess = new JLabel("Mess");
        with = new JLabel("With");
        texas = new JLabel("Texas");

        // dont
        dont.setLocation(150, 0);
        dont.setSize(200, 60);
        dont.setForeground(Color.black);
        dont.setFont(new Font("Arial", Font.PLAIN, 72));

        // mess
        mess.setLocation(150, 125);
        mess.setSize(200, 60);
        mess.setForeground(Color.black);
        mess.setFont(new Font("Arial", Font.PLAIN, 72));

        // with
        with.setLocation(150, 250);
        with.setSize(200, 60);
        with.setForeground(Color.black);
        with.setFont(new Font("Arial", Font.PLAIN, 72));

        // texas
        texas.setLocation(150, 375);
        texas.setSize(200, 60);
        texas.setForeground(Color.black);
        texas.setFont(new Font("Arial", Font.PLAIN, 72));

        // Step 4: add label to content pane of frame
        getContentPane().add(dont);
        getContentPane().add(mess);
        getContentPane().add(with);
        getContentPane().add(texas);

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
        GUI03 app = new GUI03();   // run program
    }
}