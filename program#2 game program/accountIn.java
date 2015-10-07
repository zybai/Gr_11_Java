import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;

public class accountIn extends JFrame
{
    public String password;
    public String name;
    private JLabel nameLabel;
    private JTextField nameText;

    private JLabel passwordLabel;
    private JTextField passwordText;

    private JButton OkButton;



    public accountIn ()
    {
	createUserInterface ();
    }


    public void createUserInterface ()
    {
	Container contentPane = getContentPane ();
	contentPane.setLayout (null);

// seting Jlabel and text field, Jbutton

	nameLabel = new JLabel ();
	nameLabel.setText ("name");
	nameLabel.setBounds (16, 16, 100, 15);
	contentPane.add (nameLabel);

	nameText = new JTextField ();
	nameText.setText ("");
	nameText.setBounds (72, 16, 200, 15);
	contentPane.add (nameText);

	passwordLabel = new JLabel ();
	passwordLabel.setText ("Password");
	passwordLabel.setBounds (16, 48, 100, 15);
	contentPane.add (passwordLabel);

	passwordText = new JTextField ();
	passwordText.setText ("");
	passwordText.setBounds (76, 48, 200, 15);
	contentPane.add (passwordText);

	OkButton = new JButton ();
	OkButton.setText ("OK");
	OkButton.setBounds (150, 150, 60, 15);
	contentPane.add (OkButton);
	OkButton.addActionListener (

		new ActionListener ()  // anonymous inner class
	{
	    // method called when ok JButton is pressed
	    public void actionPerformed (ActionEvent event)
	    {
		OkButtonActionPerformed (event);
	    }
	}
	);


	setLocation (510, 300);
	setSize (343, 234);
	setVisible (true);
	setTitle ("Account Information");
    }


    public static void main (String[] args) throws IOException   // main program
    {
	accountIn application = new accountIn ();


    }


    private void OkButtonActionPerformed (ActionEvent event)  // actionlistener for ok button

    {
	name = nameText.getText ();
	password = passwordText.getText ();
	try
	{
	    AccountInfo ();
	}
	catch (Exception e)
	{
	    System.out.println (e);
	}


       
	setVisible (false);
	Mainprogram app = new Mainprogram ();


    }


    public void AccountInfo () throws IOException  // print the information to the file
    {
	PrintWriter pw;
	FileWriter fw;
	fw = new FileWriter ("AccountInfor.txt");
	pw = new PrintWriter (fw);
	pw.println (name);
	pw.println (password);
	pw.println ("eof");
	fw.close ();
	pw.close ();
    }



}


