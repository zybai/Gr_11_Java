import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.applet.*;
import java.lang.*;
import java.io.*;
public class SunnyVale extends JApplet implements ActionListener
{


    Image bg;
    JButton calculate, exit, Start;
    AudioClip soundCliptf, soundClipgreat, soundClipbye, soundClipnb, soundClipbad, soundClipcool;
    JTextField english, ics, aveg, physics, chemistry, biology, law, math;
    JLabel englishL, icsL, avegL, physicsL, mathL, lawL, chemistryL, biologyL;
    int aveg1;
    thread threads = new thread ();



    public void init ()
    {

	setSize (1280, 1024);
	//Setting size for applet

	Container contentPane = getContentPane ();
	contentPane.setBackground (Color.black);
	contentPane.setLayout (null);
	//
	bg = getImage (getCodeBase (), "sunnyvale.jpg");
	//Picture

	soundClipnb = getAudioClip (getCodeBase (), "prettygood.wav");
	soundClipbad = getAudioClip (getCodeBase (), "no.wav");
	soundClipcool = getAudioClip (getCodeBase (), "cool.wav");
	soundCliptf = getAudioClip (getCodeBase (), "fingers_too_fat.wav");
	soundClipgreat = getAudioClip (getCodeBase (), "great.wav");
	soundClipbye = getAudioClip (getCodeBase (), "goodbye.wav");

	main ();


	// Place the body of the initialization method here
    } // init method


    public void main ()
    {
	Container contentPane = getContentPane ();
	contentPane.setBackground (new Color(200,250,120));
	contentPane.setLayout (null);
	Font f1 = new Font ("Broadway", Font.BOLD,20);
	Font f2 = new Font ("Agency FB", Font.BOLD, 20);
	Font f3 = new Font ("Arial", Font.BOLD, 20);
	//

	mathL = new JLabel ("Math mark:  ");
	mathL.setFont (f1);
	mathL.setBackground (Color.red);
	mathL.setForeground (Color.black);
	mathL.setBounds (0,0,200,100);
	contentPane.add (mathL);
	math = new JTextField (6);
	math.setFont (f1);
	math.setBackground (Color.white);
	math.setForeground (Color.red);
	math.setBounds (150,35,50, 30);
	contentPane.add (math);
	
	//math

	physicsL = new JLabel ("Physics mark:  ");
	physicsL.setFont (f1);
	physicsL.setBackground (Color.red);
	physicsL.setForeground (Color.black);
	physicsL.setBounds (250,0,200,100);
	contentPane.add (physicsL);
	physics = new JTextField (6);
	physics.setFont (f1);
	physics.setBackground (Color.white);
	physics.setForeground (Color.red);
	physics.setBounds(420,35,50,30);
	contentPane.add (physics);
	//physics

	chemistryL = new JLabel ("Chemistry mark:  ");
	chemistryL.setFont (f1);
	chemistryL.setBackground (Color.red);
	chemistryL.setForeground (Color.black);
	chemistryL.setBounds (500,0,230,100);
	contentPane.add (chemistryL);
	chemistry = new JTextField (6);
	chemistry.setFont (f1);
	chemistry.setBackground (Color.white);
	chemistry.setForeground (Color.red);
	chemistry.setBounds(710,35,50,30);
	contentPane.add (chemistry);
	//chemistry

	biologyL = new JLabel ("Biology mark:  ");
	biologyL.setFont (f1);
	biologyL.setBackground (Color.red);
	biologyL.setForeground (Color.black);
	biologyL.setBounds(800,0,200,100);
	contentPane.add (biologyL);
	biology = new JTextField (6);
	biology.setFont (f1);
	biology.setBackground (Color.white);
	biology.setForeground (Color.red);
	biology.setBounds(980,35,50,30);
	contentPane.add (biology);
	//biology

	lawL = new JLabel ("Law mark:  ");
	lawL.setFont (f1);
	lawL.setBackground (Color.red);
	lawL.setForeground (Color.black);
	lawL.setBounds(0,50,200,100);
	contentPane.add (lawL);
	law = new JTextField (6);
	law.setFont (f1);
	law.setBackground (Color.white);
	law.setForeground (Color.red);
	law.setBounds(150,85,50,30);
	contentPane.add (law);
	//law

	englishL = new JLabel ("English mark:  ");
	englishL.setFont (f1);
	englishL.setBackground (Color.red);
	englishL.setForeground (Color.black);
	englishL.setBounds(250,50,200,100);
	contentPane.add (englishL);
	english = new JTextField (6);
	english.setFont (f1);
	english.setBackground (Color.white);
	english.setForeground (Color.red);
	english.setBounds(420,85,50,30);
	contentPane.add (english);
	//math

	icsL = new JLabel ("ICS mark:  ");
	icsL.setFont (f1);
	icsL.setBackground (Color.red);
	icsL.setForeground (Color.black);
	icsL.setBounds(500,50,200,100);
	contentPane.add (icsL);
	ics = new JTextField (6);
	ics.setFont (f1);
	ics.setBackground (Color.white);
	ics.setForeground (Color.red);
	ics.setBounds(710,85,50,30);
	contentPane.add (ics);
	//computer law

	aveg = new JTextField (6);
	aveg.setFont (f2);
	aveg.setBackground (new Color(80,150,250));
	aveg.setForeground (Color.black);
	aveg.setBounds(1200,300,50,50);
	contentPane.add (aveg);
	//average

	calculate = new JButton ("Click Here for Average");
	calculate.addActionListener (this);
	calculate.setFont (f3);
	calculate.setBounds(900,300,300,50);
	calculate.setBackground (new Color(250,100,10));
	calculate.setForeground (Color.white);
	contentPane.add (calculate);
	//calculate

	exit = new JButton ("Click Here to EXIT");
	exit.addActionListener (this);
	exit.setFont (f3);
	exit.setBackground (new Color(120,213,41));
	exit.setForeground (Color.white);
	exit.setBounds(925,400,300,50);
	contentPane.add (exit);
	//Exit

	math.setText ("0");
	english.setText ("0");
	physics.setText ("0");
	chemistry.setText ("0");
	biology.setText ("0");
	law.setText ("0");
	ics.setText ("0");
	aveg.setText ("0");
	//Setting everything to 0
    }



