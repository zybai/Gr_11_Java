

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class AnimationBackground extends JLabel implements ActionListener
{
    int deltaX = 2;  //x position
    int deltaY = 3;  //y position
    int directionX = 1;  //x position
    int directionY = 1;  //y position
    JPanel Intropanel;
    JButton PlayIntro, ExitButton, RulesButton, ComButton;

    public AnimationBackground (
	    int startX, int startY,
	    int deltaX, int deltaY,
	    int directionX, int directionY,
	    int delay)
    {
	this.deltaX = deltaX;
	this.deltaY = deltaY;
	this.directionX = directionX;
	this.directionY = directionY;

	setIcon (new ImageIcon ("bubble.png"));
	setSize (getPreferredSize ());
	setLocation (startX, startY);
	new javax.swing.Timer (delay, this).start (); //Timer 
	
    }


    public void actionPerformed (ActionEvent e)
    {
	
	Container parent = getParent ();
	
   //  Determine next X position

	int nextX = getLocation ().x + (deltaX * directionX);

	if (nextX < 0)
	{
	    nextX = 0;
	    directionX *= -1;
	}

	if (nextX + getSize ().width > parent.getSize ().width)
	{
	    nextX = parent.getSize ().width - getSize ().width;
	    directionX *= -1;
	}

	//  Determine next Y position

	int nextY = getLocation ().y + (deltaY * directionY);

	if (nextY < 0)
	{
	    nextY = 0;
	    directionY *= -1;
	}

	if (nextY + getSize ().height > parent.getSize ().height)
	{
	    nextY = parent.getSize ().height - getSize ().height;
	    directionY *= -1;
	}

	//  Move the label

	setLocation (nextX, nextY);
    }


    public static void Introduction ()
    {

	JPanel panel = new JPanel (null)
	{
	    Image image = new ImageIcon ("fishes.jpg").getImage ();  //background image

	    protected void paintComponent (Graphics g)
	    {
		g.drawImage (image, 0, 0, getWidth (), getHeight (), null);
		super.paintComponent (g);
	    }
	}
	;
	panel.setOpaque (false);
	panel.add (new AnimationBackground (10, 10, 2, 3, 1, 1, 10));  // bubbles move 
	panel.add (new AnimationBackground (300, 100, 3, 2, -1, 1, 20));
	panel.add (new AnimationBackground (200, 200, 2, 3, 1, -1, 20));
	panel.add (new AnimationBackground (50, 50, 5, 5, -1, -1, 20));
	panel.add (new AnimationBackground (0, 000, 5, 0, 1, 1, 20));
	panel.add (new AnimationBackground (0, 200, 5, 0, 1, 1, 80));



	JFrame frame = new JFrame ();
	frame.setContentPane (panel);
	frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
	frame.setSize (1000, 1000);
	frame.setLocationRelativeTo (null);
	frame.setVisible (true);
	frame.setTitle("Animation Background");

	
   
	
       


    }



}
