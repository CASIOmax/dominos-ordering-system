import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
public class frame1{
	frame1(){
		JFrame f=new JFrame();  
		f.setTitle("    Sign Up");
		f.setSize(780,528);
		f.getContentPane().setLayout(null);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		ImageIcon img = new ImageIcon("f1pizza.png");
	    
	    
	    //Texts
	    JLabel proname=new JLabel("Domino's Pizza Order generator");
	    proname.setFont(new Font("Calibri", Font.BOLD, 18));
	    proname.setBounds(447,140,245,35);
	    f.getContentPane().add(proname);
	    
		JLabel usename=new JLabel("Branch Name :");
		usename.setFont(new Font("Tahoma", Font.BOLD, 13));
		usename.setBounds(389,179,104,16);
		f.getContentPane().add(usename);
	    JLabel passname=new JLabel("Password :");
	    passname.setFont(new Font("Tahoma", Font.BOLD, 13));
	    passname.setBounds(398,225,83,16);
	    f.getContentPane().add(passname);
	    
	    //branchname
	    JTextField user=new JTextField();
	    user.setBounds(491,179,192,16);
	    f.getContentPane().add(user);
	    
	    //password
	    JPasswordField pass=new JPasswordField();
	    pass.setBounds(491, 226, 192, 16);
	    f.getContentPane().add(pass);
	    
	    JButton login=new JButton("Login");
	    login.setFont(new Font("Arial", Font.BOLD, 16));
	    
	    login.setBounds(491,270,116,29);
	    
	    f.getContentPane().add(login);
	    
	    		login.addActionListener(new ActionListener() {
	    			public void actionPerformed(ActionEvent e) {
	    	           f.dispose();
	    			   new frame2();
	    			}
	    		});
	    
	    JButton insert=new JButton("Insert");
	    insert.setFont(new Font("Arial", Font.BOLD, 14));
	    insert.setBounds(403,322,116,29);
	    f.getContentPane().add(insert);
	    
	    insert.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Connection con = null;
                PreparedStatement pst = null;
                ResultSet rs = null;
                try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://D:\\NUML\\Sem-II\\OOP\\Pizza project\\pizza.accdb");

                    String query = "Insert into pizzat1 (bname,bpass) values(?,?)";
                    pst = con.prepareStatement(query);

                    pst.setString(1, user.getText());
                    pst.setString(2, pass.getText());
                    int a = pst.executeUpdate();
                    if (a > 0) {
                        JOptionPane.showMessageDialog(null, "success");
                    } else {
                        JOptionPane.showMessageDialog(null, "Fail");
                    }
                } catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
                }
            }

        });
	    
	    JButton view=new JButton("View");
	    view.setFont(new Font("Arial", Font.BOLD, 14));
	    view.setBounds(565,322,116,29);
	    f.getContentPane().add(view); 
	    view.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Connection conn;
                try {
                    
                    String un = JOptionPane.showInputDialog("Enter your Branch name");
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    conn = DriverManager .getConnection("jdbc:ucanaccess://D:\\NUML\\Sem-II\\OOP\\Pizza project\\pizza.accdb");
                    
                    PreparedStatement stmt = conn.prepareStatement("select * from pizzat1 where bname = ?");
                    stmt.setString(1, un);
                    ResultSet rs = stmt.executeQuery();
                    if (rs.next()) {
                        JOptionPane.showMessageDialog(null,"Username: " + rs.getString(2) + "\nPassword: " + rs.getString(3));

                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid username entered");
                    }

                    conn.close();
                }
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Something went wrong");
                    System.out.println(ex);
                }
                
            }
        });
	   
	 
	    
	    JButton delete=new JButton("Delete");
	    delete.setFont(new Font("Arial", Font.BOLD, 14));
	    delete.setBounds(565,381,116,29);
	    f.getContentPane().add(delete);
	    delete.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	Connection con = null;
                PreparedStatement pst = null;
                ResultSet rs = null;
                try {
                    Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                    con = DriverManager.getConnection("jdbc:ucanaccess://D:\\NUML\\Sem-II\\OOP\\Pizza project\\pizza.accdb");
                   
                    String query = "delete from pizzat1 where bname = ? ";
                    
                    pst = con.prepareStatement(query);
                   
                    pst.setString(1, user.getText());
                    int rows = pst.executeUpdate();
                    if (rows > 0) {
                        JOptionPane.showMessageDialog(null, rows + " " + " Branch Deleted Successfully!");
                    } 
                    else {
                        JOptionPane.showMessageDialog(null, "Failed to Delete Branch!");
                    }
                } 
                catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, ex.getMessage());
}   
            }
        });
	   

	    
	    JButton update=new JButton("Update");
	    update.setFont(new Font("Arial", Font.BOLD, 14));
	    update.setBounds(403,381,116,29);
	    f.getContentPane().add(update);
		update.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
		        JOptionPane.showMessageDialog(null,"Updated successfully","Update",1);
			}
		});
	    
	    JLabel abc=new JLabel(img);
	    abc.setBounds(0,0,764,489);
	    f.getContentPane().add(abc);
	    
	    f.setLocationRelativeTo(null);
		f.setResizable(false);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new frame1();  
	}
}

