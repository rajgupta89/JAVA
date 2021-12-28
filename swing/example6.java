import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;

public class example6 {
    public static void main(String[] args) {
        JFrame a=new JFrame();
        JLabel l1=new JLabel("UserName:");
        JLabel l2=new JLabel("Password:");
        JPasswordField p=new JPasswordField();
        JTextArea t=new JTextArea();
        JButton b=new JButton("Login");
        l1.setBounds(20,30,80,20);
        t.setBounds(100,30,100,20);
        l2.setBounds(20,80,80,20);
        p.setBounds(100,80,100,20);
        b.setBounds(90,140,100,20);
        a.add(l1);
        a.add(l2);
        a.add(p);
        a.add(t);
        a.add(b);
        a.setSize(300,300);
        a.setLayout(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
