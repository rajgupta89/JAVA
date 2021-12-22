import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class example4 {
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JCheckBox c=new JCheckBox();
        JTextField t=new JTextField("Text"); 
        b1.setBounds(0,0,100,50);
        b2.setBounds(0,50,100,50);
        b3.setBounds(0,100,100,50);
        c.setBounds(200,0,50,50);
        t.setBounds(200,50,50,50);
        frame.add(b1);
        frame.add(b2);
        frame.add(b3);
        frame.add(c);
        frame.add(t);
        b1.setBackground(Color.red);
        b2.setBackground(Color.pink);
        b3.setBackground(Color.green);
        c.setBackground(Color.blue);
        t.setBackground(Color.gray);
        frame.setSize(300, 300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
