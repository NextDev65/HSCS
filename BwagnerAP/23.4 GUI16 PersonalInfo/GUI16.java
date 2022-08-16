import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI16 extends JFrame implements ActionListener
{
    // instance variables
    private JButton button;
    private JTextArea textArea;

    // constructor
    public GUI16()
    {
        // create button
        button = new JButton("run");

        // set button attributes
        button.setLocation(220,20);
        button.setSize(80, 25);

        // add button to frame
        getContentPane().add(button);

        // register listener with button
        button.addActionListener(this);

        // create textarea
        textArea = new JTextArea();

        // set textarea attributes
        textArea.setLocation(50,50);
        textArea.setSize(400, 400);
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
        textArea.setBorder(BorderFactory.createLineBorder (Color.blue, 2));
        textArea.setEditable(false);     // cannot type text into textArea

        // add textarea to frame
        getContentPane().add(textArea);

        // set frame attributes
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

	public void actionPerformed(ActionEvent event)
	{
		if(event.getSource() == button)             // identify source
		{
			textArea.setText("");     // clear text area

			String text = "";
			text += "John Wayne\n";
			text += "100 Main Street\n";
			text += "Denton, Tx 76201\n";
			text += "\n";

			for(int i = 0; i < 3; i++)
			{
				textArea.append(text);    // append text to text area
			}
		}
	}

    // main method
    public static void main(String[] args)
    {
        GUI16 app = new GUI16();  // run program
    }
}