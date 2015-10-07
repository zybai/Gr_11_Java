import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Arrays;  
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
	
      
