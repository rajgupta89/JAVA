import javax.swing.*;
public class example1{
    public static void main(String[] args) {
        JFrame frame=new JFrame();
        JButton b=new JButton("Click me");
        JTextField c=new JTextField("Text");
        b.setBounds(40,90,85,20);  //(x-axis, y-axis, width, height)
        c.setBounds(0,0,100,50);
        frame.add(b);
        frame.add(c);
        frame.setSize(300,300);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}