// The "OnePieceGussingGame" class.By Anna Liu, Wenday Bai, Coco Qu
import java.applet.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class AAMainProgramClickHereMrMichl extends JFrame
{
    //declaring variables
    String name;
    JLabel welcomelabel;
    JLabel introTitle,congratTitle;
    JButton begin,begin2,begin3;
    JLabel chopper,usopp;
    AudioClip introsong;
    JLabel howto,leveltitle;
    JTextArea instructions;
    PrintWriter outputPW;
    FileWriter outputFW;
    JLabel L1, L2, L3;
    JLabel question;
    Container contentPane;
    JTextField ChoosingLevel;
    int level, answer;
    int highest, lowest;
    JLabel text1, text2;
    JLabel tries;
    JLabel triesnum;
    JButton guess;
    JTextField playerguess,guessnum;
    JTextArea results;
    int num,playernum;
    int count;
    boolean check;
    String guessvalue;
    JButton next,replay,fileprogram;
    JLabel bubble,franky,zoro,luffy,law;
    int finalscore;
    
    //The program:
    public AAMainProgramClickHereMrMichl()
    {
	do
	{
	//MessageDialog asking for name:
	Font f = new Font ("Serif",Font.BOLD,15);
	JLabel askname = new JLabel ("Please Enter Your Name:");
	askname.setFont(f);
	askname.setForeground(Color.black);
	name = JOptionPane.showInputDialog(null,askname);
	
	
	//error trap:
	if(name == null)
	{
	JOptionPane.showMessageDialog(null,"YOU HAVE QUIT THE PROGRAM.");
	System.exit(0);
	}
	else if(name.equals(""))
	{
	JOptionPane.showMessageDialog(null,"PLEASE ENTER NAME.");
	}
	else
	{
	//displaying maine contentPane, setting up:
	contentPane = getContentPane();
	contentPane.setLayout(null);
	contentPane.setBackground(new Color(50, 200, 200) );
	
	//adding components to contentPane
	welcomelabel = new JLabel();
	welcomelabel.setIcon(new ImageIcon("logopiece.png"));
	welcomelabel.setBounds(35,50,600,100);
	contentPane.add(welcomelabel);
	
	introTitle = new JLabel();
	introTitle.setIcon(new ImageIcon("TF.gif"));
	introTitle.setBounds(30,160,500,100);
	contentPane.add(introTitle);
	
	     
	chopper = new JLabel();
	chopper.setIcon(new ImageIcon("chopper.png"));
	chopper.setBounds(50,250,500,200);
	contentPane.add(chopper);    
	
	//JButton to press to start the game
	Font f3 = new Font ("Impact",Font.BOLD,20);
	begin = new JButton();
	begin.setText("PLAY");
	begin.setBounds(180,300,126,50);
	begin.setFont(f3);
	begin.setForeground(Color.white);
	begin.setBackground(new Color(182,33,50));
	contentPane.add(begin);
	
	//ActionListener to the next class
	HowToClass How = new HowToClass();
	begin.addActionListener(How);

	
	setSize(500,500);
	setVisible(true);
	}
	}while(name.equals(""));

    } 
    public class HowToClass implements ActionListener
    {
    public void actionPerformed(ActionEvent event)
    {
		    //repainting the screen
		    getContentPane().removeAll();
		    repaint();
		    
		    //instructions on how to play:
		    Font f1 = new Font ("Agency FB",Font.PLAIN,20);
		    JLabel greeting = new JLabel();
		    greeting.setFont(f1);
		    greeting.setText("Welcome, " + name + ", to OnePiece Guessing Game!!!");
		    greeting.setBounds(10,10,500,35);
		    contentPane.add(greeting);
		    
		    Font f2 = new Font ("Bookman Old Style",Font.BOLD,40);
		    howto = new JLabel();
		    howto.setFont(f2);
		    howto.setText("HOW TO PLAY:");
		    howto.setForeground(new Color(102,0,51));
		    howto.setBounds(10,70,500,35);
		    contentPane.add(howto);
		    
		    instructions = new JTextArea(5,20);
		    
		    //importing instructions file to JTextArea
		    BufferedReader instructionsBR;
		    DataInputStream instructionsDR;
		    FileInputStream instructionsFR;
		    String instructionsString[] = new String[100];
		    String add = "";
		    
		    //catching exceptions
		    try
		    {
		    instructionsFR = new FileInputStream("howtoplay.txt");
		    instructionsDR = new DataInputStream(instructionsFR);
	      
		    instructionsBR = new BufferedReader(new InputStreamReader(instructionsDR));

		    for(int i = 0; i < 11; i++)
		    {
		    instructionsString[i] = instructionsBR.readLine();
		    add += instructionsString[i] + "\n";
		    }
 
		    }catch(IOException e)
		    {
		    e.printStackTrace();
		    } 
		    
	   
		    
		    Font f4 = new Font ("Agency FB",Font.PLAIN,15);
		    instructions.setFont(f4);
		    instructions.setForeground(Color.black);
		    instructions.setText(add);                    
		    instructions.setBackground(Color.white);
		    instructions.setBounds(30,110,350,200);
		    
		    contentPane.add(instructions);
		    
		    usopp = new JLabel();
		    usopp.setIcon(new ImageIcon("usopp.png"));
		    usopp.setBounds(300,250,500,200);
		    contentPane.add(usopp);
		    
		    Font f3 = new Font ("Impact",Font.BOLD,20);
		    begin2 = new JButton();
		    begin2.setText("START");
		    begin2.setBounds(250,330,126,50);
		    begin2.setFont(f3);
		    begin2.setForeground(Color.white);
		    begin2.setBackground(new Color(69,33,50));
		    contentPane.add(begin2);
		    
		    LevelClass selectLevel = new LevelClass();
		    begin2.addActionListener(selectLevel);           
	       
    } 
    }
    
    public class LevelClass implements ActionListener
    {
	public void actionPerformed(ActionEvent event)
	{
	     //repainting the screen
	     getContentPane().removeAll();
	     repaint();
	     
	     
	     Font f1 = new Font ("Bookman Old Style",Font.BOLD,40);
	     leveltitle = new JLabel();
	     leveltitle.setFont(f1);
	     leveltitle.setText("LEVELS:");
	     leveltitle.setForeground(new Color(0,51,51));
	     leveltitle.setBounds(10,70,500,35);
	     contentPane.add(leveltitle);
	     
	     Font f2 = new Font ("Harrington",Font.BOLD,30);
	     
	     //Indicating level
	     L1 = new JLabel();
	     L1.setFont(f2);
	     L1.setText("1.Grand Line Pirate (Easy)");
	     L1.setForeground(new Color(0,153,102));
	     L1.setBounds(50,130,500,35);
	     contentPane.add(L1);
	     
	     L2 = new JLabel();
	     L2.setFont(f2);
	     L2.setText("2.New World Pirate (Normal)");
	     L2.setForeground(new Color(127,0,225));
	     L2.setBounds(50,190,500,35);
	     contentPane.add(L2);
	     
	     L3 = new JLabel();
	     L3.setFont(f2);
	     L3.setText("3.Pirate King (Hard)");
	     L3.setForeground(new Color(255,51,51));
	     L3.setBounds(50,250,500,35);
	     contentPane.add(L3);
	     
	     Font f3 = new Font ("Arial Narrow", Font.BOLD, 15);
	     
	     JLabel L123 = new JLabel();
	     L123.setFont(f3);
	     L123.setText("Please Enter Level (1,2,3) :");
	     L123.setForeground(new Color(95,95,95));
	     L123.setBounds(200,260,200,100);
	     contentPane.add(L123);

	     //for level selection
	     ChoosingLevel = new JTextField();
	     ChoosingLevel.setText("");
	     ChoosingLevel.setBounds(370,300,25,20);
	     ChoosingLevel.setFont(f3);
	     ChoosingLevel.setForeground(Color.black);
	     contentPane.add(ChoosingLevel);
	     
	     //JButton to start the game, leading to different levels
	     Font f4 = new Font ("Impact",Font.BOLD,20);
	     Icon flag = new ImageIcon(getClass().getResource("flag.png"));
	     Icon sunny = new ImageIcon(getClass().getResource("sunny.png"));
	     begin3 = new JButton("SET SAIL!",flag);
	     begin3.setRolloverIcon(sunny);
	     begin3.setBounds(250,350,180,60);
	     begin3.setFont(f4);
	     begin3.setForeground(Color.white);
	     begin3.setBackground(new Color(0,102,204));
	     contentPane.add(begin3);
	     
	       begin3.addActionListener(
		new ActionListener()
		{
		    public void actionPerformed (ActionEvent event)
		    {
			 begin3ActionPerformed (event);
		    }
		}
		);
	
	}
	public void begin3ActionPerformed (ActionEvent event)
	{
	    //distributing levels to easy, normal or hard 
	    if(ChoosingLevel.getText ().equals("1"))
		{
		level = 1;
		EasyClass EasyLevel = new EasyClass();
		begin3.addActionListener(EasyLevel);
		}
	    else if(ChoosingLevel.getText ().equals("2"))
		{
		level = 2;
		NormalClass NormalLevel = new NormalClass();
		 begin3.addActionListener(NormalLevel);
		}
	    else if(ChoosingLevel.getText ().equals("3"))
		{
		level = 3;
		HardClass HardLevel = new HardClass();
		begin3.addActionListener(HardLevel);
		}
	    else
	    //error trap:
		{
		level = 0;
		JOptionPane.showMessageDialog(null,"INVALID VALUE");
		}
	}
   }     
	
      
       

    //EASY LEVEL CLASS
    public class EasyClass implements ActionListener
    {
	Font f = new Font ("Calibri",Font.BOLD,20);
	Font f2 = new Font ("Impact",Font.BOLD,15);
	Font f3 = new Font ("Impact",Font.BOLD,20);
	 public void actionPerformed(ActionEvent event)
	{
	getContentPane().removeAll();
	repaint();
	
	highest = 0;
	lowest = 100;
	count = 0;
	
	//instructions on how to play
	text1 = new JLabel();
	text2 = new JLabel();
	text1.setFont(f);
	text1.setText("The treasure One Piece is buried in one of 100 islands!");
	text1.setForeground(new Color(0,51,51));
	text1.setBounds(10,100,500,35);
	contentPane.add(text1);
	text2.setFont(f);
	text2.setText("Guess the island number!(a number between 1-100)");
	text2.setForeground(new Color(0,51,51));
	text2.setBounds(10,125,500,35);
	contentPane.add(text2);
	
	//indicating number of tries,(score)
	tries = new JLabel();
	tries.setFont(f);
	tries.setText("Number of tries:");
	tries.setForeground(Color.black);
	tries.setBounds(10,400,300,50);
	contentPane.add(tries);
	
	triesnum = new JLabel();
	triesnum.setFont(f);
	triesnum.setText("");
	triesnum.setForeground(Color.red);
	triesnum.setBounds(165,415,20,20);
	contentPane.add(triesnum);
	
	
	playerguess = new JTextField();
	playerguess.setBounds(200,200,100,25);
	contentPane.add(playerguess);
	
	results = new JTextArea();
	results.setText("");
	results.setBounds(300,300,70,50);
	results.setFont(f2);
	results.setForeground(Color.black);
	results.setEditable(false);
	contentPane.add(results);
	
	bubble = new JLabel();
	bubble.setIcon(new ImageIcon("bubbledialog.png"));
	bubble.setBounds(260,250,500,200);
	contentPane.add(bubble);
	
	luffy = new JLabel();
	luffy.setIcon(new ImageIcon("Luffy.png"));
	luffy.setBounds(360,300,500,200);
	contentPane.add(luffy);
	
	//JButton for guessing the number
	guess = new JButton();
	guess.setText("GUESS!");
	guess.setBounds(300,200,100,25);
	guess.setFont(f3);
	guess.setForeground(Color.white);
	guess.setBackground(Color.red);
	contentPane.add(guess);
	guess.addActionListener(
	    new ActionListener()
	    {
		public void actionPerformed(ActionEvent event)
		{
		    guessActionPerformed(event);
		}
	    }
	);
	
	GuessingGame();
	     
	
	}
	
	public void GuessingGame()
	{
	    //selecting the actual number randomly:
	    num = (int)(Math.random()*100)+1;
	}
	
	public void guessActionPerformed (ActionEvent event)
	{
	    //calculations for the number guessed and the actual number
	    //finding whether the number guessed is higher or lower than the actual number
	    guessvalue = playerguess.getText();
	    check = isInteger(guessvalue);
	    if(check == true)
		playernum = Integer.parseInt(playerguess.getText());
	    else
		JOptionPane.showMessageDialog(null,"INVALID VALUE");

	     
	     if (playernum > num)
	     {
		if(playernum < 100)
		{
		results.setText("Too High");
		count = count + 1;
		String str = Integer.toString(count);
		triesnum.setText(str);
		}
		else
		JOptionPane.showMessageDialog(null,"NUMBER NOT IN RANGE");
	     }
	     else if (playernum < num)
	     {
		if(playernum > 0)
		{
		results.setText("Too Low");
		count = count + 1;
		String str = Integer.toString(count);
		triesnum.setText(str);
		}
		else
		JOptionPane.showMessageDialog(null,"NUMBER NOT IN RANGE");
	     }
	     else
	     {
	     //JButton to go to final class
	     results.setText("Correct!");
	     next = new JButton();
	     next.setText("NEXT");
	     next.setBounds(250,400,100,50);
	     next.setFont(f3);
	     next.setForeground(Color.white);
	     next.setBackground(Color.red);
	     contentPane.add(next);
	    
		   FinalClass TheEnd = new FinalClass();
		    next.addActionListener(TheEnd);    
		    finalscore = count;
		    count = 0;
		    try
	     {
	     outputFW = new FileWriter("easyscores.txt");
	     outputPW = new PrintWriter(outputFW);
	     outputPW.println(name + " " + finalscore);
	     outputFW.close();
	     outputPW.close();
	     }catch(IOException e)
	     {
	     e.printStackTrace();
	     }
		    
		   
	       
	     }

		
	}
	public boolean isInteger(String guessvalue)
	{
	    //checking for errors:
	    try
	    {
		Integer.parseInt(guessvalue);
		return true;
	    }
	    catch(Exception e)
	    {
		return false;
	    }
	}
	
	
   
    }
    //Normal level class:
    public class NormalClass implements ActionListener
    {
	Font f = new Font ("Calibri",Font.BOLD,20);
	Font f2 = new Font ("Impact",Font.BOLD,15);
	Font f3 = new Font ("Impact",Font.BOLD,20);
	 public void actionPerformed(ActionEvent event)
	{
	getContentPane().removeAll();
	repaint();
	highest = 0;
	lowest = 100;
	text1 = new JLabel();
	text2 = new JLabel();
	text1.setFont(f);
	//instructions:
	text1.setText("The treasure One Piece is buried in one of 1000 islands!");
	text1.setForeground(new Color(0,51,51));
	text1.setBounds(10,100,500,35);
	contentPane.add(text1);
	text2.setFont(f);
	text2.setText("Guess the island number!(a number between 1-1000)");
	text2.setForeground(new Color(0,51,51));
	text2.setBounds(10,125,500,35);
	contentPane.add(text2);
	
	//counting the number of tries for scores
	tries = new JLabel();
	tries.setFont(f);
	tries.setText("Number of tries:");
	tries.setForeground(Color.black);
	tries.setBounds(10,400,300,50);
	contentPane.add(tries);
	
	triesnum = new JLabel();
	triesnum.setFont(f);
	triesnum.setText("");
	triesnum.setForeground(Color.red);
	triesnum.setBounds(165,415,20,20);
	contentPane.add(triesnum);
	
	playerguess = new JTextField();
	playerguess.setBounds(200,200,100,25);
	contentPane.add(playerguess);
	
	results = new JTextArea();
	results.setText("");
	results.setBounds(300,300,70,50);
	results.setFont(f2);
	results.setForeground(Color.black);
	results.setEditable(false);
	contentPane.add(results);
	
	bubble = new JLabel();
	bubble.setIcon(new ImageIcon("bubbledialog.png"));
	bubble.setBounds(260,250,500,200);
	contentPane.add(bubble);
	
	zoro = new JLabel();
	zoro.setIcon(new ImageIcon("zoro.png"));
	zoro.setBounds(360,300,500,200);
	contentPane.add(zoro);
	
	guess = new JButton();
	guess.setText("GUESS!");
	guess.setBounds(300,200,100,25);
	guess.setFont(f3);
	guess.setForeground(Color.white);
	guess.setBackground(Color.red);
	contentPane.add(guess);
	guess.addActionListener(
	    new ActionListener()
	    {
		public void actionPerformed(ActionEvent event)
		{
		    guessActionPerformed(event);
		}
	    }
	);
	
	GuessingGame();
	     
	
	}
	
	public void GuessingGame()
	{
	    //selecting the number to guess
	    num = (int)(Math.random()*1000)+1;
	}
	
	public void guessActionPerformed (ActionEvent event)
	{
	    //calculating whether the number guessed is higher or lower than actual number
	    guessvalue = playerguess.getText();
	    check = isInteger(guessvalue);
	    if(check == true)
		playernum = Integer.parseInt(playerguess.getText());
	    else
		JOptionPane.showMessageDialog(null,"INVALID VALUE");

	     
	     if (playernum > num)
	     {
		if(playernum < 1000)
		{
		results.setText("Too High");
		count = count + 1;
		String str = Integer.toString(count);
		triesnum.setText(str);
		}
		else
		JOptionPane.showMessageDialog(null,"NUMBER NOT IN RANGE");
	     }
	     else if (playernum < num)
	     {
		if (playernum > 0)
		{
		results.setText("Too Low");
		count = count + 1;
		String str = Integer.toString(count);
		triesnum.setText(str);
		}
		else
		JOptionPane.showMessageDialog(null,"NUMBER NOT IN RANGE");
	     }
	     else
	     {
	     results.setText("Correct!");
	     next = new JButton();
	     next.setText("NEXT");
	     next.setBounds(250,400,100,50);
	     next.setFont(f3);
	     next.setForeground(Color.white);
	     next.setBackground(Color.red);
	     contentPane.add(next);
	     
	     finalscore = count;
	     count = 0;
	     try
	     {
	     outputFW = new FileWriter("normalscores.txt");
	     outputPW = new PrintWriter(outputFW);
	     outputPW.println(name + " " + finalscore);
	     outputFW.close();
	     outputPW.close();
	     }catch(IOException e)
	     {
	     e.printStackTrace();
	     }
	    
		   FinalClass TheEnd = new FinalClass();
		    next.addActionListener(TheEnd);    
		 
	     }

		
	}
	//error trap:
	public boolean isInteger(String guessvalue)
	{
	    try
	    {
		Integer.parseInt(guessvalue);
		return true;
	    }
	    catch(Exception e)
	    {
		return false;
	    }
	}
    }
    //Hard level class
    public class HardClass implements ActionListener
    {
	Font f = new Font ("Calibri",Font.BOLD,20);
	Font f2 = new Font ("Impact",Font.BOLD,15);
	Font f3 = new Font ("Impact",Font.BOLD,20);
	 public void actionPerformed(ActionEvent event)
	{
	getContentPane().removeAll();
	repaint();
	//instructions
	highest = 0;
	lowest = 100;
	text1 = new JLabel();
	text2 = new JLabel();
	text1.setFont(f);
	text1.setText("The treasure One Piece is buried in one of 10000 islands!");
	text1.setForeground(new Color(0,51,51));
	text1.setBounds(10,100,500,35);
	contentPane.add(text1);
	text2.setFont(f);
	text2.setText("Guess the island number!(a number between 1-10000)");
	text2.setForeground(new Color(0,51,51));
	text2.setBounds(10,125,500,35);
	contentPane.add(text2);
	
	//counting the number of tries for score
	tries = new JLabel();
	tries.setFont(f);
	tries.setText("Number of tries:");
	tries.setForeground(Color.black);
	tries.setBounds(10,400,300,50);
	contentPane.add(tries);
	
	triesnum = new JLabel();
	triesnum.setFont(f);
	triesnum.setText("");
	triesnum.setForeground(Color.red);
	triesnum.setBounds(165,415,20,20);
	contentPane.add(triesnum);
	
	playerguess = new JTextField();
	playerguess.setBounds(200,200,100,25);
	contentPane.add(playerguess);
	
	results = new JTextArea();
	results.setText("");
	results.setBounds(300,300,70,50);
	results.setFont(f2);
	results.setForeground(Color.black);
	results.setEditable(false);
	contentPane.add(results);
	
	bubble = new JLabel();
	bubble.setIcon(new ImageIcon("bubbledialog.png"));
	bubble.setBounds(260,250,500,200);
	contentPane.add(bubble);
	
	franky = new JLabel();
	franky.setIcon(new ImageIcon("franky.png"));
	franky.setBounds(360,300,500,200);
	contentPane.add(franky);
	//JButton to guess the value
	guess = new JButton();
	guess.setText("GUESS!");
	guess.setBounds(300,200,100,25);
	guess.setFont(f3);
	guess.setForeground(Color.white);
	guess.setBackground(Color.red);
	contentPane.add(guess);
	guess.addActionListener(
	    new ActionListener()
	    {
		public void actionPerformed(ActionEvent event)
		{
		    guessActionPerformed(event);
		}
	    }
	);
	
	GuessingGame();
	     
	
	}
	
	public void GuessingGame()
	{
	    //determining the number to guess
	    num = (int)(Math.random()*10000)+1;
	}
	
	public void guessActionPerformed (ActionEvent event)
	{

	    guessvalue = playerguess.getText();
	    check = isInteger(guessvalue);
	    if(check == true)
		playernum = Integer.parseInt(playerguess.getText());
	    else
		JOptionPane.showMessageDialog(null,"INVALID VALUE");

	     //calculations for whether the number is too high or too low
	     if (playernum > num)
	     {
		if(playernum <10000)
		{
		results.setText("Too High");
		count = count + 1;
		String str = Integer.toString(count);
		triesnum.setText(str);
		}
		else
		JOptionPane.showMessageDialog(null,"NUMBER NOT IN RANGE");
	     }
	     else if (playernum < num)
	     {
		if(playernum > 0)
		{
		results.setText("Too Low");
		count = count + 1;
		String str = Integer.toString(count);
		triesnum.setText(str);
		}
		else
		JOptionPane.showMessageDialog(null,"NUMBER NOT IN RANGE");
	     }
	     else
	     {
	     results.setText("Correct!");
	     next = new JButton();
	     next.setText("NEXT");
	     next.setBounds(250,400,100,50);
	     next.setFont(f3);
	     next.setForeground(Color.white);
	     next.setBackground(Color.red);
	     contentPane.add(next);
	    
		   FinalClass TheEnd = new FinalClass();
		    next.addActionListener(TheEnd);           
		    finalscore = count;
		    count = 0;
		    try
	     {
	     outputFW = new FileWriter("hardscores.txt");
	     outputPW = new PrintWriter(outputFW);
	     outputPW.println(name + " " + finalscore);
	     outputFW.close();
	     outputPW.close();
	     }catch(IOException e)
	     {
	     e.printStackTrace();
	     }
	     }

		
	}
	//error trap:
	public boolean isInteger(String guessvalue)
	{
	    try
	    {
		Integer.parseInt(guessvalue);
		return true;
	    }
	    catch(Exception e)
	    {
		return false;
	    }
	}
    }
    
    public class FinalClass implements ActionListener
    {
	Font f3 = new Font ("Impact",Font.BOLD,20);
	public void actionPerformed(ActionEvent event)
	{
	  //congradulating the user for guessing the number right 
	  getContentPane().removeAll();
	  repaint();
	  congratTitle = new JLabel();
	  congratTitle.setIcon(new ImageIcon("CONGRAT.gif"));
	  congratTitle.setBounds(40,160,500,100);
	  contentPane.add(congratTitle);
	  
	  //JButton to replay the game:
	  replay = new JButton();
	   replay.setText("REPLAY");
	   replay.setBounds(190,300,100,60);
	    replay.setFont(f3);
	    replay.setForeground(Color.white);
	    replay.setBackground(new Color(102,0,0));
	   contentPane.add(replay);
	   
	   fileprogram = new JButton();
	   fileprogram.setText("GO TO SEABOARD");
	   fileprogram.setFont(f3);
	   fileprogram.setBounds(150,400,250,60);
	   fileprogram.setForeground(Color.white);
	   fileprogram.setBackground(new Color(120,50,41));
	   contentPane.add(fileprogram);
	    
	   
	     law = new JLabel();
	law.setIcon(new ImageIcon("law.png"));
	law.setBounds(260,250,500,300);
	contentPane.add(law);
	    
	    LevelClass selectLevel = new LevelClass();
	    replay.addActionListener(selectLevel);     

	  
	    fileprogram.addActionListener(
	    new ActionListener()
	    {
		public void actionPerformed(ActionEvent event)
		{
		    fileprogramActionPerformed(event);
		}
	    }
	);
	
	}
	private void fileprogramActionPerformed(ActionEvent event)
	{
	    Introduction.SHOW();
	    
	}
    }


    

//Main Method:     
    public static void main (String[] args)
    {
	AAMainProgramClickHereMrMichl gameapplication = new AAMainProgramClickHereMrMichl();
	gameapplication.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

} 
