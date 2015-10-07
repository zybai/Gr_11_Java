// The "Introduction" class.
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.io.*;



public class Introduction extends JFrame implements ActionListener
{
    static public Introduction intro = new Introduction ();// declearing variables and JButton,JPanel, and JLebel for the program

    JLabel bg;
    JPanel Intropanel;
    JButton PlayIntro, ExitButton, RulesButton, CreditButton;

    public static String s1[] = new String [17];
    public static String rule;
    public static String introText;

    public Introduction ()
    {
	setDefaultCloseOperation (EXIT_ON_CLOSE);
	//set background picture picture
	bg = new JLabel ();
	bg.setIcon (new ImageIcon ("intro.jpg"));

	getContentPane ().setLayout (new BorderLayout ());
	getContentPane ().add (bg, BorderLayout.NORTH);

	//set button
	Intropanel = new JPanel ();
	PlayIntro = new JButton ("Play");
	PlayIntro.addActionListener (this);
	ExitButton = new JButton ("Exit");
	ExitButton.addActionListener (this);
	RulesButton = new JButton ("Rules");
	RulesButton.addActionListener (this);
	CreditButton = new JButton ("Credits");
	CreditButton.addActionListener (this);

	Intropanel.setBackground (Color.orange);
	PlayIntro.setForeground (Color.black);
	PlayIntro.setBackground (Color.yellow);
	ExitButton.setForeground (Color.black);
	ExitButton.setBackground (Color.yellow);
	CreditButton.setBackground (Color.yellow);
	CreditButton.setForeground (Color.black);
	RulesButton.setForeground (Color.black);
	RulesButton.setBackground (Color.yellow);

	Intropanel.add (PlayIntro);
	Intropanel.add (RulesButton);
	Intropanel.add (CreditButton);
	Intropanel.add (ExitButton);

	getContentPane ().add (Intropanel, BorderLayout.SOUTH);
	try
	{
	    ReadIntro ();
	}
	catch (Exception g)
	{
	    System.out.println (g);
	}


    } // Constructor


    public static void ReadIntro () throws IOException// read the file of introduction into the program

    {
	BufferedReader Br;
	FileReader fr;
	fr = new FileReader ("introduction.txt");
	Br = new BufferedReader (fr);
	String string[] = new String [10];
	introText = "";
	for (int i = 0 ; i < 10 ; i++)
	{
	    string [i] = Br.readLine ();
	    introText += string [i] + "\n";
	}

	Font g = new Font ("Serif", Font.BOLD,20); 
	JTextArea introTextArea = new JTextArea ();
	introTextArea.setText (introText);
	introTextArea.setFont (g);
	introTextArea.setBounds (100, 100, 600, 1000);
	introTextArea.setEditable (false);
	introTextArea.setBackground (Color.black);
	introTextArea.setForeground (Color.yellow);

	JOptionPane.showMessageDialog (null, introTextArea);

    }


    public static void Rule () throws IOException  // read the rule.txt and output into  DIALOG BOX
    {


	BufferedReader Br;
	FileReader fr;
	fr = new FileReader ("rule.txt");
	Br = new BufferedReader (fr);

	rule = "";
	for (int i = 0 ; i < 17 ; i++)
	{
	    s1 [i] = Br.readLine ();
	    rule += s1 [i] + "\n";
	}


	Font f = new Font ("Serif", Font.ITALIC + Font.BOLD, 24); // read rule, put into text area with scroller
	JTextArea outputArea = new JTextArea (10,35);
	JScrollPane scroller = new JScrollPane(outputArea);
	outputArea.setSize(100,100);
	outputArea.setFont (f);
	outputArea.setBackground (Color.black);
	outputArea.setForeground (Color.yellow);
	outputArea.setText (rule);
	JOptionPane.showMessageDialog (null,scroller,"Rules",JOptionPane.INFORMATION_MESSAGE );
    }


    public void actionPerformed (ActionEvent e)
    {

	if (e.getSource () == PlayIntro)
	{ //Begins game
	    intro.setVisible (false);
	    AnimationBackground.Introduction ();
	    accountIn application = new accountIn ();
	    application.setVisible (true);
	    application.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
       

	}
	if (e.getSource () == RulesButton)
	{
	    try
	    {
		Rule ();
	    }
	    catch (Exception g)
	    {
		System.out.println (g);
	    }
	}
	if (e.getSource () == CreditButton)
	{ //Dialog Box for credits

	    String credits[] = new String [10000];
	    try
	    {
		BufferedReader comBR;
		FileReader comFR;
		comFR = new FileReader ("Credits.txt");
		comBR = new BufferedReader (comFR);
		int i = 0;
		String fileName = comBR.readLine ();
		while (fileName != null)
		{
		    credits [i] = fileName;
		    fileName = comBR.readLine ();
		    i++;
		}
	    }
	    catch (IOException f)
	    {
		System.out.println (f);
	    }
	    JOptionPane.showMessageDialog (null,
		    credits, "Credits", JOptionPane.PLAIN_MESSAGE);
	}
	if (e.getSource () == ExitButton)
	{ //Exits game
	    System.exit (0);
	}


    }


    public static void Show ()
    {
	intro.setSize (775, 600);
	Dimension dim = Toolkit.getDefaultToolkit ().getScreenSize ();
	intro.setLocation (dim.width / 2 - intro.getSize ().width / 2, dim.height / 2 - intro.getSize ().height / 2);
	intro.setVisible (true);
    }


    public static void SHOW ()
    {
	Show ();
    }
} // Introduction class