    public void actionPerformed (ActionEvent e)
    {


	if (e.getSource () == calculate)
	{

	    int rang = 0, rang2 = 0, rang3 = 0, rang4 = 0, rang5 = 0, rang6 = 0, rang7 = 0;


	    String cs = ics.getText ();
	    String m1 = math.getText ();
	    String eg = english.getText ();
	    String ph = physics.getText ();
	    String ci = chemistry.getText ();
	    String bi = biology.getText ();
	    String la = law.getText ();

	    for (int z = 0 ; z < m1.length () ; z++)
		if (m1.charAt (z) >= '0' && m1.charAt (z) <= '9')
		    rang = 1;
		else
		    rang = 0;
	    //Checking if math input is correct

	    for (int z = 0 ; z < cs.length () ; z++)
		if (cs.charAt (z) >= '0' && cs.charAt (z) <= '9')
		    rang2 = 1;
		else
		    rang2 = 0;
	    //Checking if computer law input is correct

	    for (int z = 0 ; z < eg.length () ; z++)
		if (eg.charAt (z) >= '0' && eg.charAt (z) <= '9')
		    rang3 = 1;
		else
		    rang3 = 0;
	    //Checking if math input is correct

	    for (int z = 0 ; z < ph.length () ; z++)
		if (ph.charAt (z) >= '0' && ph.charAt (z) <= '9')
		    rang4 = 1;
		else
		    rang4 = 0;
	    //Checking if physics input is correct

	    for (int z = 0 ; z < bi.length () ; z++)
		if (bi.charAt (z) >= '0' && bi.charAt (z) <= '9')
		    rang5 = 1;
		else
		    rang5 = 0;
	    //Checking if biology input is correct

	    for (int z = 0 ; z < ci.length () ; z++)
		if (ci.charAt (z) >= '0' && ci.charAt (z) <= '9')
		    rang6 = 1;
		else
		    rang6 = 0;
	    //Checking if chemistry input is correct

	    for (int z = 0 ; z < la.length () ; z++)

		if (la.charAt (z) >= '0' && la.charAt (z) <= '9')
		    rang7 = 1;
		else
		    rang7 = 0;
	    //Checking if law input is correct

	    if (rang == 1 && rang2 == 1 && rang3 == 1 && rang4 == 1 && rang5 == 1 && rang6 == 1 && rang7 == 1)

		{
		    int cs1 = Integer.parseInt (ics.getText ());
		    int ma1 = Integer.parseInt (math.getText ());
		    int eg1 = Integer.parseInt (english.getText ());
		    int ph1 = Integer.parseInt (physics.getText ());
		    int ci1 = Integer.parseInt (chemistry.getText ());
		    int bi1 = Integer.parseInt (biology.getText ());
		    int la1 = Integer.parseInt (law.getText ());
		    //reading input

		    if (ma1 > 100 || ma1 < 0)
		    {
			ma1 = 0;
			eg1 = 0;
			ph1 = 0;
			ci1 = 0;
			bi1 = 0;
			la1 = 0;
			cs1 = 0;
			math.setText ("0");
			math.setText ("0");
			physics.setText ("0");
			chemistry.setText ("0");
			biology.setText ("0");
			law.setText ("0");
			ics.setText ("0");
			aveg.setText ("0");

		    }

		    //math input

		    if (cs1 > 100 || cs1 < 0)
		    {
			ma1 = 0;
			eg1 = 0;
			ph1 = 0;
			ci1 = 0;
			bi1 = 0;
			la1 = 0;
			cs1 = 0;
			math.setText ("0");
			english.setText ("0");
			physics.setText ("0");
			chemistry.setText ("0");
			biology.setText ("0");
			law.setText ("0");
			ics.setText ("0");
			aveg.setText ("0");

		    }
		    // computer law input

		    if (eg1 > 100 || eg1 < 0)
		    {
			ma1 = 0;
			eg1 = 0;
			ph1 = 0;
			ci1 = 0;
			bi1 = 0;
			la1 = 0;
			cs1 = 0;
			english.setText ("0");
			math.setText ("0");
			physics.setText ("0");
			chemistry.setText ("0");
			biology.setText ("0");
			law.setText ("0");
			ics.setText ("0");
			aveg.setText ("0");
		    }
		    //math input

		    if (ph1 > 100 || ph1 < 0)
		    {
			ma1 = 0;
			eg1 = 0;
			ph1 = 0;
			ci1 = 0;
			bi1 = 0;
			la1 = 0;
			cs1 = 0;
			english.setText ("0");
			math.setText ("0");
			physics.setText ("0");
			chemistry.setText ("0");
			biology.setText ("0");
			law.setText ("0");
			ics.setText ("0");
			aveg.setText ("0");
		    }
		    //physics input

		    if (ci1 > 100 || ci1 < 0)
		    {
			ma1 = 0;
			eg1 = 0;
			ph1 = 0;
			ci1 = 0;
			bi1 = 0;
			la1 = 0;
			cs1 = 0;
			english.setText ("0");
			math.setText ("0");
			physics.setText ("0");
			chemistry.setText ("0");
			biology.setText ("0");
			law.setText ("0");
			ics.setText ("0");
			aveg.setText ("0");
		    }
		    //chemistry input

		    if (bi1 > 100 || bi1 < 0)
		    {
			ma1 = 0;
			eg1 = 0;
			ph1 = 0;
			ci1 = 0;
			bi1 = 0;
			la1 = 0;
			cs1 = 0;
			english.setText ("0");
			math.setText ("0");
			physics.setText ("0");
			chemistry.setText ("0");
			biology.setText ("0");
			law.setText ("0");
			ics.setText ("0");
			aveg.setText ("0");
		    }
		    //biology input

		    if (la1 > 100 || la1 < 0)
		    {
			ma1 = 0;
			eg1 = 0;
			ph1 = 0;
			ci1 = 0;
			bi1 = 0;
			la1 = 0;
			cs1 = 0;
			english.setText ("0");
			math.setText ("0");
			physics.setText ("0");
			chemistry.setText ("0");
			biology.setText ("0");
			law.setText ("0");
			ics.setText ("0");
			aveg.setText ("0");
		    }
		    //law input

		    if (cs1 <= 100 && cs1 >= 0)
		    {
			try
			{
			    fileCS();
			}
			catch (IOException f)
			{
			}
		    }
		    //getting computer law file

		    if (ma1 <= 100 && ma1 >= 0)
		    {
			try
			{
			    fileMA ();
			}
			catch (IOException f)
			{
			}
		    }
		    //getting math file

		    if (eg1 <= 100 && eg1 >= 0)
		    {
			try
			{
			    fileEG ();
			}
			catch (IOException f)
			{
			}
		    }
		    //getting english file

		    if (bi1 <= 100 && bi1 >= 0)
		    {
			try
			{
			    fileBI();
			}
			catch (IOException f)
			{
			}
		    }
		    //getting biology file

		    if (ci1 <= 100 && ci1 >= 0)
		    {
			try
			{
			    fileCI ();
			}
			catch (IOException f)
			{
			}
		    }
		    //getting chemistry file

		    if (la1 <= 100 && la1 >= 0)
		    {
			try
			{
			    fileLA();
			}
			catch (IOException f)
			{
			}
		    }
		    //getting law file

		    if (ph1 <= 100 && ph1 >= 0)
		    {
			try
			{
			    filePH();
			}
			catch (IOException f)
			{
			}
		    }
		    //getting physics file

		    try
		    {
			aveg1 = calculate ();
		    }
		    catch (IOException f)
		    {
		    }
		    //getting calculating file


		    if (aveg1 >= 0)
		    {
			if (aveg1 <= 10 && aveg1 <= 0)
			    soundClipbad.play ();
			if (aveg1 > 10 && aveg1 < 50)
			{
			    soundClipnb.play ();
			}
			if (aveg1 >= 50 && aveg1 < 90)
			{
			    soundClipcool.play ();
			}
			if (aveg1 >= 90)
			{
			    soundClipgreat.play ();
			}
		    }

		    aveg.setText ("" + aveg1);
		}
	    //Playing sound effects

	    else
	    {

		english.setText ("0");
		math.setText ("0");
		physics.setText ("0");
		chemistry.setText ("0");
		biology.setText ("0");
		law.setText ("0");
		ics.setText ("0");
		aveg.setText ("0");
		soundCliptf.play ();
	    }
	    //if not inputted correctly

	}

	if (e.getSource () == exit)
	{
	    soundClipbye.play ();
	    threads.start ();
	    threads.delay ();
	    System.exit (0);
	    System.out.println (e);
	}
    }


