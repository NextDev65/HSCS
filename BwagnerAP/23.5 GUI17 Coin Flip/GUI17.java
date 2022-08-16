import java.util.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class GUI17 extends JFrame implements ActionListener
{
    // instance variables
    private JButton button;
    private JTextArea textArea;
    private JScrollPane scrollpane;

    // constructor
    public GUI17()
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
        textArea.setFont(new Font("Arial", Font.PLAIN, 16));
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
		if(event.getSource() == button)             // identify source
		{
			textArea.setText("");     // clear text area

			String text = "";
			double rand;
			double h = 0;
			double t = 0;
			for(int i = 0; i < 500; i++)
			{
				rand = Math.random();
				if (rand < .5)
				{
					textArea.append("heads\n");
					h++;
				}
				else
				{
					textArea.append("tails\n");
					t++;
				}
			}
			textArea.append("------------------\n");
			textArea.append("Number of heads = " + (int)h + "\n");
			textArea.append("Probablity of heads = " + h/(h+t)*100 + "%\n");
			textArea.append("Number of tails = " + (int)t + "\n");
			textArea.append("Probablity of tails = " + t/(h+t)*100 + "%\n");
		}
	}

    // main method
    public static void main(String[] args)
    {
        GUI17 app = new GUI17();  // run program
    }
}