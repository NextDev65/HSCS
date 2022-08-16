import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI11 extends JFrame implements ActionListener
{
    // instance variables
    private JButton button;

    // Step 1: declare JTextfield variable
    private JTextField redTextField;
    private JTextField greenTextField;
    private JTextField blueTextField;

    // constructor
    public GUI11()
    {
        // create button
        button = new JButton("Submit");

        // set button attributes
        button.setLocation(50, 200);
        button.setSize(100, 25);

        // add button to frame
        getContentPane().add(button);

        // register listener with button
        button.addActionListener(this);

        // Step 2 : instantiate JTextField object
        redTextField = new JTextField();
        greenTextField = new JTextField();
        blueTextField = new JTextField();

        // Step 3 : set textfield attributes
        redTextField.setLocation(100, 50);
        redTextField.setSize(50, 25);

        greenTextField.setLocation(100, 100);
        greenTextField.setSize(50, 25);

        blueTextField.setLocation(100, 150);
        blueTextField.setSize(50, 25);

        // Step 4 : add textfield to frame's content pane
        getContentPane().add(redTextField);
        getContentPane().add(greenTextField);
        getContentPane().add(blueTextField);


        // set frame attributes
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

	public void actionPerformed(ActionEvent event)
    {
        if(event.getSource() == button)         // identify source
        {
			String red = redTextField.getText();  // retrieve text from textfield
			String green = greenTextField.getText();  // retrieve text from textfield
			String blue = blueTextField.getText();  // retrieve text from textfield

			int r = Integer.parseInt(red);      // convert text to an integer
			int g = Integer.parseInt(green);    // convert text to an integer
			int b = Integer.parseInt(blue);     // convert text to an integer

			getContentPane().setBackground(new Color(r, g, b));
        }
    }

    // main method
    public static void main(String[] args)
    {
        GUI11 app = new GUI11();  // run program
    }
}