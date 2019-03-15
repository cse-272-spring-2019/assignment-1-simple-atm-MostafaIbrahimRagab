import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


// cardnumber is 6667

public class Interface{

	private JFrame f;
	private JLabel l;
	private JButton b;
	private JPanel p;
	private JTextField textField;
	
	static int  countn;
	static int arr[] =  new int[5];
	static String arr2[] =  new String[5];
	static int arr3[] =  new int[5];
	static int flaghis;
	static int flagtrans;
	static int counteri;
	static int counterz;
	static int countern;
	
	
	public Interface() {
		
		check();
	}
	
	
	// checking card number
	public void check() {
		//initializing array of transaction type
		
		for (int i = 0; i < arr2.length; i++) {
			
			arr2[i] = "No Transaction found";
			
		}
		
		//instance of account
		Account x = new Account();
		//instance of transaction
		Transaction b = new Transaction();
		countn = 0;
		System.out.println(countn);
		flaghis=0;
		flagtrans = 0;
		
		
		// first frame (Cardnumber Check)
		f = new JFrame("Cardnum check");
		l = new JLabel("Please enter your card number:");
		f.setSize(1024, 768);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// layout of the first window
		JPanel p = new JPanel();
		// buttons from 0 to 9 to enter
		p.setLayout(null);
		JButton b0 = new JButton("0");
		JButton b1 = new JButton("1");
		JButton b2 = new JButton("2");
		JButton b3 = new JButton("3");
		JButton b4 = new JButton("4");
		JButton b5 = new JButton("5");
		JButton b6 = new JButton("6");
		JButton b7 = new JButton("7");
		JButton b8 = new JButton("8");
		JButton b9 = new JButton("9");
		JButton b10 = new JButton("Enter");
		
		l.setBounds(250, 0, 500, 100);
		l.setFont(new Font("Serif", Font.BOLD, 35));
		
		
		textField = new JTextField();
		
		textField.setBounds(350, 550, 300, 40);
		
		textField.setColumns(10);
		
		
		
		
		//buttons bounds
		b0.setBounds(350, 100, 100, 100);
		b1.setBounds(350, 200, 100, 100);
		b2.setBounds(450, 200, 100, 100);
		b3.setBounds(550, 200, 100, 100);
		b4.setBounds(350, 300, 100, 100);
		b5.setBounds(450, 300, 100, 100);
		b6.setBounds(550, 300, 100, 100);
		b7.setBounds(350, 400, 100, 100);
		b8.setBounds(450, 400, 100, 100);
		b9.setBounds(550, 400, 100, 100);
		b9.setBounds(550, 400, 100, 100);
		b10.setBounds(450, 100, 200, 100);
		
		
		
		
		//buttons actions
		
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + b0.getText();
				textField.setText(Enternumber);
			}
		});
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + b1.getText();
				textField.setText(Enternumber);
			}
		});
		
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + b2.getText();
				textField.setText(Enternumber);
			}
		});
		
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + b3.getText();
				textField.setText(Enternumber);
			}
		});
		
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + b4.getText();
				textField.setText(Enternumber);
			}
		});
		
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + b5.getText();
				textField.setText(Enternumber);
			}
		});
		
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + b6.getText();
				textField.setText(Enternumber);
			}
		});
		
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + b7.getText();
				textField.setText(Enternumber);
			}
		});
		
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + b8.getText();
				textField.setText(Enternumber);
			}
		});
		
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = textField.getText() + b9.getText();
				textField.setText(Enternumber);
			}
		});
		
		
		
		
		
		p.add(b0);
		p.add(b1);
		p.add(b2);
		p.add(b3);
		p.add(b4);
		p.add(b5);
		p.add(b6);
		p.add(b7);
		p.add(b8);
		p.add(b9);
		p.add(b10);
		p.add(l);
		p.add(textField);
		f.add(p);
		

		
		f.setVisible(true);
		
		// second frame  (Deposit Frame)
		JFrame f2 = new JFrame("Deposit");

		
		f2.setVisible(false);
		f2.setSize(1024, 768);
		f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		
		JPanel p2 = new JPanel();

		
		p2.setLayout(null);
		
		JButton bb0 = new JButton("0");
		JButton bb1 = new JButton("1");
		JButton bb2 = new JButton("2");
		JButton bb3 = new JButton("3");
		JButton bb4 = new JButton("4");
		JButton bb5 = new JButton("5");
		JButton bb6 = new JButton("6");
		JButton bb7 = new JButton("7");
		JButton bb8 = new JButton("8");
		JButton bb9 = new JButton("9");
		JButton bb10 = new JButton("Enter");
		JButton bb11 = new JButton("Back");
		
		
		
		//certain amounts buttons
		JButton n0 = new JButton("100");
		JButton n1 = new JButton("200");
		JButton n2 = new JButton("300");
		JButton n3 = new JButton("500");
		JButton n4 = new JButton("1000");
		JButton n5 = new JButton("2000");
		JButton n6 = new JButton("3000");
		JButton n7 = new JButton("4000");
		JButton n8 = new JButton("5000");
		JButton n9 = new JButton("6000");
		
		
		
		JTextField text2 = new JTextField();
		
		text2.setBounds(350, 550, 300, 40);
		
		text2.setColumns(10);
		
		
		JLabel l4 = new JLabel("Please enter the amount :");
		l4.setBounds(250, 0, 500, 100);
		l4.setFont(new Font("Serif", Font.BOLD, 35));
		
		
	
		// buttons bounds
		
		bb0.setBounds(350, 100, 100, 100);
		bb1.setBounds(350, 200, 100, 100);
		bb2.setBounds(450, 200, 100, 100);
		bb3.setBounds(550, 200, 100, 100);
		bb4.setBounds(350, 300, 100, 100);
		bb5.setBounds(450, 300, 100, 100);
		bb6.setBounds(550, 300, 100, 100);
		bb7.setBounds(350, 400, 100, 100);
		bb8.setBounds(450, 400, 100, 100);
		bb9.setBounds(550, 400, 100, 100);
		bb10.setBounds(450, 100, 200, 100);
		bb11.setBounds(400, 600, 200, 100);
		
		//certain amount buttons bounds
		
		n0.setBounds(50, 100, 100, 50);
		n1.setBounds(50, 200, 100, 50);
		n2.setBounds(50, 300, 100, 50);
		n3.setBounds(50, 400, 100, 50);
		n4.setBounds(50, 500, 100, 50);
	
		n5.setBounds(850, 100, 100, 50);
		n6.setBounds(850, 200, 100, 50);
		n7.setBounds(850, 300, 100, 50);
		n8.setBounds(850, 400, 100, 50);
		n9.setBounds(850, 500, 100, 50);
	
		
		
		
		p2.add(bb0);
		p2.add(bb1);
		p2.add(bb2);
		p2.add(bb3);
		p2.add(bb4);
		p2.add(bb5);
		p2.add(bb6);
		p2.add(bb7);
		p2.add(bb8);
		p2.add(bb9);
		p2.add(bb10);
		p2.add(bb11);
		
		p2.add(n0);
		p2.add(n1);
		p2.add(n2);
		p2.add(n3);
		p2.add(n4);

		
		p2.add(n5);
		p2.add(n6);
		p2.add(n7);
		p2.add(n8);
		p2.add(n9);
		
		
		p2.add(text2);
		p2.add(l4);
		f2.add(p2);
		
		
		
		// Buttons Actionlist
		
		n0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text2.setText("");
				String Enternumber = text2.getText() + n0.getText();
				text2.setText(Enternumber);
			}
		});
		
		n1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text2.setText("");
				String Enternumber = text2.getText() + n1.getText();
				text2.setText(Enternumber);
			}
		});
		
		n2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text2.setText("");
				String Enternumber = text2.getText() + n2.getText();
				text2.setText(Enternumber);
			}
		});
		
		n3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text2.setText("");
				String Enternumber = text2.getText() + n3.getText();
				text2.setText(Enternumber);
			}
		});
		
		n4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				text2.setText("");
				String Enternumber = text2.getText() + n4.getText();
				text2.setText(Enternumber);
			}
		});
		
		n5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				text2.setText("");
				String Enternumber = text2.getText() + n5.getText();
				text2.setText(Enternumber);
			}
		});
		
		n6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				text2.setText("");
				String Enternumber = text2.getText() + n6.getText();
				text2.setText(Enternumber);
			}
		});
		
		n7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text2.setText("");
				String Enternumber = text2.getText() + n7.getText();
				text2.setText(Enternumber);
			}
		});
		
		n8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text2.setText("");
				String Enternumber = text2.getText() + n8.getText();
				text2.setText(Enternumber);
			}
		});
		
		n9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text2.setText("");
				String Enternumber = text2.getText() + n9.getText();
				text2.setText(Enternumber);
			}
		});
		
		
		bb0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text2.getText() + bb0.getText();
				text2.setText(Enternumber);
			}
		});
		
		bb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text2.getText() + bb1.getText();
				text2.setText(Enternumber);
			}
		});
		
		bb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text2.getText() + bb2.getText();
				text2.setText(Enternumber);
			}
		});
		
		bb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text2.getText() + bb3.getText();
				text2.setText(Enternumber);
			}
		});
		
		bb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text2.getText() + bb4.getText();
				text2.setText(Enternumber);
			}
		});
		
		bb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text2.getText() + bb5.getText();
				text2.setText(Enternumber);
			}
		});
		
		bb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text2.getText() + bb6.getText();
				text2.setText(Enternumber);
			}
		});
		
		bb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text2.getText() + bb7.getText();
				text2.setText(Enternumber);
			}
		});
		
		bb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text2.getText() + bb8.getText();
				text2.setText(Enternumber);
			}
		});
		
		bb9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text2.getText() + bb9.getText();
				text2.setText(Enternumber);
			}
		});
		
		
		
		
		// third frame  (withdraw frame)
		JFrame f3 = new JFrame("Withdraw");
		JPanel p3 = new JPanel();
		p3.setLayout(null);
		
		f3.setVisible(false);
		f3.setSize(1024, 768);
		f3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//buttons
		
		JButton bbb0 = new JButton("0");
		JButton bbb1 = new JButton("1");
		JButton bbb2 = new JButton("2");
		JButton bbb3 = new JButton("3");
		JButton bbb4 = new JButton("4");
		JButton bbb5 = new JButton("5");
		JButton bbb6 = new JButton("6");
		JButton bbb7 = new JButton("7");
		JButton bbb8 = new JButton("8");
		JButton bbb9 = new JButton("9");
		JButton bbb10 = new JButton("Enter");
		JButton bbb11 = new JButton("Back");
		
		
		
		//certain amounts buttons
		JButton nn0 = new JButton("100");
		JButton nn1 = new JButton("200");
		JButton nn2 = new JButton("300");
		JButton nn3 = new JButton("500");
		JButton nn4 = new JButton("1000");
		JButton nn5 = new JButton("2000");
		JButton nn6 = new JButton("3000");
		JButton nn7 = new JButton("4000");
		JButton nn8 = new JButton("5000");
		JButton nn9 = new JButton("6000");		
		
		
		
		

		
		
		/////////////////////////////
		
		JLabel l7 = new JLabel("Please enter the amount :");
		l7.setBounds(250, 0, 500, 100);
		l7.setFont(new Font("Serif", Font.BOLD, 35));
		
		
		
		
		bbb0.setBounds(350, 100, 100, 100);
		bbb1.setBounds(350, 200, 100, 100);
		bbb2.setBounds(450, 200, 100, 100);
		bbb3.setBounds(550, 200, 100, 100);
		bbb4.setBounds(350, 300, 100, 100);
		bbb5.setBounds(450, 300, 100, 100);
		bbb6.setBounds(550, 300, 100, 100);
		bbb7.setBounds(350, 400, 100, 100);
		bbb8.setBounds(450, 400, 100, 100);
		bbb9.setBounds(550, 400, 100, 100);
		bbb10.setBounds(450, 100, 200, 100);
		bbb11.setBounds(400, 600, 200, 100);
		
		
		
		//certain buttons bounds
		//certain amount buttons bounds
		
		nn0.setBounds(50, 100, 100, 50);
		nn1.setBounds(50, 200, 100, 50);
		nn2.setBounds(50, 300, 100, 50);
		nn3.setBounds(50, 400, 100, 50);
		nn4.setBounds(50, 500, 100, 50);
		nn5.setBounds(850, 100, 100, 50);
		nn6.setBounds(850, 200, 100, 50);
		nn7.setBounds(850, 300, 100, 50);
		nn8.setBounds(850, 400, 100, 50);
		nn9.setBounds(850, 500, 100, 50);
		
		
		JTextField text3 = new JTextField();
		
		text3.setBounds(350, 550, 300, 40);
		
		text3.setColumns(10);
		
		
		p3.add(bbb0);
		p3.add(bbb1);
		p3.add(bbb2);
		p3.add(bbb3);
		p3.add(bbb4);
		p3.add(bbb5);
		p3.add(bbb6);
		p3.add(bbb7);
		p3.add(bbb8);
		p3.add(bbb9);
		p3.add(bbb10);
		p3.add(bbb11);
		
		
		p3.add(nn0);
		p3.add(nn1);
		p3.add(nn2);
		p3.add(nn3);
		p3.add(nn4);

		
		p3.add(nn5);
		p3.add(nn6);
		p3.add(nn7);
		p3.add(nn8);
		p3.add(nn9);

		
		p3.add(text3);
		p3.add(l7);
		f3.add(p3);
		
		
		
		// Buttons Actionlist
		
		nn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text3.setText("");
				String Enternumber = text3.getText() + nn0.getText();
				text3.setText(Enternumber);
			}
		});
		
		nn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text3.setText("");
				String Enternumber = text3.getText() + nn1.getText();
				text3.setText(Enternumber);
			}
		});
		
		nn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text3.setText("");
				String Enternumber = text3.getText() + nn2.getText();
				text3.setText(Enternumber);
			}
		});
		
		nn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text3.setText("");
				String Enternumber = text3.getText() + nn3.getText();
				text3.setText(Enternumber);
			}
		});
		
		nn4.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				text3.setText("");
				String Enternumber = text3.getText() + nn4.getText();
				text3.setText(Enternumber);
			}
		});
		
		nn5.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				text3.setText("");
				String Enternumber = text3.getText() + nn5.getText();
				text3.setText(Enternumber);
			}
		});
		
		nn6.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				text3.setText("");
				String Enternumber = text3.getText() + nn6.getText();
				text3.setText(Enternumber);
			}
		});
		
		nn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text3.setText("");
				String Enternumber = text3.getText() + nn7.getText();
				text3.setText(Enternumber);
			}
		});
		
		nn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text3.setText("");
				String Enternumber = text3.getText() + nn8.getText();
				text3.setText(Enternumber);
			}
		});
		
		nn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text3.setText("");
				String Enternumber = text3.getText() + nn9.getText();
				text3.setText(Enternumber);
			}
		});
		
		
		//buttons Actions
		
		bbb0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text3.getText() + bbb0.getText();
				text3.setText(Enternumber);
			}
		});
		
		bbb1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text3.getText() + bbb1.getText();
				text3.setText(Enternumber);
			}
		});
		
		bbb2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text3.getText() + bbb2.getText();	
				text3.setText(Enternumber);
			}
		});
		
		bbb3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text3.getText() + bbb3.getText();
				text3.setText(Enternumber);
			}
		});
		
		bbb4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text3.getText() + bbb4.getText();
				text3.setText(Enternumber);
			}
		});
		
		bbb5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text3.getText() + bbb5.getText();
				text3.setText(Enternumber);
			}
		});
		
		bbb6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text3.getText() + bbb6.getText();
				text3.setText(Enternumber);
			}
		});
		
		bbb7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text3.getText() + bbb7.getText();
				text3.setText(Enternumber);
			}
		});
		
		bbb8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text3.getText() + bbb8.getText();
				text3.setText(Enternumber);
			}
		});
		
		bbb9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String Enternumber = text3.getText() + bbb9.getText();
				text3.setText(Enternumber);
			}
		});
		
		
		
		// main menu
		
		
		JFrame mainf = new JFrame("Main Menu");
		mainf.setVisible(false);
		mainf.setSize(1024, 768);
		mainf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel mainp = new JPanel();
		mainp.setLayout(null);
		
		JLabel BAL = new JLabel();
		BAL.setBounds(450, 600, 500, 100);
		BAL.setFont(new Font("Serif", Font.BOLD, 35));
		
		
		JButton dep = new JButton("Deposit");
		JButton wit = new JButton("Withdraw");
		JButton bal = new JButton("Balance");
		JButton nex = new JButton("Next");
		JButton prev = new JButton("Previous");
		JButton hist = new JButton("History");
		
		
		mainp.add(dep);
		mainp.add(wit);
		mainp.add(bal);
		mainp.add(nex);
		mainp.add(prev);
		mainp.add(hist);
		mainp.add(BAL);
		
		mainf.add(mainp);
		
		dep.setBounds(50, 50, 250, 250);
		wit.setBounds(350, 50, 250, 250);
		bal.setBounds(650, 50, 250, 250);
		prev.setBounds(50, 400, 250, 100);
		nex.setBounds(650, 400, 250, 100);
		hist.setBounds(350, 400, 250, 100);
		
		
		
		
		
		// buttons actions
		
		
		bal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				BAL.setText("your bal = " + String.valueOf(x.getBalance()));
				JOptionPane.showMessageDialog(null,"Your Balance is : " + x.getBalance());
				
			}
		});
		
		
		dep.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text2.setText("");
				f2.setVisible(true);
				mainf.dispose();
				
				
			}
		});
		
		wit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text3.setText("");
				f3.setVisible(true);
				mainf.dispose();
				
				
			}
		});
		
		
		// Enter Buttons
		
		// enter buttons for checking card number
		b10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int x = 6667;
				String writtennum = textField.getText();
				int z = Integer.parseInt(writtennum);
				if (z == x) {
					mainf.setVisible(true);
					f.dispose();
					
					
					
				}
				else {
					textField.setText("");
					JOptionPane.showMessageDialog(null,"You entered wrong card number");
				}
				
				
			}
		});
		
		
		// enter button for deposit
		bb10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String writtennum = text2.getText();
				int z = Integer.parseInt(writtennum);
				x.deposit(z);
				f2.dispose();
				text2.setText("");
				mainf.setVisible(true);
				
				b.type = "Deposit";
				b.value = z;
				flaghis=1;
				flagtrans = 0;
				
				if (countn == 5) {
					countn = 4;
					
					//array of value
					arr[0] = arr[1];
					arr[1] = arr[2];
					arr[2] = arr[3];
					arr[3] = arr[4];
					arr[countn] = z;
					
					// array of type
					arr2[0] = arr2[1];
					arr2[1] = arr2[2];
					arr2[2] = arr2[3];
					arr2[3] = arr2[4];
					arr2[countn] = b.type;
					
					// array of balance
					arr3[0] = arr3[1];
					arr3[1] = arr3[2];
					arr3[2] = arr3[3];
					arr3[3] = arr3[4];
					arr3[countn] = (int)x.getBalance();
					
					countn = countn + 1;
					
				}
				else {
					arr[countn] = z;
					arr2[countn] = b.type;
					arr3[countn] = (int)x.getBalance();
					countn = countn + 1;
				}
				

				for (int j = 0; j < arr.length; j++) {
					System.out.println(arr3[j]);
				}
				

				
				
				
			}
		});
		
		
		
		
		// enter button for withdraw
				bbb10.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						String writtennum = text3.getText();
						int z = Integer.parseInt(writtennum);
						System.out.println(z);
						
						if (x.getBalance() >= z) {
							
							x.withdraw(z);
							f3.dispose();
							text3.setText("");
							mainf.setVisible(true);
							flaghis=1;
							flagtrans = 0;
							
							b.type = "Withdraw";
							b.value = z;
							
							if (countn == 5) {
								countn = 4;
								
								//array of value
								arr[0] = arr[1];
								arr[1] = arr[2];
								arr[2] = arr[3];
								arr[3] = arr[4];
								arr[countn] = z;
								
								// array of type
								arr2[0] = arr2[1];
								arr2[1] = arr2[2];
								arr2[2] = arr2[3];
								arr2[3] = arr2[4];
								arr2[countn] = b.type;
								
								// array of balance
								arr3[0] = arr3[1];
								arr3[1] = arr3[2];
								arr3[2] = arr3[3];
								arr3[3] = arr3[4];
								arr3[countn] = (int)x.getBalance();
								
								countn = countn + 1;
								
							}
							else {
								arr[countn] = z;
								arr2[countn] = b.type;
								arr3[countn] = (int)x.getBalance();
								countn = countn + 1;
							}
							
							
								
						}
						else {
							JOptionPane.showMessageDialog(null,"The amount you entered isn't available");
						}
						
						
						
					}
				});
				
				
				
		//back buttons
				bb11.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						f2.dispose();
						mainf.setVisible(true);
					}
				});	
				
				
				bbb11.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						f3.dispose();
						mainf.setVisible(true);
					}
				});	
				
				
				
				
				// history buttons actionlist
				
				hist.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (flaghis == 1) {
							flagtrans = 1;
							if (countn == 0) {
								JOptionPane.showMessageDialog(null,"Your Last Transaction process : " + arr[countn] + " " + arr2[countn] + " Balance After Transaction is : " + arr3[countn]);
							}
							else {
								counterz = countn - 1;
								JOptionPane.showMessageDialog(null,"Your Last Transaction process : " + arr[counterz] + " " + arr2[counterz]+ " Balance After Transaction is : " + arr3[counterz]);
							}
							counteri = counterz;
							
						}
						
						else {
							
							JOptionPane.showMessageDialog(null,"There's no transaction found");
						}
						
					
					}
				});	
				
			
				
				prev.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(flagtrans == 1) {
								counteri--;
							if (counteri == -1) {
								counteri = 4;
								JOptionPane.showMessageDialog(null,"Transaction is " + arr[counteri] + " " + arr2[counteri] + " Balance After Transaction is : " + arr3[counteri]);
							}
							
							else {
								JOptionPane.showMessageDialog(null,"Transaction is " + arr[counteri] + " " + arr2[counteri] + " Balance After Transaction is : " + arr3[counteri]);
							}
							
						}
						else {
							
							JOptionPane.showMessageDialog(null,"Press History Button to get latest transaction info");
							
						}
						
					}
				});	
				
				
				nex.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						if(flagtrans == 1) {
							counteri++;
							if (counteri == 5) {
								counteri = 0;
								JOptionPane.showMessageDialog(null,"Transaction is " + arr[counteri] + " " + arr2[counteri] + " Balance After Transaction is : " + arr3[counteri]);
							}
							
							else {
								JOptionPane.showMessageDialog(null,"Transaction is " + arr[counteri] + " " + arr2[counteri] + " Balance After Transaction is : " + arr3[counteri]);
							}
					
							
						}
						else {
							
							JOptionPane.showMessageDialog(null,"Press History Button to get latest transaction info");
							
						}
						
					}
				});	
				
		
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 new Interface();
 
	}

}
