//used to add image to the button and add default close operator
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class example5 {
    public static void main(String[] args) {
        JFrame a=new JFrame();
        JButton b=new JButton(new ImageIcon("bg.jpg"));
        b.setBounds(50,100,100,50);
        a.add(b);
        a.setSize(300,300);
        a.setLayout(null);
        a.setVisible(true);
        a.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   // it is used to close compilation as soon as jframe window is closed.
    }
}
