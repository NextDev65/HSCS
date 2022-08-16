import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI12 extends JFrame implements ActionListener
{
    // instance variables
    private JButton okButton;
    private JButton cancelButton;
    private JTextField usernameTextField;
    private JTextField passwordTextField;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel welcomeLabel;

    // constructor
    public GUI12()
    {
        // create button
        okButton = new JButton("OK");
        cancelButton = new JButton("Cancel");

        // set button attributes
        okButton.setLocation(250, 200);
        okButton.setSize(80, 25);
        cancelButton.setLocation(150, 200);
        cancelButton.setSize(80, 25);

        // add button to frame
        getContentPane().add(okButton);
        getContentPane().add(cancelButton);

        // register listener with button
        okButton.addActionListener(this);
        cancelButton.addActionListener(this);

        // create textfields
        usernameTextField = new JTextField();
        passwordTextField = new JTextField();

        // set textfield attributes
        usernameTextField.setLocation(200, 100);
        usernameTextField.setSize(150, 25);
        passwordTextField.setLocation(200, 150);
        passwordTextField.setSize(150, 25);

        // add textfield to frame
        getContentPane().add(usernameTextField);
        getContentPane().add(passwordTextField);

        // create labels
        usernameLabel = new JLabel("UserName");
        passwordLabel = new JLabel("Password");
        welcomeLabel = new JLabel("Welcome");

        // set label attributes
        usernameLabel.setLocation(125, 100);
        usernameLabel.setSize(100, 25);
        passwordLabel.setLocation(125, 150);
        passwordLabel.setSize(100, 25);
        welcomeLabel.setLocation(150, 170);
        welcomeLabel.setSize(250, 40);
        welcomeLabel.setVisible(false);
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 48));

        // add labels to frame
        getContentPane().add(usernameLabel);
        getContentPane().add(passwordLabel);
        getContentPane().add(welcomeLabel);

        // set frame attributes
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event)
    {
		String myUserName = "user";
		String myPassword = "pass";

		if(event.getSource() == okButton)  // ok button pressed
		{
			if ( usernameTextField.getText().equals(myUserName) && passwordTextField.getText().equals(myPassword) )
			{
				okButton.setVisible(false);
				cancelButton.setVisible(false);
				usernameTextField.setVisible(false);
				passwordTextField.setVisible(false);
				usernameLabel.setVisible(false);
				passwordLabel.setVisible(false);
				welcomeLabel.setVisible(true);
			}
			usernameTextField.setText("");
			passwordTextField.setText("");
		}
		if(event.getSource() == cancelButton)  // cancel button pressed
		{
			System.exit(0);
		}
    }

    // main method
    public static void main(String[] args)
    {
        GUI12 app = new GUI12();  // run program
    }
}