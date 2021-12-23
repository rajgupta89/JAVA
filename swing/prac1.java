// swing without panel
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class prac1 {
    public static void main(String[] args) {
        JFrame  a=new JFrame();
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JTextField t=new JTextField("Text");
        JCheckBox c=new JCheckBox();
        b1.setBounds(0,0,100,50);    // x-axis, y-axis, width, height
        b2.setBounds(0,60,100,50);
        b3.setBounds(0,120,100,50);
        t.setBounds(0,190,100,50);
        c.setBounds(200,0,30,30);
        b1.setBackground(Color.red);
        b2.setBackground(Color.blue);
        b3.setBackground(Color.pink);
        t.setBackground(Color.yellow);
        c.setBackground(Color.gray);
        a.add(b1);
        a.add(b2);
        a.add(b3);
        a.add(t);
        a.add(c);
        a.setSize(300, 300);
        a.setLayout(null);
        a.setVisible(true);
    }
}
