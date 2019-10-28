import javax.swing.*;
import java.io.IOException;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.*;
public class WaterFacility implements ActionListener{
	JFrame j;
	public static JLabel l1,l2;
	public static JTextField t1,t2;
	public static JButton b;
	public void open(){
		j = new JFrame("Water Facility");
		j.setLayout(null);
		l1 = new JLabel("Village: ");
		l1.setBounds(50,30,150,30);
		t1 = new JTextField();
		t1.setBounds(200,30,150,30);
		l2 = new JLabel("Pincode: ");
		l2.setBounds(50,80,150,30);
		t2 = new JTextField();
		t2.setBounds(200,80,150,30);
		b = new JButton("Results");
		b.setBounds(125,170,150,30);
		b.addActionListener(this);
		j.add(l1);j.add(l2);j.add(t1);j.add(t2);j.add(b);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(400,300);
		j.setVisible(true);
	}
	Desktop d= Desktop.getDesktop();
	public void actionPerformed(ActionEvent e){
		if(t1.getText().contentEquals("")) JOptionPane.showMessageDialog(j,"Village cannot be left empty","Error",JOptionPane.ERROR_MESSAGE);
		else if(t2.getText().contentEquals("")) JOptionPane.showMessageDialog(j,"Pincode cannot be left empty","Error",JOptionPane.ERROR_MESSAGE);
		else
		{
			try {
				d.browse(new URI("https://www.justdial.com/Srikakulam/Drip-Irrigation-System-Dealers-in-Sompeta/nct-10173093"));
			} catch (IOException | URISyntaxException e1) {
				e1.printStackTrace();
			}
		}
	}
}