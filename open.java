package control;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.IOException;
import java.lang.*;

public class open implements ActionListener {

	JFrame jf;
	JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7;
	JLabel lab;
	public open()
	{
		jf=new JFrame();
		jf.setBounds(100, 100, 501, 500);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.getContentPane().setLayout(null);
		
		lab = new JLabel("click to open");
		lab.setForeground(Color.RED);
		lab.setBackground(Color.PINK);
		lab.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 20));
		lab.setBounds(129, 13, 154, 30);
		jf.getContentPane().add(lab);
		
		jb1 = new JButton("chrome");
		jb1.setBackground(Color.CYAN);
		jb1.setForeground(Color.BLACK);
		jb1.setBounds(31, 86, 97, 25);
		jb1.addActionListener(new ActionListener()
				{
		public void actionPerformed(ActionEvent e)
		{
			Runtime r1=Runtime.getRuntime();
			try {
				Process p1=r1.exec("C:\\Program Files (x86)\\Google\\Chrome\\Application\\chrome.exe");
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
				});
		jf.getContentPane().add(jb1);
		
		jb2 = new JButton("any desk");
		jb2.setBackground(Color.CYAN);
		jb2.setForeground(Color.BLACK);
		jb2.setBounds(31, 142, 97, 25);
		jb2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Runtime r2=Runtime.getRuntime();
				try {
					Process p2=r2.exec("C:\\Program Files (x86)\\AnyDesk\\AnyDesk.exe");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jf.getContentPane().add(jb2);
		
		jb3 = new JButton("team viewer");
		jb3.setBackground(Color.CYAN);
		jb3.setForeground(Color.BLACK);
		jb3.setHorizontalAlignment(SwingConstants.LEFT);
		jb3.setBounds(31, 189, 103, 25);
		jb3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Runtime r3=Runtime.getRuntime();
				try {
					Process p3=r3.exec("C:\\Program Files (x86)\\TeamViewer\\TeamViewer.exe");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jf.getContentPane().add(jb3);
		
		jb4 = new JButton("notepad");
		jb4.setBackground(Color.CYAN);
		jb4.setForeground(Color.BLACK);
		jb4.setBounds(31, 244, 97, 25);
		jb4.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Runtime r4=Runtime.getRuntime();
				try {
					Process p4=r4.exec("notepad.exe");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jf.getContentPane().add(jb4);
		
		jb5 = new JButton("notepad ++");
		jb5.setBackground(Color.CYAN);
		jb5.setForeground(Color.BLACK);
		jb5.setBounds(31, 299, 103, 25);
		jb5.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Runtime r5=Runtime.getRuntime();
				try {
					Process p5=r5.exec("C:\\Program Files (x86)\\Notepad++\\notepad++.exe");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jf.getContentPane().add(jb5);
		
		jb6 = new JButton("Eclipse");
		jb6.setBackground(Color.CYAN);
		jb6.setForeground(Color.BLACK);
		jb6.setBounds(170, 86, 97, 25);
		jb6.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Runtime r6=Runtime.getRuntime();
				try {
					Process p6=r6.exec("C:\\Users\\Tekula Hemanth Reddy\\eclipse\\java-2019-09\\eclipse\\eclipse.exe");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jf.getContentPane().add(jb6);

		jb7 = new JButton("DEV C++");
		jb7.setBackground(Color.CYAN);
		jb7.setForeground(Color.BLACK);
		jb7.setBounds(170, 142, 97, 25);
		jb7.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				Runtime r7=Runtime.getRuntime();
				try {
					Process p7=r7.exec("C:\\Program Files (x86)\\Dev-Cpp\\devcpp.exe");
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		jf.getContentPane().add(jb7);
		
		jf.setVisible(true);
				
	}
	@Override
	public void actionPerformed(ActionEvent ae) {
		String str=ae.getActionCommand();
		
	}
	
	
	
}
