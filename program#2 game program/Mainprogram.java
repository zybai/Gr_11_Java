import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Mainprogram extends JFrame
{
 
    public static Container c;                               // declaring variables and assigning value to variables
    public static JButton[] board;
    public static JLabel background;
    public static int j;
    public static int dice = 0;  // randomize number of steps
    public static int currentPosition = 0;
    public static int previousPosition = 0;
    public static String answer[];
    static Object options[] [];
    public static int countRight;

    public static String questions[] = {"When is Canada's birthday?",
	"Solve this question: 265-100+1",
	"When did the Second World War Start?",
	"The element symbol H stands for:",
	"Velocity * time =?",
	"Who drew Starry Starry night?",
	"Who composed Venetian Gondola Boat Song?",
	"Java program: which of the following is false?",
	"The great Victoria Desert is located in",
	"Who is the author of the book 'Nineteen Eighty Four'?",
	"A well designed web site can communicate effectively with its:",
	"I am primarily interested in thinking processes; I am a __________ psychologist.",
	"Because King Philip's desire to make Spain the dominant power in \n sixteenth-century Europe ran counter to Queen Elizabeth's insistence \n on autonomy for England, ------- was -------.",
	"Megan and Shana race against each other with the winner of each race \n receiving x gold coins and the loser receiving y gold coins \n (there are no ties and x and y are integers with x > y > 0.) after several races,\n Megan has 42 coins and Shana has 35 coins.Shana has 35 coins.Shana\n has won exactly 2 races.The value of x is",
	"Kings in the Late Middle Ages increasingly had to consult representative \n assemblies to grant new taxes because?:"
	};






    public static void question ()           // method for assigning the options and answers
    {
	options = new Object [15] [4];
	for (int i = 0 ; i < 15 ; i++)
	{
	    for (int g = 0 ; g < 4 ; g++)
	    {
		options [i] [g] = new Object ();
	    }
	}


	options [0] [0] = "a.      July 1st";
	options [0] [1] = "b.      July 2nd";
	options [0] [2] = "c.      August 1st";
	options [0] [3] = "d.      June 1st";
	options [1] [0] = "a.      255";
	options [1] [1] = "b.      155";
	options [1] [2] = "c.      156";
	options [1] [3] = "d.      154";
	options [2] [0] = "a.      1939";
	options [2] [1] = "b.      1940";
	options [2] [2] = "c.      1938";
	options [2] [3] = "d.      1941";
	options [3] [0] = "a.      Helium";
	options [3] [1] = "b.      Hydrogen";
	options [3] [2] = "c.      Mercury";
	options [3] [3] = "d.      Hafnium ";
	options [4] [0] = "a.      Displacement";
	options [4] [1] = "b.      Distance";
	options [4] [2] = "c.      Acceleration";
	options [4] [3] = "d.      Speed";
	options [5] [0] = "a.      Vincent Willem van Gogh";
	options [5] [1] = "b.      Leonardo Da Vinci";
	options [5] [2] = "c.      Henri Matisse";
	options [5] [3] = "d.      Pierre-Auguste Renoir";
	options [6] [0] = "a.      Ludwig Von Beethoven";
	options [6] [1] = "b.      Carl Maria von Weber";
	options [6] [2] = "c.      Wolfgang Amadeus Mozart";
	options [6] [3] = "d.      Felix Mendelssohn";
	options [7] [0] = "a.      Identifiers cannot start with a digit";
	options [7] [1] = "b.      Identifiers can include an underscore character";
	options [7] [2] = "c.      The identifiers word and woRd are the same";
	options [7] [3] = "d.      Identifiers can include digits and $ signs.";
	options [8] [0] = "a.      Canada";
	options [8] [1] = "b.      West Africa";
	options [8] [2] = "c.      Australia";
	options [8] [3] = "d.      North America";
	options [9] [0] = "a.      Thomas Hardy";
	options [9] [1] = "b.      Emile Zola";
	options [9] [2] = "c.      George Orwell";
	options [9] [3] = "d.      Walter Scott";
	options [10] [0] = "a.     Target Market";
	options [10] [1] = "b.     Stakeholders";
	options [10] [2] = "c.     Intermediaries";
	options [10] [3] = "d.     Investors";
	options [11] [0] = "a.     cognitive";
	options [11] [1] = "b.     learning";
	options [11] [2] = "c.     perception";
	options [11] [3] = "d.     personality";
	options [12] [0] = "a.     reconciliation . . assured";
	options [12] [1] = "b.     warfare . . avoidable";
	options [12] [2] = "c.     ruination . . impossible";
	options [12] [3] = "d.     conflict . . inevitable";
	options [13] [0] = "a.     3";
	options [13] [1] = "b.     4";
	options [13] [2] = "c.     5";
	options [13] [3] = "d.     6";
	options [14] [0] = "a.     Of the breakdown of feudal mechanisms to collect taxes.";
	options [14] [1] = "b.     A decline in population after the Black Death required an expansion of the tax base.";
	options [14] [2] = "c.     Absolute kinship characteristic of High Middle Ages had declined in the late Middle Ages";
	options [14] [3] = "d.     Income from ordinary revenues, particularly rents, had declined";
	answer = new String [15];
	answer [0] = "a.      July 1st";
	answer [1] = "c.      156";
	answer [2] = "a.      1939";
	answer [3] = "b.      Hydrogen";
	answer [4] = "a.      Displacement";
	answer [5] = "a.      Vincent Willem van Gogh";
	answer [6] = "d.      Felix Mendelssohn";
	answer [7] = "c.      The identifiers word and woRd are the same";
	answer [8] = "d.      North America";
	answer [9] = "c.      George Orwell";
	answer [10] = "b.     Stakeholders";
	answer [11] = "a.     cognitive";
	answer [12] = "d.     conflict . . inevitable";
	answer [13] = "b.     4";
	answer [14] = "d.     Income from ordinary revenues, particularly rents, had declined";




    }


    public static void SetIcon ()   // set the baord backgroud
    { //button

	board = new JButton [10];



	c.setLayout (null);
	for (int i = 0 ; i < 10 ; i++)
	{
	    board [i] = new JButton ();
	    board [i].setIcon (new ImageIcon ("board.png"));
	    board [i].setBounds (i * 100, 0, 100, 100);
	    c.add (board [i]);

	}

    }


    public static void move ()

    {
	c.setLayout (new BorderLayout ());    // set background
	background = new JLabel (new ImageIcon ("2.jpg"));
	background.setBounds (0, 0, 2500, 2400);
	c.add (background);
	for (j = 0 ; j < 5 ; j++) // easy level
	{
	    Object selectedValue = JOptionPane.showInputDialog (null,        // output questions and options and get the answer from the user
		    questions [j], "Input",
		    JOptionPane.INFORMATION_MESSAGE, null,
		    options [j], options [j] [0]);
	    if (selectedValue.equals (answer [j]))                     //if the answer is right, then the fish moves by generating a random number
	    {
		dice = (int) (Math.random () * 3) + 1;
		currentPosition += dice;
		if (currentPosition > 9)     // bullet proof if the currentPosition is out of bounds, currentPosition equal to max
		    currentPosition = 9;
		board [currentPosition].setIcon (new ImageIcon ("fish4.png"));
		board [previousPosition].setIcon (new ImageIcon ("board.jpg"));

		previousPosition += dice;
		if (currentPosition == 9 && j <= 4) // bullet proof to make sure that the user can win the game even if she/he didn't answer all 5 questions per level

		    {
			JOptionPane.showMessageDialog (null, "you won");
			j = 5;
		    }
	    }
	    if (selectedValue.equals (null))   // prevent the program from crashing if the user accidentally press CANCEL button
	    {
		System.exit (0);
	    }
	}
	if (currentPosition < 9)  // bullet proof if the user didn't reach the final position on the board after all 5 questions have displayed, he/she will lose
	{
	    JOptionPane.showMessageDialog (null, "You lost");
	    Introduction.SHOW ();

	} //go back to the first page
	//------------------------------------------------------------// the medium level----------------------------------------------------------//
	JOptionPane.showMessageDialog (null, "you are in the medium level");


	board [9].setIcon (new ImageIcon ("board.png"));
	currentPosition = 0;
	previousPosition = 0;
	for (j = 5 ; j < 10 ; j++)
	{
	    Object selectedValue = JOptionPane.showInputDialog (null,
		    questions [j], "Input",
		    JOptionPane.INFORMATION_MESSAGE, null,
		    options [j], options [j] [0]);
	    if (selectedValue.equals (answer [j]))
	    {
		dice = (int) (Math.random () * 3) + 1;
		currentPosition += dice;
		if (currentPosition > 9)
		    currentPosition = 9;
		board [currentPosition].setIcon (new ImageIcon ("fish4.jpg"));
		board [previousPosition].setIcon (new ImageIcon ("board.png"));
		previousPosition += dice;
		if (currentPosition == 9 & j <= 9)

		    {
			JOptionPane.showMessageDialog (null, "you won");
			j = 10;
		    }



	    }
	    if (selectedValue.equals (null))
	    {
		System.exit (0);
	    }
	}
	if (currentPosition < 9)
	{
	    JOptionPane.showMessageDialog (null, "You lost");
	    try
	    {
		Thread.sleep (1000);
	    }
	    catch (Exception e)
	    {
		System.out.println (e);
	    }
	    Introduction.SHOW ();
	}
	//go back to the first page
	//---------------------------------------------hard level----------------------------------------------------------------//
	JOptionPane.showMessageDialog (null, "you are in the hard level");

	currentPosition = 0;
	previousPosition = 0;
	board [9].setIcon (new ImageIcon ("board.png"));
	for (j = 10 ; j < 15 ; j++)
	{
	    Object selectedValue = JOptionPane.showInputDialog (null,
		    questions [j], "Input",
		    JOptionPane.INFORMATION_MESSAGE, null,
		    options [j], options [j] [0]);
	    if (selectedValue.equals (answer [j]))
	    {
		dice = (int) (Math.random () * 3) + 1;
		currentPosition += dice;
		if (currentPosition > 9)
		    currentPosition = 9;
		board [currentPosition].setIcon (new ImageIcon ("fish4.jpg"));
		board [previousPosition].setIcon (new ImageIcon ("board.png"));
		previousPosition += dice;
		if (currentPosition == 9 && j <= 14)

		    {
			JOptionPane.showMessageDialog (null, "you won");
			j = 15;
			Introduction.SHOW ();
		    }
	    }
	    if (selectedValue.equals (null))
	    {
		System.exit (0);
	    }
	}
	if (currentPosition < 9 && j > 14)

	    {
		JOptionPane.showMessageDialog (null, "You lost");
		try
		{
		    Thread.sleep (1000);
		}
		catch (Exception e)
		{
		    System.out.println (e);
		}

	      Introduction.SHOW ();
	    }
	;  //go back to the first page



    }


    public Mainprogram ()  // make the board appear visible and set the size and location
    {
	c = getContentPane ();
	setDefaultCloseOperation (EXIT_ON_CLOSE);
	question ();
	SetIcon ();
	setTitle ("board");
	setSize (1000, 1000);
	setLocation (0, 0);

	c.setLayout (new BorderLayout ());
	setDefaultCloseOperation (EXIT_ON_CLOSE);
	background = new JLabel (new ImageIcon ("2.jpg"));
	c.add (background);
	setVisible (true);
	move ();

    }



    public static void main (String[] args)
    {
	new Mainprogram ();



    }
}

