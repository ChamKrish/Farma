import javax.swing.*;
import java.awt.Desktop;
import java.net.URI;
import java.awt.event.*;
public class News implements ActionListener{
	JFrame j;
	JLabel l1;
	JTextField t1;
	JLabel l2;
	JComboBox<String> t2;
	public void open(){
		j = new JFrame("News");
		j.setLayout(null);
		l1 = new JLabel("Pincode: ");
		l1.setBounds(50,30,150,30);
		t1 = new JTextField();
		t1.setBounds(200,30,150,30);
		l2 = new JLabel("News type: ");
		l2.setBounds(50,80,150,30);
		String str[] = {"Select","District","Regional","State","National","International"};
		t2 = new JComboBox<String>(str);
		t2.setBounds(200,80,150,30);
		JButton b = new JButton("Results");
		b.setBounds(125,170,150,30);
		b.addActionListener(this);
		j.add(l1);j.add(l2);j.add(t1);j.add(t2);j.add(b);
		j.setSize(400,300);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setVisible(true);
	}
	Desktop d = Desktop.getDesktop();
	public void actionPerformed(ActionEvent e){
		if(t1.getText().contentEquals("")) JOptionPane.showMessageDialog(j,"Pincode cannot be left empty","Error",JOptionPane.ERROR_MESSAGE);
		else if(t2.getSelectedIndex() == 0) JOptionPane.showMessageDialog(j,"Choose any news type","Error",JOptionPane.ERROR_MESSAGE);
		else
		{
			try
			{
				d.browse(new URI("https://www.downtoearth.org.in/news/agriculture/andhra-farmers-taste-success-with-zero-budget-natural-farming-59445"));
			}
			catch(Exception e1)
			{
				e1.printStackTrace();
			}
		}
	}
}
