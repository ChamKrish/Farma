import javax.swing.*;
import java.net.URI;
import java.awt.Desktop;
import java.awt.event.*;
public class Help implements ActionListener{
	JFrame j;
	JLabel l1;
	JTextField t1;
	JButton b1;
	JLabel l2;
	JTextField t2;
	JButton b2;
	JLabel l3;
	JTextField t3;
	JButton b3;
	JLabel l4;
	JTextField t4;
	JButton b4;
	public void open(){
		j = new JFrame("Help");
		j.setLayout(null);
		l1 = new JLabel("Crop name: ");
		l1.setBounds(50,50,150,30);
		t1 = new JTextField();
		t1.setBounds(200,50,150,30);
		b1 = new JButton("Details");
		b1.setBounds(400,50,150,30);
		b1.addActionListener(this);
		l2 = new JLabel("Insect name: ");
		l2.setBounds(50,100,150,30);
		t2 = new JTextField();
		t2.setBounds(200,100,150,30);
		b2 = new JButton("Details");
		b2.setBounds(400,100,150,30);
		b2.addActionListener(this);
		l3 = new JLabel("Pesticide name: ");
		l3.setBounds(50,150,150,30);
		t3 = new JTextField();
		t3.setBounds(200,150,150,30);
		b3 = new JButton("Details");
		b3.setBounds(400,150,150,30);
		b3.addActionListener(this);
		l4 = new JLabel("Seed name: ");
		l4.setBounds(50,200,150,30);
		t4 = new JTextField();
		t4.setBounds(200,200,150,30);
		b4 = new JButton("Details");
		b4.setBounds(400,200,150,30);
		b4.addActionListener(this);
		j.add(l1);j.add(l2);j.add(l3);j.add(l4);j.add(t1);j.add(t2);j.add(t3);j.add(t4);
		j.add(b1);j.add(b2);j.add(b3);j.add(b4);
		// setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		j.setSize(600,320);
		j.setVisible(true);
	}
	Desktop d = Desktop.getDesktop();
	public void actionPerformed(ActionEvent e){
		if(e.getSource()==b1){
			if(t1.getText().contentEquals("")) JOptionPane.showMessageDialog(j,"Enter a crop name for details","Error",JOptionPane.ERROR_MESSAGE);
			else if(t1.getText().contentEquals("corn"))
			{
				try {
				d.browse(new URI("https://extension.uga.edu/publications/detail.html?number=B1333&title=Corn%20Production%20Safety%20and%20Health%20for%20Farmers"));
			}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		}
		else if(e.getSource()==b2){
			if(t2.getText().contentEquals("")) JOptionPane.showMessageDialog(j,"Enter a insect name for details","Error",JOptionPane.ERROR_MESSAGE);
			else
			{
				try {
				
				d.browse(new URI("https://extension.entm.purdue.edu/fieldcropsipm/insects/corn-wireworms.php"));
			}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		}
		else if(e.getSource()==b3){
			if(t3.getText().contentEquals("")) JOptionPane.showMessageDialog(j,"Enter a pesticide name for details","Error",JOptionPane.ERROR_MESSAGE);
			else if(t3.getText().contentEquals("get"))
			{
				try {
				d.browse(new URI("https://www.planetnatural.com/pest-problem-solver/garden-pests/wireworm-control/"));
			}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		}
		else if(e.getSource()==b4){
			if(t4.getText().contentEquals("")) JOptionPane.showMessageDialog(j,"Enter a seed name for details","Error",JOptionPane.ERROR_MESSAGE);
			else
			{
				try {
					d.browse(new URI("http://agritech.tnau.ac.in/seed_certification/seed_cm_maize.html"));
			}
				catch(Exception e1)
				{
					e1.printStackTrace();
				}
			}
		}
		
		
	}
}
