import javax.swing.*;
import java.awt.*;

public class pract2 {
    public static void main(String[] args) {
        JFrame a=new JFrame();
        JPanel p=new JPanel(new BorderLayout());
        JButton b1=new JButton("Button 1");
        JButton b2=new JButton("Button 2");
        // JButton b3=new JButton("Button 3");
        // JCheckBox c=new JCheckBox();
        JScrollBar s=new JScrollBar();
        // JTextField t=new JTextField();
        p.add(b1, BorderLayout.NORTH);
        p.add(b2, BorderLayout.SOUTH);
        // p.add(b3, BorderLayout.WEST);
        p.add(s, BorderLayout.WEST);
        // p.add(c, BorderLayout.EAST);
        // p.add(t, BorderLayout.CENTER);
        p.setBackground(Color.red);
        a.add(p);
        a.setSize(300,300);
        a.setVisible(true);
    }
}
