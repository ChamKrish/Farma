import javax.swing.*;
import java.awt.event.*;
public class Complaint implements ActionListener{
	JFrame j;
	public static JTextField t1,t2;
	public static JComboBox<String> cb1,cb2;
	public static JTextArea a1;
	public static JButton b1,b2,b3;
	public void open(){
		j = new JFrame("Complaint Sender");
		j.setLayout(null);
		JLabel l1 = new JLabel("Name: ");
		l1.setBounds(50,50,200,30);
		t1 = new JTextField();
		t1.setBounds(250,50,200,30);
		JLabel l2 = new JLabel("Problem type: ");
		l2.setBounds(50,100,200,30);
		String[] str1 = {"Select","Seeds","Manures, Fertilizers and Biocides",
				"Irrigation","Lack of mechanisation","Soil erosion","Agricultural Marketing"
				};
		cb1 = new JComboBox<String>(str1);
		cb1.setBounds(250,100,200,30);
		JLabel l3 = new JLabel("Problem description: ");
		l3.setBounds(50,150,200,30);
		a1 = new JTextArea();
		a1.setBounds(250,150,200,280);
		JLabel l4 = new JLabel("Ph.no: ");
		l4.setBounds(50,450,200,30);
		t2 = new JTextField();
		t2.setBounds(250,450,200,30);
		JLabel l5 = new JLabel("Send to: ");
		l5.setBounds(50,500,200,30);
		String[] str2 = {"Select","Mandal office","Panchayat office","VRO","MRO"};
		cb2 = new JComboBox<String>(str2);
		cb2.setBounds(250,500,200,30);
		b1 = new JButton("Send");
		b1.setBounds(50,600,100,30);
		b1.addActionListener(this);
		b2 = new JButton("Delete");
		b2.setBounds(200,600,100,30);
		b2.addActionListener(this);
		b3 = new JButton("Cancel");
		b3.setBounds(350,600,100,30);
		b3.addActionListener(this);
		j.add(l1);j.add(l2);j.add(l3);j.add(l4);j.add(l5);j.add(t1);j.add(t2);j.add(a1);j.add(cb1);j.add(cb2);
		j.add(b1);j.add(b2);j.add(b3);
		// j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(500,700);
		j.setVisible(true);
	}
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1){
			if(t1.getText().contentEquals("")) JOptionPane.showMessageDialog(j,"Name cannot be left empty","Error",JOptionPane.ERROR_MESSAGE);
			else if(cb1.getSelectedIndex()==0) JOptionPane.showMessageDialog(j,"Choose the problem type","Error",JOptionPane.ERROR_MESSAGE);
			else if(a1.getText().contentEquals("")) JOptionPane.showMessageDialog(j,"Description cannot be left empty","Error",JOptionPane.ERROR_MESSAGE);
			else if(t2.getText().contentEquals("") && cb2.getSelectedIndex()==0) JOptionPane.showMessageDialog(j,"Enter a phone number or choose where to send","Error",JOptionPane.ERROR_MESSAGE);
			else{
				JOptionPane.showMessageDialog(j,"Complaint is sent","Information",JOptionPane.INFORMATION_MESSAGE);
				int a = JOptionPane.showConfirmDialog(j,"Do you want to send another complaint?");
				if(a==JOptionPane.YES_OPTION){
					t1.setText(null);
					t2.setText(null);
					a1.setText(null);
					cb1.setSelectedIndex(0);
					cb2.setSelectedIndex(0);
				}
				else if(a == JOptionPane.NO_OPTION)	j.dispose();
			}
		}
		else if(e.getSource() == b2) {
			if(JOptionPane.showConfirmDialog(j,"Are you sure?")==JOptionPane.YES_OPTION){
				t1.setText(null);
				t2.setText(null);
				a1.setText(null);
				cb1.setSelectedIndex(0);
				cb2.setSelectedIndex(0);
			}
		}
		else if(e.getSource() == b3) j.dispose();
	}
	
	
	
	
	
	
	
	
	
	
	
}