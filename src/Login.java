import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;
public class Login implements ActionListener{
	public static JFrame j;
	public static JLabel l1,l2,l3;
	public static JTextField f;
	public static JPasswordField p;
	public static JButton b1,b2,b3;
	public void open(){
		j = new JFrame("Login");
		j.setLayout(null);
		l1 = new JLabel("Username: ");
		l1.setBounds(100,50,200,30);
		f = new JTextField();
		f.setBounds(200,50,200,30);
		l2 = new JLabel("Password: ");
		l2.setBounds(100,100,200,30);
		p = new JPasswordField();
		p.setBounds(200,100,200,30);
		b1 = new JButton("login");
		b1.setBounds(100,150,100,30);
		b1.addActionListener(this);
		b2 = new JButton("exit");
		b2.setBounds(300,150,100,30);
		b2.addActionListener(this);
		l3 = new JLabel("new user ? ");
		l3.setHorizontalAlignment(JLabel.CENTER);
		l3.setBounds(150,200,100,30);
		b3 = new JButton("signup");
		b3.addActionListener(this);
		b3.setBounds(250,200,100,30);
		j.add(l1);j.add(f);j.add(l2);j.add(p);j.add(b1);j.add(b2);j.add(l3);j.add(b3);
		j.setSize(500,300);
		j.setBackground(Color.GRAY);
		// j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
	
	public static User user = new User();
	public static Register reg = new Register();
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			String name = f.getText();
			char[] c = p.getPassword();
			if(name.contentEquals("")) JOptionPane.showMessageDialog(j,"Username cannot be left empty","Error",JOptionPane.ERROR_MESSAGE);
			else if(c.length == 0) JOptionPane.showMessageDialog(j,"Password cannot be left empty","Error",JOptionPane.ERROR_MESSAGE);
			else user.open();
		}
		else if(e.getSource() == b2) {
			if(JOptionPane.showConfirmDialog(j,"Do you want to exit?")==JOptionPane.YES_OPTION) j.dispose();
		}
		else if(e.getSource() == b3){
			reg.open();
		}
	}
}