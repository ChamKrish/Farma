import javax.swing.*;
import java.awt.event.*;
public class Profile implements ActionListener{
	JFrame j;
	public static JTextField t1,t2,t3,t5,t6,t7,t8,t9;
	public static JTextArea t4;
	public static JComboBox<String> cb1;
	public static JButton b1,b2,b3;
	public void open(){
		j = new JFrame("Profile");
		j.setLayout(null);
		JLabel l1 = new JLabel("Name: ");
		l1.setBounds(50,50,250,30);
		t1 = new JTextField();
		t1.setBounds(300,50,250,30);
		JLabel l2 = new JLabel("Email-Id: ");
		l2.setBounds(50,100,250,30);
		t2 = new JTextField();
		t2.setBounds(300,100,250,30);
		JLabel l3 = new JLabel("Gender: ");
		l3.setBounds(50,150,250,30);
		String[] gender = {"Select","Male","Female","Other"};
		cb1 = new JComboBox<String>(gender);
		cb1.setBounds(300,150,250,30);
		JLabel l4 = new JLabel("No of years of Farming: ");
		l4.setBounds(50,200,250,30);
		t3 = new JTextField();
		t3.setBounds(300,200,250,30);
		JLabel l5 = new JLabel("Cultivating crops: ");
		l5.setBounds(50,250,250,30);
		t5 = new JTextField();
		t5.setBounds(300,250,250,30);
		JLabel l6 = new JLabel("Address: ");
		l6.setBounds(50,300,250,30);
		t4 = new JTextArea();
		t4.setBounds(300,300,250,175);
		JLabel l7 = new JLabel("Village: ");
		l7.setBounds(50,500,250,30);
		t6 = new JTextField();
		t6.setBounds(300,500,250,30);
		JLabel l8 = new JLabel("District: ");
		l8.setBounds(50,550,250,30);
		t7 = new JTextField();
		t7.setBounds(300,550,250,30);
		JLabel l9 = new JLabel("State: ");
		l9.setBounds(50,600,250,30);
		t8 = new JTextField();
		t8.setBounds(300,600,250,30);
		JLabel l10 = new JLabel("Pincode: ");
		l10.setBounds(50,650,250,30);
		t9 = new JTextField();
		t9.setBounds(300,650,250,30);
		b1 = new JButton("Save");
		b1.setBounds(50,720,100,50);
		b1.addActionListener(this);
		b2 = new JButton("Delete");
		b2.addActionListener(this);
		b2.setBounds(250,720,100,50);
		b3 = new JButton("Back");
		b3.addActionListener(this);
		b3.setBounds(450,720,100,50);
		j.add(l1);j.add(l2);j.add(l3);j.add(l4);j.add(l5);j.add(l6);j.add(l7);j.add(l8);j.add(l9);j.add(l10);
		j.add(t1);j.add(t2);j.add(t3);j.add(t4);j.add(t5);j.add(t6);j.add(t7);j.add(cb1);j.add(t8);j.add(t9);
		j.add(b1);j.add(b2);j.add(b3);
		// j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(600,850);
		j.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			JOptionPane.showMessageDialog(j,"Successfully updated","Information",JOptionPane.INFORMATION_MESSAGE);
		}
		if(e.getSource() == b2) {
			int a = JOptionPane.showConfirmDialog(j,"Are you sure?");
			if(a==JOptionPane.YES_OPTION){
				t1.setText(null);
				cb1.setSelectedIndex(0);
				t2.setText(null);
				t3.setText(null);
				t4.setText(null);
				t5.setText(null);
				t6.setText(null);
				t7.setText(null);
				t8.setText(null);
				t9.setText(null);
			}
		}
		else if(e.getSource() == b3) j.dispose();
	}	
}