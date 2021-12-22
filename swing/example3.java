//Swing using JPanel and borderLayout
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;
public class example3 {
    public static void main(String[] args) {
        JFrame a=new JFrame();
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        JButton b3=new JButton("Button 3");
        JButton b4=new JButton("Button 4");
        JPanel p=new JPanel(new BorderLayout()); // new BorderLayout() function to include layout
        // JTextField t=new JTextField("Text");
        JCheckBox c=new JCheckBox();
        // b.setBounds(40,80,50,50);
        // t.setBounds(10,10,100,50);
        // p.add(t, BorderLayout.CENTER);
        p.add(b1, BorderLayout.EAST);   // layout direction 
        p.add(b2, BorderLayout.WEST);
        p.add(b3, BorderLayout.NORTH);
        p.add(b4, BorderLayout.SOUTH);
        p.add(c);
        b1.setBackground(Color.red);    // give bgcolor to specific buttons
        b2.setBackground(Color.pink);
        b3.setBackground(Color.blue);
        b4.setBackground(Color.green);
        // t.setBackground(Color.yellow);
        c.setBackground(Color.yellow);
        a.add(p);
        a.setSize(300,300);
        a.setVisible(true);
    }
}
