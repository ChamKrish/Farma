import javax.swing.*;
import java.awt.event.*;
import java.lang.String;
public class Register extends Login implements ActionListener{
    JFrame j;
    JLabel l1;
    JLabel l2;
    JLabel l3;
    JLabel l4;
    JLabel l5;
    JLabel l6;
    JTextField t1;
    JTextField t2;
    JTextField t3;
    JPasswordField pf1;
    JPasswordField pf2;
    JRadioButton r1;
    JRadioButton r2;
    JRadioButton r3;
    JButton b1;
    JButton b2;
    ButtonGroup bg;
    public void open(){
        j = new JFrame("Register");
        j.setLayout(null);
        l1 = new JLabel("Username:");
        l1.setBounds(50,50,150,30);
        t1 = new JTextField();
        t1.setBounds(200,50,150,30);
        l2 = new JLabel("Email id:");
        l2.setBounds(50,100,150,30);
        t2 = new JTextField();
        t2.setBounds(200,100,150,30);
        l3 = new JLabel("Password:");
        l3.setBounds(50,150,150,30);
        pf1 = new JPasswordField();
        pf1.setBounds(200,150,150,30);
        l4 = new JLabel("Re enter password:");
        l4.setBounds(50,200,150,30);
        pf2 = new JPasswordField();
        pf2.setBounds(200,200,150,30);
        l5 = new JLabel("Gender:");
        l5.setBounds(50,250,150,30);
        bg = new ButtonGroup();
        r1 = new JRadioButton("Male");
        r1.setBounds(200,240,70,30);
        r2 = new JRadioButton("Female");
        r2.setBounds(270,240,70,30);
        r3 = new JRadioButton("Other");
        r3.setBounds(240,265,60,30);
        bg.add(r1);bg.add(r2);bg.add(r3);
        l6 = new JLabel("Ph-no:");
        l6.setBounds(50,300,150,30);
        t3 = new JTextField("");
        t3.setBounds(200,300,150,30);
        b1 = new JButton("Register");
        b1.setBounds(50,370,100,30);
        b1.addActionListener(this);
        b2 = new JButton("Cancel");
        b2.setBounds(250,370,100,30);
        b2.addActionListener(this);
        j.add(l1); j.add(l2); j.add(l3); j.add(l4); j.add(l5); j.add(t1); j.add(t2); j.add(pf1); j.add(pf2); j.add(l6); j.add(b1); j.add(t3); j.add(l1);j.add(b1);j.add(b2);
        j.add(r1);j.add(r2);j.add(r3);
        // j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(400,500);
        j.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b1) {
            String s1 = new String(pf1.getPassword());
            String s2 = new String(pf2.getPassword());
            if(t1.getText().contentEquals("")) JOptionPane.showMessageDialog(j,"Username cannot be left empty","Error",JOptionPane.ERROR_MESSAGE);
            else if(t2.getText().contentEquals("")) JOptionPane.showMessageDialog(j,"Email-id cannot be left empty","Error",JOptionPane.ERROR_MESSAGE);
            else if(pf1.getPassword().length == 0) JOptionPane.showMessageDialog(j,"Password cannot be left empty","Error",JOptionPane.ERROR_MESSAGE);
            else if(pf2.getPassword().length == 0) JOptionPane.showMessageDialog(j,"Please Re enter a password","Error",JOptionPane.ERROR_MESSAGE);
            else if(!s1.equals(s2)) JOptionPane.showMessageDialog(j,"Enter the same password","Error",JOptionPane.ERROR_MESSAGE);
            else if(!(r1.isSelected()||r2.isSelected()||r3.isSelected())) JOptionPane.showMessageDialog(j,"Choose a gender","Error",JOptionPane.ERROR_MESSAGE);
            else if(t3.getText().contentEquals("")) JOptionPane.showMessageDialog(j,"Please enter a phone number","Error",JOptionPane.ERROR_MESSAGE);
            else {
                JOptionPane.showMessageDialog(j,"Successfully registered","Information",JOptionPane.INFORMATION_MESSAGE);
                f.setText(t1.getText());
        		p.setText(String.valueOf(pf1.getPassword()));
        		j.dispose();
            }
        }
        else if(e.getSource()==b2){
            if(JOptionPane.showConfirmDialog(j,"Are you sure?")==JOptionPane.YES_OPTION){
                j.dispose();
            }
        }
    }
}