    public int calculate () throws IOException
    {
	String l1, l2, l3, l4, l5, l6, l7;
	BufferedReader inpBR1, inpBR2, inpBR3, inpBR4, inpBR5, inpBR6, inpBR7;
	FileReader inpFR1, inpFR2, inpFR3, inpFR4, inpFR5, inpFR6, inpFR7;
	inpFR1 = new FileReader ("fileMA.txt");
	inpBR1 = new BufferedReader (inpFR1);
	inpFR2 = new FileReader ("filePH.txt");
	inpBR2 = new BufferedReader (inpFR2);
	inpFR3 = new FileReader ("fileLA.txt");
	inpBR3 = new BufferedReader (inpFR3);
	inpFR4 = new FileReader ("fileCS.txt");
	inpBR4 = new BufferedReader (inpFR4);
	inpFR5 = new FileReader ("fileCI.txt");
	inpBR5 = new BufferedReader (inpFR5);
	inpFR6 = new FileReader ("fileBI.txt");
	inpBR6 = new BufferedReader (inpFR6);
	inpFR7 = new FileReader ("fileEG.txt");
	inpBR7 = new BufferedReader (inpFR7);
	//

	l1 = inpBR1.readLine ();
	l2 = inpBR2.readLine ();
	l3 = inpBR3.readLine ();
	l4 = inpBR4.readLine ();
	l5 = inpBR5.readLine ();
	l6 = inpBR6.readLine ();
	l7 = inpBR7.readLine ();
	//reading

	int ma2 = Integer.parseInt (l1);
	int hs2 = Integer.parseInt (l2);
	int cs2 = Integer.parseInt (l3);
	int sc2 = Integer.parseInt (l4);
	int ci2 = Integer.parseInt (l5);
	int ca2 = Integer.parseInt (l6);
	int eg2 = Integer.parseInt (l7);
	//switching

	int avg = (ma2 + hs2 + cs2 + ci2 + ca2 + sc2 + eg2) / 7;

	//calculate
	return avg;
    }



