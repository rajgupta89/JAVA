// Program to convert inches to cm using swing

import java.awt.event.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;


// Program to convert inches to cm  using swings
public class example7 extends JFrame implements ActionListener{
       JButton b;
       JTextArea t1;
       JTextField t2;
       JPanel p;
       JLabel l;
       public example7(){
           p=new JPanel();
           b=new JButton("Convert");
           t1=new JTextArea(10,20);
           t2=new JTextField(20);
           l=new JLabel("Distance in Inches");
           p.add(l);
           p.add(b);
           p.add(t2);
           p.add(t1);
           this.add(p);
           this.setSize(400,400);
           this.setVisible(true);
           this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
           t1.setEditable(false);
           b.addActionListener(this);
       }
    
    public void actionPerformed(ActionEvent e) {
        double cm=Double.parseDouble(t2.getText())*2.5;
        t1.append(t2.getText()+" equals "+cm+" cm\n");        
    }
    public static void main(String[] args) {
        new example7();
    }
}