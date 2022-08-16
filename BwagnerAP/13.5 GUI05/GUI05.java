import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI05 extends JFrame
{
    // Step 1 : declare JLabel variable
    private JLabel jackLabel;
    private JLabel queenLabel;
    private JLabel kingLabel;

    // constructor
    public GUI05()
    {
        // Step 2: create ImageIcon object using an image file as a parameter
        ImageIcon jackImage = new ImageIcon("jack.gif");
        ImageIcon queenImage = new ImageIcon("queen.gif");
        ImageIcon kingImage = new ImageIcon("king.gif");

        // Step 3: create label using ImageIcon variable as parameter
        jackLabel = new JLabel(jackImage);
        queenLabel = new JLabel(queenImage);
        kingLabel = new JLabel(kingImage);

        // jack
        jackLabel.setLocation(90,0);
        jackLabel.setSize(jackImage.getIconWidth(), jackImage.getIconHeight());

        // queen
        queenLabel.setLocation(180,0);
        queenLabel.setSize(queenImage.getIconWidth(), queenImage.getIconHeight());

        // king
        kingLabel.setLocation(270,0);
        kingLabel.setSize(kingImage.getIconWidth(), kingImage.getIconHeight());

        // Step 5: add label to frame
        getContentPane().add(jackLabel);
        getContentPane().add(queenLabel);
        getContentPane().add(kingLabel);

        // set frame attributes
        setLayout(null);
        setSize(450, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    // main method
    public static void main(String[] args)
    {
        GUI05 app = new GUI05();
    }
}