    public void fileCS () throws IOException
    {
	PrintWriter outputPW;
	FileWriter outputFW;
	outputFW = new FileWriter ("fileCS.txt", false);
	outputPW = new PrintWriter (outputFW);
	outputPW.println (ics.getText ());
	outputFW.close ();
	outputPW.close ();

    }


    //computer science file


    public void filePH () throws IOException
    {
	PrintWriter outputPW;
	FileWriter outputFW;
	outputFW = new FileWriter ("filePH.txt", false);
	outputPW = new PrintWriter (outputFW);
	outputPW.println (physics.getText ());
	outputFW.close ();
	outputPW.close ();

    }


    // physics file

    public void fileMA () throws IOException
    {
	PrintWriter outputPW;
	FileWriter outputFW;
	outputFW = new FileWriter ("fileMA.txt", false);
	outputPW = new PrintWriter (outputFW);
	outputPW.println (math.getText ());
	outputFW.close ();
	outputPW.close ();

    }


    // math file

    public void fileBI () throws IOException
    {
	PrintWriter outputPW;
	FileWriter outputFW;
	outputFW = new FileWriter ("fileBI.txt", false);
	outputPW = new PrintWriter (outputFW);
	outputPW.println (biology.getText ());
	outputFW.close ();
	outputPW.close ();

    }


