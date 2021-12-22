//Swing using JPanel
import java.awt.Color;

import javax.swing.*;
public class example2 {
    public static void main(String[] args) {
        JFrame a=new JFrame();
        JButton b1=new JButton("Click me");
        JButton b2=new JButton("Click me");
        JPanel p=new JPanel();
        JTextField t=new JTextField("Text");
        // b.setBounds(40,80,50,50);
        // t.setBounds(10,10,100,50);
        p.add(b1);
        p.add(b2);
        p.add(t);
        p.setBackground(Color.red);
        a.add(p);
        a.setSize(300,300);
        a.setVisible(true);
    }
}
