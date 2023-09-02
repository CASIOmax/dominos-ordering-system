import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.*;

public class frame2{
	frame2(){		
		JFrame f2=new JFrame();  
		
	    //Texts
	    JLabel proname=new JLabel("Domino's Pizza Order Cashier Menu");
	    proname.setFont(new Font("Calibri", Font.BOLD, 22));
	    proname.setBounds(136,168,329,23);
	    f2.getContentPane().add(proname);
    
    
        //cashier
	    JLabel casname=new JLabel("Cashier Name :");
	    casname.setFont(new Font("Tahoma", Font.BOLD, 13));
	    casname.setBounds(26,215,104,16);
	    f2.getContentPane().add(casname);
	    String names[]={"Nawaz Sharif","Imran Khan","Zardari","Shehbaz sharif","Bilawal bhutto"};
	    JComboBox na=new JComboBox(names);
	    na.setBounds(136,215,127,16);
	    f2.getContentPane().add(na);
	
	    //Cashier ID
	    JLabel id=new JLabel("Cashier ID :");
	    id.setFont(new Font("Tahoma", Font.BOLD, 13));
	    id.setBounds(324,215,95,16);
	    f2.getContentPane().add(id); 
	    JTextField ido=new JTextField();
	    ido.setBounds(414,215,67,16);
	    f2.getContentPane().add(ido);
	    
	    //order no
	    JLabel orderno=new JLabel("Order number :");
	    orderno.setFont(new Font("Tahoma", Font.BOLD, 13));
	    orderno.setBounds(300,248,119,16);
	    f2.getContentPane().add(orderno); 
	    JTextField no=new JTextField();
	    no.setBounds(414,248,67,16);
	    f2.getContentPane().add(no);
	    
	    //Customer name
	    JLabel cusname=new JLabel("Customer Name :");
	    cusname.setFont(new Font("Tahoma", Font.BOLD, 13));
	    cusname.setBounds(10,248,127,16);
	    f2.getContentPane().add(cusname); 
	    JTextField cusna=new JTextField();
	    cusna.setBounds(136,248,127,16);
	    f2.getContentPane().add(cusna);
		
		//Pizza type
		JLabel type=new JLabel("PIZZA TYPE");
		type.setFont(new Font("Tahoma", Font.BOLD, 13));
		type.setBounds(44,289,73,16);
		f2.getContentPane().add(type);
		JCheckBox type1=new JCheckBox(" Smokey Chicken Tikka");
		type1.setBackground(new Color(255, 255, 255));
		type1.setBounds(26,312,203,13);
		f2.getContentPane().add(type1);
		JCheckBox type2=new JCheckBox(" Chicken Mughlai");
		type2.setBackground(new Color(255, 255, 255));
		type2.setBounds(26,328,127,23);
		f2.getContentPane().add(type2);
		JCheckBox type3=new JCheckBox(" Legend Dynamite");
		type3.setBackground(new Color(255, 255, 255));
		type3.setBounds(26,373,144,16);
		f2.getContentPane().add(type3);
		JCheckBox type4=new JCheckBox(" TEX-MEX ");
		type4.setBackground(new Color(255, 255, 255));
		type4.setBounds(26,354,95,16);
		f2.getContentPane().add(type4);
		
		//pizza crust
		ButtonGroup cg=new ButtonGroup();
		JLabel crust=new JLabel("PIZZA CRUST");
		crust.setFont(new Font("Tahoma", Font.BOLD, 13));
		crust.setBounds(321,289,116,16);
		f2.getContentPane().add(crust);
		JRadioButton crust1=new JRadioButton(" Deep Dish");
		crust1.setBackground(new Color(255, 255, 255));
		crust1.setBounds(300,373,95,16);
		cg.add(crust1);
		f2.getContentPane().add(crust1);
		JRadioButton crust2=new JRadioButton(" Hand-Tossed ");
		crust2.setBackground(new Color(255, 255, 255));
		crust2.setBounds(300,330,137,23);
		cg.add(crust2);
		f2.getContentPane().add(crust2);
		JRadioButton crust3=new JRadioButton(" Stuffed Crust");
		crust3.setBackground(new Color(255, 255, 255));
		crust3.setBounds(300,354,127,16);
		cg.add(crust3);
		f2.getContentPane().add(crust3);
		JRadioButton crust4=new JRadioButton(" Thin ");
		crust4.setBackground(new Color(255, 255, 255));
		crust4.setBounds(300,312,117,16);
		cg.add(crust4);
		f2.getContentPane().add(crust4);
		
		//pizzasize
		ButtonGroup bg=new ButtonGroup();
		JLabel size=new JLabel("PIZZA SIZE");
		size.setFont(new Font("Tahoma", Font.BOLD, 13));
		size.setBounds(52,417,203,16);
		f2.getContentPane().add(size);
		JRadioButton size1=new JRadioButton(" LARGE          16'inch       RS 1800 ");
		size1.setBackground(new Color(255, 255, 255));
		size1.setBounds(26,476,216,16);
		bg.add(size1);
		f2.getContentPane().add(size1);
		JRadioButton size2=new JRadioButton(" MEDIUM       13'inch       RS 1400 ");
		size2.setBackground(new Color(255, 255, 255));
		size2.setBounds(26,457,229,16);
		bg.add(size2);
		f2.getContentPane().add(size2);		
		JRadioButton size3=new JRadioButton(" SMALL         10'inch       RS 1200 ");
		size3.setBackground(new Color(255, 255, 255));
	    size3.setBounds(26,438,229,16);
		bg.add(size3);
	    f2.getContentPane().add(size3);
	    JRadioButton size4=new JRadioButton(" X-LARGE      18'inch       RS 2000 ");
	    size4.setBackground(new Color(255, 255, 255));
	    size4.setBounds(26,495,229,16);
		bg.add(size4);
		f2.getContentPane().add(size4);
		
		//topplings
		JLabel top=new JLabel("PIZZA TOPPLINGS");
		top.setFont(new Font("Tahoma", Font.BOLD, 13));
		top.setBounds(323,417,117,16);
		f2.getContentPane().add(top);
		JCheckBox top1=new JCheckBox(" Mushroom            RS 150");
		top1.setBackground(new Color(255, 255, 255));
		top1.setBounds(300,476,168,16);
		f2.getContentPane().add(top1);
		JCheckBox top2=new JCheckBox(" Crispy Chicken    RS 250");
		top2.setBackground(new Color(255, 255, 255));
		top2.setBounds(300,495,168,16);
		f2.getContentPane().add(top2);
		JCheckBox top3=new JCheckBox(" Cheese                  RS 250");
		top3.setBackground(new Color(255, 255, 255));
		top3.setBounds(300,454,168,20);
		f2.getContentPane().add(top3);
		JCheckBox top4=new JCheckBox(" Olive                       RS 150 ");
		top4.setBackground(new Color(255, 255, 255));
		top4.setBounds(300,435,168,16);
		f2.getContentPane().add(top4);
		
		//Using Separartors
	    f2.setTitle("    Domino's Pizza Order Menu");
	    f2.setSize(1000,770);
	    f2.getContentPane().setLayout(null);
	    f2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    JSeparator separator_2_2 = new JSeparator();
	    separator_2_2.setOrientation(SwingConstants.VERTICAL);
	    separator_2_2.setForeground(Color.BLACK);
	    separator_2_2.setBounds(26, 417, 1, 16);
	    f2.getContentPane().add(separator_2_2);
	    
	    JSeparator separator_1_1 = new JSeparator();
	    separator_1_1.setForeground(Color.BLACK);
	    separator_1_1.setBounds(299, 303, 182, 2);
	    f2.getContentPane().add(separator_1_1);
	    
	    JSeparator separator_3_3 = new JSeparator();
	    separator_3_3.setOrientation(SwingConstants.VERTICAL);
	    separator_3_3.setForeground(Color.BLACK);
	    separator_3_3.setBounds(481, 417, 1, 16);
	    f2.getContentPane().add(separator_3_3);
	    
	    JSeparator separator_1_3 = new JSeparator();
	    separator_1_3.setForeground(Color.BLACK);
	    separator_1_3.setBounds(300, 431, 182, 2);
	    f2.getContentPane().add(separator_1_3);
	    
	    JSeparator separator_3_1 = new JSeparator();
	    separator_3_1.setOrientation(SwingConstants.VERTICAL);
	    separator_3_1.setForeground(Color.BLACK);
	    separator_3_1.setBounds(480, 289, 1, 16);
	    f2.getContentPane().add(separator_3_1);
	    
	    JSeparator separator_2_3 = new JSeparator();
	    separator_2_3.setOrientation(SwingConstants.VERTICAL);
	    separator_2_3.setForeground(Color.BLACK);
	    separator_2_3.setBounds(300, 417, 1, 16);
	    f2.getContentPane().add(separator_2_3);
	    
	    JSeparator separator_6 = new JSeparator();
	    separator_6.setForeground(Color.BLACK);
	    separator_6.setBounds(300, 417, 182, 2);
	    f2.getContentPane().add(separator_6);
	    
	    JSeparator separator_3_2 = new JSeparator();
	    separator_3_2.setOrientation(SwingConstants.VERTICAL);
	    separator_3_2.setForeground(Color.BLACK);
	    separator_3_2.setBounds(207, 417, 1, 16);
	    f2.getContentPane().add(separator_3_2);
	    
	    JSeparator separator_5 = new JSeparator();
	    separator_5.setForeground(Color.BLACK);
	    separator_5.setBounds(26, 417, 182, 2);
	    f2.getContentPane().add(separator_5);
	    
	    JSeparator separator_2_1 = new JSeparator();
	    separator_2_1.setOrientation(SwingConstants.VERTICAL);
	    separator_2_1.setForeground(Color.BLACK);
	    separator_2_1.setBounds(299, 289, 1, 16);
	    f2.getContentPane().add(separator_2_1);
	    
	    JSeparator separator_4 = new JSeparator();
	    separator_4.setForeground(Color.BLACK);
	    separator_4.setBounds(299, 289, 182, 2);
	    f2.getContentPane().add(separator_4);
	    
	    JSeparator separator_1_2 = new JSeparator();
	    separator_1_2.setForeground(Color.BLACK);
	    separator_1_2.setBounds(26, 431, 182, 2);
	    f2.getContentPane().add(separator_1_2);
	    
	    JSeparator separator_2 = new JSeparator();
	    separator_2.setOrientation(SwingConstants.VERTICAL);
	    separator_2.setForeground(new Color(0, 0, 0));
	    separator_2.setBounds(26, 289, 1, 16);
	    f2.getContentPane().add(separator_2);
	    
	    JSeparator separator_3 = new JSeparator();
	    separator_3.setForeground(new Color(0, 0, 0));
	    separator_3.setOrientation(SwingConstants.VERTICAL);
	    separator_3.setBounds(207, 289, 1, 16);
	    f2.getContentPane().add(separator_3);
	    
	    JSeparator separator = new JSeparator();
	    separator.setForeground(new Color(0, 0, 0));
	    separator.setBounds(26, 289, 182, 2);
	    f2.getContentPane().add(separator);
	    
	    JSeparator separator_1 = new JSeparator();
	    separator_1.setForeground(new Color(0, 0, 0));
	    separator_1.setBounds(26, 303, 182, 2);
	    f2.getContentPane().add(separator_1);

		//Quantity
		JLabel quantity=new JLabel("Quantity: ");
		quantity.setFont(new Font("Tahoma", Font.BOLD, 13));
		quantity.setBounds(63,534,67,27);
		f2.getContentPane().add(quantity);
		JTextField qty=new JTextField();
		qty.setBounds(136,537,43,23);
	    f2.getContentPane().add(qty);
	    
		//total
		JLabel total=new JLabel("Total Amount: ");
		total.setFont(new Font("Tahoma", Font.BOLD, 13));
		total.setBounds(211,538,97,16);
		f2.getContentPane().add(total);
		JTextField tot=new JTextField();
	    tot.setBounds(314,535,81,23);
	    f2.getContentPane().add(tot); 
	
		
	    //proceed to check out
		JButton proceed=new JButton(" Checkout ");
		proceed.setFont(new Font("Arial", Font.BOLD, 18));
		proceed.setBounds(173,586,130,45);
		f2.getContentPane().add(proceed);
		proceed.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
	           f2.dispose();
			   new frame3();
			}
		});

		ImageIcon img = new ImageIcon("finalf2.gif");
	    JLabel abc=new JLabel(img);
	    abc.setBounds(0,0,990,730);
	    f2.getContentPane().add(abc);
	    
	    f2.setLocationRelativeTo(null);
		f2.setResizable(false);
		f2.setVisible(true);
		
	}
public static void main(String[] args) {
	new frame2();
	} 
}