    //biology file

    public void fileCI () throws IOException
    {
	PrintWriter outputPW;
	FileWriter outputFW;
	outputFW = new FileWriter ("fileCI.txt", false);
	outputPW = new PrintWriter (outputFW);
	outputPW.println (chemistry.getText ());
	outputFW.close ();
	outputPW.close ();

    }


    //chemistry file

    public void fileLA () throws IOException
    {
	PrintWriter outputPW;
	FileWriter outputFW;
	outputFW = new FileWriter ("fileLA.txt", false);
	outputPW = new PrintWriter (outputFW);
	outputPW.println (law.getText ());
	outputFW.close ();
	outputPW.close ();

    }


    //law file

    public void fileEG () throws IOException
    {
	PrintWriter outputPW;
	FileWriter outputFW;
	outputFW = new FileWriter ("fileEG.txt", false);
	outputPW = new PrintWriter (outputFW);
	outputPW.println (math.getText ());
	outputFW.close ();
	outputPW.close ();

    }


    //english file



    public void paint (Graphics g)
    { // call inherited version of method paint

	super.paint (g);
	Font f4 = new Font ("Agency FB", Font.BOLD, 60);
	g.setFont (f4);
	g.setColor (new Color(50,200,41));
	g.drawImage (bg, 0, 150, this);
	g.drawString ("Sunny Vale Academy", 850, 200);

    } // paint method


    class thread extends Thread
    {
	int sleeptime = 3000;

	public void delay ()
	{
	    try
	    {
		sleep (sleeptime);
	    }
	    catch (InterruptedException e)
	    {

	    }
	}
	//delay
    }


    //threads

} //end of class SunnyVale


