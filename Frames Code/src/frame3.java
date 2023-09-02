import java.awt.GridLayout;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JSeparator;
import javax.swing.SwingConstants;
import java.awt.SystemColor;

public class frame3 extends JFrame{
	frame3(){
		setTitle("    Checkout Menu");
		setSize(820,690);
	    getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//Panel p
		JPanel p = new JPanel();
		p.setBackground(new Color(255, 255, 255));
		p.setBounds(57, 177, 330, 159);
		getContentPane().add(p);
		
		GridLayout grid=new GridLayout(4, 2);
		grid.setVgap(15);

		p.setLayout(grid);
		
		
		JLabel ch=new JLabel(" Domino's Checkout Menu ");
		ch.setFont(new Font("Calibri", Font.BOLD, 20));
		ch.setBounds(256,139,253,27);
		getContentPane().add(ch);
		
		JLabel cusname=new JLabel(" Customer Name: ");
		cusname.setFont(new Font("Tahoma", Font.BOLD, 11));
		cusname.setBounds(49,96,104,16);
		p.add(cusname);
		JTextField cus=new JTextField();
		cus.setBounds(173,91,168,21);
		p.add(cus);
		
		JLabel cuspno=new JLabel(" Customer Phone no: ");
		cuspno.setFont(new Font("Tahoma", Font.BOLD, 11));
		cuspno.setBounds(39,148,124,16);
		p.add(cuspno);
		JTextField pno=new JTextField();
		pno.setBounds(173,143,168,21);
		p.add(pno);
		
		JLabel cash=new JLabel(" Customer Cash: ");
		cash.setFont(new Font("Tahoma", Font.BOLD, 11));
		cash.setBounds(59,192,150,16);
		p.add(cash);
		JTextField ca=new JTextField();
		ca.setBounds(173,190,79,21);
		p.add(ca);
		
		JLabel promo=new JLabel(" Domino's Promo code: ");
		promo.setFont(new Font("Tahoma", Font.BOLD, 11));
		promo.setBounds(24,240,168,16);
		p.add(promo);
		JTextField code=new JTextField();
		code.setBounds(173,238,79,21);
		p.add(code);
	
		//Setting date
		JLabel date=new JLabel(" Date: ");
		date.setFont(new Font("Tahoma", Font.BOLD, 11));
		date.setBounds(78,347,72,16);
		getContentPane().add(date);
		String[] dd= {"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20","21","22","23","24","25","26","27","28","29","30"};
		String[] mm= {"1","2","3","4","5","6","7","8","9","10","11","12"};
		String[] yy= {"2022","2023","2024","2025","2026"};
		JComboBox d=new JComboBox(dd);
		JComboBox m=new JComboBox(mm);
		JComboBox y=new JComboBox(yy);
		d.setBounds(206,342,42,27);
		m.setBounds(154,342,42,27);
		y.setBounds(260,342,58,27);
		getContentPane().add(d);
		getContentPane().add(m);
		getContentPane().add(y);
		
		//address
		JLabel address=new JLabel(" Customer Address: ");
		address.setFont(new Font("Tahoma", Font.BOLD, 11));
		address.setBounds(57,392,116,16);
	    getContentPane().add(address);
	    JTextField add=new JTextField();
		add.setBounds(186,392,201,48);
	    getContentPane().add(add);
	    
	    //order
		ButtonGroup cg=new ButtonGroup();
		JLabel ord=new JLabel("ORDER");
		ord.setFont(new Font("Tahoma", Font.BOLD, 11));
		ord.setBackground(new Color(255, 255, 255));
		ord.setBounds(66,440,52,16);
		getContentPane().add(ord);
		//separarter
		JSeparator separator_2 = new JSeparator();
		separator_2.setBackground(new Color(0, 0, 0));
		separator_2.setBounds(55, 438, 95, 2);
		getContentPane().add(separator_2);
		
		JSeparator separator_3 = new JSeparator();
		separator_3.setBackground(new Color(0, 0, 0));
		separator_3.setBounds(57, 454, 95, 2);
		getContentPane().add(separator_3);
		
		JSeparator separator_1 = new JSeparator();
		separator_1.setBackground(new Color(0, 0, 0));
		separator_1.setOrientation(SwingConstants.VERTICAL);
		separator_1.setForeground(new Color(0, 0, 0));
		separator_1.setBounds(149, 440, 1, 16);
		getContentPane().add(separator_1);
		
		JSeparator separator = new JSeparator();
		separator.setBackground(new Color(0, 0, 0));
		separator.setForeground(new Color(0, 0, 0));
		separator.setOrientation(SwingConstants.VERTICAL);
		separator.setBounds(55, 440, 1, 16);
		getContentPane().add(separator);
		
		JRadioButton o1=new JRadioButton(" Dine In");
		o1.setBackground(new Color(255, 255, 255));
		o1.setBounds(45,463,78,16);
		cg.add(o1);
		getContentPane().add(o1);
		JRadioButton o2=new JRadioButton(" Take Away ");
		o2.setBackground(new Color(255, 255, 255));
		o2.setBounds(121,463,107,16);
		cg.add(o2);
		getContentPane().add(o2);
		JRadioButton o3=new JRadioButton(" Delivery");
		o3.setBackground(new Color(255, 255, 255));
		o3.setBounds(226,463,78,16);
		cg.add(o3);
		getContentPane().add(o3);
	    
	    //rider
		JLabel rider=new JLabel(" Rider instructions: ");
		rider.setFont(new Font("Tahoma", Font.BOLD, 11));
		rider.setBounds(59,494,116,16);
	    getContentPane().add(rider);
	    JTextField ride=new JTextField();
		ride.setBounds(186,490,201,48);
	    getContentPane().add(ride);
		
	    
	    //Bill generator
		JButton gen=new JButton("Generate Bill");
		gen.setBounds(550,270,173,27);
		getContentPane().add(gen);
		JTextArea bill=new JTextArea();
		bill.setBounds(550,22,168,252);
		getContentPane().add(bill);
	
		ImageIcon img = new ImageIcon("finalf3.gif");
	    JLabel abc=new JLabel(img);
	    abc.setBounds(0,0,800,650);
	    getContentPane().add(abc);
	   
	    
	    setLocationRelativeTo(null);
		setResizable(false);
		setVisible(true);
	}
public static void main(String[] args) {
		new frame3();
	}

}
