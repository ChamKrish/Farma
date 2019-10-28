import javax.swing.*;
import java.io.IOException;
import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.awt.event.*;
public class Weather implements ActionListener{
	JFrame j;
	public static JLabel l1,l2,l3;
	public static JTextField t1,t2,t3;
	public static JButton b;
	public void open() {
		j = new JFrame("Weather");
		j.setLayout(null);
		l1 = new JLabel("Village: ");
		l1.setBounds(50,30,150,30);
		t1 = new JTextField();
		t1.setBounds(200,30,150,30);
		l2 = new JLabel("Pincode: ");
		l2.setBounds(50,80,150,30);
		t2 = new JTextField();
		t2.setBounds(200,80,150,30);
		l3 = new JLabel("Date: ");
		l3.setBounds(50,130,150,30);
		t3 = new JTextField();
		t3.setBounds(200,130,150,30);
		b = new JButton("Results");
		b.setBounds(125,195,150,30);
		b.addActionListener(this);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.add(l1);j.add(l2);j.add(l3);j.add(t1);j.add(t2);j.add(t3);j.add(b);
		j.setSize(400,300);
		j.setVisible(true);
	}
	Desktop d = Desktop.getDesktop();
	public void actionPerformed(ActionEvent e){
		if(t1.getText().contentEquals("")) JOptionPane.showMessageDialog(j,"Village cannot be left empty","Error",JOptionPane.ERROR_MESSAGE);
		else if(t2.getText().contentEquals("")) JOptionPane.showMessageDialog(j,"Pincode cannot be left empty","Error",JOptionPane.ERROR_MESSAGE);
		else if(t3.getText().contentEquals("")) JOptionPane.showMessageDialog(j,"Date cannot be left empty","Error",JOptionPane.ERROR_MESSAGE);
		else if(t1.getText().contentEquals("sompeta"))
		{
		try {
			d.browse(new URI("https://www.accuweather.com/en/in/sompeta/191804/weather-forecast/191804"));
		} catch (IOException | URISyntaxException e1) {
			e1.printStackTrace();
		}
		}
	else  if(t1.getText().contentEquals("ongole"))
	{
		try {
			d.browse(new URI("https://www.accuweather.com/en/in/ongole/186818/weather-forecast/186818"));
		} catch (IOException | URISyntaxException e1) {
			e1.printStackTrace();
		}
	}
	else if(t1.getText().contentEquals("challapalle")) {
		try {
			d.browse(new URI("https://www.accuweather.com/en/in/ongole/186818/weather-forecast/186818"));
		} catch (IOException | URISyntaxException e1) {
			e1.printStackTrace();
		}
	}
	else if(t1.getText().contentEquals("kollam")) {
		try {
			d.browse(new URI("https://www.accuweather.com/en/in/ongole/186818/weather-forecast/186818"));
		} catch (IOException | URISyntaxException e1) {
			e1.printStackTrace();
		}
	}
	}
}
