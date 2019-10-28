import javax.swing.*;
import java.util.Date;
import java.text.*;
import java.awt.event.*;
public class User implements ActionListener{
	public static JFrame j;
	public static JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	public void open(){
		j = new JFrame("User");
		j.setLayout(null);
		b1 = new JButton("Profile");
		b1.setBounds(100,50,300,30);
		b1.addActionListener(this);
		b2 = new JButton("Weather");
		b2.setBounds(100,100,300,30);
		b2.addActionListener(this);
		b3 = new JButton("Help");
		b3.setBounds(100,150,300,30);
		b3.addActionListener(this);
		b4 = new JButton("News");
		b4.setBounds(100,200,300,30);
		b4.addActionListener(this);
		b5 = new JButton("Water Facility");
		b5.setBounds(100,250,300,30);
		b5.addActionListener(this);
		b6 = new JButton("Complaint Sender");
		b6.setBounds(100,300,300,30);
		b6.addActionListener(this);
		b7 = new JButton("Fertilizer Merchants");
		b7.setBounds(100,350,300,30);
		b7.addActionListener(this);
		b8 = new JButton("logout");
		b8.setBounds(100,450,100,30);
		b8.addActionListener(this);
		b9 = new JButton("close");
		b9.setBounds(300,450,100,30);
		b9.addActionListener(this);
		j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.add(b1);j.add(b2);j.add(b3);j.add(b4);j.add(b5);j.add(b6);j.add(b7);j.add(b8);j.add(b9);
		j.setSize(500,600);
		j.setVisible(true);
	}
	public String date() {
		Date dt = new Date();
		SimpleDateFormat ft = new SimpleDateFormat("dd.MM.yyyy");
		String str = new String(ft.format(dt));
		return str;
	}
	static Login login = new Login();
	static Profile profile = new Profile();
	static Weather weather = new Weather();
	static Help help = new Help();
	static News news = new News();
	static WaterFacility water = new WaterFacility();
	static Complaint complaint = new Complaint();
	static Fertilizer fert = new Fertilizer();
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1) {
			profile.open();
			profile.t1.setText(login.f.getText());
			try{
				profile.t2.setText(login.reg.t2.getText());
				if(login.reg.r1.isSelected()) profile.cb1.setSelectedIndex(1);
				else if(login.reg.r2.isSelected()) profile.cb1.setSelectedIndex(2);
				else if(login.reg.r3.isSelected()) profile.cb1.setSelectedIndex(3);
			}
			catch(Exception e1) {};
		}
		else if(e.getSource() == b2) {
			weather.open();
			weather.t1.setText(profile.t6.getText());
			weather.t2.setText(profile.t9.getText());
			weather.t3.setText(date());
		}
		else if(e.getSource() == b3) help.open();
		else if(e.getSource() == b4) {
			news.open();
			news.t1.setText(profile.t9.getText());
		}
		else if(e.getSource() == b5) {
			water.open();
			water.t1.setText(profile.t6.getText());
			water.t2.setText(profile.t9.getText());
		}
		else if(e.getSource() == b6) {
			complaint.open();
			complaint.t1.setText(profile.t1.getText());
		}
		else if(e.getSource() == b7) {
			fert.open();
			fert.t1.setText(profile.t6.getText());
			fert.t2.setText(profile.t9.getText());
		}
		else if(e.getSource() == b8) {
			j.dispose();
			login.f.setText("");
			login.p.setText("");
		}
		else if(e.getSource() == b9) {
			if(JOptionPane.showConfirmDialog(j, "Do you want to exit?") == JOptionPane.YES_OPTION) {
				j.dispose();
				login.j.dispose();				
			}
		}
	}
	
	public static void main(String args[]) {
		login.open();
		// new Register();
//		open();
//		profile.open();
//		new Weather();
//		new WaterFacility();
		// new News();
//		new Help();
//		new Fertilizer();
//		new Complaint();
	}
}