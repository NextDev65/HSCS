import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI18 extends JFrame implements ActionListener
{
    // instance variables
    private JButton button;
    private JTextArea textArea;
    private JScrollPane scrollpane;

    // constructor
    public GUI18()
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
        textArea.setFont(new Font("consolas", Font.PLAIN, 16));
        textArea.setEditable(false);   // cannot type text into textArea
        textArea.setLineWrap(true);   // wrap text when reach right border

        // create scrollpane and add textarea
        scrollpane = new JScrollPane(textArea);

        // set scrollpane attributes
        scrollpane.setLocation(50,50);
        scrollpane.setSize(400, 400);
        scrollpane.setBorder(BorderFactory.createLineBorder (Color.blue, 2));

        // add scrollpane to frame
        getContentPane().add(scrollpane);

        // set frame attributes
        setLayout(null);
        setSize(500, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

	public void actionPerformed(ActionEvent event)
	{
		if (event.getSource() == button)
		{
			textArea.setText("");

			for (int i = 0; i <= 31; i++)
			{
				textArea.append(String.format("%4d%4c", 32+i, (char)32+i) );
				textArea.append("        ");
				textArea.append(String.format("%4d%4c", 64+i, (char)64+i) );
				textArea.append("        ");
				textArea.append(String.format("%4d%4c%n", 96+i, (char)96+i) );
			}
		}
	}

    // main method
    public static void main(String[] args)
    {
        GUI18 app = new GUI18();  // run program
    }
}